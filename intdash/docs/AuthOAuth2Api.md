# AuthOAuth2Api

All URIs are relative to *https://example.intdash.jp/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authOauth2JwksGet**](AuthOAuth2Api.md#authOauth2JwksGet) | **GET** /auth/oauth2/jwks | List JSON Web Keys |
| [**issueToken**](AuthOAuth2Api.md#issueToken) | **POST** /auth/oauth2/token | Token Endpoint |
| [**oauth2Authorization**](AuthOAuth2Api.md#oauth2Authorization) | **GET** /auth/oauth2/authorization | Authorization Endpoint |
| [**reovokeToken**](AuthOAuth2Api.md#reovokeToken) | **POST** /auth/oauth2/revocation | Revoke Token |


<a id="authOauth2JwksGet"></a>
# **authOauth2JwksGet**
> OAuth2JWKs authOauth2JwksGet()

List JSON Web Keys

JSON Web Keysのリストを取得します。 [RFC7517:JSON Web Key](https://tools.ietf.org/html/rfc7517)

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthOAuth2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.intdash.jp/api");
    
    // Configure API key authorization: IntdashToken
    ApiKeyAuth IntdashToken = (ApiKeyAuth) defaultClient.getAuthentication("IntdashToken");
    IntdashToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //IntdashToken.setApiKeyPrefix("Token");

    // Configure API key authorization: OAuth2TokenInCookie
    ApiKeyAuth OAuth2TokenInCookie = (ApiKeyAuth) defaultClient.getAuthentication("OAuth2TokenInCookie");
    OAuth2TokenInCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //OAuth2TokenInCookie.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: OAuth2TokenInHeader
    HttpBearerAuth OAuth2TokenInHeader = (HttpBearerAuth) defaultClient.getAuthentication("OAuth2TokenInHeader");
    OAuth2TokenInHeader.setBearerToken("BEARER TOKEN");

    AuthOAuth2Api apiInstance = new AuthOAuth2Api(defaultClient);
    try {
      OAuth2JWKs result = apiInstance.authOauth2JwksGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthOAuth2Api#authOauth2JwksGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAuth2JWKs**](OAuth2JWKs.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jwk-set+json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="issueToken"></a>
# **issueToken**
> IssueToken200Response issueToken(grantType, refreshToken, tenantUuid, username, password, clientId, clientSecret, clientCertification, redirectUri, codeVerifier, code)

Token Endpoint

OAuth2のアクセストークンを取得します。 [RFC6749:The OAuth 2.0 Authorization Framework](https://tools.ietf.org/html/rfc6749)

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthOAuth2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.intdash.jp/api");
    
    // Configure API key authorization: IntdashToken
    ApiKeyAuth IntdashToken = (ApiKeyAuth) defaultClient.getAuthentication("IntdashToken");
    IntdashToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //IntdashToken.setApiKeyPrefix("Token");

    // Configure API key authorization: OAuth2TokenInCookie
    ApiKeyAuth OAuth2TokenInCookie = (ApiKeyAuth) defaultClient.getAuthentication("OAuth2TokenInCookie");
    OAuth2TokenInCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //OAuth2TokenInCookie.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: OAuth2TokenInHeader
    HttpBearerAuth OAuth2TokenInHeader = (HttpBearerAuth) defaultClient.getAuthentication("OAuth2TokenInHeader");
    OAuth2TokenInHeader.setBearerToken("BEARER TOKEN");

    AuthOAuth2Api apiInstance = new AuthOAuth2Api(defaultClient);
    String grantType = "password"; // String | グラントタイプ
    String refreshToken = "refreshToken_example"; // String | 認可時に発行されたリフレッシュトークン。grant_typeが `refresh_token` の場合にだけ指定します。
    String tenantUuid = "00000000-0000-0000-0000-000000000000"; // String | テナントのUUID。grant_typeが `password` の場合にだけ指定します。 grant_typeが `password` で、テナントUUIDを省略した場合は、デフォルトのテナントが使用されます。
    String username = "username_example"; // String | ユーザーの名前。grant_typeが `password` の場合にだけ指定します。
    String password = "password_example"; // String | パスワード。grant_typeが `password` の場合にだけ指定します。
    String clientId = "clientId_example"; // String | OAuth2クライアントのID
    String clientSecret = "clientSecret_example"; // String | OAuth2のクライアントシークレット。 OAuth2クライアントの `token_endpoint_auth_method` が `client_secret_post` の場合にだけ指定します。
    String clientCertification = "clientCertification_example"; // String | OAuth2のクライアント証明書。 OAuth2クライアントの `token_endpoint_auth_method` が `tls_client_auth` の場合にだけ指定します。
    String redirectUri = "redirectUri_example"; // String | 認可後のリダイレクト先URI。 grant_typeが `authorization_code` の場合にだけ必要です。
    String codeVerifier = "codeVerifier_example"; // String | PKCE code verifier.  * 使用可能な文字:  `[a-Z] / [0-9] / \\\"-\\\" / \\\".\\\" / \\\"_\\\" / \\\"~\\\"`  * 長さ: 43文字以上、128文字以下
    String code = "code_example"; // String | 認可コード
    try {
      IssueToken200Response result = apiInstance.issueToken(grantType, refreshToken, tenantUuid, username, password, clientId, clientSecret, clientCertification, redirectUri, codeVerifier, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthOAuth2Api#issueToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **grantType** | **String**| グラントタイプ | [optional] [enum: password, authorization_code, refresh_token, client_credentials] |
| **refreshToken** | **String**| 認可時に発行されたリフレッシュトークン。grant_typeが &#x60;refresh_token&#x60; の場合にだけ指定します。 | [optional] |
| **tenantUuid** | **String**| テナントのUUID。grant_typeが &#x60;password&#x60; の場合にだけ指定します。 grant_typeが &#x60;password&#x60; で、テナントUUIDを省略した場合は、デフォルトのテナントが使用されます。 | [optional] [default to 00000000-0000-0000-0000-000000000000] |
| **username** | **String**| ユーザーの名前。grant_typeが &#x60;password&#x60; の場合にだけ指定します。 | [optional] |
| **password** | **String**| パスワード。grant_typeが &#x60;password&#x60; の場合にだけ指定します。 | [optional] |
| **clientId** | **String**| OAuth2クライアントのID | [optional] |
| **clientSecret** | **String**| OAuth2のクライアントシークレット。 OAuth2クライアントの &#x60;token_endpoint_auth_method&#x60; が &#x60;client_secret_post&#x60; の場合にだけ指定します。 | [optional] |
| **clientCertification** | **String**| OAuth2のクライアント証明書。 OAuth2クライアントの &#x60;token_endpoint_auth_method&#x60; が &#x60;tls_client_auth&#x60; の場合にだけ指定します。 | [optional] |
| **redirectUri** | **String**| 認可後のリダイレクト先URI。 grant_typeが &#x60;authorization_code&#x60; の場合にだけ必要です。 | [optional] |
| **codeVerifier** | **String**| PKCE code verifier.  * 使用可能な文字:  &#x60;[a-Z] / [0-9] / \\\&quot;-\\\&quot; / \\\&quot;.\\\&quot; / \\\&quot;_\\\&quot; / \\\&quot;~\\\&quot;&#x60;  * 長さ: 43文字以上、128文字以下 | [optional] |
| **code** | **String**| 認可コード | [optional] |

### Return type

[**IssueToken200Response**](IssueToken200Response.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="oauth2Authorization"></a>
# **oauth2Authorization**
> oauth2Authorization(clientId, responseType, redirectUri, state, codeChallenge, codeChallengeMethod)

Authorization Endpoint

OAuth2認可エンドポイント。 [RFC6749:The OAuth 2.0 Authorization Framework](https://tools.ietf.org/html/rfc6749)

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthOAuth2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.intdash.jp/api");
    
    // Configure API key authorization: IntdashToken
    ApiKeyAuth IntdashToken = (ApiKeyAuth) defaultClient.getAuthentication("IntdashToken");
    IntdashToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //IntdashToken.setApiKeyPrefix("Token");

    // Configure API key authorization: OAuth2TokenInCookie
    ApiKeyAuth OAuth2TokenInCookie = (ApiKeyAuth) defaultClient.getAuthentication("OAuth2TokenInCookie");
    OAuth2TokenInCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //OAuth2TokenInCookie.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: OAuth2TokenInHeader
    HttpBearerAuth OAuth2TokenInHeader = (HttpBearerAuth) defaultClient.getAuthentication("OAuth2TokenInHeader");
    OAuth2TokenInHeader.setBearerToken("BEARER TOKEN");

    AuthOAuth2Api apiInstance = new AuthOAuth2Api(defaultClient);
    String clientId = "client_id"; // String | OAuth2クライアントID
    String responseType = "code"; // String | OAuth2のresponse_type。 `code` のみサポートされています。
    String redirectUri = "http://localhost:8080/"; // String | 認可後のリダイレクト先URI
    String state = "05d54c58385046dd822d233c6adfb9e9"; // String | CSRF対策のためのstate
    String codeChallenge = "ZtNPunH49FD35FWYhT5Tv8I7vRKQJ8uxMaL0_9eHjNA"; // String | PKCEコードチャレンジ。 `code_verifier` から計算したSHA-256ハッシュを、Base64 URLエンコードしたもの。
    String codeChallengeMethod = "S256"; // String | PKCEコードチャレンジの方式。 `S256` （SHA-256）のみサポートされます。
    try {
      apiInstance.oauth2Authorization(clientId, responseType, redirectUri, state, codeChallenge, codeChallengeMethod);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthOAuth2Api#oauth2Authorization");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientId** | **String**| OAuth2クライアントID | |
| **responseType** | **String**| OAuth2のresponse_type。 &#x60;code&#x60; のみサポートされています。 | [enum: code] |
| **redirectUri** | **String**| 認可後のリダイレクト先URI | |
| **state** | **String**| CSRF対策のためのstate | |
| **codeChallenge** | **String**| PKCEコードチャレンジ。 &#x60;code_verifier&#x60; から計算したSHA-256ハッシュを、Base64 URLエンコードしたもの。 | [optional] |
| **codeChallengeMethod** | **String**| PKCEコードチャレンジの方式。 &#x60;S256&#x60; （SHA-256）のみサポートされます。 | [optional] [enum: S256] |

### Return type

null (empty response body)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | APIサーバーで設定されているログインページや同意ページへのリダイレクト |  -  |

<a id="reovokeToken"></a>
# **reovokeToken**
> reovokeToken(clientId, tokenTypeHint, token)

Revoke Token

トークンを無効化します。 このエンドポイントをコールしてからトークンが無効化されるまで、通常数秒程度かかります。 [RFC7009:OAuth 2.0 Token Revocation](https://tools.ietf.org/html/rfc7009)

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthOAuth2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://example.intdash.jp/api");
    
    // Configure API key authorization: IntdashToken
    ApiKeyAuth IntdashToken = (ApiKeyAuth) defaultClient.getAuthentication("IntdashToken");
    IntdashToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //IntdashToken.setApiKeyPrefix("Token");

    // Configure API key authorization: OAuth2TokenInCookie
    ApiKeyAuth OAuth2TokenInCookie = (ApiKeyAuth) defaultClient.getAuthentication("OAuth2TokenInCookie");
    OAuth2TokenInCookie.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //OAuth2TokenInCookie.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: OAuth2TokenInHeader
    HttpBearerAuth OAuth2TokenInHeader = (HttpBearerAuth) defaultClient.getAuthentication("OAuth2TokenInHeader");
    OAuth2TokenInHeader.setBearerToken("BEARER TOKEN");

    AuthOAuth2Api apiInstance = new AuthOAuth2Api(defaultClient);
    String clientId = "clientId_example"; // String | OAuth2クライアントID
    String tokenTypeHint = "access_token"; // String | OAuth2トークンタイプについてのヒント
    String token = "token_example"; // String | 無効化したいリフレッシュトークンまたはアクセストークン。 指定を省略した場合、サーバーは、cookieの `_bearer_token` に指定されたアクセストークン、または、Authorizationヘッダーに指定されたアクセストークン（ `Bearer` トークン）を無効化します。
    try {
      apiInstance.reovokeToken(clientId, tokenTypeHint, token);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthOAuth2Api#reovokeToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientId** | **String**| OAuth2クライアントID | |
| **tokenTypeHint** | **String**| OAuth2トークンタイプについてのヒント | [optional] [default to refresh_token] [enum: access_token, refresh_token] |
| **token** | **String**| 無効化したいリフレッシュトークンまたはアクセストークン。 指定を省略した場合、サーバーは、cookieの &#x60;_bearer_token&#x60; に指定されたアクセストークン、または、Authorizationヘッダーに指定されたアクセストークン（ &#x60;Bearer&#x60; トークン）を無効化します。 | [optional] |

### Return type

null (empty response body)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

