# AuthProjectEdgesApi

All URIs are relative to *https://example.intdash.jp/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addProjectEdges**](AuthProjectEdgesApi.md#addProjectEdges) | **POST** /auth/projects/{project_uuid}/edges | Add Project Edge |
| [**getProjectEdge**](AuthProjectEdgesApi.md#getProjectEdge) | **GET** /auth/projects/{project_uuid}/edges/{edge_uuid} | Get Project Edge |
| [**listProjectEdges**](AuthProjectEdgesApi.md#listProjectEdges) | **GET** /auth/projects/{project_uuid}/edges | List Project Edges |
| [**removeProjectEdge**](AuthProjectEdgesApi.md#removeProjectEdge) | **DELETE** /auth/projects/{project_uuid}/edges/{edge_uuid} | Remove Project Edge |
| [**updateProjectEdge**](AuthProjectEdgesApi.md#updateProjectEdge) | **PATCH** /auth/projects/{project_uuid}/edges/{edge_uuid} | Update Project Edge |


<a id="addProjectEdges"></a>
# **addProjectEdges**
> ProjectEdge addProjectEdges(projectUuid, addProjectEdgeRequest)

Add Project Edge

エッジをプロジェクトに追加します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthProjectEdgesApi;

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

    AuthProjectEdgesApi apiInstance = new AuthProjectEdgesApi(defaultClient);
    String projectUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | プロジェクトのUUID
    AddProjectEdgeRequest addProjectEdgeRequest = new AddProjectEdgeRequest(); // AddProjectEdgeRequest | 
    try {
      ProjectEdge result = apiInstance.addProjectEdges(projectUuid, addProjectEdgeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthProjectEdgesApi#addProjectEdges");
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
| **addProjectEdgeRequest** | [**AddProjectEdgeRequest**](AddProjectEdgeRequest.md)|  | [optional] |

### Return type

[**ProjectEdge**](ProjectEdge.md)

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

<a id="getProjectEdge"></a>
# **getProjectEdge**
> ProjectEdge getProjectEdge(projectUuid, edgeUuid)

Get Project Edge

プロジェクトに所属するエッジを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthProjectEdgesApi;

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

    AuthProjectEdgesApi apiInstance = new AuthProjectEdgesApi(defaultClient);
    String projectUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | プロジェクトのUUID
    String edgeUuid = "e920a50c-ddde-4571-b066-b568340de7cf"; // String | エッジのUUID
    try {
      ProjectEdge result = apiInstance.getProjectEdge(projectUuid, edgeUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthProjectEdgesApi#getProjectEdge");
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
| **edgeUuid** | **String**| エッジのUUID | |

### Return type

[**ProjectEdge**](ProjectEdge.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listProjectEdges"></a>
# **listProjectEdges**
> ProjectEdges listProjectEdges(projectUuid, edgeUuid, page, perPage, sort)

List Project Edges

プロジェクトに所属するエッジのリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthProjectEdgesApi;

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

    AuthProjectEdgesApi apiInstance = new AuthProjectEdgesApi(defaultClient);
    String projectUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | プロジェクトのUUID
    List<String> edgeUuid = Arrays.asList(); // List<String> | エッジのUUID
    Integer page = 1; // Integer | 取得するページの番号
    Integer perPage = 30; // Integer | 1回のリクエストで取得する件数
    String sort = "created_at"; // String | 並べ替えに使用するキー。接尾辞 `+` を付けた場合は昇順、 `-` を付けた場合は降順で出力されます。 接尾辞を省略した場合は昇順となります。 例えば、 `name-` を指定すると、nameによる降順で出力されます。
    try {
      ProjectEdges result = apiInstance.listProjectEdges(projectUuid, edgeUuid, page, perPage, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthProjectEdgesApi#listProjectEdges");
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
| **edgeUuid** | [**List&lt;String&gt;**](String.md)| エッジのUUID | [optional] |
| **page** | **Integer**| 取得するページの番号 | [optional] [default to 1] |
| **perPage** | **Integer**| 1回のリクエストで取得する件数 | [optional] [default to 30] |
| **sort** | **String**| 並べ替えに使用するキー。接尾辞 &#x60;+&#x60; を付けた場合は昇順、 &#x60;-&#x60; を付けた場合は降順で出力されます。 接尾辞を省略した場合は昇順となります。 例えば、 &#x60;name-&#x60; を指定すると、nameによる降順で出力されます。 | [optional] [enum: created_at, created_at+, created_at-, updated_at, updated_at+, updated_at-, nickname, nickname+, nickname-] |

### Return type

[**ProjectEdges**](ProjectEdges.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="removeProjectEdge"></a>
# **removeProjectEdge**
> removeProjectEdge(projectUuid, edgeUuid)

Remove Project Edge

プロジェクトからエッジを外します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthProjectEdgesApi;

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

    AuthProjectEdgesApi apiInstance = new AuthProjectEdgesApi(defaultClient);
    String projectUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | プロジェクトのUUID
    String edgeUuid = "e920a50c-ddde-4571-b066-b568340de7cf"; // String | エッジのUUID
    try {
      apiInstance.removeProjectEdge(projectUuid, edgeUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthProjectEdgesApi#removeProjectEdge");
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
| **edgeUuid** | **String**| エッジのUUID | |

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

<a id="updateProjectEdge"></a>
# **updateProjectEdge**
> ProjectEdge updateProjectEdge(projectUuid, edgeUuid, updateProjectEdgeRequest)

Update Project Edge

プロジェクトエッジを更新します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.AuthProjectEdgesApi;

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

    AuthProjectEdgesApi apiInstance = new AuthProjectEdgesApi(defaultClient);
    String projectUuid = "0932ff17-567c-4ac8-a40d-136357890f7b"; // String | プロジェクトのUUID
    String edgeUuid = "e920a50c-ddde-4571-b066-b568340de7cf"; // String | エッジのUUID
    UpdateProjectEdgeRequest updateProjectEdgeRequest = new UpdateProjectEdgeRequest(); // UpdateProjectEdgeRequest | 
    try {
      ProjectEdge result = apiInstance.updateProjectEdge(projectUuid, edgeUuid, updateProjectEdgeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthProjectEdgesApi#updateProjectEdge");
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
| **edgeUuid** | **String**| エッジのUUID | |
| **updateProjectEdgeRequest** | [**UpdateProjectEdgeRequest**](UpdateProjectEdgeRequest.md)|  | [optional] |

### Return type

[**ProjectEdge**](ProjectEdge.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **304** | Not Modified |  -  |

