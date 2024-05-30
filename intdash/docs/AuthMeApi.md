# AuthMeApi

All URIs are relative to *https://example.intdash.jp/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changePassword**](AuthMeApi.md#changePassword) | **PUT** /auth/users/me/password | Change Password |
| [**checkPassword**](AuthMeApi.md#checkPassword) | **POST** /auth/users/me/password/check | Check Password |
| [**createMyAPIToken**](AuthMeApi.md#createMyAPIToken) | **POST** /auth/users/me/tokens | Create My API Token |
| [**createMyEmail**](AuthMeApi.md#createMyEmail) | **POST** /auth/users/me/emails | Create My Email |
| [**deleteMyAPIToken**](AuthMeApi.md#deleteMyAPIToken) | **DELETE** /auth/users/me/tokens/{user_api_token_id} | Delete My API Token |
| [**deleteMyEmail**](AuthMeApi.md#deleteMyEmail) | **DELETE** /auth/users/me/emails/{user_email_id} | Delete My Email |
| [**getMe**](AuthMeApi.md#getMe) | **GET** /auth/users/me | Get Me |
| [**listMyAPITokens**](AuthMeApi.md#listMyAPITokens) | **GET** /auth/users/me/tokens | List My API Tokens |
| [**listMyRoles**](AuthMeApi.md#listMyRoles) | **GET** /auth/users/me/roles | List My Roles |
| [**sendVerificationEmailToMyAddress**](AuthMeApi.md#sendVerificationEmailToMyAddress) | **PUT** /auth/users/me/emails/{user_email_id}/verification | Send Verification Email to Me |
| [**updateMe**](AuthMeApi.md#updateMe) | **PATCH** /auth/users/me | Update Me |
| [**updateMyAPIToken**](AuthMeApi.md#updateMyAPIToken) | **PATCH** /auth/users/me/tokens/{user_api_token_id} | Update My API Token |
| [**updateMyAddressToVerified**](AuthMeApi.md#updateMyAddressToVerified) | **PUT** /auth/users/me/emails/{user_email_id}/verified | Set My Email as Verified |
| [**updateMyEmail**](AuthMeApi.md#updateMyEmail) | **PATCH** /auth/users/me/emails/{user_email_id} | Update My Email |


<a id="changePassword"></a>
# **changePassword**
> UserPassword changePassword(changePasswordRequest)

Change Password

パスワードを変更します。 現在のパスワード &#x60;old_password&#x60; または &#x60;recovery_token&#x60; が必要です。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthMeApi;

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

    AuthMeApi apiInstance = new AuthMeApi(defaultClient);
    ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest(); // ChangePasswordRequest | 
    try {
      UserPassword result = apiInstance.changePassword(changePasswordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthMeApi#changePassword");
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
| **changePasswordRequest** | [**ChangePasswordRequest**](ChangePasswordRequest.md)|  | [optional] |

### Return type

[**UserPassword**](UserPassword.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a id="checkPassword"></a>
# **checkPassword**
> CheckPasswordResult checkPassword(checkPasswordRequest)

Check Password

パスワードがポリシーに適合しているかをチェックします。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthMeApi;

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

    AuthMeApi apiInstance = new AuthMeApi(defaultClient);
    CheckPasswordRequest checkPasswordRequest = new CheckPasswordRequest(); // CheckPasswordRequest | 
    try {
      CheckPasswordResult result = apiInstance.checkPassword(checkPasswordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthMeApi#checkPassword");
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
| **checkPasswordRequest** | [**CheckPasswordRequest**](CheckPasswordRequest.md)|  | [optional] |

### Return type

[**CheckPasswordResult**](CheckPasswordResult.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createMyAPIToken"></a>
# **createMyAPIToken**
> UserAPIToken createMyAPIToken(createUserAPITokenRequest)

Create My API Token

自分（ユーザー）のAPIトークンを作成します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthMeApi;

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

    AuthMeApi apiInstance = new AuthMeApi(defaultClient);
    CreateUserAPITokenRequest createUserAPITokenRequest = new CreateUserAPITokenRequest(); // CreateUserAPITokenRequest | 
    try {
      UserAPIToken result = apiInstance.createMyAPIToken(createUserAPITokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthMeApi#createMyAPIToken");
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
| **createUserAPITokenRequest** | [**CreateUserAPITokenRequest**](CreateUserAPITokenRequest.md)|  | [optional] |

### Return type

[**UserAPIToken**](UserAPIToken.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **409** | Conflict |  -  |

<a id="createMyEmail"></a>
# **createMyEmail**
> UserEmail createMyEmail(createEmailRequest)

Create My Email

自分（ユーザー）のメールアドレスを設定します。 メールアドレスの設定が成功すると、確認用URLを含むメールがそのアドレスに送信されます。 確認用URLには、メールアドレス確認用トークンとメールアドレスのIDが含まれます。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthMeApi;

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

    AuthMeApi apiInstance = new AuthMeApi(defaultClient);
    CreateEmailRequest createEmailRequest = new CreateEmailRequest(); // CreateEmailRequest | 
    try {
      UserEmail result = apiInstance.createMyEmail(createEmailRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthMeApi#createMyEmail");
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
| **createEmailRequest** | [**CreateEmailRequest**](CreateEmailRequest.md)|  | [optional] |

### Return type

[**UserEmail**](UserEmail.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **409** | Conflict |  -  |

<a id="deleteMyAPIToken"></a>
# **deleteMyAPIToken**
> deleteMyAPIToken(userApiTokenId)

Delete My API Token

自分（ユーザー）のAPIトークンを削除します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthMeApi;

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

    AuthMeApi apiInstance = new AuthMeApi(defaultClient);
    Long userApiTokenId = 1L; // Long | APIトークンのID
    try {
      apiInstance.deleteMyAPIToken(userApiTokenId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthMeApi#deleteMyAPIToken");
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
| **userApiTokenId** | **Long**| APIトークンのID | |

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
| **204** | No Content |  -  |

<a id="deleteMyEmail"></a>
# **deleteMyEmail**
> deleteMyEmail(userEmailId)

Delete My Email

自分（ユーザー）のメールアドレスを削除します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthMeApi;

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

    AuthMeApi apiInstance = new AuthMeApi(defaultClient);
    Long userEmailId = 1L; // Long | ユーザーのメールアドレスのID
    try {
      apiInstance.deleteMyEmail(userEmailId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthMeApi#deleteMyEmail");
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
| **userEmailId** | **Long**| ユーザーのメールアドレスのID | |

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
| **204** | No Content |  -  |

<a id="getMe"></a>
# **getMe**
> User getMe()

Get Me

自分（ユーザー）を取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthMeApi;

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

    AuthMeApi apiInstance = new AuthMeApi(defaultClient);
    try {
      User result = apiInstance.getMe();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthMeApi#getMe");
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

[**User**](User.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listMyAPITokens"></a>
# **listMyAPITokens**
> UserAPITokens listMyAPITokens()

List My API Tokens

自分（ユーザー）のAPIトークンのリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthMeApi;

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

    AuthMeApi apiInstance = new AuthMeApi(defaultClient);
    try {
      UserAPITokens result = apiInstance.listMyAPITokens();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthMeApi#listMyAPITokens");
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

[**UserAPITokens**](UserAPITokens.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listMyRoles"></a>
# **listMyRoles**
> Roles listMyRoles()

List My Roles

自分（ユーザー）に割り当てられたロールのリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthMeApi;

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

    AuthMeApi apiInstance = new AuthMeApi(defaultClient);
    try {
      Roles result = apiInstance.listMyRoles();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthMeApi#listMyRoles");
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

[**Roles**](Roles.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="sendVerificationEmailToMyAddress"></a>
# **sendVerificationEmailToMyAddress**
> UserEmailVerification sendVerificationEmailToMyAddress(userEmailId)

Send Verification Email to Me

メールアドレスを確認するための確認メールを送信します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthMeApi;

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

    AuthMeApi apiInstance = new AuthMeApi(defaultClient);
    Long userEmailId = 1L; // Long | ユーザーのメールアドレスのID
    try {
      UserEmailVerification result = apiInstance.sendVerificationEmailToMyAddress(userEmailId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthMeApi#sendVerificationEmailToMyAddress");
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
| **userEmailId** | **Long**| ユーザーのメールアドレスのID | |

### Return type

[**UserEmailVerification**](UserEmailVerification.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a id="updateMe"></a>
# **updateMe**
> User updateMe(patchUserRequest)

Update Me

自分（ユーザー）を更新します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthMeApi;

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

    AuthMeApi apiInstance = new AuthMeApi(defaultClient);
    PatchUserRequest patchUserRequest = new PatchUserRequest(); // PatchUserRequest | 
    try {
      User result = apiInstance.updateMe(patchUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthMeApi#updateMe");
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
| **patchUserRequest** | [**PatchUserRequest**](PatchUserRequest.md)|  | [optional] |

### Return type

[**User**](User.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |

<a id="updateMyAPIToken"></a>
# **updateMyAPIToken**
> UserAPIToken updateMyAPIToken(userApiTokenId, updateUserAPITokenRequest)

Update My API Token

自分（ユーザー）のAPIトークンを作成します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthMeApi;

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

    AuthMeApi apiInstance = new AuthMeApi(defaultClient);
    Long userApiTokenId = 1L; // Long | APIトークンのID
    UpdateUserAPITokenRequest updateUserAPITokenRequest = new UpdateUserAPITokenRequest(); // UpdateUserAPITokenRequest | 
    try {
      UserAPIToken result = apiInstance.updateMyAPIToken(userApiTokenId, updateUserAPITokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthMeApi#updateMyAPIToken");
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
| **userApiTokenId** | **Long**| APIトークンのID | |
| **updateUserAPITokenRequest** | [**UpdateUserAPITokenRequest**](UpdateUserAPITokenRequest.md)|  | [optional] |

### Return type

[**UserAPIToken**](UserAPIToken.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateMyAddressToVerified"></a>
# **updateMyAddressToVerified**
> UserEmail updateMyAddressToVerified(userEmailId, updateEmailVerifiedRequest)

Set My Email as Verified

自分（ユーザー）のメールアドレスを確認済みにします。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthMeApi;

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

    AuthMeApi apiInstance = new AuthMeApi(defaultClient);
    Long userEmailId = 1L; // Long | ユーザーのメールアドレスのID
    UpdateEmailVerifiedRequest updateEmailVerifiedRequest = new UpdateEmailVerifiedRequest(); // UpdateEmailVerifiedRequest | 
    try {
      UserEmail result = apiInstance.updateMyAddressToVerified(userEmailId, updateEmailVerifiedRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthMeApi#updateMyAddressToVerified");
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
| **userEmailId** | **Long**| ユーザーのメールアドレスのID | |
| **updateEmailVerifiedRequest** | [**UpdateEmailVerifiedRequest**](UpdateEmailVerifiedRequest.md)|  | [optional] |

### Return type

[**UserEmail**](UserEmail.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateMyEmail"></a>
# **updateMyEmail**
> UserEmail updateMyEmail(userEmailId, patchEmailRequest)

Update My Email

自分（ユーザー）のメールアドレスを更新します。 メールアドレスの設定が成功すると、確認用URLを含むメールがそのアドレスに送信されます。 確認用URLには、メールアドレス確認用トークンとメールアドレスのIDが含まれます。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthMeApi;

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

    AuthMeApi apiInstance = new AuthMeApi(defaultClient);
    Long userEmailId = 1L; // Long | ユーザーのメールアドレスのID
    PatchEmailRequest patchEmailRequest = new PatchEmailRequest(); // PatchEmailRequest | 
    try {
      UserEmail result = apiInstance.updateMyEmail(userEmailId, patchEmailRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthMeApi#updateMyEmail");
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
| **userEmailId** | **Long**| ユーザーのメールアドレスのID | |
| **patchEmailRequest** | [**PatchEmailRequest**](PatchEmailRequest.md)|  | [optional] |

### Return type

[**UserEmail**](UserEmail.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **409** | Conflict |  -  |

