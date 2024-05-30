# MeasMeasurementMarkersApi

All URIs are relative to *https://example.intdash.jp/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMeasurementMarker**](MeasMeasurementMarkersApi.md#createMeasurementMarker) | **POST** /v1/measurements/{measurement_uuid}/markers | Create Measurement Marker by Measurement UUID |
| [**createProjectMeasurementMarker**](MeasMeasurementMarkersApi.md#createProjectMeasurementMarker) | **POST** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/markers | Create Project Measurement Marker by Measurement UUID |
| [**deleteMeasurementMarker**](MeasMeasurementMarkersApi.md#deleteMeasurementMarker) | **DELETE** /v1/measurements/markers/{measurement_marker_uuid} | Delete Measurement Marker |
| [**deleteMeasurementMarkerWithMeasurementUUIDAndMarkerUUID**](MeasMeasurementMarkersApi.md#deleteMeasurementMarkerWithMeasurementUUIDAndMarkerUUID) | **DELETE** /v1/measurements/{measurement_uuid}/markers/{measurement_marker_uuid} | Delete Measurement Marker using Measurement UUID |
| [**deleteMeasurementMarkers**](MeasMeasurementMarkersApi.md#deleteMeasurementMarkers) | **DELETE** /v1/measurements/{measurement_uuid}/markers | Delete Measurement Markers by Measurement UUID |
| [**deleteProjectMeasurementMarker**](MeasMeasurementMarkersApi.md#deleteProjectMeasurementMarker) | **DELETE** /v1/projects/{project_uuid}/measurements/markers/{measurement_marker_uuid} | Delete Project Measurement Marker |
| [**deleteProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID**](MeasMeasurementMarkersApi.md#deleteProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID) | **DELETE** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/markers/{measurement_marker_uuid} | Delete Project Measurement Marker using Measurement UUID |
| [**deleteProjectMeasurementMarkers**](MeasMeasurementMarkersApi.md#deleteProjectMeasurementMarkers) | **DELETE** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/markers | Delete Project Measurement Markers by Measurement UUID |
| [**getMeasurementMarker**](MeasMeasurementMarkersApi.md#getMeasurementMarker) | **GET** /v1/measurements/markers/{measurement_marker_uuid} | Get Measurement Marker |
| [**getMeasurementMarkerWithMeasurementUUIDAndMarkerUUID**](MeasMeasurementMarkersApi.md#getMeasurementMarkerWithMeasurementUUIDAndMarkerUUID) | **GET** /v1/measurements/{measurement_uuid}/markers/{measurement_marker_uuid} | Get Measurement Marker using Measurement UUID |
| [**getMeasurementMarkersWithMeasurementUUID**](MeasMeasurementMarkersApi.md#getMeasurementMarkersWithMeasurementUUID) | **GET** /v1/measurements/{measurement_uuid}/markers | List Measurement Markers by Measurement UUID |
| [**getProjectMeasurementMarker**](MeasMeasurementMarkersApi.md#getProjectMeasurementMarker) | **GET** /v1/projects/{project_uuid}/measurements/markers/{measurement_marker_uuid} | Get Project Measurement Marker |
| [**getProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID**](MeasMeasurementMarkersApi.md#getProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID) | **GET** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/markers/{measurement_marker_uuid} | Get Project Measurement Marker using Measurement UUID |
| [**getProjectMeasurementMarkersWithMeasurementUUID**](MeasMeasurementMarkersApi.md#getProjectMeasurementMarkersWithMeasurementUUID) | **GET** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/markers | List Project Measurement Markers by Measurement UUID |
| [**listMeasurementMarkers**](MeasMeasurementMarkersApi.md#listMeasurementMarkers) | **GET** /v1/measurements/markers | List Measurement Markers |
| [**listProjectMeasurementMarkers**](MeasMeasurementMarkersApi.md#listProjectMeasurementMarkers) | **GET** /v1/projects/{project_uuid}/measurements/markers | List Project Measurement Markers |
| [**updateMeasurementMarker**](MeasMeasurementMarkersApi.md#updateMeasurementMarker) | **PUT** /v1/measurements/markers/{measurement_marker_uuid} | Update Measurement Marker |
| [**updateMeasurementMarkerWithMeasurementUUIDAndMarkerUUID**](MeasMeasurementMarkersApi.md#updateMeasurementMarkerWithMeasurementUUIDAndMarkerUUID) | **PUT** /v1/measurements/{measurement_uuid}/markers/{measurement_marker_uuid} | Replace Measurement Marker using Measurement UUID |
| [**updateProjectMeasurementMarker**](MeasMeasurementMarkersApi.md#updateProjectMeasurementMarker) | **PUT** /v1/projects/{project_uuid}/measurements/markers/{measurement_marker_uuid} | Update Project Measurement Marker |
| [**updateProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID**](MeasMeasurementMarkersApi.md#updateProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID) | **PUT** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/markers/{measurement_marker_uuid} | Replace Project Measurement Marker using Measurement UUID |


<a id="createMeasurementMarker"></a>
# **createMeasurementMarker**
> MeasurementMarker createMeasurementMarker(measurementUuid, measurementMarkerPostRequest)

Create Measurement Marker by Measurement UUID

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/markers&#x60; を使用してください） 計測マーカーを作成します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    MeasurementMarkerPostRequest measurementMarkerPostRequest = new MeasurementMarkerPostRequest(); // MeasurementMarkerPostRequest | 
    try {
      MeasurementMarker result = apiInstance.createMeasurementMarker(measurementUuid, measurementMarkerPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#createMeasurementMarker");
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
| **measurementMarkerPostRequest** | [**MeasurementMarkerPostRequest**](MeasurementMarkerPostRequest.md)|  | [optional] |

### Return type

[**MeasurementMarker**](MeasurementMarker.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createProjectMeasurementMarker"></a>
# **createProjectMeasurementMarker**
> MeasurementMarker createProjectMeasurementMarker(projectUuid, measurementUuid, measurementMarkerPostRequest)

Create Project Measurement Marker by Measurement UUID

計測マーカーを作成します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    MeasurementMarkerPostRequest measurementMarkerPostRequest = new MeasurementMarkerPostRequest(); // MeasurementMarkerPostRequest | 
    try {
      MeasurementMarker result = apiInstance.createProjectMeasurementMarker(projectUuid, measurementUuid, measurementMarkerPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#createProjectMeasurementMarker");
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
| **measurementMarkerPostRequest** | [**MeasurementMarkerPostRequest**](MeasurementMarkerPostRequest.md)|  | [optional] |

### Return type

[**MeasurementMarker**](MeasurementMarker.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteMeasurementMarker"></a>
# **deleteMeasurementMarker**
> deleteMeasurementMarker(measurementMarkerUuid)

Delete Measurement Marker

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/markers/{measurement_marker_uuid}&#x60; を使用してください） 計測マーカーを削除します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String measurementMarkerUuid = "27a841d8-78c0-4e5e-b0ee-ec1fafd90ef6"; // String | 計測マーカーのUUID
    try {
      apiInstance.deleteMeasurementMarker(measurementMarkerUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#deleteMeasurementMarker");
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
| **measurementMarkerUuid** | **String**| 計測マーカーのUUID | |

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

<a id="deleteMeasurementMarkerWithMeasurementUUIDAndMarkerUUID"></a>
# **deleteMeasurementMarkerWithMeasurementUUIDAndMarkerUUID**
> deleteMeasurementMarkerWithMeasurementUUIDAndMarkerUUID(measurementUuid, measurementMarkerUuid)

Delete Measurement Marker using Measurement UUID

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/markers/{Measurement_marker_uuid}&#x60; を使用してください） 計測マーカーを削除します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String measurementMarkerUuid = "27a841d8-78c0-4e5e-b0ee-ec1fafd90ef6"; // String | 計測マーカーのUUID
    try {
      apiInstance.deleteMeasurementMarkerWithMeasurementUUIDAndMarkerUUID(measurementUuid, measurementMarkerUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#deleteMeasurementMarkerWithMeasurementUUIDAndMarkerUUID");
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
| **measurementMarkerUuid** | **String**| 計測マーカーのUUID | |

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

<a id="deleteMeasurementMarkers"></a>
# **deleteMeasurementMarkers**
> deleteMeasurementMarkers(measurementUuid)

Delete Measurement Markers by Measurement UUID

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/markers&#x60; を使用してください） 計測マーカーを削除します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      apiInstance.deleteMeasurementMarkers(measurementUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#deleteMeasurementMarkers");
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

<a id="deleteProjectMeasurementMarker"></a>
# **deleteProjectMeasurementMarker**
> deleteProjectMeasurementMarker(projectUuid, measurementMarkerUuid)

Delete Project Measurement Marker

計測マーカーを削除します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementMarkerUuid = "27a841d8-78c0-4e5e-b0ee-ec1fafd90ef6"; // String | 計測マーカーのUUID
    try {
      apiInstance.deleteProjectMeasurementMarker(projectUuid, measurementMarkerUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#deleteProjectMeasurementMarker");
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
| **measurementMarkerUuid** | **String**| 計測マーカーのUUID | |

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

<a id="deleteProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID"></a>
# **deleteProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID**
> deleteProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID(projectUuid, measurementUuid, measurementMarkerUuid)

Delete Project Measurement Marker using Measurement UUID

計測マーカーを削除します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String measurementMarkerUuid = "27a841d8-78c0-4e5e-b0ee-ec1fafd90ef6"; // String | 計測マーカーのUUID
    try {
      apiInstance.deleteProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID(projectUuid, measurementUuid, measurementMarkerUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#deleteProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID");
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
| **measurementMarkerUuid** | **String**| 計測マーカーのUUID | |

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

<a id="deleteProjectMeasurementMarkers"></a>
# **deleteProjectMeasurementMarkers**
> deleteProjectMeasurementMarkers(projectUuid, measurementUuid)

Delete Project Measurement Markers by Measurement UUID

計測マーカーを削除します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      apiInstance.deleteProjectMeasurementMarkers(projectUuid, measurementUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#deleteProjectMeasurementMarkers");
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

<a id="getMeasurementMarker"></a>
# **getMeasurementMarker**
> MeasurementMarker getMeasurementMarker(measurementMarkerUuid)

Get Measurement Marker

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/markers/{measurement_marker_uuid}&#x60; を使用してください） 計測マーカーを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String measurementMarkerUuid = "27a841d8-78c0-4e5e-b0ee-ec1fafd90ef6"; // String | 計測マーカーのUUID
    try {
      MeasurementMarker result = apiInstance.getMeasurementMarker(measurementMarkerUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#getMeasurementMarker");
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
| **measurementMarkerUuid** | **String**| 計測マーカーのUUID | |

### Return type

[**MeasurementMarker**](MeasurementMarker.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMeasurementMarkerWithMeasurementUUIDAndMarkerUUID"></a>
# **getMeasurementMarkerWithMeasurementUUIDAndMarkerUUID**
> MeasurementMarker getMeasurementMarkerWithMeasurementUUIDAndMarkerUUID(measurementUuid, measurementMarkerUuid)

Get Measurement Marker using Measurement UUID

**Deprecated** このエンドポイントではなく、 &#x60;GET /measurements/{measurement_uuid}&#x60; を使用してください。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String measurementMarkerUuid = "27a841d8-78c0-4e5e-b0ee-ec1fafd90ef6"; // String | 計測マーカーのUUID
    try {
      MeasurementMarker result = apiInstance.getMeasurementMarkerWithMeasurementUUIDAndMarkerUUID(measurementUuid, measurementMarkerUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#getMeasurementMarkerWithMeasurementUUIDAndMarkerUUID");
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
| **measurementMarkerUuid** | **String**| 計測マーカーのUUID | |

### Return type

[**MeasurementMarker**](MeasurementMarker.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMeasurementMarkersWithMeasurementUUID"></a>
# **getMeasurementMarkersWithMeasurementUUID**
> MeasurementMarkersWithoutPage getMeasurementMarkersWithMeasurementUUID(measurementUuid)

List Measurement Markers by Measurement UUID

(**Deprecated** このエンドポイントではなく、 &#x60;GET /measurements/{measurement_uuid}&#x60; を使用してください。) 計測UUIDを指定して、その計測に付与されたマーカーの一覧を取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      MeasurementMarkersWithoutPage result = apiInstance.getMeasurementMarkersWithMeasurementUUID(measurementUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#getMeasurementMarkersWithMeasurementUUID");
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

[**MeasurementMarkersWithoutPage**](MeasurementMarkersWithoutPage.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProjectMeasurementMarker"></a>
# **getProjectMeasurementMarker**
> MeasurementMarker getProjectMeasurementMarker(projectUuid, measurementMarkerUuid)

Get Project Measurement Marker

計測マーカーを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementMarkerUuid = "27a841d8-78c0-4e5e-b0ee-ec1fafd90ef6"; // String | 計測マーカーのUUID
    try {
      MeasurementMarker result = apiInstance.getProjectMeasurementMarker(projectUuid, measurementMarkerUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#getProjectMeasurementMarker");
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
| **measurementMarkerUuid** | **String**| 計測マーカーのUUID | |

### Return type

[**MeasurementMarker**](MeasurementMarker.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID"></a>
# **getProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID**
> MeasurementMarker getProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID(projectUuid, measurementUuid, measurementMarkerUuid)

Get Project Measurement Marker using Measurement UUID

**Deprecated** このエンドポイントではなく、 &#x60;GET /measurements/{measurement_uuid}&#x60; を使用してください。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String measurementMarkerUuid = "27a841d8-78c0-4e5e-b0ee-ec1fafd90ef6"; // String | 計測マーカーのUUID
    try {
      MeasurementMarker result = apiInstance.getProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID(projectUuid, measurementUuid, measurementMarkerUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#getProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID");
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
| **measurementMarkerUuid** | **String**| 計測マーカーのUUID | |

### Return type

[**MeasurementMarker**](MeasurementMarker.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProjectMeasurementMarkersWithMeasurementUUID"></a>
# **getProjectMeasurementMarkersWithMeasurementUUID**
> MeasurementMarkersWithoutPage getProjectMeasurementMarkersWithMeasurementUUID(projectUuid, measurementUuid)

List Project Measurement Markers by Measurement UUID

(**Deprecated** このエンドポイントではなく、 &#x60;GET /measurements/{measurement_uuid}&#x60; を使用してください。) 計測UUIDを指定して、その計測に付与されたマーカーの一覧を取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      MeasurementMarkersWithoutPage result = apiInstance.getProjectMeasurementMarkersWithMeasurementUUID(projectUuid, measurementUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#getProjectMeasurementMarkersWithMeasurementUUID");
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

[**MeasurementMarkersWithoutPage**](MeasurementMarkersWithoutPage.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listMeasurementMarkers"></a>
# **listMeasurementMarkers**
> MeasurementMarkers listMeasurementMarkers(uuid, name, startUnixMicro, endUnixMicro, tagLessThanKeyGreaterThan, exclamationTagLessThanKeyGreaterThan, limit, sort, page, order)

List Measurement Markers

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/markers&#x60; を使用してください） 計測マーカーのリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    List<String> uuid = Arrays.asList(); // List<String> | 計測マーカーのUUID
    List<String> name = Arrays.asList(); // List<String> | 計測マーカーの名前
    Long startUnixMicro = 1000L; // Long | Get MeasMarkers which start Meas.BaseTime + elapsed_time &lt;= this[usec].
    Long endUnixMicro = 1000L; // Long | Get MeasMarkers which start this[usec] &lt; Meas.BaseTime + elapsed_time.
    List<String> tagLessThanKeyGreaterThan = Arrays.asList(); // List<String> | タグのキーと値を使って条件を指定し、条件に一致する計測マーカーを取得します。 キーのみを指定した場合は、指定されたキーを持つ計測マーカーを取得します。 キーと値を指定した場合は、指定されたキーを持ち、その値として指定された値を含む計測マーカーを取得します。 `tag.<key>=<value>` 条件は複数個指定することができ、OR条件で使用されます。 ただし `!tag.<key>` と組み合わせた場合、  `!tag.<key>` が優先されます。  例:      | measurement marker | tag (key: value) |     | ------------------ | ---------------- |     | 1                  | a: value1        |     |                    | c: value2        |     |                    | e: 1             |      | 2                  | a: b             |     |                    | c: d             |      | 3                  | a: b             |    -  `?tag.e=` の場合、計測マーカー1番が取得されます。   -  `?!tag.c=` の場合、計測マーカー3番が取得されます。   -  `?tag.a=&!tag.e=` の場合、計測マーカー2、3番が取得されます。   -  `?tag.a=val&tag.c=d` の場合、計測マーカー1、2番が取得されます。
    List<String> exclamationTagLessThanKeyGreaterThan = Arrays.asList(); // List<String> | タグのキーを使って条件を指定し、条件に一致する計測キャプチャを除外します。 タグの値は無視されます。 `!tag.<key>` を複数個指定した場合、AND条件となります。 また、 `tag.<key>=<value>` と組み合わせて使用した場合、 `tag.<key>=<value>`  よりも `!tag.<key>` が優先されます。 例: 上の `tag.<key>` の説明を参照してください。
    Integer limit = 1000; // Integer | 1回のリクエストで取得する件数
    String sort = "name"; // String | 並べ替えに使用するキー
    Integer page = 1; // Integer | 取得するページの番号
    String order = "asc"; // String | 並べ替えの順序
    try {
      MeasurementMarkers result = apiInstance.listMeasurementMarkers(uuid, name, startUnixMicro, endUnixMicro, tagLessThanKeyGreaterThan, exclamationTagLessThanKeyGreaterThan, limit, sort, page, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#listMeasurementMarkers");
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
| **uuid** | [**List&lt;String&gt;**](String.md)| 計測マーカーのUUID | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)| 計測マーカーの名前 | [optional] |
| **startUnixMicro** | **Long**| Get MeasMarkers which start Meas.BaseTime + elapsed_time &amp;lt;&#x3D; this[usec]. | [optional] |
| **endUnixMicro** | **Long**| Get MeasMarkers which start this[usec] &amp;lt; Meas.BaseTime + elapsed_time. | [optional] |
| **tagLessThanKeyGreaterThan** | [**List&lt;String&gt;**](String.md)| タグのキーと値を使って条件を指定し、条件に一致する計測マーカーを取得します。 キーのみを指定した場合は、指定されたキーを持つ計測マーカーを取得します。 キーと値を指定した場合は、指定されたキーを持ち、その値として指定された値を含む計測マーカーを取得します。 &#x60;tag.&lt;key&gt;&#x3D;&lt;value&gt;&#x60; 条件は複数個指定することができ、OR条件で使用されます。 ただし &#x60;!tag.&lt;key&gt;&#x60; と組み合わせた場合、  &#x60;!tag.&lt;key&gt;&#x60; が優先されます。  例:      | measurement marker | tag (key: value) |     | ------------------ | ---------------- |     | 1                  | a: value1        |     |                    | c: value2        |     |                    | e: 1             |      | 2                  | a: b             |     |                    | c: d             |      | 3                  | a: b             |    -  &#x60;?tag.e&#x3D;&#x60; の場合、計測マーカー1番が取得されます。   -  &#x60;?!tag.c&#x3D;&#x60; の場合、計測マーカー3番が取得されます。   -  &#x60;?tag.a&#x3D;&amp;!tag.e&#x3D;&#x60; の場合、計測マーカー2、3番が取得されます。   -  &#x60;?tag.a&#x3D;val&amp;tag.c&#x3D;d&#x60; の場合、計測マーカー1、2番が取得されます。 | [optional] |
| **exclamationTagLessThanKeyGreaterThan** | [**List&lt;String&gt;**](String.md)| タグのキーを使って条件を指定し、条件に一致する計測キャプチャを除外します。 タグの値は無視されます。 &#x60;!tag.&lt;key&gt;&#x60; を複数個指定した場合、AND条件となります。 また、 &#x60;tag.&lt;key&gt;&#x3D;&lt;value&gt;&#x60; と組み合わせて使用した場合、 &#x60;tag.&lt;key&gt;&#x3D;&lt;value&gt;&#x60;  よりも &#x60;!tag.&lt;key&gt;&#x60; が優先されます。 例: 上の &#x60;tag.&lt;key&gt;&#x60; の説明を参照してください。 | [optional] |
| **limit** | **Integer**| 1回のリクエストで取得する件数 | [optional] |
| **sort** | **String**| 並べ替えに使用するキー | [optional] [default to base_time] [enum: name, base_time, created_at, updated_at] |
| **page** | **Integer**| 取得するページの番号 | [optional] |
| **order** | **String**| 並べ替えの順序 | [optional] [enum: asc, desc] |

### Return type

[**MeasurementMarkers**](MeasurementMarkers.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listProjectMeasurementMarkers"></a>
# **listProjectMeasurementMarkers**
> MeasurementMarkers listProjectMeasurementMarkers(projectUuid, uuid, name, startUnixMicro, endUnixMicro, tagLessThanKeyGreaterThan, exclamationTagLessThanKeyGreaterThan, limit, sort, page, order)

List Project Measurement Markers

計測マーカーのリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    List<String> uuid = Arrays.asList(); // List<String> | 計測マーカーのUUID
    List<String> name = Arrays.asList(); // List<String> | 計測マーカーの名前
    Long startUnixMicro = 1000L; // Long | Get MeasMarkers which start Meas.BaseTime + elapsed_time &lt;= this[usec].
    Long endUnixMicro = 1000L; // Long | Get MeasMarkers which start this[usec] &lt; Meas.BaseTime + elapsed_time.
    List<String> tagLessThanKeyGreaterThan = Arrays.asList(); // List<String> | タグのキーと値を使って条件を指定し、条件に一致する計測マーカーを取得します。 キーのみを指定した場合は、指定されたキーを持つ計測マーカーを取得します。 キーと値を指定した場合は、指定されたキーを持ち、その値として指定された値を含む計測マーカーを取得します。 `tag.<key>=<value>` 条件は複数個指定することができ、OR条件で使用されます。 ただし `!tag.<key>` と組み合わせた場合、  `!tag.<key>` が優先されます。  例:      | measurement marker | tag (key: value) |     | ------------------ | ---------------- |     | 1                  | a: value1        |     |                    | c: value2        |     |                    | e: 1             |      | 2                  | a: b             |     |                    | c: d             |      | 3                  | a: b             |    -  `?tag.e=` の場合、計測マーカー1番が取得されます。   -  `?!tag.c=` の場合、計測マーカー3番が取得されます。   -  `?tag.a=&!tag.e=` の場合、計測マーカー2、3番が取得されます。   -  `?tag.a=val&tag.c=d` の場合、計測マーカー1、2番が取得されます。
    List<String> exclamationTagLessThanKeyGreaterThan = Arrays.asList(); // List<String> | タグのキーを使って条件を指定し、条件に一致する計測キャプチャを除外します。 タグの値は無視されます。 `!tag.<key>` を複数個指定した場合、AND条件となります。 また、 `tag.<key>=<value>` と組み合わせて使用した場合、 `tag.<key>=<value>`  よりも `!tag.<key>` が優先されます。 例: 上の `tag.<key>` の説明を参照してください。
    Integer limit = 1000; // Integer | 1回のリクエストで取得する件数
    String sort = "name"; // String | 並べ替えに使用するキー
    Integer page = 1; // Integer | 取得するページの番号
    String order = "asc"; // String | 並べ替えの順序
    try {
      MeasurementMarkers result = apiInstance.listProjectMeasurementMarkers(projectUuid, uuid, name, startUnixMicro, endUnixMicro, tagLessThanKeyGreaterThan, exclamationTagLessThanKeyGreaterThan, limit, sort, page, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#listProjectMeasurementMarkers");
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
| **uuid** | [**List&lt;String&gt;**](String.md)| 計測マーカーのUUID | [optional] |
| **name** | [**List&lt;String&gt;**](String.md)| 計測マーカーの名前 | [optional] |
| **startUnixMicro** | **Long**| Get MeasMarkers which start Meas.BaseTime + elapsed_time &amp;lt;&#x3D; this[usec]. | [optional] |
| **endUnixMicro** | **Long**| Get MeasMarkers which start this[usec] &amp;lt; Meas.BaseTime + elapsed_time. | [optional] |
| **tagLessThanKeyGreaterThan** | [**List&lt;String&gt;**](String.md)| タグのキーと値を使って条件を指定し、条件に一致する計測マーカーを取得します。 キーのみを指定した場合は、指定されたキーを持つ計測マーカーを取得します。 キーと値を指定した場合は、指定されたキーを持ち、その値として指定された値を含む計測マーカーを取得します。 &#x60;tag.&lt;key&gt;&#x3D;&lt;value&gt;&#x60; 条件は複数個指定することができ、OR条件で使用されます。 ただし &#x60;!tag.&lt;key&gt;&#x60; と組み合わせた場合、  &#x60;!tag.&lt;key&gt;&#x60; が優先されます。  例:      | measurement marker | tag (key: value) |     | ------------------ | ---------------- |     | 1                  | a: value1        |     |                    | c: value2        |     |                    | e: 1             |      | 2                  | a: b             |     |                    | c: d             |      | 3                  | a: b             |    -  &#x60;?tag.e&#x3D;&#x60; の場合、計測マーカー1番が取得されます。   -  &#x60;?!tag.c&#x3D;&#x60; の場合、計測マーカー3番が取得されます。   -  &#x60;?tag.a&#x3D;&amp;!tag.e&#x3D;&#x60; の場合、計測マーカー2、3番が取得されます。   -  &#x60;?tag.a&#x3D;val&amp;tag.c&#x3D;d&#x60; の場合、計測マーカー1、2番が取得されます。 | [optional] |
| **exclamationTagLessThanKeyGreaterThan** | [**List&lt;String&gt;**](String.md)| タグのキーを使って条件を指定し、条件に一致する計測キャプチャを除外します。 タグの値は無視されます。 &#x60;!tag.&lt;key&gt;&#x60; を複数個指定した場合、AND条件となります。 また、 &#x60;tag.&lt;key&gt;&#x3D;&lt;value&gt;&#x60; と組み合わせて使用した場合、 &#x60;tag.&lt;key&gt;&#x3D;&lt;value&gt;&#x60;  よりも &#x60;!tag.&lt;key&gt;&#x60; が優先されます。 例: 上の &#x60;tag.&lt;key&gt;&#x60; の説明を参照してください。 | [optional] |
| **limit** | **Integer**| 1回のリクエストで取得する件数 | [optional] |
| **sort** | **String**| 並べ替えに使用するキー | [optional] [default to base_time] [enum: name, base_time, created_at, updated_at] |
| **page** | **Integer**| 取得するページの番号 | [optional] |
| **order** | **String**| 並べ替えの順序 | [optional] [enum: asc, desc] |

### Return type

[**MeasurementMarkers**](MeasurementMarkers.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateMeasurementMarker"></a>
# **updateMeasurementMarker**
> MeasurementMarker updateMeasurementMarker(measurementMarkerUuid, measurementMarkerPutRequest)

Update Measurement Marker

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/markers/{measurement_marker_uuid}&#x60; を使用してください） 計測マーカーを更新します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String measurementMarkerUuid = "27a841d8-78c0-4e5e-b0ee-ec1fafd90ef6"; // String | 計測マーカーのUUID
    MeasurementMarkerPutRequest measurementMarkerPutRequest = new MeasurementMarkerPutRequest(); // MeasurementMarkerPutRequest | 
    try {
      MeasurementMarker result = apiInstance.updateMeasurementMarker(measurementMarkerUuid, measurementMarkerPutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#updateMeasurementMarker");
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
| **measurementMarkerUuid** | **String**| 計測マーカーのUUID | |
| **measurementMarkerPutRequest** | [**MeasurementMarkerPutRequest**](MeasurementMarkerPutRequest.md)|  | [optional] |

### Return type

[**MeasurementMarker**](MeasurementMarker.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateMeasurementMarkerWithMeasurementUUIDAndMarkerUUID"></a>
# **updateMeasurementMarkerWithMeasurementUUIDAndMarkerUUID**
> MeasurementMarker updateMeasurementMarkerWithMeasurementUUIDAndMarkerUUID(measurementUuid, measurementMarkerUuid, measurementMarkerPutRequest)

Replace Measurement Marker using Measurement UUID

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/markers/{Measurement_marker_uuid}&#x60; を使用してください） 計測マーカーの情報を更新します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String measurementMarkerUuid = "27a841d8-78c0-4e5e-b0ee-ec1fafd90ef6"; // String | 計測マーカーのUUID
    MeasurementMarkerPutRequest measurementMarkerPutRequest = new MeasurementMarkerPutRequest(); // MeasurementMarkerPutRequest | 
    try {
      MeasurementMarker result = apiInstance.updateMeasurementMarkerWithMeasurementUUIDAndMarkerUUID(measurementUuid, measurementMarkerUuid, measurementMarkerPutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#updateMeasurementMarkerWithMeasurementUUIDAndMarkerUUID");
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
| **measurementMarkerUuid** | **String**| 計測マーカーのUUID | |
| **measurementMarkerPutRequest** | [**MeasurementMarkerPutRequest**](MeasurementMarkerPutRequest.md)|  | [optional] |

### Return type

[**MeasurementMarker**](MeasurementMarker.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateProjectMeasurementMarker"></a>
# **updateProjectMeasurementMarker**
> MeasurementMarker updateProjectMeasurementMarker(projectUuid, measurementMarkerUuid, measurementMarkerPutRequest)

Update Project Measurement Marker

計測マーカーを更新します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementMarkerUuid = "27a841d8-78c0-4e5e-b0ee-ec1fafd90ef6"; // String | 計測マーカーのUUID
    MeasurementMarkerPutRequest measurementMarkerPutRequest = new MeasurementMarkerPutRequest(); // MeasurementMarkerPutRequest | 
    try {
      MeasurementMarker result = apiInstance.updateProjectMeasurementMarker(projectUuid, measurementMarkerUuid, measurementMarkerPutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#updateProjectMeasurementMarker");
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
| **measurementMarkerUuid** | **String**| 計測マーカーのUUID | |
| **measurementMarkerPutRequest** | [**MeasurementMarkerPutRequest**](MeasurementMarkerPutRequest.md)|  | [optional] |

### Return type

[**MeasurementMarker**](MeasurementMarker.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID"></a>
# **updateProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID**
> MeasurementMarker updateProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID(projectUuid, measurementUuid, measurementMarkerUuid, measurementMarkerPutRequest)

Replace Project Measurement Marker using Measurement UUID

計測マーカーの情報を更新します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementMarkersApi;

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

    MeasMeasurementMarkersApi apiInstance = new MeasMeasurementMarkersApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String measurementMarkerUuid = "27a841d8-78c0-4e5e-b0ee-ec1fafd90ef6"; // String | 計測マーカーのUUID
    MeasurementMarkerPutRequest measurementMarkerPutRequest = new MeasurementMarkerPutRequest(); // MeasurementMarkerPutRequest | 
    try {
      MeasurementMarker result = apiInstance.updateProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID(projectUuid, measurementUuid, measurementMarkerUuid, measurementMarkerPutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementMarkersApi#updateProjectMeasurementMarkerWithMeasurementUUIDAndMarkerUUID");
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
| **measurementMarkerUuid** | **String**| 計測マーカーのUUID | |
| **measurementMarkerPutRequest** | [**MeasurementMarkerPutRequest**](MeasurementMarkerPutRequest.md)|  | [optional] |

### Return type

[**MeasurementMarker**](MeasurementMarker.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

