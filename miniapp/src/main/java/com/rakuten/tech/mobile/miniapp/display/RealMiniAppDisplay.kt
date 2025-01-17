package com.rakuten.tech.mobile.miniapp.display

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.View
import android.webkit.WebView
import androidx.annotation.VisibleForTesting
import androidx.core.app.ActivityCompat
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent
import com.rakuten.tech.mobile.miniapp.MiniAppDisplay
import com.rakuten.tech.mobile.miniapp.MiniAppInfo
import com.rakuten.tech.mobile.miniapp.analytics.Actype
import com.rakuten.tech.mobile.miniapp.analytics.Etype
import com.rakuten.tech.mobile.miniapp.analytics.MiniAppAnalytics
import com.rakuten.tech.mobile.miniapp.file.MiniAppFileChooser
import com.rakuten.tech.mobile.miniapp.js.MessageBridgeRatDispatcher
import com.rakuten.tech.mobile.miniapp.navigator.MiniAppNavigator
import com.rakuten.tech.mobile.miniapp.js.MiniAppMessageBridge
import com.rakuten.tech.mobile.miniapp.js.MiniAppSecureStorageDispatcher
import com.rakuten.tech.mobile.miniapp.permission.MiniAppCustomPermissionCache
import com.rakuten.tech.mobile.miniapp.sdkExceptionForNoActivityContext
import com.rakuten.tech.mobile.miniapp.storage.DownloadedManifestCache
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@SuppressLint("SetJavaScriptEnabled", "ParameterListWrapping")
internal class RealMiniAppDisplay(
    private val basePath: String,
    val miniAppInfo: MiniAppInfo,
    val miniAppMessageBridge: MiniAppMessageBridge,
    val miniAppNavigator: MiniAppNavigator?,
    private val miniAppFileChooser: MiniAppFileChooser?,
    val hostAppUserAgentInfo: String,
    val miniAppCustomPermissionCache: MiniAppCustomPermissionCache,
    val downloadedManifestCache: DownloadedManifestCache,
    val queryParams: String,
    val miniAppAnalytics: MiniAppAnalytics,
    val ratDispatcher: MessageBridgeRatDispatcher,
    val secureStorageDispatcher: MiniAppSecureStorageDispatcher,
    val enableH5Ads: Boolean
) : MiniAppDisplay {

    var appUrl: String? = null
        private set
    @VisibleForTesting
    internal var miniAppWebView: MiniAppWebView? = null
    @VisibleForTesting
    internal fun getMiniAppAnalytics() = miniAppAnalytics

    constructor(
        appUrl: String,
        miniAppMessageBridge: MiniAppMessageBridge,
        miniAppNavigator: MiniAppNavigator?,
        miniAppFileChooser: MiniAppFileChooser?,
        hostAppUserAgentInfo: String,
        miniAppCustomPermissionCache: MiniAppCustomPermissionCache,
        downloadedManifestCache: DownloadedManifestCache,
        queryParams: String,
        miniAppAnalytics: MiniAppAnalytics,
        ratDispatcher: MessageBridgeRatDispatcher,
        secureStorageDispatcher: MiniAppSecureStorageDispatcher,
        enableH5Ads: Boolean
    ) : this(
        "",
        MiniAppInfo.forUrl(),
        miniAppMessageBridge,
        miniAppNavigator,
        miniAppFileChooser,
        hostAppUserAgentInfo,
        miniAppCustomPermissionCache,
        downloadedManifestCache,
        queryParams,
        miniAppAnalytics,
        ratDispatcher,
        secureStorageDispatcher,
        enableH5Ads
    ) {
        this.appUrl = appUrl
    }

    // Returns the view only when context type is legit else throw back error
    // Activity context needs to be used here, to prevent issues, where some native elements are
    // not rendered successfully in the mini app e.g. select tags
    override suspend fun getMiniAppView(activityContext: Context): View? =
        if (isContextValid(activityContext)) {
            // send analytics tracking when Host App displays a mini app.
            getMiniAppAnalytics().sendAnalytics(
                eType = Etype.CLICK,
                actype = Actype.OPEN,
                miniAppInfo = miniAppInfo
            )
            provideMiniAppWebView(activityContext)
        } else throw sdkExceptionForNoActivityContext()

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    override fun destroyView() {
        // send analytics tracking when mini app is closed.
        getMiniAppAnalytics().sendAnalytics(
            eType = Etype.CLICK,
            actype = Actype.CLOSE,
            miniAppInfo = miniAppInfo
        )
        miniAppWebView?.destroyView()
        miniAppWebView = null
    }

    override fun navigateBackward(): Boolean = if (miniAppWebView != null) {
        val webView = (miniAppWebView as WebView)
        when {
            webView.canGoBack() -> {
                webView.goBack()
                true
            }
            else -> false
        }
    } else false

    override fun navigateForward(): Boolean = if (miniAppWebView != null) {
        val webView = (miniAppWebView as WebView)
        when {
            webView.canGoForward() -> {
                webView.goForward()
                true
            }
            else -> false
        }
    } else false

    @Suppress("LongMethod")
    private suspend fun provideMiniAppWebView(context: Context): MiniAppWebView =
        miniAppWebView ?: withContext(Dispatchers.Main) {
            if (appUrl != null) {
                miniAppWebView = MiniAppHttpWebView(
                    context = context,
                    miniAppInfo = miniAppInfo,
                    appUrl = appUrl!!,
                    miniAppMessageBridge = miniAppMessageBridge,
                    miniAppNavigator = miniAppNavigator,
                    miniAppFileChooser = miniAppFileChooser,
                    hostAppUserAgentInfo = hostAppUserAgentInfo,
                    miniAppCustomPermissionCache = miniAppCustomPermissionCache,
                    downloadedManifestCache = downloadedManifestCache,
                    queryParams = queryParams,
                    ratDispatcher = ratDispatcher,
                    secureStorageDispatcher = secureStorageDispatcher,
                    enableH5Ads = enableH5Ads,
                )
            } else {
                miniAppWebView = MiniAppWebView(
                    context = context,
                    basePath = basePath,
                    miniAppInfo = miniAppInfo,
                    miniAppMessageBridge = miniAppMessageBridge,
                    miniAppNavigator = miniAppNavigator,
                    miniAppFileChooser = miniAppFileChooser,
                    hostAppUserAgentInfo = hostAppUserAgentInfo,
                    miniAppCustomPermissionCache = miniAppCustomPermissionCache,
                    downloadedManifestCache = downloadedManifestCache,
                    queryParams = queryParams,
                    ratDispatcher = ratDispatcher,
                    secureStorageDispatcher = secureStorageDispatcher,
                    enableH5Ads = enableH5Ads
                )
            }

            miniAppWebView!!
        }

    @VisibleForTesting
    internal fun isContextValid(activityContext: Context) =
        activityContext is Activity || activityContext is ActivityCompat
}
