# MeasUploadingMeasurementsApi

All URIs are relative to *https://example.intdash.jp/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listMeasurementStatuses**](MeasUploadingMeasurementsApi.md#listMeasurementStatuses) | **GET** /v1/measurements/upload | List Uploading Statuses of Measurements |
| [**listProjectMeasurementStatuses**](MeasUploadingMeasurementsApi.md#listProjectMeasurementStatuses) | **GET** /v1/projects/{project_uuid}/measurements/upload | List Project Uploading Statuses of Measurements |
| [**uploadMeasurement**](MeasUploadingMeasurementsApi.md#uploadMeasurement) | **POST** /v1/measurements/upload | Create Measurement from CSV File |
| [**uploadMeasurementIntoMeasurement**](MeasUploadingMeasurementsApi.md#uploadMeasurementIntoMeasurement) | **POST** /v1/measurements/{measurement_uuid}/upload | Store Data Points by CSV File |
| [**uploadProjectMeasurement**](MeasUploadingMeasurementsApi.md#uploadProjectMeasurement) | **POST** /v1/projects/{project_uuid}/measurements/upload | Create Project Measurement from CSV File |
| [**uploadProjectMeasurementIntoMeasurement**](MeasUploadingMeasurementsApi.md#uploadProjectMeasurementIntoMeasurement) | **POST** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/upload | Store Project Data Points by CSV File |


<a id="listMeasurementStatuses"></a>
# **listMeasurementStatuses**
> MeasurementUploadStatusesGetResponse listMeasurementStatuses(limit, sort, page, order)

List Uploading Statuses of Measurements

（ **Deprecated** このエンドポイントではなく、&#x60;GET /measurements/jobs&#x60; を使用してください。） 計測のアップロードのリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasUploadingMeasurementsApi;

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

    MeasUploadingMeasurementsApi apiInstance = new MeasUploadingMeasurementsApi(defaultClient);
    Integer limit = 1000; // Integer | 1回のリクエストで取得する件数
    String sort = "created_at"; // String | 並べ替えに使用するキー
    Integer page = 1; // Integer | 取得するページの番号
    String order = "asc"; // String | 並べ替えの順序
    try {
      MeasurementUploadStatusesGetResponse result = apiInstance.listMeasurementStatuses(limit, sort, page, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasUploadingMeasurementsApi#listMeasurementStatuses");
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
| **limit** | **Integer**| 1回のリクエストで取得する件数 | [optional] |
| **sort** | **String**| 並べ替えに使用するキー | [optional] [default to created_at] [enum: created_at, updated_at] |
| **page** | **Integer**| 取得するページの番号 | [optional] |
| **order** | **String**| 並べ替えの順序 | [optional] [enum: asc, desc] |

### Return type

[**MeasurementUploadStatusesGetResponse**](MeasurementUploadStatusesGetResponse.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listProjectMeasurementStatuses"></a>
# **listProjectMeasurementStatuses**
> MeasurementUploadStatusesGetResponse listProjectMeasurementStatuses(projectUuid, limit, sort, page, order)

List Project Uploading Statuses of Measurements

（ **Deprecated** このエンドポイントではなく、&#x60;GET /measurements/jobs&#x60; を使用してください。） 計測のアップロードのリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasUploadingMeasurementsApi;

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

    MeasUploadingMeasurementsApi apiInstance = new MeasUploadingMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    Integer limit = 1000; // Integer | 1回のリクエストで取得する件数
    String sort = "created_at"; // String | 並べ替えに使用するキー
    Integer page = 1; // Integer | 取得するページの番号
    String order = "asc"; // String | 並べ替えの順序
    try {
      MeasurementUploadStatusesGetResponse result = apiInstance.listProjectMeasurementStatuses(projectUuid, limit, sort, page, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasUploadingMeasurementsApi#listProjectMeasurementStatuses");
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
| **limit** | **Integer**| 1回のリクエストで取得する件数 | [optional] |
| **sort** | **String**| 並べ替えに使用するキー | [optional] [default to created_at] [enum: created_at, updated_at] |
| **page** | **Integer**| 取得するページの番号 | [optional] |
| **order** | **String**| 並べ替えの順序 | [optional] [enum: asc, desc] |

### Return type

[**MeasurementUploadStatusesGetResponse**](MeasurementUploadStatusesGetResponse.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="uploadMeasurement"></a>
# **uploadMeasurement**
> MeasurementUploadPostResponse uploadMeasurement(edgeUuid, dataFile, baseTime, baseTimeType, channel, measEnd, labelDataType)

Create Measurement from CSV File

CSVまたはMP4（**MP4はexperimental**）ファイルをアップロードし、計測を作成します。 計測には、指定されたエッジUUIDが関連付けられます。  &#x60;base_time&#x60; （基準時刻）は、RFC3339による表現か、UNIX時刻（マイクロ秒）を指定してください。 基準時刻が指定されていない場合は、CSVファイルのデータ行の1行目の時刻が基準時刻として使用されます。 CSVファイルのデータは、時刻順にソートされている必要があります。 &#x60;meas_end&#x60; パラメーターの設定は任意です。指定しない場合、 &#x60;true&#x60; となります。  CSVファイルの例: &#x60;&#x60;&#x60; time,       col1,   col2, col3,      col4,   col5, col6,      col7,   col8, col9,      col10 1539263579, val11,  12,   13.12345,  val14,  15,   16.12345,  val17,  18, 19.12345,  val110 1539263580, val21,  22,   23.12345,  val24,  25,   26.12345,  val27,  28, 29.12345,  val210 1539263581, val31,  32,   33.12345,  val34,  35,   36.12345,  val37,  38, 39.12345,  val310 1539263582, val41,  42,   43.12345,  val44,  45,   46.12345,  val47,  48, 49.12345,  val410 &#x60;&#x60;&#x60; 空白行がある場合、行番号のカウントは加算されますが、その行は処理されません。 例えば、以下のような場合の空白行は無視されます。 &#x60;&#x60;&#x60; time,       col1,   col2, col3,      col4,   col5, col6,      col7,   col8, col9,      col10 1539263579, val11,  12,   13.12345,  val14,  15,   16.12345,  val17,  18, 19.12345,  val110  1539263581, val31,  32,   33.12345,  val34,  35,   36.12345,  val37,  38, 39.12345,  val310 1539263582, val41,  42,   43.12345,  val44,  45,   46.12345,  val47,  48, 49.12345,  val410 &#x60;&#x60;&#x60;  [Go parser library](https://golang.org/pkg/encoding/csv/) も参照してください。  時刻の列には、RFC3339による表現か、UNIX時刻（秒）を使用することができます。 ## エスケープ 値の内部で &#x60;,&#x60; を使用したい場合は、その値全体を &#x60;\&quot;&#x60; で囲んでください。 また、値の内部で &#x60;\&quot;&#x60; を使用したい場合は、値全体を &#x60;\&quot;&#x60; で囲み、さらに、 &#x60;\&quot;&#x60; を &#x60;\&quot;\&quot;&#x60; のように表記してください。 値を &#x60;\&quot;&#x60; で囲まないと、CSVファイルのパースの際にエラーが発生します。  エスケープの例: &#x60;&#x60;&#x60; time,col1 1539263579,\&quot;ab,cde\&quot;                  .....OK (parsed as &#39;ab,cde&#39;) 1539263579,\&quot;ab\&quot;\&quot;cde\&quot;                 .....OK (parsed as &#39;ab\&quot;cde&#39;) 1539263579,     abcde                .....OK (parsed as &#39;     abcde&#39;) 1539263579,\&quot;     abcde\&quot;              .....OK (parsed as &#39;     abcde&#39;) 1539263579,ab\&quot;cde                    .....NG 1539263579, \&quot;abcde\&quot;                  .....NG 1539263579,ab,cde                    .....NG(wrong number of fields) &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasUploadingMeasurementsApi;

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

    MeasUploadingMeasurementsApi apiInstance = new MeasUploadingMeasurementsApi(defaultClient);
    UUID edgeUuid = UUID.randomUUID(); // UUID | エッジのUUID
    File dataFile = new File("/path/to/file"); // File | アップロードするファイル
    Date baseTime = new Date(); // Date | 計測の基準時刻。MP4ファイルをアップロードする場合は必須です。
    String baseTimeType = "edge_rtc"; // String | 基準時刻のタイプ
    Integer channel = 56; // Integer | 計測のチャンネル（十進表記の文字列）
    Boolean measEnd = true; // Boolean | `true` にすると、計測は終了したものとして扱われます。
    String labelDataType = "labelDataType_example"; // String | 列名とデータタイプの対応。 データタイプは、 `int` 、` string` 、 `float` のいずれかを指定してください。 例: ``` {   \\\"column_1\\\": \\\"float\\\",   \\\"column_2\\\": \\\"string\\\",   \\\"column_3\\\": \\\"int\\\" } ```
    try {
      MeasurementUploadPostResponse result = apiInstance.uploadMeasurement(edgeUuid, dataFile, baseTime, baseTimeType, channel, measEnd, labelDataType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasUploadingMeasurementsApi#uploadMeasurement");
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
| **edgeUuid** | **UUID**| エッジのUUID | |
| **dataFile** | **File**| アップロードするファイル | |
| **baseTime** | **Date**| 計測の基準時刻。MP4ファイルをアップロードする場合は必須です。 | [optional] |
| **baseTimeType** | **String**| 基準時刻のタイプ | [optional] [default to edge_rtc] [enum: edge_rtc, ntp, gps, api_first_received, volatile, manual, undefined] |
| **channel** | **Integer**| 計測のチャンネル（十進表記の文字列） | [optional] |
| **measEnd** | **Boolean**| &#x60;true&#x60; にすると、計測は終了したものとして扱われます。 | [optional] |
| **labelDataType** | **String**| 列名とデータタイプの対応。 データタイプは、 &#x60;int&#x60; 、&#x60; string&#x60; 、 &#x60;float&#x60; のいずれかを指定してください。 例: &#x60;&#x60;&#x60; {   \\\&quot;column_1\\\&quot;: \\\&quot;float\\\&quot;,   \\\&quot;column_2\\\&quot;: \\\&quot;string\\\&quot;,   \\\&quot;column_3\\\&quot;: \\\&quot;int\\\&quot; } &#x60;&#x60;&#x60; | [optional] |

### Return type

[**MeasurementUploadPostResponse**](MeasurementUploadPostResponse.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | OK |  -  |

<a id="uploadMeasurementIntoMeasurement"></a>
# **uploadMeasurementIntoMeasurement**
> MeasurementUploadPostResponse uploadMeasurementIntoMeasurement(measurementUuid, dataFile, channel, measEnd, labelDataType)

Store Data Points by CSV File

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/upload&#x60; を使用してください）  CSVファイルをアップロードし、計測にデータを追加します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasUploadingMeasurementsApi;

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

    MeasUploadingMeasurementsApi apiInstance = new MeasUploadingMeasurementsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    File dataFile = new File("/path/to/file"); // File | アップロードするファイル
    Integer channel = 56; // Integer | 作成された計測のチャンネル
    Boolean measEnd = true; // Boolean | * `true` : 終了した計測 * `false` : 終了していない計測
    String labelDataType = "labelDataType_example"; // String | 列名とデータタイプの対応。 データタイプは、 `int` 、` string` 、 `float` のいずれかを指定してください。 例: ``` {   \\\"column_1\\\": \\\"float\\\",   \\\"column_2\\\": \\\"string\\\",   \\\"column_3\\\": \\\"int\\\" } ```
    try {
      MeasurementUploadPostResponse result = apiInstance.uploadMeasurementIntoMeasurement(measurementUuid, dataFile, channel, measEnd, labelDataType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasUploadingMeasurementsApi#uploadMeasurementIntoMeasurement");
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
| **dataFile** | **File**| アップロードするファイル | |
| **channel** | **Integer**| 作成された計測のチャンネル | [optional] |
| **measEnd** | **Boolean**| * &#x60;true&#x60; : 終了した計測 * &#x60;false&#x60; : 終了していない計測 | [optional] |
| **labelDataType** | **String**| 列名とデータタイプの対応。 データタイプは、 &#x60;int&#x60; 、&#x60; string&#x60; 、 &#x60;float&#x60; のいずれかを指定してください。 例: &#x60;&#x60;&#x60; {   \\\&quot;column_1\\\&quot;: \\\&quot;float\\\&quot;,   \\\&quot;column_2\\\&quot;: \\\&quot;string\\\&quot;,   \\\&quot;column_3\\\&quot;: \\\&quot;int\\\&quot; } &#x60;&#x60;&#x60; | [optional] |

### Return type

[**MeasurementUploadPostResponse**](MeasurementUploadPostResponse.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | OK |  -  |

<a id="uploadProjectMeasurement"></a>
# **uploadProjectMeasurement**
> MeasurementUploadPostResponse uploadProjectMeasurement(projectUuid, edgeUuid, dataFile, baseTime, baseTimeType, channel, measEnd, labelDataType)

Create Project Measurement from CSV File

CSVまたはMP4（**MP4はexperimental**）ファイルをアップロードし、計測を作成します。 計測には、指定されたエッジUUIDが関連付けられます。  &#x60;base_time&#x60; （基準時刻）は、RFC3339による表現か、UNIX時刻（マイクロ秒）を指定してください。 基準時刻が指定されていない場合は、CSVファイルのデータ行の1行目の時刻が基準時刻として使用されます。 CSVファイルのデータは、時刻順にソートされている必要があります。 &#x60;meas_end&#x60; パラメーターの設定は任意です。指定しない場合、 &#x60;true&#x60; となります。  CSVファイルの例: &#x60;&#x60;&#x60; time,       col1,   col2, col3,      col4,   col5, col6,      col7,   col8, col9,      col10 1539263579, val11,  12,   13.12345,  val14,  15,   16.12345,  val17,  18, 19.12345,  val110 1539263580, val21,  22,   23.12345,  val24,  25,   26.12345,  val27,  28, 29.12345,  val210 1539263581, val31,  32,   33.12345,  val34,  35,   36.12345,  val37,  38, 39.12345,  val310 1539263582, val41,  42,   43.12345,  val44,  45,   46.12345,  val47,  48, 49.12345,  val410 &#x60;&#x60;&#x60; 空白行がある場合、行番号のカウントは加算されますが、その行は処理されません。 例えば、以下のような場合の空白行は無視されます。 &#x60;&#x60;&#x60; time,       col1,   col2, col3,      col4,   col5, col6,      col7,   col8, col9,      col10 1539263579, val11,  12,   13.12345,  val14,  15,   16.12345,  val17,  18, 19.12345,  val110  1539263581, val31,  32,   33.12345,  val34,  35,   36.12345,  val37,  38, 39.12345,  val310 1539263582, val41,  42,   43.12345,  val44,  45,   46.12345,  val47,  48, 49.12345,  val410 &#x60;&#x60;&#x60;  [Go parser library](https://golang.org/pkg/encoding/csv/) も参照してください。  時刻の列には、RFC3339による表現か、UNIX時刻（秒）を使用することができます。 ## エスケープ 値の内部で &#x60;,&#x60; を使用したい場合は、その値全体を &#x60;\&quot;&#x60; で囲んでください。 また、値の内部で &#x60;\&quot;&#x60; を使用したい場合は、値全体を &#x60;\&quot;&#x60; で囲み、さらに、 &#x60;\&quot;&#x60; を &#x60;\&quot;\&quot;&#x60; のように表記してください。 値を &#x60;\&quot;&#x60; で囲まないと、CSVファイルのパースの際にエラーが発生します。  エスケープの例: &#x60;&#x60;&#x60; time,col1 1539263579,\&quot;ab,cde\&quot;                  .....OK (parsed as &#39;ab,cde&#39;) 1539263579,\&quot;ab\&quot;\&quot;cde\&quot;                 .....OK (parsed as &#39;ab\&quot;cde&#39;) 1539263579,     abcde                .....OK (parsed as &#39;     abcde&#39;) 1539263579,\&quot;     abcde\&quot;              .....OK (parsed as &#39;     abcde&#39;) 1539263579,ab\&quot;cde                    .....NG 1539263579, \&quot;abcde\&quot;                  .....NG 1539263579,ab,cde                    .....NG(wrong number of fields) &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasUploadingMeasurementsApi;

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

    MeasUploadingMeasurementsApi apiInstance = new MeasUploadingMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    UUID edgeUuid = UUID.randomUUID(); // UUID | エッジのUUID
    File dataFile = new File("/path/to/file"); // File | アップロードするファイル
    Date baseTime = new Date(); // Date | 計測の基準時刻。MP4ファイルをアップロードする場合は必須です。
    String baseTimeType = "edge_rtc"; // String | 基準時刻のタイプ
    Integer channel = 56; // Integer | 計測のチャンネル（十進表記の文字列）
    Boolean measEnd = true; // Boolean | `true` にすると、計測は終了したものとして扱われます。
    String labelDataType = "labelDataType_example"; // String | 列名とデータタイプの対応。 データタイプは、 `int` 、` string` 、 `float` のいずれかを指定してください。 例: ``` {   \\\"column_1\\\": \\\"float\\\",   \\\"column_2\\\": \\\"string\\\",   \\\"column_3\\\": \\\"int\\\" } ```
    try {
      MeasurementUploadPostResponse result = apiInstance.uploadProjectMeasurement(projectUuid, edgeUuid, dataFile, baseTime, baseTimeType, channel, measEnd, labelDataType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasUploadingMeasurementsApi#uploadProjectMeasurement");
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
| **edgeUuid** | **UUID**| エッジのUUID | |
| **dataFile** | **File**| アップロードするファイル | |
| **baseTime** | **Date**| 計測の基準時刻。MP4ファイルをアップロードする場合は必須です。 | [optional] |
| **baseTimeType** | **String**| 基準時刻のタイプ | [optional] [default to edge_rtc] [enum: edge_rtc, ntp, gps, api_first_received, volatile, manual, undefined] |
| **channel** | **Integer**| 計測のチャンネル（十進表記の文字列） | [optional] |
| **measEnd** | **Boolean**| &#x60;true&#x60; にすると、計測は終了したものとして扱われます。 | [optional] |
| **labelDataType** | **String**| 列名とデータタイプの対応。 データタイプは、 &#x60;int&#x60; 、&#x60; string&#x60; 、 &#x60;float&#x60; のいずれかを指定してください。 例: &#x60;&#x60;&#x60; {   \\\&quot;column_1\\\&quot;: \\\&quot;float\\\&quot;,   \\\&quot;column_2\\\&quot;: \\\&quot;string\\\&quot;,   \\\&quot;column_3\\\&quot;: \\\&quot;int\\\&quot; } &#x60;&#x60;&#x60; | [optional] |

### Return type

[**MeasurementUploadPostResponse**](MeasurementUploadPostResponse.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | OK |  -  |

<a id="uploadProjectMeasurementIntoMeasurement"></a>
# **uploadProjectMeasurementIntoMeasurement**
> MeasurementUploadPostResponse uploadProjectMeasurementIntoMeasurement(projectUuid, measurementUuid, dataFile, channel, measEnd, labelDataType)

Store Project Data Points by CSV File

CSVファイルをアップロードし、計測にデータを追加します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasUploadingMeasurementsApi;

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

    MeasUploadingMeasurementsApi apiInstance = new MeasUploadingMeasurementsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    File dataFile = new File("/path/to/file"); // File | アップロードするファイル
    Integer channel = 56; // Integer | 作成された計測のチャンネル
    Boolean measEnd = true; // Boolean | * `true` : 終了した計測 * `false` : 終了していない計測
    String labelDataType = "labelDataType_example"; // String | 列名とデータタイプの対応。 データタイプは、 `int` 、` string` 、 `float` のいずれかを指定してください。 例: ``` {   \\\"column_1\\\": \\\"float\\\",   \\\"column_2\\\": \\\"string\\\",   \\\"column_3\\\": \\\"int\\\" } ```
    try {
      MeasurementUploadPostResponse result = apiInstance.uploadProjectMeasurementIntoMeasurement(projectUuid, measurementUuid, dataFile, channel, measEnd, labelDataType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasUploadingMeasurementsApi#uploadProjectMeasurementIntoMeasurement");
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
| **dataFile** | **File**| アップロードするファイル | |
| **channel** | **Integer**| 作成された計測のチャンネル | [optional] |
| **measEnd** | **Boolean**| * &#x60;true&#x60; : 終了した計測 * &#x60;false&#x60; : 終了していない計測 | [optional] |
| **labelDataType** | **String**| 列名とデータタイプの対応。 データタイプは、 &#x60;int&#x60; 、&#x60; string&#x60; 、 &#x60;float&#x60; のいずれかを指定してください。 例: &#x60;&#x60;&#x60; {   \\\&quot;column_1\\\&quot;: \\\&quot;float\\\&quot;,   \\\&quot;column_2\\\&quot;: \\\&quot;string\\\&quot;,   \\\&quot;column_3\\\&quot;: \\\&quot;int\\\&quot; } &#x60;&#x60;&#x60; | [optional] |

### Return type

[**MeasurementUploadPostResponse**](MeasurementUploadPostResponse.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | OK |  -  |

