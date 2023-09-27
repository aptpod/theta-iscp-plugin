# AuthGroupMembersApi

All URIs are relative to *https://example.intdash.jp/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addGroupMember**](AuthGroupMembersApi.md#addGroupMember) | **POST** /auth/groups/{group_uuid}/members | Add Group Member |
| [**addGroupOwnerAttribute**](AuthGroupMembersApi.md#addGroupOwnerAttribute) | **PUT** /auth/groups/{group_uuid}/members/{user_uuid}/owner | Add Group Owner Attribute |
| [**getGroupMember**](AuthGroupMembersApi.md#getGroupMember) | **GET** /auth/groups/{group_uuid}/members/{user_uuid} | Get Group Member |
| [**listGroupMembers**](AuthGroupMembersApi.md#listGroupMembers) | **GET** /auth/groups/{group_uuid}/members | List Group Members |
| [**removeGroupMember**](AuthGroupMembersApi.md#removeGroupMember) | **DELETE** /auth/groups/{group_uuid}/members/{user_uuid} | Remove Group Member |
| [**removeGroupOwnerAttribute**](AuthGroupMembersApi.md#removeGroupOwnerAttribute) | **DELETE** /auth/groups/{group_uuid}/members/{user_uuid}/owner | Remove Group Owner Attribute |
| [**updateGroupMember**](AuthGroupMembersApi.md#updateGroupMember) | **PATCH** /auth/groups/{group_uuid}/members/{user_uuid} | Update Group Member |


<a id="addGroupMember"></a>
# **addGroupMember**
> Member addGroupMember(groupUuid, addGroupMemberRequest)

Add Group Member

グループメンバーを追加します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthGroupMembersApi;

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

    AuthGroupMembersApi apiInstance = new AuthGroupMembersApi(defaultClient);
    String groupUuid = "6b4f4bce-ba32-4ad9-b808-39e2d68b33ee"; // String | グループのUUID
    AddGroupMemberRequest addGroupMemberRequest = new AddGroupMemberRequest(); // AddGroupMemberRequest | 
    try {
      Member result = apiInstance.addGroupMember(groupUuid, addGroupMemberRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthGroupMembersApi#addGroupMember");
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
| **groupUuid** | **String**| グループのUUID | |
| **addGroupMemberRequest** | [**AddGroupMemberRequest**](AddGroupMemberRequest.md)|  | [optional] |

### Return type

[**Member**](Member.md)

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
| **409** | Conflict |  -  |

<a id="addGroupOwnerAttribute"></a>
# **addGroupOwnerAttribute**
> Member addGroupOwnerAttribute(groupUuid, userUuid)

Add Group Owner Attribute

オーナー属性を追加します。オーナー属性を追加したメンバーは自動的にそのグループにおける全ての権限が付与されます。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthGroupMembersApi;

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

    AuthGroupMembersApi apiInstance = new AuthGroupMembersApi(defaultClient);
    String groupUuid = "6b4f4bce-ba32-4ad9-b808-39e2d68b33ee"; // String | グループのUUID
    String userUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | 
    try {
      Member result = apiInstance.addGroupOwnerAttribute(groupUuid, userUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthGroupMembersApi#addGroupOwnerAttribute");
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
| **groupUuid** | **String**| グループのUUID | |
| **userUuid** | **String**|  | |

### Return type

[**Member**](Member.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **304** | Not Modified |  -  |

<a id="getGroupMember"></a>
# **getGroupMember**
> Member getGroupMember(groupUuid, userUuid)

Get Group Member

グループメンバーを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthGroupMembersApi;

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

    AuthGroupMembersApi apiInstance = new AuthGroupMembersApi(defaultClient);
    String groupUuid = "6b4f4bce-ba32-4ad9-b808-39e2d68b33ee"; // String | グループのUUID
    String userUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | 
    try {
      Member result = apiInstance.getGroupMember(groupUuid, userUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthGroupMembersApi#getGroupMember");
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
| **groupUuid** | **String**| グループのUUID | |
| **userUuid** | **String**|  | |

### Return type

[**Member**](Member.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

<a id="listGroupMembers"></a>
# **listGroupMembers**
> Members listGroupMembers(groupUuid, isOwner, userUuid, page, perPage, sort)

List Group Members

グループメンバーリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthGroupMembersApi;

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

    AuthGroupMembersApi apiInstance = new AuthGroupMembersApi(defaultClient);
    String groupUuid = "6b4f4bce-ba32-4ad9-b808-39e2d68b33ee"; // String | グループのUUID
    Boolean isOwner = false; // Boolean | * `true` を指定した場合、オーナーのみを取得します。 * `false` を指定した場合、オーナー以外を取得します。 * 指定を省略した場合、オーナーであるかにかかわらずメンバーを取得します。
    List<String> userUuid = Arrays.asList(); // List<String> | ユーザーのUUID
    Integer page = 1; // Integer | 取得するページの番号
    Integer perPage = 30; // Integer | 1回のリクエストで取得する件数
    String sort = "created_at"; // String | 並べ替えに使用するキー。接尾辞 `+` を付けた場合は昇順、 `-` を付けた場合は降順で出力されます。 接尾辞を省略した場合は昇順となります。 例えば、 `name-` を指定すると、nameによる降順で出力されます。
    try {
      Members result = apiInstance.listGroupMembers(groupUuid, isOwner, userUuid, page, perPage, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthGroupMembersApi#listGroupMembers");
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
| **groupUuid** | **String**| グループのUUID | |
| **isOwner** | **Boolean**| * &#x60;true&#x60; を指定した場合、オーナーのみを取得します。 * &#x60;false&#x60; を指定した場合、オーナー以外を取得します。 * 指定を省略した場合、オーナーであるかにかかわらずメンバーを取得します。 | [optional] |
| **userUuid** | [**List&lt;String&gt;**](String.md)| ユーザーのUUID | [optional] |
| **page** | **Integer**| 取得するページの番号 | [optional] [default to 1] |
| **perPage** | **Integer**| 1回のリクエストで取得する件数 | [optional] [default to 30] |
| **sort** | **String**| 並べ替えに使用するキー。接尾辞 &#x60;+&#x60; を付けた場合は昇順、 &#x60;-&#x60; を付けた場合は降順で出力されます。 接尾辞を省略した場合は昇順となります。 例えば、 &#x60;name-&#x60; を指定すると、nameによる降順で出力されます。 | [optional] [enum: created_at, created_at+, created_at-, updated_at, updated_at+, updated_at-, name, name+, name-] |

### Return type

[**Members**](Members.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="removeGroupMember"></a>
# **removeGroupMember**
> removeGroupMember(groupUuid, userUuid)

Remove Group Member

グループメンバーを除名します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthGroupMembersApi;

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

    AuthGroupMembersApi apiInstance = new AuthGroupMembersApi(defaultClient);
    String groupUuid = "6b4f4bce-ba32-4ad9-b808-39e2d68b33ee"; // String | グループのUUID
    String userUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | 
    try {
      apiInstance.removeGroupMember(groupUuid, userUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthGroupMembersApi#removeGroupMember");
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
| **groupUuid** | **String**| グループのUUID | |
| **userUuid** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **403** | Forbidden |  -  |

<a id="removeGroupOwnerAttribute"></a>
# **removeGroupOwnerAttribute**
> removeGroupOwnerAttribute(groupUuid, userUuid)

Remove Group Owner Attribute

オーナー属性を取り除きます。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthGroupMembersApi;

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

    AuthGroupMembersApi apiInstance = new AuthGroupMembersApi(defaultClient);
    String groupUuid = "6b4f4bce-ba32-4ad9-b808-39e2d68b33ee"; // String | グループのUUID
    String userUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | 
    try {
      apiInstance.removeGroupOwnerAttribute(groupUuid, userUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthGroupMembersApi#removeGroupOwnerAttribute");
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
| **groupUuid** | **String**| グループのUUID | |
| **userUuid** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **304** | Not Modified |  -  |
| **403** | Forbidden |  -  |

<a id="updateGroupMember"></a>
# **updateGroupMember**
> Member updateGroupMember(groupUuid, userUuid, updateGroupMemberRequest)

Update Group Member

グループメンバーを更新します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthGroupMembersApi;

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

    AuthGroupMembersApi apiInstance = new AuthGroupMembersApi(defaultClient);
    String groupUuid = "6b4f4bce-ba32-4ad9-b808-39e2d68b33ee"; // String | グループのUUID
    String userUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | 
    UpdateGroupMemberRequest updateGroupMemberRequest = new UpdateGroupMemberRequest(); // UpdateGroupMemberRequest | 
    try {
      Member result = apiInstance.updateGroupMember(groupUuid, userUuid, updateGroupMemberRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthGroupMembersApi#updateGroupMember");
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
| **groupUuid** | **String**| グループのUUID | |
| **userUuid** | **String**|  | |
| **updateGroupMemberRequest** | [**UpdateGroupMemberRequest**](UpdateGroupMemberRequest.md)|  | [optional] |

### Return type

[**Member**](Member.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

