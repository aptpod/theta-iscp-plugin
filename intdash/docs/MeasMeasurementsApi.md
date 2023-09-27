# MeasMeasurementsApi

All URIs are relative to *https://example.intdash.jp/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**completeMeasurement**](MeasMeasurementsApi.md#completeMeasurement) | **PUT** /v1/measurements/{measurement_uuid}/complete | Complete Measurement |
| [**completeProjectMeasurement**](MeasMeasurementsApi.md#completeProjectMeasurement) | **PUT** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/complete | Complete Project Measurement |
| [**createMeasurement**](MeasMeasurementsApi.md#createMeasurement) | **POST** /v1/measurements | Create Measurement |
| [**createMeasurementSequenceChunks**](MeasMeasurementsApi.md#createMeasurementSequenceChunks) | **POST** /v1/measurements/sequences/chunks | Create Measurement Sequence Chunk |
| [**createMeasurementWithUUID**](MeasMeasurementsApi.md#createMeasurementWithUUID) | **POST** /v1/measurements/{measurement_uuid} | Create Measurement with UUID |
| [**createProjectMeasurement**](MeasMeasurementsApi.md#createProjectMeasurement) | **POST** /v1/projects/{project_uuid}/measurements | Create Project Measurement |
| [**createProjectMeasurementSequenceChunks**](MeasMeasurementsApi.md#createProjectMeasurementSequenceChunks) | **POST** /v1/projects/{project_uuid}/measurements/sequences/chunks | Create Project Measurement Sequence Chunk |
| [**createProjectMeasurementWithUUID**](MeasMeasurementsApi.md#createProjectMeasurementWithUUID) | **POST** /v1/projects/{project_uuid}/measurements/{measurement_uuid} | Create Project Measurement with UUID |
| [**deleteMeasurement**](MeasMeasurementsApi.md#deleteMeasurement) | **DELETE** /v1/measurements/{measurement_uuid} | Trash Measurement |
| [**deleteMeasurementBaseTime**](MeasMeasurementsApi.md#deleteMeasurementBaseTime) | **DELETE** /v1/measurements/{measurement_uuid}/basetimes/{type} | Delete Measurement Base Time |
| [**deleteProjectMeasurement**](MeasMeasurementsApi.md#deleteProjectMeasurement) | **DELETE** /v1/projects/{project_uuid}/measurements/{measurement_uuid} | Trash Project Measurement |
| [**deleteProjectMeasurementBaseTime**](MeasMeasurementsApi.md#deleteProjectMeasurementBaseTime) | **DELETE** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/basetimes/{type} | Delete Project Measurement Base Time |
| [**endMeasurement**](MeasMeasurementsApi.md#endMeasurement) | **PUT** /v1/measurements/{measurement_uuid}/end | End Measurement |
| [**endProjectMeasurement**](MeasMeasurementsApi.md#endProjectMeasurement) | **PUT** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/end | End Project Measurement |
| [**getMeasurement**](MeasMeasurementsApi.md#getMeasurement) | **GET** /v1/measurements/{measurement_uuid} | Get Measurement |
| [**getMeasurementBaseTime**](MeasMeasurementsApi.md#getMeasurementBaseTime) | **GET** /v1/measurements/{measurement_uuid}/basetimes/{type} | Get Measurement Base Time |
| [**getMeasurementFromMeasurementMarker**](MeasMeasurementsApi.md#getMeasurementFromMeasurementMarker) | **GET** /v1/measurements/markers/{measurement_marker_uuid}/measurement | Get Measurement from Marker |
| [**getMeasurementSections**](MeasMeasurementsApi.md#getMeasurementSections) | **GET** /v1/measurements/{measurement_uuid}/sections | List Measurement Sections |
| [**getMeasurementSequence**](MeasMeasurementsApi.md#getMeasurementSequence) | **GET** /v1/measurements/{measurement_uuid}/sequences/{sequences_uuid} | Get Measurement Sequence |
| [**getProjectMeasurement**](MeasMeasurementsApi.md#getProjectMeasurement) | **GET** /v1/projects/{project_uuid}/measurements/{measurement_uuid} | Get Project Measurement |
| [**getProjectMeasurementBaseTime**](MeasMeasurementsApi.md#getProjectMeasurementBaseTime) | **GET** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/basetimes/{type} | Get Project Measurement Base Time |
| [**getProjectMeasurementSections**](MeasMeasurementsApi.md#getProjectMeasurementSections) | **GET** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/sections | List Project Measurement Sections |
| [**getProjectMeasurementSequence**](MeasMeasurementsApi.md#getProjectMeasurementSequence) | **GET** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/sequences/{sequences_uuid} | Get Project Measurement Sequence |
| [**listMeasurementBaseTimes**](MeasMeasurementsApi.md#listMeasurementBaseTimes) | **GET** /v1/measurements/{measurement_uuid}/basetimes | List Measurement Base Times |
| [**listMeasurementSequences**](MeasMeasurementsApi.md#listMeasurementSequences) | **GET** /v1/measurements/{measurement_uuid}/sequences | List Measurement Sequences |
| [**listMeasurements**](MeasMeasurementsApi.md#listMeasurements) | **GET** /v1/measurements | List Measurements |
| [**listProjectMeasurementBaseTimes**](MeasMeasurementsApi.md#listProjectMeasurementBaseTimes) | **GET** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/basetimes | List Project Measurement Base Times |
| [**listProjectMeasurementSequences**](MeasMeasurementsApi.md#listProjectMeasurementSequences) | **GET** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/sequences | List Project Measurement Sequences |
| [**listProjectMeasurements**](MeasMeasurementsApi.md#listProjectMeasurements) | **GET** /v1/projects/{project_uuid}/measurements | List Project Measurements |
| [**protectMeasurement**](MeasMeasurementsApi.md#protectMeasurement) | **PUT** /v1/measurements/{measurement_uuid}/protected | Protect Measurement |
| [**protectProjectMeasurement**](MeasMeasurementsApi.md#protectProjectMeasurement) | **PUT** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/protected | Protect Project Measurement |
| [**replaceMeasurementSequence**](MeasMeasurementsApi.md#replaceMeasurementSequence) | **PUT** /v1/measurements/{measurement_uuid}/sequences/{sequences_uuid} | Replace Measurement Sequence |
| [**replaceProjectMeasurementSequence**](MeasMeasurementsApi.md#replaceProjectMeasurementSequence) | **PUT** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/sequences/{sequences_uuid} | Replace Project Measurement Sequence |
| [**unprotectMeasurement**](MeasMeasurementsApi.md#unprotectMeasurement) | **DELETE** /v1/measurements/{measurement_uuid}/protected | Unprotect Measurement |
| [**unprotectProjectMeasurement**](MeasMeasurementsApi.md#unprotectProjectMeasurement) | **DELETE** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/protected | Unprotect Project Measurement |
| [**updateMeasurement**](MeasMeasurementsApi.md#updateMeasurement) | **PUT** /v1/measurements/{measurement_uuid} | Update Measurement |
| [**updateMeasurementBaseTime**](MeasMeasurementsApi.md#updateMeasurementBaseTime) | **PUT** /v1/measurements/{measurement_uuid}/basetimes/{type} | Replace Measurement Base Time |
| [**updateMeasurementSequence**](MeasMeasurementsApi.md#updateMeasurementSequence) | **PATCH** /v1/measurements/{measurement_uuid}/sequences/{sequences_uuid} | Update Measurement Sequence |
| [**updateProjectMeasurement**](MeasMeasurementsApi.md#updateProjectMeasurement) | **PUT** /v1/projects/{project_uuid}/measurements/{measurement_uuid} | Update Project Measurement |
| [**updateProjectMeasurementBaseTime**](MeasMeasurementsApi.md#updateProjectMeasurementBaseTime) | **PUT** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/basetimes/{type} | Replace Project Measurement Base Time |
| [**updateProjectMeasurementSequence**](MeasMeasurementsApi.md#updateProjectMeasurementSequence) | **PATCH** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/sequences/{sequences_uuid} | Update Project Measurement Sequence |


<a id="completeMeasurement"></a>
# **completeMeasurement**
> Measurement completeMeasurement(measurementUuid)

Complete Measurement

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/complete&#x60; を使用してください）  計測を回収完了（completed）にします。  completedは、エッジでのデータ取得が終了し（ended）、  かつ、すべてのデータがサーバーに送信されたことを意味します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      Measurement result = apiInstance.completeMeasurement(measurementUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#completeMeasurement");
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

[**Measurement**](Measurement.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="completeProjectMeasurement"></a>
# **completeProjectMeasurement**
> Measurement completeProjectMeasurement(projectUuid, measurementUuid)

Complete Project Measurement

計測を回収完了（completed）にします。 completedは、エッジでのデータ取得が終了し（ended）、 かつ、すべてのデータがサーバーに送信されたことを意味します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      Measurement result = apiInstance.completeProjectMeasurement(projectUuid, measurementUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#completeProjectMeasurement");
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

[**Measurement**](Measurement.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createMeasurement"></a>
# **createMeasurement**
> Measurement createMeasurement(measCreate)

Create Measurement

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements&#x60; を使用してください）  計測を作成します。   - **Note**    - 計測の保護／非保護を切り替える権限を持たないエッジも、      計測作成時は保護された計測を作成することが可能です。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    MeasCreate measCreate = new MeasCreate(); // MeasCreate | 
    try {
      Measurement result = apiInstance.createMeasurement(measCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#createMeasurement");
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
| **measCreate** | [**MeasCreate**](MeasCreate.md)|  | [optional] |

### Return type

[**Measurement**](Measurement.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createMeasurementSequenceChunks"></a>
# **createMeasurementSequenceChunks**
> CreateMeasurementChunksResult createMeasurementSequenceChunks(body)

Create Measurement Sequence Chunk

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/sequence/chunks&#x60; を使用してください） 計測シーケンスにチャンクを作成します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    File body = new File("/path/to/file"); // File | 
    try {
      CreateMeasurementChunksResult result = apiInstance.createMeasurementSequenceChunks(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#createMeasurementSequenceChunks");
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
| **body** | **File**|  | [optional] |

### Return type

[**CreateMeasurementChunksResult**](CreateMeasurementChunksResult.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/vnd.iscp.v2.protobuf, application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createMeasurementWithUUID"></a>
# **createMeasurementWithUUID**
> Measurement createMeasurementWithUUID(measurementUuid, measCreate)

Create Measurement with UUID

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}&#x60; を使用してください） 指定したUUIDの計測を作成します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    MeasCreate measCreate = new MeasCreate(); // MeasCreate | 
    try {
      Measurement result = apiInstance.createMeasurementWithUUID(measurementUuid, measCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#createMeasurementWithUUID");
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
| **measCreate** | [**MeasCreate**](MeasCreate.md)|  | [optional] |

### Return type

[**Measurement**](Measurement.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createProjectMeasurement"></a>
# **createProjectMeasurement**
> Measurement createProjectMeasurement(projectUuid, measCreate)

Create Project Measurement

計測を作成します。  - **Note**   - 計測の保護／非保護を切り替える権限を持たないエッジも、     計測作成時は保護された計測を作成することが可能です。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    MeasCreate measCreate = new MeasCreate(); // MeasCreate | 
    try {
      Measurement result = apiInstance.createProjectMeasurement(projectUuid, measCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#createProjectMeasurement");
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
| **measCreate** | [**MeasCreate**](MeasCreate.md)|  | [optional] |

### Return type

[**Measurement**](Measurement.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createProjectMeasurementSequenceChunks"></a>
# **createProjectMeasurementSequenceChunks**
> CreateMeasurementChunksResult createProjectMeasurementSequenceChunks(projectUuid, body)

Create Project Measurement Sequence Chunk

計測シーケンスにチャンクを作成します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    File body = new File("/path/to/file"); // File | 
    try {
      CreateMeasurementChunksResult result = apiInstance.createProjectMeasurementSequenceChunks(projectUuid, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#createProjectMeasurementSequenceChunks");
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
| **body** | **File**|  | [optional] |

### Return type

[**CreateMeasurementChunksResult**](CreateMeasurementChunksResult.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/vnd.iscp.v2.protobuf, application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createProjectMeasurementWithUUID"></a>
# **createProjectMeasurementWithUUID**
> Measurement createProjectMeasurementWithUUID(projectUuid, measurementUuid, measCreate)

Create Project Measurement with UUID

指定したUUIDの計測を作成します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    MeasCreate measCreate = new MeasCreate(); // MeasCreate | 
    try {
      Measurement result = apiInstance.createProjectMeasurementWithUUID(projectUuid, measurementUuid, measCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#createProjectMeasurementWithUUID");
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
| **measCreate** | [**MeasCreate**](MeasCreate.md)|  | [optional] |

### Return type

[**Measurement**](Measurement.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteMeasurement"></a>
# **deleteMeasurement**
> deleteMeasurement(measurementUuid)

Trash Measurement

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}&#x60; を使用してください）  計測を削除します。  - **Note**    - 保護された計測は削除できません。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      apiInstance.deleteMeasurement(measurementUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#deleteMeasurement");
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

<a id="deleteMeasurementBaseTime"></a>
# **deleteMeasurementBaseTime**
> deleteMeasurementBaseTime(measurementUuid, type)

Delete Measurement Base Time

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/basetimes/{type}&#x60; を使用してください）  基準時刻を削除します。   指定された基準時刻が使用中の場合（その計測の &#x60;basetime_type&#x60; として設定されている場合）は、  その基準時刻は削除できません（ステータスコード &#x60;409&#x60; が返却されます）。   このような場合は、他の基準時刻をその計測の &#x60;basetime_type&#x60; にしてから、削除したい基準時刻を削除してください。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String type = "edge_rtc"; // String | 基準時刻のタイプ
    try {
      apiInstance.deleteMeasurementBaseTime(measurementUuid, type);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#deleteMeasurementBaseTime");
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
| **type** | **String**| 基準時刻のタイプ | [enum: edge_rtc, ntp, gps, api_first_received, volatile, manual] |

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

<a id="deleteProjectMeasurement"></a>
# **deleteProjectMeasurement**
> deleteProjectMeasurement(projectUuid, measurementUuid)

Trash Project Measurement

計測を削除します。 - **Note**   - 保護された計測は削除できません。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      apiInstance.deleteProjectMeasurement(projectUuid, measurementUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#deleteProjectMeasurement");
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

<a id="deleteProjectMeasurementBaseTime"></a>
# **deleteProjectMeasurementBaseTime**
> deleteProjectMeasurementBaseTime(projectUuid, measurementUuid, type)

Delete Project Measurement Base Time

基準時刻を削除します。 指定された基準時刻が使用中の場合（その計測の &#x60;basetime_type&#x60; として設定されている場合）は、 その基準時刻は削除できません（ステータスコード &#x60;409&#x60; が返却されます）。 このような場合は、他の基準時刻をその計測の &#x60;basetime_type&#x60; にしてから、削除したい基準時刻を削除してください。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String type = "edge_rtc"; // String | 基準時刻のタイプ
    try {
      apiInstance.deleteProjectMeasurementBaseTime(projectUuid, measurementUuid, type);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#deleteProjectMeasurementBaseTime");
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
| **type** | **String**| 基準時刻のタイプ | [enum: edge_rtc, ntp, gps, api_first_received, volatile, manual] |

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

<a id="endMeasurement"></a>
# **endMeasurement**
> SequenceSummary endMeasurement(measurementUuid)

End Measurement

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/end&#x60; を使用してください）  計測終了（ended）とします。endedは、エッジにおけるデータの取得が終了していることを表します。  （サーバーに回収されていないデータがまだエッジに残っている可能性はあります。サーバーへのデータの回収が完了した状態は、completedと呼びます。）

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      SequenceSummary result = apiInstance.endMeasurement(measurementUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#endMeasurement");
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

[**SequenceSummary**](SequenceSummary.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="endProjectMeasurement"></a>
# **endProjectMeasurement**
> SequenceSummary endProjectMeasurement(projectUuid, measurementUuid)

End Project Measurement

計測終了（ended）とします。endedは、エッジにおけるデータの取得が終了していることを表します。 （サーバーに回収されていないデータがまだエッジに残っている可能性はあります。サーバーへのデータの回収が完了した状態は、completedと呼びます。）

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      SequenceSummary result = apiInstance.endProjectMeasurement(projectUuid, measurementUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#endProjectMeasurement");
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

[**SequenceSummary**](SequenceSummary.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMeasurement"></a>
# **getMeasurement**
> Measurement getMeasurement(measurementUuid)

Get Measurement

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}&#x60; を使用してください） 計測を取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      Measurement result = apiInstance.getMeasurement(measurementUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#getMeasurement");
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

[**Measurement**](Measurement.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMeasurementBaseTime"></a>
# **getMeasurementBaseTime**
> MeasBaseTime getMeasurementBaseTime(measurementUuid, type)

Get Measurement Base Time

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/basetimes/{type}&#x60; を使用してください） 基準時刻タイプを指定して計測の基準時刻を取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String type = "edge_rtc"; // String | 基準時刻のタイプ
    try {
      MeasBaseTime result = apiInstance.getMeasurementBaseTime(measurementUuid, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#getMeasurementBaseTime");
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
| **type** | **String**| 基準時刻のタイプ | [enum: edge_rtc, ntp, gps, api_first_received, volatile, manual] |

### Return type

[**MeasBaseTime**](MeasBaseTime.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMeasurementFromMeasurementMarker"></a>
# **getMeasurementFromMeasurementMarker**
> Measurement getMeasurementFromMeasurementMarker(measurementMarkerUuid)

Get Measurement from Marker

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/markers/{measurement_marker_uuid}/measurement&#x60; を使用してください）

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String measurementMarkerUuid = "27a841d8-78c0-4e5e-b0ee-ec1fafd90ef6"; // String | 計測マーカーのUUID
    try {
      Measurement result = apiInstance.getMeasurementFromMeasurementMarker(measurementMarkerUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#getMeasurementFromMeasurementMarker");
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

[**Measurement**](Measurement.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMeasurementSections"></a>
# **getMeasurementSections**
> MeasurementSectionsGetResponse getMeasurementSections(measurementUuid, filter, limit)

List Measurement Sections

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/sections&#x60; を使用してください）  計測に含まれるセクションのリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String filter = "processed"; // String | 計測セクションの処理ステータス。 `processed` （処理済みの計測セクションを取得）、 `unprocessed` （未処理の計測セクションを取得）、 `both` （両方を取得）のいずれかを選択します。
    Integer limit = 1000; // Integer | 1回のリクエストで取得する件数
    try {
      MeasurementSectionsGetResponse result = apiInstance.getMeasurementSections(measurementUuid, filter, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#getMeasurementSections");
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
| **filter** | **String**| 計測セクションの処理ステータス。 &#x60;processed&#x60; （処理済みの計測セクションを取得）、 &#x60;unprocessed&#x60; （未処理の計測セクションを取得）、 &#x60;both&#x60; （両方を取得）のいずれかを選択します。 | [optional] [default to both] [enum: processed, unprocessed, both] |
| **limit** | **Integer**| 1回のリクエストで取得する件数 | [optional] |

### Return type

[**MeasurementSectionsGetResponse**](MeasurementSectionsGetResponse.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMeasurementSequence"></a>
# **getMeasurementSequence**
> MeasurementSequenceGroup getMeasurementSequence(measurementUuid, sequencesUuid)

Get Measurement Sequence

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/sequences/{sequence_uuid}&#x60; を使用してください） 計測シーケンスを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String sequencesUuid = "0b849907-9f04-4c87-b176-b73fb527e935"; // String | 計測シーケンスのUUID
    try {
      MeasurementSequenceGroup result = apiInstance.getMeasurementSequence(measurementUuid, sequencesUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#getMeasurementSequence");
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
| **sequencesUuid** | **String**| 計測シーケンスのUUID | |

### Return type

[**MeasurementSequenceGroup**](MeasurementSequenceGroup.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProjectMeasurement"></a>
# **getProjectMeasurement**
> Measurement getProjectMeasurement(projectUuid, measurementUuid)

Get Project Measurement

計測を取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      Measurement result = apiInstance.getProjectMeasurement(projectUuid, measurementUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#getProjectMeasurement");
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

[**Measurement**](Measurement.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProjectMeasurementBaseTime"></a>
# **getProjectMeasurementBaseTime**
> MeasBaseTime getProjectMeasurementBaseTime(projectUuid, measurementUuid, type)

Get Project Measurement Base Time

基準時刻タイプを指定して計測の基準時刻を取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String type = "edge_rtc"; // String | 基準時刻のタイプ
    try {
      MeasBaseTime result = apiInstance.getProjectMeasurementBaseTime(projectUuid, measurementUuid, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#getProjectMeasurementBaseTime");
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
| **type** | **String**| 基準時刻のタイプ | [enum: edge_rtc, ntp, gps, api_first_received, volatile, manual] |

### Return type

[**MeasBaseTime**](MeasBaseTime.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProjectMeasurementSections"></a>
# **getProjectMeasurementSections**
> MeasurementSectionsGetResponse getProjectMeasurementSections(projectUuid, measurementUuid, filter, limit)

List Project Measurement Sections

計測に含まれるセクションのリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String filter = "processed"; // String | 計測セクションの処理ステータス。 `processed` （処理済みの計測セクションを取得）、 `unprocessed` （未処理の計測セクションを取得）、 `both` （両方を取得）のいずれかを選択します。
    Integer limit = 1000; // Integer | 1回のリクエストで取得する件数
    try {
      MeasurementSectionsGetResponse result = apiInstance.getProjectMeasurementSections(projectUuid, measurementUuid, filter, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#getProjectMeasurementSections");
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
| **filter** | **String**| 計測セクションの処理ステータス。 &#x60;processed&#x60; （処理済みの計測セクションを取得）、 &#x60;unprocessed&#x60; （未処理の計測セクションを取得）、 &#x60;both&#x60; （両方を取得）のいずれかを選択します。 | [optional] [default to both] [enum: processed, unprocessed, both] |
| **limit** | **Integer**| 1回のリクエストで取得する件数 | [optional] |

### Return type

[**MeasurementSectionsGetResponse**](MeasurementSectionsGetResponse.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProjectMeasurementSequence"></a>
# **getProjectMeasurementSequence**
> MeasurementSequenceGroup getProjectMeasurementSequence(projectUuid, measurementUuid, sequencesUuid)

Get Project Measurement Sequence

計測シーケンスを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String sequencesUuid = "0b849907-9f04-4c87-b176-b73fb527e935"; // String | 計測シーケンスのUUID
    try {
      MeasurementSequenceGroup result = apiInstance.getProjectMeasurementSequence(projectUuid, measurementUuid, sequencesUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#getProjectMeasurementSequence");
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
| **sequencesUuid** | **String**| 計測シーケンスのUUID | |

### Return type

[**MeasurementSequenceGroup**](MeasurementSequenceGroup.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listMeasurementBaseTimes"></a>
# **listMeasurementBaseTimes**
> MeasBaseTimes listMeasurementBaseTimes(measurementUuid)

List Measurement Base Times

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/basetimes&#x60; を使用してください）  計測の基準時刻のリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      MeasBaseTimes result = apiInstance.listMeasurementBaseTimes(measurementUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#listMeasurementBaseTimes");
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

[**MeasBaseTimes**](MeasBaseTimes.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listMeasurementSequences"></a>
# **listMeasurementSequences**
> MeasurementSequenceGroups listMeasurementSequences(measurementUuid)

List Measurement Sequences

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/sequences&#x60; を使用してください） 計測シーケンスのリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      MeasurementSequenceGroups result = apiInstance.listMeasurementSequences(measurementUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#listMeasurementSequences");
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

[**MeasurementSequenceGroups**](MeasurementSequenceGroups.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listMeasurements"></a>
# **listMeasurements**
> Measurements listMeasurements(uuid, name, edgeUuid, start, end, partialMatch, basetimeType, ended, since, durationStart, durationEnd, status, limit, sort, page, order)

List Measurements

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements&#x60; を使用してください）  計測のリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    List<String> uuid = Arrays.asList(); // List<String> | 計測のUUID
    Integer name = measurement1; // Integer | 名前が指定した文字列から始まる計測を取得します。 文字列をダブルクォーテーションで囲むと、完全一致のものだけが取得されます。
    String edgeUuid = "e0022b03-023f-4f24-90f1-560be10c423b"; // String | 計測に関連付けられたエッジのUUID
    String start = "2019-10-29T03:04:05.123456Z"; // String | 取得対象範囲の始点。以下のいずれかの形式で指定します。   - RFC3339(例 `2019-10-29T03:04:05.341268Z` )   - UNIX時刻（マイクロ秒）(**Deprecated**)
    String end = "2019-10-29T03:04:05.234567Z"; // String | 取得対象範囲の終点。以下のいずれかの形式で指定します。   - RFC3339(例 `2019-10-29T03:04:05.341268Z` )   - UNIX時刻（マイクロ秒）(**Deprecated**)
    Boolean partialMatch = false; // Boolean | `true` にすると、計測の一部が取得対象範囲に入っていればその計測は取得対象となります。 `false` にすると、計測の基準時刻（計測開始）が取得対象範囲に入っていればその計測は取得対象となります。 ```    | measurement1 |    +--------------+                                    | measurement2 |                                    +--------------+                        | measurement3 |                        +--------------+                                                         time -----------+----------------------------+------------>            |                            |           start                        end ```  - この例では、もし `partial_match` を `true` にすると、 `measurement1` 、 `measurement2` 、 `measurement3` が取得できます。 - もし `partial_match` を `false` にすると、 `measurement2` と `measurement3` が取得できます。
    String basetimeType = "edge_rtc"; // String | 計測の基準時刻のタイプ
    Boolean ended = false; // Boolean | 計測が終了している（ended）かどうかを指定して計測を取得します。  エッジにおいてデータの取得が終了している場合、その計測は「終了(ended)」となります。 計測は終了(ended)していても、まだサーバーに送信されていないデータがエッジに残っている可能性があります。 * `true`: 終了した計測だけを取得します。 * `false`: 終了していない計測だけを取得します。
    String since = "2019-10-29T03:04:05.341268Z"; // String | 指定した時刻以降に更新された計測のみを取得します。  以下のいずれかの形式で指定します。    - RFC3339(例 `2019-10-29T03:04:05.341268Z` )   - UNIX時刻（マイクロ秒）(**Deprecated**)
    Long durationStart = 100L; // Long | 計測時間の最小値（マイクロ秒）。これより短い計測は取得しません。
    Long durationEnd = 100000L; // Long | 計測時間の最大値（マイクロ秒）。これより長い計測は取得しません。
    List<String> status = Arrays.asList(); // List<String> | 計測のステータス
    Integer limit = 1000; // Integer | 1回のリクエストで取得する件数。ただし、0を指定するとデフォルトの値が使用されます。
    String sort = "name"; // String | 並べ替えに使用するキー
    Integer page = 1; // Integer | 取得するページの番号
    String order = "asc"; // String | 並べ替えの順序
    try {
      Measurements result = apiInstance.listMeasurements(uuid, name, edgeUuid, start, end, partialMatch, basetimeType, ended, since, durationStart, durationEnd, status, limit, sort, page, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#listMeasurements");
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
| **uuid** | [**List&lt;String&gt;**](String.md)| 計測のUUID | [optional] |
| **name** | **Integer**| 名前が指定した文字列から始まる計測を取得します。 文字列をダブルクォーテーションで囲むと、完全一致のものだけが取得されます。 | [optional] |
| **edgeUuid** | **String**| 計測に関連付けられたエッジのUUID | [optional] |
| **start** | **String**| 取得対象範囲の始点。以下のいずれかの形式で指定します。   - RFC3339(例 &#x60;2019-10-29T03:04:05.341268Z&#x60; )   - UNIX時刻（マイクロ秒）(**Deprecated**) | [optional] |
| **end** | **String**| 取得対象範囲の終点。以下のいずれかの形式で指定します。   - RFC3339(例 &#x60;2019-10-29T03:04:05.341268Z&#x60; )   - UNIX時刻（マイクロ秒）(**Deprecated**) | [optional] |
| **partialMatch** | **Boolean**| &#x60;true&#x60; にすると、計測の一部が取得対象範囲に入っていればその計測は取得対象となります。 &#x60;false&#x60; にすると、計測の基準時刻（計測開始）が取得対象範囲に入っていればその計測は取得対象となります。 &#x60;&#x60;&#x60;    | measurement1 |    +--------------+                                    | measurement2 |                                    +--------------+                        | measurement3 |                        +--------------+                                                         time -----------+----------------------------+------------&gt;            |                            |           start                        end &#x60;&#x60;&#x60;  - この例では、もし &#x60;partial_match&#x60; を &#x60;true&#x60; にすると、 &#x60;measurement1&#x60; 、 &#x60;measurement2&#x60; 、 &#x60;measurement3&#x60; が取得できます。 - もし &#x60;partial_match&#x60; を &#x60;false&#x60; にすると、 &#x60;measurement2&#x60; と &#x60;measurement3&#x60; が取得できます。 | [optional] [default to false] |
| **basetimeType** | **String**| 計測の基準時刻のタイプ | [optional] [enum: edge_rtc, ntp, gps, api_first_received, volatile, manual] |
| **ended** | **Boolean**| 計測が終了している（ended）かどうかを指定して計測を取得します。  エッジにおいてデータの取得が終了している場合、その計測は「終了(ended)」となります。 計測は終了(ended)していても、まだサーバーに送信されていないデータがエッジに残っている可能性があります。 * &#x60;true&#x60;: 終了した計測だけを取得します。 * &#x60;false&#x60;: 終了していない計測だけを取得します。 | [optional] |
| **since** | **String**| 指定した時刻以降に更新された計測のみを取得します。  以下のいずれかの形式で指定します。    - RFC3339(例 &#x60;2019-10-29T03:04:05.341268Z&#x60; )   - UNIX時刻（マイクロ秒）(**Deprecated**) | [optional] |
| **durationStart** | **Long**| 計測時間の最小値（マイクロ秒）。これより短い計測は取得しません。 | [optional] |
| **durationEnd** | **Long**| 計測時間の最大値（マイクロ秒）。これより長い計測は取得しません。 | [optional] |
| **status** | [**List&lt;String&gt;**](String.md)| 計測のステータス | [optional] [enum: measuring, resending, finished] |
| **limit** | **Integer**| 1回のリクエストで取得する件数。ただし、0を指定するとデフォルトの値が使用されます。 | [optional] [default to 1000] |
| **sort** | **String**| 並べ替えに使用するキー | [optional] [default to base_time] [enum: name, description, ended, duration, base_time, processed_ratio, created_at, updated_at] |
| **page** | **Integer**| 取得するページの番号 | [optional] |
| **order** | **String**| 並べ替えの順序 | [optional] [enum: asc, desc] |

### Return type

[**Measurements**](Measurements.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listProjectMeasurementBaseTimes"></a>
# **listProjectMeasurementBaseTimes**
> MeasBaseTimes listProjectMeasurementBaseTimes(projectUuid, measurementUuid)

List Project Measurement Base Times

計測の基準時刻のリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      MeasBaseTimes result = apiInstance.listProjectMeasurementBaseTimes(projectUuid, measurementUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#listProjectMeasurementBaseTimes");
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

[**MeasBaseTimes**](MeasBaseTimes.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listProjectMeasurementSequences"></a>
# **listProjectMeasurementSequences**
> MeasurementSequenceGroups listProjectMeasurementSequences(projectUuid, measurementUuid)

List Project Measurement Sequences

計測シーケンスのリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      MeasurementSequenceGroups result = apiInstance.listProjectMeasurementSequences(projectUuid, measurementUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#listProjectMeasurementSequences");
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

[**MeasurementSequenceGroups**](MeasurementSequenceGroups.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listProjectMeasurements"></a>
# **listProjectMeasurements**
> Measurements listProjectMeasurements(projectUuid, uuid, name, edgeUuid, start, end, partialMatch, basetimeType, ended, since, durationStart, durationEnd, status, limit, sort, page, order)

List Project Measurements

計測のリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    List<String> uuid = Arrays.asList(); // List<String> | 計測のUUID
    Integer name = measurement1; // Integer | 名前が指定した文字列から始まる計測を取得します。 文字列をダブルクォーテーションで囲むと、完全一致のものだけが取得されます。
    String edgeUuid = "e0022b03-023f-4f24-90f1-560be10c423b"; // String | 計測に関連付けられたエッジのUUID
    String start = "2019-10-29T03:04:05.123456Z"; // String | 取得対象範囲の始点。以下のいずれかの形式で指定します。   - RFC3339(例 `2019-10-29T03:04:05.341268Z` )   - UNIX時刻（マイクロ秒）(**Deprecated**)
    String end = "2019-10-29T03:04:05.234567Z"; // String | 取得対象範囲の終点。以下のいずれかの形式で指定します。   - RFC3339(例 `2019-10-29T03:04:05.341268Z` )   - UNIX時刻（マイクロ秒）(**Deprecated**)
    Boolean partialMatch = false; // Boolean | `true` にすると、計測の一部が取得対象範囲に入っていればその計測は取得対象となります。 `false` にすると、計測の基準時刻（計測開始）が取得対象範囲に入っていればその計測は取得対象となります。 ```    | measurement1 |    +--------------+                                    | measurement2 |                                    +--------------+                        | measurement3 |                        +--------------+                                                         time -----------+----------------------------+------------>            |                            |           start                        end ```  - この例では、もし `partial_match` を `true` にすると、 `measurement1` 、 `measurement2` 、 `measurement3` が取得できます。 - もし `partial_match` を `false` にすると、 `measurement2` と `measurement3` が取得できます。
    String basetimeType = "edge_rtc"; // String | 計測の基準時刻のタイプ
    Boolean ended = false; // Boolean | 計測が終了している（ended）かどうかを指定して計測を取得します。  エッジにおいてデータの取得が終了している場合、その計測は「終了(ended)」となります。 計測は終了(ended)していても、まだサーバーに送信されていないデータがエッジに残っている可能性があります。 * `true`: 終了した計測だけを取得します。 * `false`: 終了していない計測だけを取得します。
    String since = "2019-10-29T03:04:05.341268Z"; // String | 指定した時刻以降に更新された計測のみを取得します。  以下のいずれかの形式で指定します。    - RFC3339(例 `2019-10-29T03:04:05.341268Z` )   - UNIX時刻（マイクロ秒）(**Deprecated**)
    Long durationStart = 100L; // Long | 計測時間の最小値（マイクロ秒）。これより短い計測は取得しません。
    Long durationEnd = 100000L; // Long | 計測時間の最大値（マイクロ秒）。これより長い計測は取得しません。
    List<String> status = Arrays.asList(); // List<String> | 計測のステータス
    Integer limit = 1000; // Integer | 1回のリクエストで取得する件数。ただし、0を指定するとデフォルトの値が使用されます。
    String sort = "name"; // String | 並べ替えに使用するキー
    Integer page = 1; // Integer | 取得するページの番号
    String order = "asc"; // String | 並べ替えの順序
    try {
      Measurements result = apiInstance.listProjectMeasurements(projectUuid, uuid, name, edgeUuid, start, end, partialMatch, basetimeType, ended, since, durationStart, durationEnd, status, limit, sort, page, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#listProjectMeasurements");
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
| **uuid** | [**List&lt;String&gt;**](String.md)| 計測のUUID | [optional] |
| **name** | **Integer**| 名前が指定した文字列から始まる計測を取得します。 文字列をダブルクォーテーションで囲むと、完全一致のものだけが取得されます。 | [optional] |
| **edgeUuid** | **String**| 計測に関連付けられたエッジのUUID | [optional] |
| **start** | **String**| 取得対象範囲の始点。以下のいずれかの形式で指定します。   - RFC3339(例 &#x60;2019-10-29T03:04:05.341268Z&#x60; )   - UNIX時刻（マイクロ秒）(**Deprecated**) | [optional] |
| **end** | **String**| 取得対象範囲の終点。以下のいずれかの形式で指定します。   - RFC3339(例 &#x60;2019-10-29T03:04:05.341268Z&#x60; )   - UNIX時刻（マイクロ秒）(**Deprecated**) | [optional] |
| **partialMatch** | **Boolean**| &#x60;true&#x60; にすると、計測の一部が取得対象範囲に入っていればその計測は取得対象となります。 &#x60;false&#x60; にすると、計測の基準時刻（計測開始）が取得対象範囲に入っていればその計測は取得対象となります。 &#x60;&#x60;&#x60;    | measurement1 |    +--------------+                                    | measurement2 |                                    +--------------+                        | measurement3 |                        +--------------+                                                         time -----------+----------------------------+------------&gt;            |                            |           start                        end &#x60;&#x60;&#x60;  - この例では、もし &#x60;partial_match&#x60; を &#x60;true&#x60; にすると、 &#x60;measurement1&#x60; 、 &#x60;measurement2&#x60; 、 &#x60;measurement3&#x60; が取得できます。 - もし &#x60;partial_match&#x60; を &#x60;false&#x60; にすると、 &#x60;measurement2&#x60; と &#x60;measurement3&#x60; が取得できます。 | [optional] [default to false] |
| **basetimeType** | **String**| 計測の基準時刻のタイプ | [optional] [enum: edge_rtc, ntp, gps, api_first_received, volatile, manual] |
| **ended** | **Boolean**| 計測が終了している（ended）かどうかを指定して計測を取得します。  エッジにおいてデータの取得が終了している場合、その計測は「終了(ended)」となります。 計測は終了(ended)していても、まだサーバーに送信されていないデータがエッジに残っている可能性があります。 * &#x60;true&#x60;: 終了した計測だけを取得します。 * &#x60;false&#x60;: 終了していない計測だけを取得します。 | [optional] |
| **since** | **String**| 指定した時刻以降に更新された計測のみを取得します。  以下のいずれかの形式で指定します。    - RFC3339(例 &#x60;2019-10-29T03:04:05.341268Z&#x60; )   - UNIX時刻（マイクロ秒）(**Deprecated**) | [optional] |
| **durationStart** | **Long**| 計測時間の最小値（マイクロ秒）。これより短い計測は取得しません。 | [optional] |
| **durationEnd** | **Long**| 計測時間の最大値（マイクロ秒）。これより長い計測は取得しません。 | [optional] |
| **status** | [**List&lt;String&gt;**](String.md)| 計測のステータス | [optional] [enum: measuring, resending, finished] |
| **limit** | **Integer**| 1回のリクエストで取得する件数。ただし、0を指定するとデフォルトの値が使用されます。 | [optional] [default to 1000] |
| **sort** | **String**| 並べ替えに使用するキー | [optional] [default to base_time] [enum: name, description, ended, duration, base_time, processed_ratio, created_at, updated_at] |
| **page** | **Integer**| 取得するページの番号 | [optional] |
| **order** | **String**| 並べ替えの順序 | [optional] [enum: asc, desc] |

### Return type

[**Measurements**](Measurements.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="protectMeasurement"></a>
# **protectMeasurement**
> protectMeasurement(measurementUuid)

Protect Measurement

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/protected&#x60; を使用してください） 計測を保護します。保護された計測は削除できません。 [See](#section/Protected-resources) も参照してください。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      apiInstance.protectMeasurement(measurementUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#protectMeasurement");
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

<a id="protectProjectMeasurement"></a>
# **protectProjectMeasurement**
> protectProjectMeasurement(projectUuid, measurementUuid)

Protect Project Measurement

計測を保護します。保護された計測は削除できません。 [See](#section/Protected-resources) も参照してください。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      apiInstance.protectProjectMeasurement(projectUuid, measurementUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#protectProjectMeasurement");
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

<a id="replaceMeasurementSequence"></a>
# **replaceMeasurementSequence**
> MeasurementSequenceGroup replaceMeasurementSequence(measurementUuid, sequencesUuid, measurementSequenceGroupReplace)

Replace Measurement Sequence

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/sequences/{sequence_uuid}&#x60; を使用してください） 計測シーケンスを置換します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String sequencesUuid = "0b849907-9f04-4c87-b176-b73fb527e935"; // String | 計測シーケンスのUUID
    MeasurementSequenceGroupReplace measurementSequenceGroupReplace = new MeasurementSequenceGroupReplace(); // MeasurementSequenceGroupReplace | 
    try {
      MeasurementSequenceGroup result = apiInstance.replaceMeasurementSequence(measurementUuid, sequencesUuid, measurementSequenceGroupReplace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#replaceMeasurementSequence");
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
| **sequencesUuid** | **String**| 計測シーケンスのUUID | |
| **measurementSequenceGroupReplace** | [**MeasurementSequenceGroupReplace**](MeasurementSequenceGroupReplace.md)|  | [optional] |

### Return type

[**MeasurementSequenceGroup**](MeasurementSequenceGroup.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="replaceProjectMeasurementSequence"></a>
# **replaceProjectMeasurementSequence**
> MeasurementSequenceGroup replaceProjectMeasurementSequence(projectUuid, measurementUuid, sequencesUuid, measurementSequenceGroupReplace)

Replace Project Measurement Sequence

計測シーケンスを置換します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String sequencesUuid = "0b849907-9f04-4c87-b176-b73fb527e935"; // String | 計測シーケンスのUUID
    MeasurementSequenceGroupReplace measurementSequenceGroupReplace = new MeasurementSequenceGroupReplace(); // MeasurementSequenceGroupReplace | 
    try {
      MeasurementSequenceGroup result = apiInstance.replaceProjectMeasurementSequence(projectUuid, measurementUuid, sequencesUuid, measurementSequenceGroupReplace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#replaceProjectMeasurementSequence");
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
| **sequencesUuid** | **String**| 計測シーケンスのUUID | |
| **measurementSequenceGroupReplace** | [**MeasurementSequenceGroupReplace**](MeasurementSequenceGroupReplace.md)|  | [optional] |

### Return type

[**MeasurementSequenceGroup**](MeasurementSequenceGroup.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="unprotectMeasurement"></a>
# **unprotectMeasurement**
> unprotectMeasurement(measurementUuid)

Unprotect Measurement

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/protected&#x60; を使用してください） 計測の保護を解除します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      apiInstance.unprotectMeasurement(measurementUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#unprotectMeasurement");
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

<a id="unprotectProjectMeasurement"></a>
# **unprotectProjectMeasurement**
> unprotectProjectMeasurement(projectUuid, measurementUuid)

Unprotect Project Measurement

計測の保護を解除します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      apiInstance.unprotectProjectMeasurement(projectUuid, measurementUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#unprotectProjectMeasurement");
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

<a id="updateMeasurement"></a>
# **updateMeasurement**
> updateMeasurement(measurementUuid, measReplace)

Update Measurement

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}&#x60; を使用してください） 計測に関する情報を更新します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    MeasReplace measReplace = new MeasReplace(); // MeasReplace | 
    try {
      apiInstance.updateMeasurement(measurementUuid, measReplace);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#updateMeasurement");
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
| **measReplace** | [**MeasReplace**](MeasReplace.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="updateMeasurementBaseTime"></a>
# **updateMeasurementBaseTime**
> MeasBaseTime updateMeasurementBaseTime(measurementUuid, type, measBaseTimePut)

Replace Measurement Base Time

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/basetimes/{type}&#x60; を使用してください）  基準時刻を更新します。  この計測において、使用する基準時刻が設定されていない（ &#x60;basetime_type&#x60; が &#x60;undefined&#x60; ）の場合は、  新しい基準時刻を &#x60;basetime_type&#x60; に設定します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String type = "edge_rtc"; // String | 基準時刻のタイプ
    MeasBaseTimePut measBaseTimePut = new MeasBaseTimePut(); // MeasBaseTimePut | 
    try {
      MeasBaseTime result = apiInstance.updateMeasurementBaseTime(measurementUuid, type, measBaseTimePut);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#updateMeasurementBaseTime");
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
| **type** | **String**| 基準時刻のタイプ | [enum: edge_rtc, ntp, gps, api_first_received, volatile, manual] |
| **measBaseTimePut** | [**MeasBaseTimePut**](MeasBaseTimePut.md)|  | [optional] |

### Return type

[**MeasBaseTime**](MeasBaseTime.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateMeasurementSequence"></a>
# **updateMeasurementSequence**
> MeasurementSequenceGroup updateMeasurementSequence(measurementUuid, sequencesUuid, measurementSequenceGroupReplace)

Update Measurement Sequence

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/sequences/{sequence_uuid}&#x60; を使用してください） 計測シーケンスを更新します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String sequencesUuid = "0b849907-9f04-4c87-b176-b73fb527e935"; // String | 計測シーケンスのUUID
    MeasurementSequenceGroupReplace measurementSequenceGroupReplace = new MeasurementSequenceGroupReplace(); // MeasurementSequenceGroupReplace | 
    try {
      MeasurementSequenceGroup result = apiInstance.updateMeasurementSequence(measurementUuid, sequencesUuid, measurementSequenceGroupReplace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#updateMeasurementSequence");
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
| **sequencesUuid** | **String**| 計測シーケンスのUUID | |
| **measurementSequenceGroupReplace** | [**MeasurementSequenceGroupReplace**](MeasurementSequenceGroupReplace.md)|  | [optional] |

### Return type

[**MeasurementSequenceGroup**](MeasurementSequenceGroup.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateProjectMeasurement"></a>
# **updateProjectMeasurement**
> updateProjectMeasurement(projectUuid, measurementUuid, measReplace)

Update Project Measurement

計測に関する情報を更新します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    MeasReplace measReplace = new MeasReplace(); // MeasReplace | 
    try {
      apiInstance.updateProjectMeasurement(projectUuid, measurementUuid, measReplace);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#updateProjectMeasurement");
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
| **measReplace** | [**MeasReplace**](MeasReplace.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="updateProjectMeasurementBaseTime"></a>
# **updateProjectMeasurementBaseTime**
> MeasBaseTime updateProjectMeasurementBaseTime(projectUuid, measurementUuid, type, measBaseTimePut)

Replace Project Measurement Base Time

基準時刻を更新します。 この計測において、使用する基準時刻が設定されていない（ &#x60;basetime_type&#x60; が &#x60;undefined&#x60; ）の場合は、 新しい基準時刻を &#x60;basetime_type&#x60; に設定します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String type = "edge_rtc"; // String | 基準時刻のタイプ
    MeasBaseTimePut measBaseTimePut = new MeasBaseTimePut(); // MeasBaseTimePut | 
    try {
      MeasBaseTime result = apiInstance.updateProjectMeasurementBaseTime(projectUuid, measurementUuid, type, measBaseTimePut);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#updateProjectMeasurementBaseTime");
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
| **type** | **String**| 基準時刻のタイプ | [enum: edge_rtc, ntp, gps, api_first_received, volatile, manual] |
| **measBaseTimePut** | [**MeasBaseTimePut**](MeasBaseTimePut.md)|  | [optional] |

### Return type

[**MeasBaseTime**](MeasBaseTime.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateProjectMeasurementSequence"></a>
# **updateProjectMeasurementSequence**
> MeasurementSequenceGroup updateProjectMeasurementSequence(projectUuid, measurementUuid, sequencesUuid, measurementSequenceGroupReplace)

Update Project Measurement Sequence

計測シーケンスを更新します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasMeasurementsApi;

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

    MeasMeasurementsApi apiInstance = new MeasMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    String sequencesUuid = "0b849907-9f04-4c87-b176-b73fb527e935"; // String | 計測シーケンスのUUID
    MeasurementSequenceGroupReplace measurementSequenceGroupReplace = new MeasurementSequenceGroupReplace(); // MeasurementSequenceGroupReplace | 
    try {
      MeasurementSequenceGroup result = apiInstance.updateProjectMeasurementSequence(projectUuid, measurementUuid, sequencesUuid, measurementSequenceGroupReplace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasMeasurementsApi#updateProjectMeasurementSequence");
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
| **sequencesUuid** | **String**| 計測シーケンスのUUID | |
| **measurementSequenceGroupReplace** | [**MeasurementSequenceGroupReplace**](MeasurementSequenceGroupReplace.md)|  | [optional] |

### Return type

[**MeasurementSequenceGroup**](MeasurementSequenceGroup.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

