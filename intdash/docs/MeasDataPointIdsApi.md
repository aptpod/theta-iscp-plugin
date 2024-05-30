# MeasDataPointIdsApi

All URIs are relative to *https://example.intdash.jp/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listDataPointDataIDs**](MeasDataPointIdsApi.md#listDataPointDataIDs) | **GET** /v1/data_ids | List Data Point Data IDs |
| [**listProjectDataPointDataIDs**](MeasDataPointIdsApi.md#listProjectDataPointDataIDs) | **GET** /v1/projects/{project_uuid}/data_ids | List Project Data Point Data IDs |


<a id="listDataPointDataIDs"></a>
# **listDataPointDataIDs**
> DataPointDataIDs listDataPointDataIDs(name, start, end)

List Data Point Data IDs

（Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/data_ids&#x60; を使用してください）  データポイントのデータID（ &#x60;data_type&#x60;, &#x60;data_id&#x60; ）のリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasDataPointIdsApi;

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

    MeasDataPointIdsApi apiInstance = new MeasDataPointIdsApi(defaultClient);
    String name = "8f40b21c-f2c4-4fa5-8fe3-325491a59597"; // String | どの計測またはどのエッジのデータポイントを取得するかを、以下のいずれかを使って指定します： - 計測UUID - エッジUUID - エッジの名前  最初に、指定されたnameに一致する計測UUIDがあるかが検索されます。なければ一致するエッジUUIDがあるかが検索され、それもなければ一致するエッジの名前があるかが検索されます。
    String start = "2019-10-29T03:04:05.123456Z"; // String | 取得対象範囲の始点。以下のいずれかの形式で指定します。   - rfc3339(ex 2019-10-29T03:04:05.341268Z)   - UNIX時刻（マイクロ秒）(**Deprecated**)
    String end = "2019-10-29T03:04:05.234567Z"; // String | 取得対象範囲の終点。以下のいずれかの形式で指定します。   - rfc3339(ex 2019-10-29T03:04:05.341268Z)   - UNIX時刻（マイクロ秒）(**Deprecated**)
    try {
      DataPointDataIDs result = apiInstance.listDataPointDataIDs(name, start, end);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasDataPointIdsApi#listDataPointDataIDs");
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

### Return type

[**DataPointDataIDs**](DataPointDataIDs.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listProjectDataPointDataIDs"></a>
# **listProjectDataPointDataIDs**
> DataPointDataIDs listProjectDataPointDataIDs(projectUuid, name, start, end)

List Project Data Point Data IDs

データポイントのデータID（ &#x60;data_type&#x60;, &#x60;data_id&#x60; ）のリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MeasDataPointIdsApi;

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

    MeasDataPointIdsApi apiInstance = new MeasDataPointIdsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String name = "8f40b21c-f2c4-4fa5-8fe3-325491a59597"; // String | どの計測またはどのエッジのデータポイントを取得するかを、以下のいずれかを使って指定します： - 計測UUID - エッジUUID - エッジの名前  最初に、指定されたnameに一致する計測UUIDがあるかが検索されます。なければ一致するエッジUUIDがあるかが検索され、それもなければ一致するエッジの名前があるかが検索されます。
    String start = "2019-10-29T03:04:05.123456Z"; // String | 取得対象範囲の始点。以下のいずれかの形式で指定します。   - rfc3339(ex 2019-10-29T03:04:05.341268Z)   - UNIX時刻（マイクロ秒）(**Deprecated**)
    String end = "2019-10-29T03:04:05.234567Z"; // String | 取得対象範囲の終点。以下のいずれかの形式で指定します。   - rfc3339(ex 2019-10-29T03:04:05.341268Z)   - UNIX時刻（マイクロ秒）(**Deprecated**)
    try {
      DataPointDataIDs result = apiInstance.listProjectDataPointDataIDs(projectUuid, name, start, end);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MeasDataPointIdsApi#listProjectDataPointDataIDs");
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
| **start** | **String**| 取得対象範囲の始点。以下のいずれかの形式で指定します。   - rfc3339(ex 2019-10-29T03:04:05.341268Z)   - UNIX時刻（マイクロ秒）(**Deprecated**) | [optional] |
| **end** | **String**| 取得対象範囲の終点。以下のいずれかの形式で指定します。   - rfc3339(ex 2019-10-29T03:04:05.341268Z)   - UNIX時刻（マイクロ秒）(**Deprecated**) | [optional] |

### Return type

[**DataPointDataIDs**](DataPointDataIDs.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

