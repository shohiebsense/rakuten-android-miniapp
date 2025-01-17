package com.rakuten.tech.mobile.miniapp.view

import com.rakuten.tech.mobile.miniapp.MiniAppDisplay
import com.rakuten.tech.mobile.miniapp.MiniAppSdkException
import com.rakuten.tech.mobile.miniapp.js.NativeEventType
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

internal class MiniAppViewImpl(
    internal var miniAppParameters: MiniAppParameters,
    initMiniAppViewHandler: () -> MiniAppViewHandler,
) : MiniAppView() {

    private val miniAppViewHandler: MiniAppViewHandler by lazy { initMiniAppViewHandler() }
    internal var scope: CoroutineScope = CoroutineScope(Dispatchers.IO)

    @Suppress("LongMethod", "MaxLineLength", "MaximumLineLength")
    override fun load(
        queryParams: String,
        fromCache: Boolean,
        onComplete: (MiniAppDisplay?, MiniAppSdkException?) -> Unit
    ) {
        scope.launch {
            try {
                when (miniAppParameters) {
                    is MiniAppParameters.DefaultParams -> {
                        (miniAppParameters as MiniAppParameters.DefaultParams).fromCache = fromCache
                        if (queryParams != "") {
                            (miniAppParameters as MiniAppParameters.DefaultParams).config.queryParams =
                                queryParams
                        }
                        onComplete(
                            miniAppViewHandler.createMiniAppView(
                                (miniAppParameters as MiniAppParameters.DefaultParams).miniAppId,
                                (miniAppParameters as MiniAppParameters.DefaultParams).config,
                                (miniAppParameters as MiniAppParameters.DefaultParams).fromCache
                            ), null
                        )
                    }
                    is MiniAppParameters.InfoParams -> {
                        (miniAppParameters as MiniAppParameters.InfoParams).fromCache = fromCache
                        if (queryParams != "") (miniAppParameters as MiniAppParameters.InfoParams).config.queryParams =
                            queryParams
                        onComplete(
                            miniAppViewHandler.createMiniAppView(
                                (miniAppParameters as MiniAppParameters.InfoParams).miniAppInfo,
                                (miniAppParameters as MiniAppParameters.InfoParams).config,
                                (miniAppParameters as MiniAppParameters.InfoParams).fromCache
                            ), null
                        )
                    }
                    is MiniAppParameters.UrlParams -> {
                        if (queryParams != "") (miniAppParameters as MiniAppParameters.UrlParams).config.queryParams =
                            queryParams
                        onComplete(
                            miniAppViewHandler.createMiniAppViewWithUrl(
                                (miniAppParameters as MiniAppParameters.UrlParams).miniAppUrl,
                                (miniAppParameters as MiniAppParameters.UrlParams).config
                            ), null
                        )
                    }
                }
            } catch (miniAppSdkException: MiniAppSdkException) {
                onComplete(null, miniAppSdkException)
            }
        }
    }

    override fun sendJsonToMiniApp(message: String, onFailed: () -> Unit) {
        message.let {
            if (it.isNotBlank()) {
                val miniAppMessageBridge = when (miniAppParameters) {
                    is MiniAppParameters.DefaultParams ->
                        (miniAppParameters as MiniAppParameters.DefaultParams).config.miniAppMessageBridge
                    is MiniAppParameters.InfoParams ->
                        (miniAppParameters as MiniAppParameters.InfoParams).config.miniAppMessageBridge
                    is MiniAppParameters.UrlParams ->
                        (miniAppParameters as MiniAppParameters.UrlParams).config.miniAppMessageBridge
                }
                miniAppMessageBridge.dispatchNativeEvent(
                    NativeEventType.MINIAPP_RECEIVE_JSON_INFO, it
                )
            } else {
                onFailed()
            }
        }
    }
}
