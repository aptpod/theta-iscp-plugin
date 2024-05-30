# MeasTrashedMeasurementsApi

All URIs are relative to *https://example.intdash.jp/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteProjectTrashedMeasurement**](MeasTrashedMeasurementsApi.md#deleteProjectTrashedMeasurement) | **DELETE** /v1/projects/{project_uuid}/trashed_measurements/{measurement_uuid} | Delete Project Trashed Measurement and Delete Data Points Immediately |
| [**deleteTrashedMeasurement**](MeasTrashedMeasurementsApi.md#deleteTrashedMeasurement) | **DELETE** /v1/trashed_measurements/{measurement_uuid} | Delete Trashed Measurement and Delete Data Points Immediately |
| [**listProjectTrashedMeasurements**](MeasTrashedMeasurementsApi.md#listProjectTrashedMeasurements) | **GET** /v1/projects/{project_uuid}/trashed_measurements | List Project Trashed Measurements |
| [**listTrashedMeasurements**](MeasTrashedMeasurementsApi.md#listTrashedMeasurements) | **GET** /v1/trashed_measurements | List Trashed Measurements |
| [**restoreProjectTrashedMeasurement**](MeasTrashedMeasurementsApi.md#restoreProjectTrashedMeasurement) | **DELETE** /v1/projects/{project_uuid}/trashed_measurements/{measurement_uuid}/restore | Restore Project Measurement |
| [**restoreTrashedMeasurement**](MeasTrashedMeasurementsApi.md#restoreTrashedMeasurement) | **DELETE** /v1/trashed_measurements/{measurement_uuid}/restore | Restore Measurement |


<a id="deleteProjectTrashedMeasurement"></a>
# **deleteProjectTrashedMeasurement**
> deleteProjectTrashedMeasurement(projectUuid, measurementUuid)

Delete Project Trashed Measurement and Delete Data Points Immediately

ゴミ箱に入っている計測と、その計測に関連付けられているデータポイントを直ちに削除します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasTrashedMeasurementsApi;

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

    MeasTrashedMeasurementsApi apiInstance = new MeasTrashedMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "86fff159-5887-43c9-bf2d-cd1b522c047d"; // String | 計測のUUID
    try {
      apiInstance.deleteProjectTrashedMeasurement(projectUuid, measurementUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasTrashedMeasurementsApi#deleteProjectTrashedMeasurement");
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
| **measurementUuid** | **String**| 計測のUUID | |

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

<a id="deleteTrashedMeasurement"></a>
# **deleteTrashedMeasurement**
> deleteTrashedMeasurement(measurementUuid)

Delete Trashed Measurement and Delete Data Points Immediately

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/trashed_measurements/{measurement_uuid}&#x60; を使用してください） ゴミ箱に入っている計測と、その計測に関連付けられているデータポイントを直ちに削除します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasTrashedMeasurementsApi;

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

    MeasTrashedMeasurementsApi apiInstance = new MeasTrashedMeasurementsApi(defaultClient);
    String measurementUuid = "86fff159-5887-43c9-bf2d-cd1b522c047d"; // String | 計測のUUID
    try {
      apiInstance.deleteTrashedMeasurement(measurementUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasTrashedMeasurementsApi#deleteTrashedMeasurement");
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
| **measurementUuid** | **String**| 計測のUUID | |

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

<a id="listProjectTrashedMeasurements"></a>
# **listProjectTrashedMeasurements**
> TrashedMeasurements listProjectTrashedMeasurements(projectUuid, limit, page)

List Project Trashed Measurements

ゴミ箱に入っている計測のリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasTrashedMeasurementsApi;

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

    MeasTrashedMeasurementsApi apiInstance = new MeasTrashedMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    Integer limit = 1; // Integer | 1回のリクエストで取得する件数。`0` を指定した場合は、デフォルト値の50件となります。
    Integer page = 1; // Integer | 取得するページの番号
    try {
      TrashedMeasurements result = apiInstance.listProjectTrashedMeasurements(projectUuid, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasTrashedMeasurementsApi#listProjectTrashedMeasurements");
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
| **limit** | **Integer**| 1回のリクエストで取得する件数。&#x60;0&#x60; を指定した場合は、デフォルト値の50件となります。 | [optional] |
| **page** | **Integer**| 取得するページの番号 | [optional] |

### Return type

[**TrashedMeasurements**](TrashedMeasurements.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listTrashedMeasurements"></a>
# **listTrashedMeasurements**
> TrashedMeasurements listTrashedMeasurements(limit, page)

List Trashed Measurements

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/trashed_measurements&#x60; を使用してください） ゴミ箱に入っている計測のリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasTrashedMeasurementsApi;

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

    MeasTrashedMeasurementsApi apiInstance = new MeasTrashedMeasurementsApi(defaultClient);
    Integer limit = 1; // Integer | 1回のリクエストで取得する件数。`0` を指定した場合は、デフォルト値の50件となります。
    Integer page = 1; // Integer | 取得するページの番号
    try {
      TrashedMeasurements result = apiInstance.listTrashedMeasurements(limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasTrashedMeasurementsApi#listTrashedMeasurements");
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
| **limit** | **Integer**| 1回のリクエストで取得する件数。&#x60;0&#x60; を指定した場合は、デフォルト値の50件となります。 | [optional] |
| **page** | **Integer**| 取得するページの番号 | [optional] |

### Return type

[**TrashedMeasurements**](TrashedMeasurements.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="restoreProjectTrashedMeasurement"></a>
# **restoreProjectTrashedMeasurement**
> restoreProjectTrashedMeasurement(projectUuid, measurementUuid)

Restore Project Measurement

ゴミ箱に入っている計測を復元します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasTrashedMeasurementsApi;

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

    MeasTrashedMeasurementsApi apiInstance = new MeasTrashedMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "86fff159-5887-43c9-bf2d-cd1b522c047d"; // String | 計測のUUID
    try {
      apiInstance.restoreProjectTrashedMeasurement(projectUuid, measurementUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasTrashedMeasurementsApi#restoreProjectTrashedMeasurement");
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
| **measurementUuid** | **String**| 計測のUUID | |

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

<a id="restoreTrashedMeasurement"></a>
# **restoreTrashedMeasurement**
> restoreTrashedMeasurement(measurementUuid)

Restore Measurement

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/trashed_measurements/{measurement_uuid}/restore&#x60; を使用してください） ゴミ箱に入っている計測を復元します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasTrashedMeasurementsApi;

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

    MeasTrashedMeasurementsApi apiInstance = new MeasTrashedMeasurementsApi(defaultClient);
    String measurementUuid = "86fff159-5887-43c9-bf2d-cd1b522c047d"; // String | 計測のUUID
    try {
      apiInstance.restoreTrashedMeasurement(measurementUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasTrashedMeasurementsApi#restoreTrashedMeasurement");
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
| **measurementUuid** | **String**| 計測のUUID | |

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

