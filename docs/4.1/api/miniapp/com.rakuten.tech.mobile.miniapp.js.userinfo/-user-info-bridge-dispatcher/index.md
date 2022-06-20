//[miniapp](../../../index.md)/[com.rakuten.tech.mobile.miniapp.js.userinfo](../index.md)/[UserInfoBridgeDispatcher](index.md)

# UserInfoBridgeDispatcher

[androidJvm]\
interface [UserInfoBridgeDispatcher](index.md)

A class to provide the interfaces for getting user info e.g. user-name, profile-photo etc.

## Functions

| Name | Summary |
|---|---|
| [getAccessToken](get-access-token.md) | [androidJvm]<br>@[JvmName](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-name/index.html)(name = "getAccessToken")<br>open fun [getAccessToken](get-access-token.md)(miniAppId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), accessTokenScope: [AccessTokenScope](../../com.rakuten.tech.mobile.miniapp.permission/-access-token-scope/index.md), onSuccess: (tokenData: [TokenData](../-token-data/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), onError: (tokenError: [MiniAppAccessTokenError](../../com.rakuten.tech.mobile.miniapp.errors/-mini-app-access-token-error/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))<br>Get access token from host app. |
| [getContacts](get-contacts.md) | [androidJvm]<br>open fun [getContacts](get-contacts.md)(onSuccess: (contacts: [ArrayList](https://developer.android.com/reference/kotlin/java/util/ArrayList.html)&lt;[Contact](../-contact/index.md)&gt;) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), onError: (message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))<br>Get contacts from host app. You can also throw an [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html) from this method to pass an error message to the mini app. |
| [getPoints](get-points.md) | [androidJvm]<br>open fun [getPoints](get-points.md)(onSuccess: (points: [Points](../-points/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), onError: (pointsError: [MiniAppPointsError](../../com.rakuten.tech.mobile.miniapp.errors/-mini-app-points-error/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))<br>Get points from host app. You can also throw an [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html) from this method to pass an error message to the mini app. |
| [getProfilePhoto](get-profile-photo.md) | [androidJvm]<br>open fun [getProfilePhoto](get-profile-photo.md)(onSuccess: (profilePhoto: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), onError: (message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))<br>Get profile photo url from host app. You can also throw an [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html) from this method to pass an error message to the mini app. |
| [getUserName](get-user-name.md) | [androidJvm]<br>open fun [getUserName](get-user-name.md)(onSuccess: (userName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html), onError: (message: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))<br>Get user name from host app. You can also throw an [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html) from this method to pass an error message to the mini app. |