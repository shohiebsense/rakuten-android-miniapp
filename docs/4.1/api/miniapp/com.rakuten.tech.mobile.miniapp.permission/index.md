//[miniapp](../../index.md)/[com.rakuten.tech.mobile.miniapp.permission](index.md)

# Package com.rakuten.tech.mobile.miniapp.permission

## Types

| Name | Summary |
|---|---|
| [AccessTokenScope](-access-token-scope/index.md) | [androidJvm]<br>data class [AccessTokenScope](-access-token-scope/index.md)(audience: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), scopes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;)<br>Contains the components which need to be validated when access token is granted. |
| [MiniAppCustomPermission](-mini-app-custom-permission/index.md) | [androidJvm]<br>data class [MiniAppCustomPermission](-mini-app-custom-permission/index.md)(miniAppId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), pairValues: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[MiniAppCustomPermissionType](-mini-app-custom-permission-type/index.md), [MiniAppCustomPermissionResult](-mini-app-custom-permission-result/index.md)&gt;&gt;)<br>A data class to hold the custom permission with grant results using Pair per MiniApp. |
| [MiniAppCustomPermissionResponse](-mini-app-custom-permission-response/index.md) | [androidJvm]<br>data class [MiniAppCustomPermissionResponse](-mini-app-custom-permission-response/index.md)(permissions: [ArrayList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-list/index.html)&lt;[MiniAppCustomPermissionResponse.CustomPermissionResponseObj](-mini-app-custom-permission-response/-custom-permission-response-obj/index.md)&gt;)<br>A data class to prepare the json response of custom permissions to be sent from this SDK. |
| [MiniAppCustomPermissionResult](-mini-app-custom-permission-result/index.md) | [androidJvm]<br>enum [MiniAppCustomPermissionResult](-mini-app-custom-permission-result/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[MiniAppCustomPermissionResult](-mini-app-custom-permission-result/index.md)&gt; <br>Type of miniapp custom permission result. |
| [MiniAppCustomPermissionType](-mini-app-custom-permission-type/index.md) | [androidJvm]<br>enum [MiniAppCustomPermissionType](-mini-app-custom-permission-type/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[MiniAppCustomPermissionType](-mini-app-custom-permission-type/index.md)&gt; <br>Type of miniapp custom permission. |
| [MiniAppDevicePermissionType](-mini-app-device-permission-type/index.md) | [androidJvm]<br>enum [MiniAppDevicePermissionType](-mini-app-device-permission-type/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[MiniAppDevicePermissionType](-mini-app-device-permission-type/index.md)&gt; <br>Type of miniapp device permission. |