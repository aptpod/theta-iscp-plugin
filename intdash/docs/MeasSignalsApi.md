# MeasSignalsApi

All URIs are relative to *https://example.intdash.jp/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProjectSignal**](MeasSignalsApi.md#createProjectSignal) | **POST** /v1/projects/{project_uuid}/signals | Create Project Signal |
| [**createSignal**](MeasSignalsApi.md#createSignal) | **POST** /v1/signals | Create Signal |
| [**deleteProjectSignal**](MeasSignalsApi.md#deleteProjectSignal) | **DELETE** /v1/projects/{project_uuid}/signals/{signal_uuid} | Delete Project Signal |
| [**deleteSignal**](MeasSignalsApi.md#deleteSignal) | **DELETE** /v1/signals/{signal_uuid} | Delete Signal |
| [**getProjectSignal**](MeasSignalsApi.md#getProjectSignal) | **GET** /v1/projects/{project_uuid}/signals/{signal_uuid} | Get Project Signal |
| [**getSignal**](MeasSignalsApi.md#getSignal) | **GET** /v1/signals/{signal_uuid} | Get Signal |
| [**listProjectSignals**](MeasSignalsApi.md#listProjectSignals) | **GET** /v1/projects/{project_uuid}/signals | List Project Signals |
| [**listSignals**](MeasSignalsApi.md#listSignals) | **GET** /v1/signals | List Signals |
| [**updateProjectSignal**](MeasSignalsApi.md#updateProjectSignal) | **PUT** /v1/projects/{project_uuid}/signals/{signal_uuid} | Update Project Signal |
| [**updateSignal**](MeasSignalsApi.md#updateSignal) | **PUT** /v1/signals/{signal_uuid} | Update Signal |


<a id="createProjectSignal"></a>
# **createProjectSignal**
> Signal createProjectSignal(projectUuid, createSignalRequest)

Create Project Signal

信号定義を作成します。  * **Note**     - 既存の信号定義と &#x60;label&#x60; が重複する場合、または &#x60;uuid&#x60; が重複する場合は、       ステータスコード &#x60;409 Conflict&#x60; が返却されます。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasSignalsApi;

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

    MeasSignalsApi apiInstance = new MeasSignalsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    CreateSignalRequest createSignalRequest = new CreateSignalRequest(); // CreateSignalRequest | 
    try {
      Signal result = apiInstance.createProjectSignal(projectUuid, createSignalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasSignalsApi#createProjectSignal");
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
| **createSignalRequest** | [**CreateSignalRequest**](CreateSignalRequest.md)|  | [optional] |

### Return type

[**Signal**](Signal.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createSignal"></a>
# **createSignal**
> Signal createSignal(createSignalRequest)

Create Signal

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/signals&#x60; を使用してください）  信号定義を作成します。   * **Note**      - 既存の信号定義と &#x60;label&#x60; が重複する場合、または &#x60;uuid&#x60; が重複する場合は、        ステータスコード &#x60;409 Conflict&#x60; が返却されます。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasSignalsApi;

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

    MeasSignalsApi apiInstance = new MeasSignalsApi(defaultClient);
    CreateSignalRequest createSignalRequest = new CreateSignalRequest(); // CreateSignalRequest | 
    try {
      Signal result = apiInstance.createSignal(createSignalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasSignalsApi#createSignal");
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
| **createSignalRequest** | [**CreateSignalRequest**](CreateSignalRequest.md)|  | [optional] |

### Return type

[**Signal**](Signal.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteProjectSignal"></a>
# **deleteProjectSignal**
> deleteProjectSignal(projectUuid, signalUuid)

Delete Project Signal

信号定義を削除します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasSignalsApi;

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

    MeasSignalsApi apiInstance = new MeasSignalsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String signalUuid = "a74b933c-7c3a-4e9f-bf16-299a96d26562"; // String | 信号定義のUUID
    try {
      apiInstance.deleteProjectSignal(projectUuid, signalUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasSignalsApi#deleteProjectSignal");
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
| **signalUuid** | **String**| 信号定義のUUID | |

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

<a id="deleteSignal"></a>
# **deleteSignal**
> deleteSignal(signalUuid)

Delete Signal

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/signals/{signal_uuid}&#x60; を使用してください） 信号定義を削除します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasSignalsApi;

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

    MeasSignalsApi apiInstance = new MeasSignalsApi(defaultClient);
    String signalUuid = "a74b933c-7c3a-4e9f-bf16-299a96d26562"; // String | 信号定義のUUID
    try {
      apiInstance.deleteSignal(signalUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasSignalsApi#deleteSignal");
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
| **signalUuid** | **String**| 信号定義のUUID | |

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

<a id="getProjectSignal"></a>
# **getProjectSignal**
> Signal getProjectSignal(projectUuid, signalUuid)

Get Project Signal

信号定義を取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasSignalsApi;

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

    MeasSignalsApi apiInstance = new MeasSignalsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String signalUuid = "a74b933c-7c3a-4e9f-bf16-299a96d26562"; // String | 信号定義のUUID
    try {
      Signal result = apiInstance.getProjectSignal(projectUuid, signalUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasSignalsApi#getProjectSignal");
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
| **signalUuid** | **String**| 信号定義のUUID | |

### Return type

[**Signal**](Signal.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSignal"></a>
# **getSignal**
> Signal getSignal(signalUuid)

Get Signal

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/signals/{signal_uuid}&#x60; を使用してください） 信号定義を取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasSignalsApi;

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

    MeasSignalsApi apiInstance = new MeasSignalsApi(defaultClient);
    String signalUuid = "a74b933c-7c3a-4e9f-bf16-299a96d26562"; // String | 信号定義のUUID
    try {
      Signal result = apiInstance.getSignal(signalUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasSignalsApi#getSignal");
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
| **signalUuid** | **String**| 信号定義のUUID | |

### Return type

[**Signal**](Signal.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listProjectSignals"></a>
# **listProjectSignals**
> Signals listProjectSignals(projectUuid, label, sort, order, limit, page)

List Project Signals

信号定義のリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasSignalsApi;

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

    MeasSignalsApi apiInstance = new MeasSignalsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    List<String> label = Arrays.asList(); // List<String> | ラベルが指定した文字列から始まる信号定義を取得します。 文字列をダブルクォーテーションで囲むと、完全一致のものだけを取得します。
    String sort = "label"; // String | 並べ替えに使用するキー
    String order = "asc"; // String | 並べ替えの順序
    Integer limit = 100; // Integer | 1回のリクエストで取得する件数
    Integer page = 1; // Integer | 取得するページの番号
    try {
      Signals result = apiInstance.listProjectSignals(projectUuid, label, sort, order, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasSignalsApi#listProjectSignals");
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
| **label** | [**List&lt;String&gt;**](String.md)| ラベルが指定した文字列から始まる信号定義を取得します。 文字列をダブルクォーテーションで囲むと、完全一致のものだけを取得します。 | [optional] |
| **sort** | **String**| 並べ替えに使用するキー | [optional] [enum: label, created_at, updated_at] |
| **order** | **String**| 並べ替えの順序 | [optional] [enum: asc, desc] |
| **limit** | **Integer**| 1回のリクエストで取得する件数 | [optional] |
| **page** | **Integer**| 取得するページの番号 | [optional] |

### Return type

[**Signals**](Signals.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listSignals"></a>
# **listSignals**
> Signals listSignals(label, sort, order, limit, page)

List Signals

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/signals&#x60; を使用してください） 信号定義のリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasSignalsApi;

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

    MeasSignalsApi apiInstance = new MeasSignalsApi(defaultClient);
    List<String> label = Arrays.asList(); // List<String> | ラベルが指定した文字列から始まる信号定義を取得します。 文字列をダブルクォーテーションで囲むと、完全一致のものだけを取得します。
    String sort = "label"; // String | 並べ替えに使用するキー
    String order = "asc"; // String | 並べ替えの順序
    Integer limit = 100; // Integer | 1回のリクエストで取得する件数
    Integer page = 1; // Integer | 取得するページの番号
    try {
      Signals result = apiInstance.listSignals(label, sort, order, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasSignalsApi#listSignals");
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
| **label** | [**List&lt;String&gt;**](String.md)| ラベルが指定した文字列から始まる信号定義を取得します。 文字列をダブルクォーテーションで囲むと、完全一致のものだけを取得します。 | [optional] |
| **sort** | **String**| 並べ替えに使用するキー | [optional] [enum: label, created_at, updated_at] |
| **order** | **String**| 並べ替えの順序 | [optional] [enum: asc, desc] |
| **limit** | **Integer**| 1回のリクエストで取得する件数 | [optional] |
| **page** | **Integer**| 取得するページの番号 | [optional] |

### Return type

[**Signals**](Signals.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateProjectSignal"></a>
# **updateProjectSignal**
> Signal updateProjectSignal(projectUuid, signalUuid, updateSignalRequest)

Update Project Signal

信号定義を更新します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasSignalsApi;

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

    MeasSignalsApi apiInstance = new MeasSignalsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String signalUuid = "a74b933c-7c3a-4e9f-bf16-299a96d26562"; // String | 信号定義のUUID
    UpdateSignalRequest updateSignalRequest = new UpdateSignalRequest(); // UpdateSignalRequest | 
    try {
      Signal result = apiInstance.updateProjectSignal(projectUuid, signalUuid, updateSignalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasSignalsApi#updateProjectSignal");
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
| **signalUuid** | **String**| 信号定義のUUID | |
| **updateSignalRequest** | [**UpdateSignalRequest**](UpdateSignalRequest.md)|  | [optional] |

### Return type

[**Signal**](Signal.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateSignal"></a>
# **updateSignal**
> Signal updateSignal(signalUuid, updateSignalRequest)

Update Signal

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/signals/{signal_uuid}&#x60; を使用してください） 信号定義を更新します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasSignalsApi;

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

    MeasSignalsApi apiInstance = new MeasSignalsApi(defaultClient);
    String signalUuid = "a74b933c-7c3a-4e9f-bf16-299a96d26562"; // String | 信号定義のUUID
    UpdateSignalRequest updateSignalRequest = new UpdateSignalRequest(); // UpdateSignalRequest | 
    try {
      Signal result = apiInstance.updateSignal(signalUuid, updateSignalRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasSignalsApi#updateSignal");
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
| **signalUuid** | **String**| 信号定義のUUID | |
| **updateSignalRequest** | [**UpdateSignalRequest**](UpdateSignalRequest.md)|  | [optional] |

### Return type

[**Signal**](Signal.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

