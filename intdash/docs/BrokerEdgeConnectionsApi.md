# BrokerEdgeConnectionsApi

All URIs are relative to *https://example.intdash.jp/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEdgeConnection**](BrokerEdgeConnectionsApi.md#getEdgeConnection) | **GET** /v1/edge_connections/{edge_connection_uuid} | Get Edge Connection |
| [**getProjectEdgeConnection**](BrokerEdgeConnectionsApi.md#getProjectEdgeConnection) | **GET** /v1/projects/{project_uuid}/edge_connections/{edge_connection_uuid} | Get Project Edge Connection |
| [**listEdgeConnections**](BrokerEdgeConnectionsApi.md#listEdgeConnections) | **GET** /v1/edge_connections | List Edge Connections |
| [**listProjectEdgeConnections**](BrokerEdgeConnectionsApi.md#listProjectEdgeConnections) | **GET** /v1/projects/{project_uuid}/edge_connections | List Project Edge Connections |


<a id="getEdgeConnection"></a>
# **getEdgeConnection**
> EdgeConnection getEdgeConnection(edgeConnectionUuid)

Get Edge Connection

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/edge_connection/{edge_connection_uuid}&#x60; を使用してください） エッジ接続（ &#x60;/v1/ws/measurements&#x60; に接続されたエッジの接続情報）を取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.BrokerEdgeConnectionsApi;

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

    BrokerEdgeConnectionsApi apiInstance = new BrokerEdgeConnectionsApi(defaultClient);
    String edgeConnectionUuid = "e0326d93-6e94-4edf-92a2-961cc1c07414"; // String | エッジ接続のUUID
    try {
      EdgeConnection result = apiInstance.getEdgeConnection(edgeConnectionUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrokerEdgeConnectionsApi#getEdgeConnection");
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
| **edgeConnectionUuid** | **String**| エッジ接続のUUID | |

### Return type

[**EdgeConnection**](EdgeConnection.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProjectEdgeConnection"></a>
# **getProjectEdgeConnection**
> EdgeConnection getProjectEdgeConnection(projectUuid, edgeConnectionUuid)

Get Project Edge Connection

エッジ接続（ &#x60;/v1/ws/measurements&#x60; に接続されたエッジの接続情報）を取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.BrokerEdgeConnectionsApi;

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

    BrokerEdgeConnectionsApi apiInstance = new BrokerEdgeConnectionsApi(defaultClient);
    String projectUuid = "c78ce0c1-eb57-4f93-a087-ee3b7cee5e06"; // String | プロジェクトのUUID
    String edgeConnectionUuid = "e0326d93-6e94-4edf-92a2-961cc1c07414"; // String | エッジ接続のUUID
    try {
      EdgeConnection result = apiInstance.getProjectEdgeConnection(projectUuid, edgeConnectionUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrokerEdgeConnectionsApi#getProjectEdgeConnection");
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
| **edgeConnectionUuid** | **String**| エッジ接続のUUID | |

### Return type

[**EdgeConnection**](EdgeConnection.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listEdgeConnections"></a>
# **listEdgeConnections**
> EdgeConnectionList listEdgeConnections(edge, sort, order, limit, page)

List Edge Connections

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/edge_connection&#x60; を使用してください）  エッジ接続のリストを取得します。  エッジ接続は、エッジが &#x60;/v1/ws/measurements&#x60; エンドポイントに接続したときに新規作成され、  3日間更新がないと削除されます。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.BrokerEdgeConnectionsApi;

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

    BrokerEdgeConnectionsApi apiInstance = new BrokerEdgeConnectionsApi(defaultClient);
    List<String> edge = Arrays.asList(); // List<String> | エッジのUUID
    String sort = "last_lived_at"; // String | 並べ替えに使用するキー
    String order = "asc"; // String | 並べ替えの順序
    Integer limit = 100; // Integer | 1回のリクエストで取得する件数
    Integer page = 1; // Integer | 取得するページの番号
    try {
      EdgeConnectionList result = apiInstance.listEdgeConnections(edge, sort, order, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrokerEdgeConnectionsApi#listEdgeConnections");
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
| **edge** | [**List&lt;String&gt;**](String.md)| エッジのUUID | [optional] |
| **sort** | **String**| 並べ替えに使用するキー | [optional] [default to last_lived_at] [enum: last_lived_at, created_at, updated_at] |
| **order** | **String**| 並べ替えの順序 | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **Integer**| 1回のリクエストで取得する件数 | [optional] [default to 100] |
| **page** | **Integer**| 取得するページの番号 | [optional] [default to 1] |

### Return type

[**EdgeConnectionList**](EdgeConnectionList.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listProjectEdgeConnections"></a>
# **listProjectEdgeConnections**
> EdgeConnectionList listProjectEdgeConnections(projectUuid, edge, sort, order, limit, page)

List Project Edge Connections

エッジ接続のリストを取得します。 エッジ接続は、エッジが &#x60;/v1/ws/measurements&#x60; エンドポイントに接続したときに新規作成され、 3日間更新がないと削除されます。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.BrokerEdgeConnectionsApi;

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

    BrokerEdgeConnectionsApi apiInstance = new BrokerEdgeConnectionsApi(defaultClient);
    String projectUuid = "c78ce0c1-eb57-4f93-a087-ee3b7cee5e06"; // String | プロジェクトのUUID
    List<String> edge = Arrays.asList(); // List<String> | エッジのUUID
    String sort = "last_lived_at"; // String | 並べ替えに使用するキー
    String order = "asc"; // String | 並べ替えの順序
    Integer limit = 100; // Integer | 1回のリクエストで取得する件数
    Integer page = 1; // Integer | 取得するページの番号
    try {
      EdgeConnectionList result = apiInstance.listProjectEdgeConnections(projectUuid, edge, sort, order, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BrokerEdgeConnectionsApi#listProjectEdgeConnections");
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
| **edge** | [**List&lt;String&gt;**](String.md)| エッジのUUID | [optional] |
| **sort** | **String**| 並べ替えに使用するキー | [optional] [default to last_lived_at] [enum: last_lived_at, created_at, updated_at] |
| **order** | **String**| 並べ替えの順序 | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **Integer**| 1回のリクエストで取得する件数 | [optional] [default to 100] |
| **page** | **Integer**| 取得するページの番号 | [optional] [default to 1] |

### Return type

[**EdgeConnectionList**](EdgeConnectionList.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

