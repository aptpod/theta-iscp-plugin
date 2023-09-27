# MeasDataPointsApi

All URIs are relative to *https://example.intdash.jp/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDataPoints**](MeasDataPointsApi.md#createDataPoints) | **POST** /v1/measurements/data | Store Data Points |
| [**createProjectDataPoints**](MeasDataPointsApi.md#createProjectDataPoints) | **POST** /v1/projects/{project_uuid}/measurements/data | Store Project Data Points |
| [**listDataIDs**](MeasDataPointsApi.md#listDataIDs) | **GET** /v1/getids | List Edge&#39;s Data IDs |
| [**listDataIDsWithMeasurementUUID**](MeasDataPointsApi.md#listDataIDsWithMeasurementUUID) | **GET** /v1/measurements/{measurement_uuid}/getids | List Data IDs |
| [**listDataPoints**](MeasDataPointsApi.md#listDataPoints) | **GET** /v1/data | List Data Points |
| [**listProjectDataIDs**](MeasDataPointsApi.md#listProjectDataIDs) | **GET** /v1/projects/{project_uuid}/getids | List Project Edge&#39;s Data IDs |
| [**listProjectDataIDsWithMeasurementUUID**](MeasDataPointsApi.md#listProjectDataIDsWithMeasurementUUID) | **GET** /v1/projects/{project_uuid}/measurements/{measurement_uuid}/getids | List Project Data IDs |
| [**listProjectDataPoints**](MeasDataPointsApi.md#listProjectDataPoints) | **GET** /v1/projects/{project_uuid}/data | List Project Data Points |


<a id="createDataPoints"></a>
# **createDataPoints**
> File createDataPoints(body)

Store Data Points

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/data&#x60; を使用してください）  データポイントを登録します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasDataPointsApi;

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

    MeasDataPointsApi apiInstance = new MeasDataPointsApi(defaultClient);
    File body = new File("/path/to/file"); // File | このエンドポイント使用時は、 `Content-Type` を以下にしてください。   * `application/protobuf`       * [protocol.proto](https://docs.intdash.jp/api/measurement/proto/index.html) の `StoreProto` を参照してください。         * `DataPointProto` の `data_payload`は iSCP v1のデータフォーマットに従います。         * iSCPのデータフォーマットは [詳説 iSCP 1.0](https://docs.intdash.jp/manual/iscp1-essentials/latest/ja/iscp1-essentials-ja.pdf#page=23)を参照してください。
    try {
      File result = apiInstance.createDataPoints(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasDataPointsApi#createDataPoints");
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
| **body** | **File**| このエンドポイント使用時は、 &#x60;Content-Type&#x60; を以下にしてください。   * &#x60;application/protobuf&#x60;       * [protocol.proto](https://docs.intdash.jp/api/measurement/proto/index.html) の &#x60;StoreProto&#x60; を参照してください。         * &#x60;DataPointProto&#x60; の &#x60;data_payload&#x60;は iSCP v1のデータフォーマットに従います。         * iSCPのデータフォーマットは [詳説 iSCP 1.0](https://docs.intdash.jp/manual/iscp1-essentials/latest/ja/iscp1-essentials-ja.pdf#page&#x3D;23)を参照してください。 | [optional] |

### Return type

[**File**](File.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/protobuf
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createProjectDataPoints"></a>
# **createProjectDataPoints**
> File createProjectDataPoints(projectUuid, body)

Store Project Data Points

データポイントを登録します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasDataPointsApi;

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

    MeasDataPointsApi apiInstance = new MeasDataPointsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    File body = new File("/path/to/file"); // File | このエンドポイント使用時は、 `Content-Type` を以下にしてください。   * `application/protobuf`       * [protocol.proto](https://docs.intdash.jp/api/measurement/proto/index.html) の `StoreProto` を参照してください。         * `DataPointProto` の `data_payload`は iSCP v1のデータフォーマットに従います。         * iSCPのデータフォーマットは [詳説 iSCP 1.0](https://docs.intdash.jp/manual/iscp1-essentials/latest/ja/iscp1-essentials-ja.pdf#page=23)を参照してください。
    try {
      File result = apiInstance.createProjectDataPoints(projectUuid, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasDataPointsApi#createProjectDataPoints");
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
| **body** | **File**| このエンドポイント使用時は、 &#x60;Content-Type&#x60; を以下にしてください。   * &#x60;application/protobuf&#x60;       * [protocol.proto](https://docs.intdash.jp/api/measurement/proto/index.html) の &#x60;StoreProto&#x60; を参照してください。         * &#x60;DataPointProto&#x60; の &#x60;data_payload&#x60;は iSCP v1のデータフォーマットに従います。         * iSCPのデータフォーマットは [詳説 iSCP 1.0](https://docs.intdash.jp/manual/iscp1-essentials/latest/ja/iscp1-essentials-ja.pdf#page&#x3D;23)を参照してください。 | [optional] |

### Return type

[**File**](File.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/protobuf
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listDataIDs"></a>
# **listDataIDs**
> DataIDs listDataIDs(start, end, edgeUuid)

List Edge&#39;s Data IDs

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/getids&#x60; を使用してください）  エッジを指定し、そのエッジから送信されているデータに含まれるデータ識別子（ &#x60;data_type&#x60; 、 &#x60;channel&#x60; 、 &#x60;data_id&#x60; の組み合わせ）のリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasDataPointsApi;

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

    MeasDataPointsApi apiInstance = new MeasDataPointsApi(defaultClient);
    Long start = 1505797626000000L; // Long | 取得対象範囲の始点（マイクロ秒単位のUNIX時刻）
    Long end = 1505798226123456L; // Long | 取得対象範囲の終点（マイクロ秒単位のUNIX時刻）
    String edgeUuid = "24dbdc29-165f-4919-b2ce-7a335282bde2"; // String | エッジのUUID
    try {
      DataIDs result = apiInstance.listDataIDs(start, end, edgeUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasDataPointsApi#listDataIDs");
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
| **start** | **Long**| 取得対象範囲の始点（マイクロ秒単位のUNIX時刻） | [optional] |
| **end** | **Long**| 取得対象範囲の終点（マイクロ秒単位のUNIX時刻） | [optional] |
| **edgeUuid** | **String**| エッジのUUID | [optional] |

### Return type

[**DataIDs**](DataIDs.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listDataIDsWithMeasurementUUID"></a>
# **listDataIDsWithMeasurementUUID**
> DataIDs listDataIDsWithMeasurementUUID(measurementUuid)

List Data IDs

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/measurements/{measurement_uuid}/getids&#x60; を使用してください） 計測を指定し、その計測に含まれるデータ識別子（ &#x60;data_type&#x60; 、 &#x60;channel&#x60; 、 &#x60;data_id&#x60; の組み合わせ）のリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasDataPointsApi;

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

    MeasDataPointsApi apiInstance = new MeasDataPointsApi(defaultClient);
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      DataIDs result = apiInstance.listDataIDsWithMeasurementUUID(measurementUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasDataPointsApi#listDataIDsWithMeasurementUUID");
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

[**DataIDs**](DataIDs.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listDataPoints"></a>
# **listDataPoints**
> File listDataPoints(name, start, end, idq, since, exitOnError, label, period, limit, order, timeFormat)

List Data Points

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/data&#x60; を使用してください）  データポイントのリストを取得します。  返却されるデータポイントはJSON形式です。データポイントごとに改行で区切られます。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasDataPointsApi;

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

    MeasDataPointsApi apiInstance = new MeasDataPointsApi(defaultClient);
    String name = "8f40b21c-f2c4-4fa5-8fe3-325491a59597"; // String | どの計測またはどのエッジのデータポイントを取得するかを、以下のいずれかを使って指定します： - 計測UUID - エッジUUID - エッジの名前  最初に、指定されたnameに一致する計測UUIDがあるかが検索されます。なければ一致するエッジUUIDがあるかが検索され、それもなければ一致するエッジの名前があるかが検索されます。
    String start = "2019-10-29T03:04:05.123456Z"; // String | 取得対象範囲の始点。以下のいずれかの形式で指定します。   - rfc3339(ex 2019-10-29T03:04:05.341268Z)   - UNIX時刻（マイクロ秒）(**Deprecated**)
    String end = "2019-10-29T03:04:05.234567Z"; // String | 取得対象範囲の終点。以下のいずれかの形式で指定します。   - rfc3339(ex 2019-10-29T03:04:05.341268Z)   - UNIX時刻（マイクロ秒）(**Deprecated**)
    List<String> idq = Arrays.asList(); // List<String> | 取得したいデータポイントの条件を以下のフォーマットで指定します。 `data_id` には、 `GET /data_ids` エンドポイントで取得できる `data_id` の値を使用します。  - `<data_type>:<channel>/<data_id>`  各セグメントにはワイルドカード(*)を使用することができます。 例:   - CAN(data_type = `1`)のデータポイントを取得する -> `1:*_/_*` または `1`   - チャンネル2のCANデータポイントを取得する -> `1:2/_*` または `1:2`   - チャンネル2のCANデータポイントのうち、データIDが `00000001` のものを取得する -> `1:2/00000001`
    String since = "2019-10-29T03:04:05.341268Z"; // String | 指定した時刻以降に更新された計測のみを取得します。 以下のいずれかの形式で指定します。   - rfc3339(ex 2019-10-29T03:04:05.341268Z).   - UNIX時刻（マイクロ秒）(**Deprecated**).
    String exitOnError = "false"; // String | `true` を指定した場合、取得中にエラーが発生すると処理を中断し、中断前までのデータポイントのリストを返します。
    List<String> label = Arrays.asList(); // List<String> | 信号定義のラベル
    Long period = 10000L; // Long | データポイントを指定した間隔（マイクロ秒）に間引きます。（ **Experimental** ）  指定された間隔ごとに最新のデータポイントを残し、それ以外を除去します。 また、指定された間隔になるようにデータポイントの時刻を揃えます。 ```  --1--2----3---4--5---6-7--89-a---b-c---d--e--> period指定なし  |     |     |     |     |     |     |     |  |     |     |     |     |     |     |     |  2-----3-----5-----7-----a-----c-----d-----e--> period指定あり   |<--->| period ```
    Long limit = 56L; // Long | 1回のリクエストで取得する件数。デフォルトは無制限。
    String order = "asc"; // String | 並べ替えの順序。デフォルトは `asc` （昇順）
    String timeFormat = "ns"; // String | レスポンスの時刻表示形式。デフォルトは `us` （マイクロ秒）
    try {
      File result = apiInstance.listDataPoints(name, start, end, idq, since, exitOnError, label, period, limit, order, timeFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasDataPointsApi#listDataPoints");
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
| **name** | **String**| どの計測またはどのエッジのデータポイントを取得するかを、以下のいずれかを使って指定します： - 計測UUID - エッジUUID - エッジの名前  最初に、指定されたnameに一致する計測UUIDがあるかが検索されます。なければ一致するエッジUUIDがあるかが検索され、それもなければ一致するエッジの名前があるかが検索されます。 | |
| **start** | **String**| 取得対象範囲の始点。以下のいずれかの形式で指定します。   - rfc3339(ex 2019-10-29T03:04:05.341268Z)   - UNIX時刻（マイクロ秒）(**Deprecated**) | [optional] |
| **end** | **String**| 取得対象範囲の終点。以下のいずれかの形式で指定します。   - rfc3339(ex 2019-10-29T03:04:05.341268Z)   - UNIX時刻（マイクロ秒）(**Deprecated**) | [optional] |
| **idq** | [**List&lt;String&gt;**](String.md)| 取得したいデータポイントの条件を以下のフォーマットで指定します。 &#x60;data_id&#x60; には、 &#x60;GET /data_ids&#x60; エンドポイントで取得できる &#x60;data_id&#x60; の値を使用します。  - &#x60;&lt;data_type&gt;:&lt;channel&gt;/&lt;data_id&gt;&#x60;  各セグメントにはワイルドカード(*)を使用することができます。 例:   - CAN(data_type &#x3D; &#x60;1&#x60;)のデータポイントを取得する -&gt; &#x60;1:*_/_*&#x60; または &#x60;1&#x60;   - チャンネル2のCANデータポイントを取得する -&gt; &#x60;1:2/_*&#x60; または &#x60;1:2&#x60;   - チャンネル2のCANデータポイントのうち、データIDが &#x60;00000001&#x60; のものを取得する -&gt; &#x60;1:2/00000001&#x60; | [optional] |
| **since** | **String**| 指定した時刻以降に更新された計測のみを取得します。 以下のいずれかの形式で指定します。   - rfc3339(ex 2019-10-29T03:04:05.341268Z).   - UNIX時刻（マイクロ秒）(**Deprecated**). | [optional] |
| **exitOnError** | **String**| &#x60;true&#x60; を指定した場合、取得中にエラーが発生すると処理を中断し、中断前までのデータポイントのリストを返します。 | [optional] [default to false] |
| **label** | [**List&lt;String&gt;**](String.md)| 信号定義のラベル | [optional] |
| **period** | **Long**| データポイントを指定した間隔（マイクロ秒）に間引きます。（ **Experimental** ）  指定された間隔ごとに最新のデータポイントを残し、それ以外を除去します。 また、指定された間隔になるようにデータポイントの時刻を揃えます。 &#x60;&#x60;&#x60;  --1--2----3---4--5---6-7--89-a---b-c---d--e--&gt; period指定なし  |     |     |     |     |     |     |     |  |     |     |     |     |     |     |     |  2-----3-----5-----7-----a-----c-----d-----e--&gt; period指定あり   |&lt;---&gt;| period &#x60;&#x60;&#x60; | [optional] |
| **limit** | **Long**| 1回のリクエストで取得する件数。デフォルトは無制限。 | [optional] |
| **order** | **String**| 並べ替えの順序。デフォルトは &#x60;asc&#x60; （昇順） | [optional] [enum: asc, desc] |
| **timeFormat** | **String**| レスポンスの時刻表示形式。デフォルトは &#x60;us&#x60; （マイクロ秒） | [optional] [enum: ns, us, ms, s, rfc3339] |

### Return type

[**File**](File.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, application/protobuf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Transfer-Encoding -  <br>  |

<a id="listProjectDataIDs"></a>
# **listProjectDataIDs**
> DataIDs listProjectDataIDs(projectUuid, start, end, edgeUuid)

List Project Edge&#39;s Data IDs

エッジを指定し、そのエッジから送信されているデータに含まれるデータ識別子（ &#x60;data_type&#x60; 、 &#x60;channel&#x60; 、 &#x60;data_id&#x60; の組み合わせ）のリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasDataPointsApi;

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

    MeasDataPointsApi apiInstance = new MeasDataPointsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    Long start = 1505797626000000L; // Long | 取得対象範囲の始点（マイクロ秒単位のUNIX時刻）
    Long end = 1505798226123456L; // Long | 取得対象範囲の終点（マイクロ秒単位のUNIX時刻）
    String edgeUuid = "24dbdc29-165f-4919-b2ce-7a335282bde2"; // String | エッジのUUID
    try {
      DataIDs result = apiInstance.listProjectDataIDs(projectUuid, start, end, edgeUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasDataPointsApi#listProjectDataIDs");
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
| **start** | **Long**| 取得対象範囲の始点（マイクロ秒単位のUNIX時刻） | [optional] |
| **end** | **Long**| 取得対象範囲の終点（マイクロ秒単位のUNIX時刻） | [optional] |
| **edgeUuid** | **String**| エッジのUUID | [optional] |

### Return type

[**DataIDs**](DataIDs.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listProjectDataIDsWithMeasurementUUID"></a>
# **listProjectDataIDsWithMeasurementUUID**
> DataIDs listProjectDataIDsWithMeasurementUUID(projectUuid, measurementUuid)

List Project Data IDs

計測を指定し、その計測に含まれるデータ識別子（ &#x60;data_type&#x60; 、 &#x60;channel&#x60; 、 &#x60;data_id&#x60; の組み合わせ）のリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasDataPointsApi;

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

    MeasDataPointsApi apiInstance = new MeasDataPointsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measurementUuid = "2cc7de37-6f71-4458-887e-10e618a6fcfb"; // String | 計測のUUID
    try {
      DataIDs result = apiInstance.listProjectDataIDsWithMeasurementUUID(projectUuid, measurementUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasDataPointsApi#listProjectDataIDsWithMeasurementUUID");
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

[**DataIDs**](DataIDs.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listProjectDataPoints"></a>
# **listProjectDataPoints**
> File listProjectDataPoints(projectUuid, name, idq, start, end, since, exitOnError, label, period, limit, order, timeFormat)

List Project Data Points

データポイントのリストを取得します。 返却されるデータポイントはJSON形式です。データポイントごとに改行で区切られます。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasDataPointsApi;

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

    MeasDataPointsApi apiInstance = new MeasDataPointsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String name = "8f40b21c-f2c4-4fa5-8fe3-325491a59597"; // String | どの計測またはどのエッジのデータポイントを取得するかを、以下のいずれかを使って指定します： - 計測UUID - エッジUUID - エッジの名前  最初に、指定されたnameに一致する計測UUIDがあるかが検索されます。なければ一致するエッジUUIDがあるかが検索され、それもなければ一致するエッジの名前があるかが検索されます。
    List<String> idq = Arrays.asList(); // List<String> | 取得したいデータポイントの条件を以下のフォーマットで指定します。 `data_id` には、 `GET /data_ids` エンドポイントで取得できる `data_id` の値を使用します。  - `<data_type>:<channel>/<data_id>`  各セグメントにはワイルドカード(*)を使用することができます。 例:   - CAN(data_type = `1`)のデータポイントを取得する -> `1:*_/_*` または `1`   - チャンネル2のCANデータポイントを取得する -> `1:2/_*` または `1:2`   - チャンネル2のCANデータポイントのうち、データIDが `00000001` のものを取得する -> `1:2/00000001`
    String start = "2019-10-29T03:04:05.123456Z"; // String | 取得対象範囲の始点。以下のいずれかの形式で指定します。   - rfc3339(ex 2019-10-29T03:04:05.341268Z)   - UNIX時刻（マイクロ秒）(**Deprecated**)
    String end = "2019-10-29T03:04:05.234567Z"; // String | 取得対象範囲の終点。以下のいずれかの形式で指定します。   - rfc3339(ex 2019-10-29T03:04:05.341268Z)   - UNIX時刻（マイクロ秒）(**Deprecated**)
    String since = "2019-10-29T03:04:05.341268Z"; // String | 指定した時刻以降に更新された計測のみを取得します。 以下のいずれかの形式で指定します。   - rfc3339(ex 2019-10-29T03:04:05.341268Z).   - UNIX時刻（マイクロ秒）(**Deprecated**).
    String exitOnError = "false"; // String | `true` を指定した場合、取得中にエラーが発生すると処理を中断し、中断前までのデータポイントのリストを返します。
    List<String> label = Arrays.asList(); // List<String> | 信号定義のラベル
    Long period = 10000L; // Long | データポイントを指定した間隔（マイクロ秒）に間引きます。（ **Experimental** ）  指定された間隔ごとに最新のデータポイントを残し、それ以外を除去します。 また、指定された間隔になるようにデータポイントの時刻を揃えます。 ```  --1--2----3---4--5---6-7--89-a---b-c---d--e--> period指定なし  |     |     |     |     |     |     |     |  |     |     |     |     |     |     |     |  2-----3-----5-----7-----a-----c-----d-----e--> period指定あり   |<--->| period ```
    Integer limit = 1000; // Integer | 1回のリクエストで取得する件数
    String order = "asc"; // String | 並べ替えの順序。デフォルトは `asc` （昇順）
    String timeFormat = "ns"; // String | レスポンスの時刻表示形式。デフォルトは `us` （マイクロ秒）
    try {
      File result = apiInstance.listProjectDataPoints(projectUuid, name, idq, start, end, since, exitOnError, label, period, limit, order, timeFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasDataPointsApi#listProjectDataPoints");
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
| **name** | **String**| どの計測またはどのエッジのデータポイントを取得するかを、以下のいずれかを使って指定します： - 計測UUID - エッジUUID - エッジの名前  最初に、指定されたnameに一致する計測UUIDがあるかが検索されます。なければ一致するエッジUUIDがあるかが検索され、それもなければ一致するエッジの名前があるかが検索されます。 | |
| **idq** | [**List&lt;String&gt;**](String.md)| 取得したいデータポイントの条件を以下のフォーマットで指定します。 &#x60;data_id&#x60; には、 &#x60;GET /data_ids&#x60; エンドポイントで取得できる &#x60;data_id&#x60; の値を使用します。  - &#x60;&lt;data_type&gt;:&lt;channel&gt;/&lt;data_id&gt;&#x60;  各セグメントにはワイルドカード(*)を使用することができます。 例:   - CAN(data_type &#x3D; &#x60;1&#x60;)のデータポイントを取得する -&gt; &#x60;1:*_/_*&#x60; または &#x60;1&#x60;   - チャンネル2のCANデータポイントを取得する -&gt; &#x60;1:2/_*&#x60; または &#x60;1:2&#x60;   - チャンネル2のCANデータポイントのうち、データIDが &#x60;00000001&#x60; のものを取得する -&gt; &#x60;1:2/00000001&#x60; | [optional] |
| **start** | **String**| 取得対象範囲の始点。以下のいずれかの形式で指定します。   - rfc3339(ex 2019-10-29T03:04:05.341268Z)   - UNIX時刻（マイクロ秒）(**Deprecated**) | [optional] |
| **end** | **String**| 取得対象範囲の終点。以下のいずれかの形式で指定します。   - rfc3339(ex 2019-10-29T03:04:05.341268Z)   - UNIX時刻（マイクロ秒）(**Deprecated**) | [optional] |
| **since** | **String**| 指定した時刻以降に更新された計測のみを取得します。 以下のいずれかの形式で指定します。   - rfc3339(ex 2019-10-29T03:04:05.341268Z).   - UNIX時刻（マイクロ秒）(**Deprecated**). | [optional] |
| **exitOnError** | **String**| &#x60;true&#x60; を指定した場合、取得中にエラーが発生すると処理を中断し、中断前までのデータポイントのリストを返します。 | [optional] [default to false] |
| **label** | [**List&lt;String&gt;**](String.md)| 信号定義のラベル | [optional] |
| **period** | **Long**| データポイントを指定した間隔（マイクロ秒）に間引きます。（ **Experimental** ）  指定された間隔ごとに最新のデータポイントを残し、それ以外を除去します。 また、指定された間隔になるようにデータポイントの時刻を揃えます。 &#x60;&#x60;&#x60;  --1--2----3---4--5---6-7--89-a---b-c---d--e--&gt; period指定なし  |     |     |     |     |     |     |     |  |     |     |     |     |     |     |     |  2-----3-----5-----7-----a-----c-----d-----e--&gt; period指定あり   |&lt;---&gt;| period &#x60;&#x60;&#x60; | [optional] |
| **limit** | **Integer**| 1回のリクエストで取得する件数 | [optional] |
| **order** | **String**| 並べ替えの順序。デフォルトは &#x60;asc&#x60; （昇順） | [optional] [enum: asc, desc] |
| **timeFormat** | **String**| レスポンスの時刻表示形式。デフォルトは &#x60;us&#x60; （マイクロ秒） | [optional] [enum: ns, us, ms, s, rfc3339] |

### Return type

[**File**](File.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, application/protobuf

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Transfer-Encoding -  <br>  |

