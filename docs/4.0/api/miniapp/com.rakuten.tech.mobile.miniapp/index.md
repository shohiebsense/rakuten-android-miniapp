//[miniapp](../../index.md)/[com.rakuten.tech.mobile.miniapp](index.md)

# Package com.rakuten.tech.mobile.miniapp

## Types

| Name | Summary |
|---|---|
| [Host](-host/index.md) | [androidJvm]<br>data class [Host](-host/index.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), subscriptionKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>This represents a host entity of a Mini App. |
| [MiniApp](-mini-app/index.md) | [androidJvm]<br>abstract class [MiniApp](-mini-app/index.md)<br>This represents the contract between the consuming application and the SDK by which operations in the mini app ecosystem are exposed. Should be accessed via [MiniApp.instance](-mini-app/-companion/instance.md). |
| [MiniAppDisplay](-mini-app-display/index.md) | [androidJvm]<br>interface [MiniAppDisplay](-mini-app-display/index.md) : [LifecycleObserver](https://developer.android.com/reference/kotlin/androidx/lifecycle/LifecycleObserver.html)<br>This represents the contract by which the host app can interact with the display unit of the mini app. This contract complies to Android's [LifecycleObserver](https://developer.android.com/reference/kotlin/androidx/lifecycle/LifecycleObserver.html) contract, and when made to observe the lifecycle, it automatically clears up the view state and any services registered with. |
| [MiniAppHasNoPublishedVersionException](-mini-app-has-no-published-version-exception/index.md) | [androidJvm]<br>class [MiniAppHasNoPublishedVersionException](-mini-app-has-no-published-version-exception/index.md)(appId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [MiniAppSdkException](-mini-app-sdk-exception/index.md)<br>Exception which is thrown when the server returns no published versions for the provided mini app ID. |
| [MiniAppHostException](-mini-app-host-exception/index.md) | [androidJvm]<br>class [MiniAppHostException](-mini-app-host-exception/index.md)(serverMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [MiniAppSdkException](-mini-app-sdk-exception/index.md)<br>Exception which is thrown when the provided project ID does not have any mini app exist on the server. |
| [MiniAppInfo](-mini-app-info/index.md) | [androidJvm]<br>data class [MiniAppInfo](-mini-app-info/index.md)(id: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), displayName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), icon: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), version: [Version](-version/index.md), promotionalImageUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, promotionalText: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>This represents a Mini App entity. |
| [MiniAppManifest](-mini-app-manifest/index.md) | [androidJvm]<br>data class [MiniAppManifest](-mini-app-manifest/index.md)(requiredPermissions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[MiniAppCustomPermissionType](../com.rakuten.tech.mobile.miniapp.permission/-mini-app-custom-permission-type/index.md), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;, optionalPermissions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[MiniAppCustomPermissionType](../com.rakuten.tech.mobile.miniapp.permission/-mini-app-custom-permission-type/index.md), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;, accessTokenPermissions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[AccessTokenScope](../com.rakuten.tech.mobile.miniapp.permission/-access-token-scope/index.md)&gt;, customMetaData: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, versionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>A data class to represent data in the mini app's manifest. |
| [MiniAppNetException](-mini-app-net-exception/index.md) | [androidJvm]<br>class [MiniAppNetException](-mini-app-net-exception/index.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?) : [MiniAppSdkException](-mini-app-sdk-exception/index.md)<br>Exception indicating that there was an issue with network connectivity. |
| [MiniAppNotFoundException](-mini-app-not-found-exception/index.md) | [androidJvm]<br>class [MiniAppNotFoundException](-mini-app-not-found-exception/index.md)(serverMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [MiniAppSdkException](-mini-app-sdk-exception/index.md)<br>Exception which is thrown when the provided project ID does not have any mini app exist on the server. |
| [MiniAppSdkConfig](-mini-app-sdk-config/index.md) | [androidJvm]<br>data class [MiniAppSdkConfig](-mini-app-sdk-config/index.md)(baseUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), rasProjectId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), subscriptionKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), hostAppVersionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), hostAppUserAgentInfo: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), isPreviewMode: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), requireSignatureVerification: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), miniAppAnalyticsConfigList: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[MiniAppAnalyticsConfig](../com.rakuten.tech.mobile.miniapp.analytics/-mini-app-analytics-config/index.md)&gt;, sslPinningPublicKeyList: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, enableH5Ads: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>This represents the configuration settings for the Mini App SDK. |
| [MiniAppSdkException](-mini-app-sdk-exception/index.md) | [androidJvm]<br>open class [MiniAppSdkException](-mini-app-sdk-exception/index.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), cause: [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)?) : [Exception](https://developer.android.com/reference/kotlin/java/lang/Exception.html)<br>A custom exception class which treats the purpose of providing error information to the consumer app in an unified way. |
| [MiniAppVerificationException](-mini-app-verification-exception/index.md) | [androidJvm]<br>class [MiniAppVerificationException](-mini-app-verification-exception/index.md)(message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?) : [MiniAppSdkException](-mini-app-sdk-exception/index.md)<br>Exception which is thrown when cannot verify device keystore. |
| [PreviewMiniAppInfo](-preview-mini-app-info/index.md) | [androidJvm]<br>data class [PreviewMiniAppInfo](-preview-mini-app-info/index.md)(host: [Host](-host/index.md), miniapp: [MiniAppInfo](-mini-app-info/index.md)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>This represents a response entity for preview code. |
| [RequiredPermissionsNotGrantedException](-required-permissions-not-granted-exception/index.md) | [androidJvm]<br>class [RequiredPermissionsNotGrantedException](-required-permissions-not-granted-exception/index.md)(appId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), versionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [MiniAppSdkException](-mini-app-sdk-exception/index.md)<br>Exception which is thrown when the required permissions of the manifest are not granted. |
| [SSLCertificatePinningException](-s-s-l-certificate-pinning-exception/index.md) | [androidJvm]<br>class [SSLCertificatePinningException](-s-s-l-certificate-pinning-exception/index.md)(serverMessage: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [MiniAppSdkException](-mini-app-sdk-exception/index.md)<br>Exception which is thrown when the public key used for ssl pinning is mismatched. |
| [Version](-version/index.md) | [androidJvm]<br>data class [Version](-version/index.md)(versionTag: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), versionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Parcelable](https://developer.android.com/reference/kotlin/android/os/Parcelable.html)<br>This represents a version entity of a Mini App. |