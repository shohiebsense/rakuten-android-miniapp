//[miniapp](../../../index.md)/[com.rakuten.tech.mobile.miniapp](../index.md)/[MiniAppManifest](index.md)

# MiniAppManifest

[androidJvm]\
data class [MiniAppManifest](index.md)(requiredPermissions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[MiniAppCustomPermissionType](../../com.rakuten.tech.mobile.miniapp.permission/-mini-app-custom-permission-type/index.md), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;, optionalPermissions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[MiniAppCustomPermissionType](../../com.rakuten.tech.mobile.miniapp.permission/-mini-app-custom-permission-type/index.md), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;, accessTokenPermissions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[AccessTokenScope](../../com.rakuten.tech.mobile.miniapp.permission/-access-token-scope/index.md)&gt;, customMetaData: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, versionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

A data class to represent data in the mini app's manifest.

## Constructors

| | |
|---|---|
| [MiniAppManifest](-mini-app-manifest.md) | [androidJvm]<br>fun [MiniAppManifest](-mini-app-manifest.md)(requiredPermissions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[MiniAppCustomPermissionType](../../com.rakuten.tech.mobile.miniapp.permission/-mini-app-custom-permission-type/index.md), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;, optionalPermissions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[MiniAppCustomPermissionType](../../com.rakuten.tech.mobile.miniapp.permission/-mini-app-custom-permission-type/index.md), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;, accessTokenPermissions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[AccessTokenScope](../../com.rakuten.tech.mobile.miniapp.permission/-access-token-scope/index.md)&gt;, customMetaData: [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;, versionId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [accessTokenPermissions](access-token-permissions.md) | [androidJvm]<br>val [accessTokenPermissions](access-token-permissions.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[AccessTokenScope](../../com.rakuten.tech.mobile.miniapp.permission/-access-token-scope/index.md)&gt;<br>List of audiences and scopes requested by Mini App. |
| [customMetaData](custom-meta-data.md) | [androidJvm]<br>val [customMetaData](custom-meta-data.md): [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;<br>Custom metadata set by Mini App. |
| [optionalPermissions](optional-permissions.md) | [androidJvm]<br>val [optionalPermissions](optional-permissions.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[MiniAppCustomPermissionType](../../com.rakuten.tech.mobile.miniapp.permission/-mini-app-custom-permission-type/index.md), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;<br>List of optional permissions requested by Mini App. |
| [requiredPermissions](required-permissions.md) | [androidJvm]<br>val [requiredPermissions](required-permissions.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[MiniAppCustomPermissionType](../../com.rakuten.tech.mobile.miniapp.permission/-mini-app-custom-permission-type/index.md), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)&gt;&gt;<br>List of required permissions requested by Mini App. |
| [versionId](version-id.md) | [androidJvm]<br>val [versionId](version-id.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>the version id for the Mini App. |