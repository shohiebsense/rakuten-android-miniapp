//[miniapp](../../../index.md)/[com.rakuten.tech.mobile.miniapp](../index.md)/[MiniApp](index.md)

# MiniApp

[androidJvm]\
abstract class [MiniApp](index.md)

This represents the contract between the consuming application and the SDK by which operations in the mini app ecosystem are exposed. Should be accessed via [MiniApp.instance](-companion/instance.md).

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [androidJvm]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [create](create.md) | [androidJvm]<br>abstract suspend fun [create](create.md)(appInfo: [MiniAppInfo](../-mini-app-info/index.md), miniAppMessageBridge: [MiniAppMessageBridge](../../com.rakuten.tech.mobile.miniapp.js/-mini-app-message-bridge/index.md), miniAppNavigator: [MiniAppNavigator](../../com.rakuten.tech.mobile.miniapp.navigator/-mini-app-navigator/index.md)? = null, miniAppFileChooser: [MiniAppFileChooser](../../com.rakuten.tech.mobile.miniapp.file/-mini-app-file-chooser/index.md)? = null, queryParams: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ""): [MiniAppDisplay](../-mini-app-display/index.md)<br>Creates a mini app using the mini app ID and version specified in [MiniAppInfo](../-mini-app-info/index.md). This should only be used in "Preview Mode". The mini app is downloaded, saved and provides a [MiniAppDisplay](../-mini-app-display/index.md) when successful.<br>[androidJvm]<br>abstract suspend fun [create](create.md)(appId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), miniAppMessageBridge: [MiniAppMessageBridge](../../com.rakuten.tech.mobile.miniapp.js/-mini-app-message-bridge/index.md), miniAppNavigator: [MiniAppNavigator](../../com.rakuten.tech.mobile.miniapp.navigator/-mini-app-navigator/index.md)? = null, miniAppFileChooser: [MiniAppFileChooser](../../com.rakuten.tech.mobile.miniapp.file/-mini-app-file-chooser/index.md)? = null, queryParams: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ""): [MiniAppDisplay](../-mini-app-display/index.md)<br>Creates a mini app. The mini app is downloaded, saved and provides a [MiniAppDisplay](../-mini-app-display/index.md) when successful. |
| [createWithUrl](create-with-url.md) | [androidJvm]<br>abstract suspend fun [createWithUrl](create-with-url.md)(appUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), miniAppMessageBridge: [MiniAppMessageBridge](../../com.rakuten.tech.mobile.miniapp.js/-mini-app-message-bridge/index.md), miniAppNavigator: [MiniAppNavigator](../../com.rakuten.tech.mobile.miniapp.navigator/-mini-app-navigator/index.md)? = null, miniAppFileChooser: [MiniAppFileChooser](../../com.rakuten.tech.mobile.miniapp.file/-mini-app-file-chooser/index.md)? = null, queryParams: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ""): [MiniAppDisplay](../-mini-app-display/index.md)<br>Creates a mini app using provided url. Mini app is NOT downloaded and cached in local, its content are read directly from the url. This should only be used for previewing a mini app from a local server. |
| [fetchInfo](fetch-info.md) | [androidJvm]<br>abstract suspend fun [fetchInfo](fetch-info.md)(appId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [MiniAppInfo](../-mini-app-info/index.md)<br>Fetches meta data information of a mini app. |
| [getCustomPermissions](get-custom-permissions.md) | [androidJvm]<br>abstract fun [getCustomPermissions](get-custom-permissions.md)(miniAppId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [MiniAppCustomPermission](../../com.rakuten.tech.mobile.miniapp.permission/-mini-app-custom-permission/index.md)<br>Get custom permissions with grant results per MiniApp from this SDK. |
| [getDownloadedManifest](get-downloaded-manifest.md) | [androidJvm]<br>abstract fun [getDownloadedManifest](get-downloaded-manifest.md)(appId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [MiniAppManifest](../-mini-app-manifest/index.md)?<br>Get the currently downloaded manifest information e.g. required and optional permissions. |
| [getMiniAppInfoByPreviewCode](get-mini-app-info-by-preview-code.md) | [androidJvm]<br>abstract suspend fun [getMiniAppInfoByPreviewCode](get-mini-app-info-by-preview-code.md)(previewCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [PreviewMiniAppInfo](../-preview-mini-app-info/index.md)<br>Fetches MiniappInfo by preview code. |
| [getMiniAppManifest](get-mini-app-manifest.md) | [androidJvm]<br>abstract suspend fun [getMiniAppManifest](get-mini-app-manifest.md)(appId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), versionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), languageCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = ""): [MiniAppManifest](../-mini-app-manifest/index.md)<br>Get the manifest information e.g. required and optional permissions. |
| [listDownloadedWithCustomPermissions](list-downloaded-with-custom-permissions.md) | [androidJvm]<br>abstract fun [listDownloadedWithCustomPermissions](list-downloaded-with-custom-permissions.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[MiniAppInfo](../-mini-app-info/index.md), [MiniAppCustomPermission](../../com.rakuten.tech.mobile.miniapp.permission/-mini-app-custom-permission/index.md)&gt;&gt;<br>lists out the mini applications available with custom permissions in cache. |
| [listMiniApp](list-mini-app.md) | [androidJvm]<br>abstract suspend fun [listMiniApp](list-mini-app.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[MiniAppInfo](../-mini-app-info/index.md)&gt;<br>Fetches and lists out the mini applications available in the MiniApp Ecosystem. |
| [setCustomPermissions](set-custom-permissions.md) | [androidJvm]<br>abstract fun [setCustomPermissions](set-custom-permissions.md)(miniAppCustomPermission: [MiniAppCustomPermission](../../com.rakuten.tech.mobile.miniapp.permission/-mini-app-custom-permission/index.md))<br>Store custom permissions with grant results per MiniApp inside this SDK. |