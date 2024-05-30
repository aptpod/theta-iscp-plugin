# AuthProjectMembersApi

All URIs are relative to *https://example.intdash.jp/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProjectMember**](AuthProjectMembersApi.md#addProjectMember) | **POST** /auth/projects/{project_uuid}/members | Add Project Member |
| [**addProjectOwnerAttribute**](AuthProjectMembersApi.md#addProjectOwnerAttribute) | **PUT** /auth/projects/{project_uuid}/members/{user_uuid}/owner | Add Project Owner Attribute |
| [**getProjectMember**](AuthProjectMembersApi.md#getProjectMember) | **GET** /auth/projects/{project_uuid}/members/{user_uuid} | Get Project Member |
| [**listProjectMembers**](AuthProjectMembersApi.md#listProjectMembers) | **GET** /auth/projects/{project_uuid}/members | List Project Members |
| [**removeProjectMember**](AuthProjectMembersApi.md#removeProjectMember) | **DELETE** /auth/projects/{project_uuid}/members/{user_uuid} | Remove Project Member |
| [**removeProjectOwnerAttribute**](AuthProjectMembersApi.md#removeProjectOwnerAttribute) | **DELETE** /auth/projects/{project_uuid}/members/{user_uuid}/owner | Remove Project Owner Attribute |
| [**updateProjectMember**](AuthProjectMembersApi.md#updateProjectMember) | **PATCH** /auth/projects/{project_uuid}/members/{user_uuid} | Update Project Member |


<a id="addProjectMember"></a>
# **addProjectMember**
> Member addProjectMember(projectUuid, addProjectMemberRequest)

Add Project Member

プロジェクトメンバーを追加します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthProjectMembersApi;

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

    AuthProjectMembersApi apiInstance = new AuthProjectMembersApi(defaultClient);
    String projectUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | プロジェクトのUUID
    AddProjectMemberRequest addProjectMemberRequest = new AddProjectMemberRequest(); // AddProjectMemberRequest | 
    try {
      Member result = apiInstance.addProjectMember(projectUuid, addProjectMemberRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthProjectMembersApi#addProjectMember");
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
| **projectUuid** | **String**| プロジェクトのUUID | |
| **addProjectMemberRequest** | [**AddProjectMemberRequest**](AddProjectMemberRequest.md)|  | [optional] |

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

<a id="addProjectOwnerAttribute"></a>
# **addProjectOwnerAttribute**
> Member addProjectOwnerAttribute(projectUuid, userUuid)

Add Project Owner Attribute

オーナー属性を追加します。オーナー属性を追加したメンバーは自動的にそのプロジェクトにおける全ての権限が付与されます。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthProjectMembersApi;

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

    AuthProjectMembersApi apiInstance = new AuthProjectMembersApi(defaultClient);
    String projectUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | プロジェクトのUUID
    String userUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | 
    try {
      Member result = apiInstance.addProjectOwnerAttribute(projectUuid, userUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthProjectMembersApi#addProjectOwnerAttribute");
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
| **projectUuid** | **String**| プロジェクトのUUID | |
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

<a id="getProjectMember"></a>
# **getProjectMember**
> Member getProjectMember(projectUuid, userUuid)

Get Project Member

プロジェクトメンバーを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthProjectMembersApi;

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

    AuthProjectMembersApi apiInstance = new AuthProjectMembersApi(defaultClient);
    String projectUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | プロジェクトのUUID
    String userUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | 
    try {
      Member result = apiInstance.getProjectMember(projectUuid, userUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthProjectMembersApi#getProjectMember");
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
| **projectUuid** | **String**| プロジェクトのUUID | |
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

<a id="listProjectMembers"></a>
# **listProjectMembers**
> Members listProjectMembers(projectUuid, userUuid, isOwner, page, perPage, sort)

List Project Members

プロジェクトメンバーリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthProjectMembersApi;

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

    AuthProjectMembersApi apiInstance = new AuthProjectMembersApi(defaultClient);
    String projectUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | プロジェクトのUUID
    List<String> userUuid = Arrays.asList(); // List<String> | ユーザーのUUID
    Boolean isOwner = false; // Boolean | * `true` を指定した場合、オーナーのみを取得します。 * `false` を指定した場合、オーナー以外を取得します。 * 指定を省略した場合、オーナーであるかにかかわらずメンバーを取得します。
    Integer page = 1; // Integer | 取得するページの番号
    Integer perPage = 30; // Integer | 1回のリクエストで取得する件数
    String sort = "created_at"; // String | 並べ替えに使用するキー。接尾辞 `+` を付けた場合は昇順、 `-` を付けた場合は降順で出力されます。 接尾辞を省略した場合は昇順となります。 例えば、 `name-` を指定すると、nameによる降順で出力されます。
    try {
      Members result = apiInstance.listProjectMembers(projectUuid, userUuid, isOwner, page, perPage, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthProjectMembersApi#listProjectMembers");
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
| **projectUuid** | **String**| プロジェクトのUUID | |
| **userUuid** | [**List&lt;String&gt;**](String.md)| ユーザーのUUID | [optional] |
| **isOwner** | **Boolean**| * &#x60;true&#x60; を指定した場合、オーナーのみを取得します。 * &#x60;false&#x60; を指定した場合、オーナー以外を取得します。 * 指定を省略した場合、オーナーであるかにかかわらずメンバーを取得します。 | [optional] |
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

<a id="removeProjectMember"></a>
# **removeProjectMember**
> removeProjectMember(projectUuid, userUuid)

Remove Project Member

プロジェクトからメンバーを外します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthProjectMembersApi;

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

    AuthProjectMembersApi apiInstance = new AuthProjectMembersApi(defaultClient);
    String projectUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | プロジェクトのUUID
    String userUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | 
    try {
      apiInstance.removeProjectMember(projectUuid, userUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthProjectMembersApi#removeProjectMember");
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
| **projectUuid** | **String**| プロジェクトのUUID | |
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

<a id="removeProjectOwnerAttribute"></a>
# **removeProjectOwnerAttribute**
> removeProjectOwnerAttribute(projectUuid, userUuid)

Remove Project Owner Attribute

オーナー属性を取り除きます。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthProjectMembersApi;

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

    AuthProjectMembersApi apiInstance = new AuthProjectMembersApi(defaultClient);
    String projectUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | プロジェクトのUUID
    String userUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | 
    try {
      apiInstance.removeProjectOwnerAttribute(projectUuid, userUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthProjectMembersApi#removeProjectOwnerAttribute");
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
| **projectUuid** | **String**| プロジェクトのUUID | |
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

<a id="updateProjectMember"></a>
# **updateProjectMember**
> Member updateProjectMember(projectUuid, userUuid, updateProjectMemberRequest)

Update Project Member

プロジェクトメンバーを更新します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthProjectMembersApi;

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

    AuthProjectMembersApi apiInstance = new AuthProjectMembersApi(defaultClient);
    String projectUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | プロジェクトのUUID
    String userUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | 
    UpdateProjectMemberRequest updateProjectMemberRequest = new UpdateProjectMemberRequest(); // UpdateProjectMemberRequest | 
    try {
      Member result = apiInstance.updateProjectMember(projectUuid, userUuid, updateProjectMemberRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthProjectMembersApi#updateProjectMember");
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
| **projectUuid** | **String**| プロジェクトのUUID | |
| **userUuid** | **String**|  | |
| **updateProjectMemberRequest** | [**UpdateProjectMemberRequest**](UpdateProjectMemberRequest.md)|  | [optional] |

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

