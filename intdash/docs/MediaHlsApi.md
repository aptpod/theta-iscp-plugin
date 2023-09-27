# MediaHlsApi

All URIs are relative to *https://example.intdash.jp/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFMP4**](MediaHlsApi.md#getFMP4) | **GET** /media/measurements/{meas_uuid}/channels/{channel}/mp4s/measurement.mp4 | Get HLS as FMP4 |
| [**getHLSes**](MediaHlsApi.md#getHLSes) | **GET** /media/hlses | List HLSes |
| [**getPlaylist**](MediaHlsApi.md#getPlaylist) | **GET** /media/measurements/{meas_uuid}/channels/{channel}/hlses/playlist.m3u8 | Get HLS Playlist |
| [**getProjectFMP4**](MediaHlsApi.md#getProjectFMP4) | **GET** /media/projects/{project_uuid}/measurements/{meas_uuid}/channels/{channel}/mp4s/measurement.mp4 | Get Project HLS as FMP4 |
| [**getProjectHLSes**](MediaHlsApi.md#getProjectHLSes) | **GET** /media/projects/{project_uuid}/hlses | List Project HLSes |
| [**getProjectPlaylist**](MediaHlsApi.md#getProjectPlaylist) | **GET** /media/projects/{project_uuid}/measurements/{meas_uuid}/channels/{channel}/hlses/playlist.m3u8 | Get Project HLS Playlist |


<a id="getFMP4"></a>
# **getFMP4**
> File getFMP4(measUuid, channel)

Get HLS as FMP4

**Deprecated** このエンドポイントの代わりに [&#x60;POST /media/videos/{video_uuid}/mp4s&#x60;](#operation/createMP4) を使用してください。 mp4リソース作成後、 &#x60;MP4&#x60;オブジェクトの &#x60;file_path&#x60;にあるPATHに従って動画を取得してください

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaHlsApi;

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

    MediaHlsApi apiInstance = new MediaHlsApi(defaultClient);
    String measUuid = "f967c530-f562-410a-991b-031c43142778"; // String | 計測のUUID
    Integer channel = 1; // Integer | チャンネル
    try {
      File result = apiInstance.getFMP4(measUuid, channel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaHlsApi#getFMP4");
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
| **measUuid** | **String**| 計測のUUID | |
| **channel** | **Integer**| チャンネル | |

### Return type

[**File**](File.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: video/mp4

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getHLSes"></a>
# **getHLSes**
> HLSList getHLSes(start, end, edgeUuid, channel, limit)

List HLSes

**Deprecated** このエンドポイントではなく [&#x60;GET /media/videos&#x60;](#operation/getVideos) を使用してください

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaHlsApi;

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

    MediaHlsApi apiInstance = new MediaHlsApi(defaultClient);
    Integer start = 1234567890; // Integer | 取得対象範囲の始点（マイクロ秒単位のUNIX時刻）
    Integer end = 1234567890; // Integer | 取得対象範囲の終点（マイクロ秒単位のUNIX時刻）
    String edgeUuid = "3699e2b9-5d87-4dbd-9b85-098e7dfaee76"; // String | エッジのUUID
    Integer channel = 1; // Integer | チャンネル
    Integer limit = 1000; // Integer | 1回のリクエストで取得する件数
    try {
      HLSList result = apiInstance.getHLSes(start, end, edgeUuid, channel, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaHlsApi#getHLSes");
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
| **start** | **Integer**| 取得対象範囲の始点（マイクロ秒単位のUNIX時刻） | [optional] |
| **end** | **Integer**| 取得対象範囲の終点（マイクロ秒単位のUNIX時刻） | [optional] |
| **edgeUuid** | **String**| エッジのUUID | [optional] |
| **channel** | **Integer**| チャンネル | [optional] |
| **limit** | **Integer**| 1回のリクエストで取得する件数 | [optional] |

### Return type

[**HLSList**](HLSList.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPlaylist"></a>
# **getPlaylist**
> String getPlaylist(measUuid, channel, forceEnd)

Get HLS Playlist

**Depricated** このエンドポイントの代わりに、Videoオブジェクトの &#x60;hls&#x60;にあるPATHにしたがってPlaylistを取得してください。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaHlsApi;

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

    MediaHlsApi apiInstance = new MediaHlsApi(defaultClient);
    String measUuid = "f967c530-f562-410a-991b-031c43142778"; // String | 計測のUUID
    Integer channel = 1; // Integer | チャンネル
    Boolean forceEnd = true; // Boolean | `true` にすると、取得するm3u8形式のプレイリストに強制的にEXT-X-ENDLISTを追加します。
    try {
      String result = apiInstance.getPlaylist(measUuid, channel, forceEnd);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaHlsApi#getPlaylist");
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
| **measUuid** | **String**| 計測のUUID | |
| **channel** | **Integer**| チャンネル | |
| **forceEnd** | **Boolean**| &#x60;true&#x60; にすると、取得するm3u8形式のプレイリストに強制的にEXT-X-ENDLISTを追加します。 | [optional] |

### Return type

**String**

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.apple.mpegurl

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProjectFMP4"></a>
# **getProjectFMP4**
> File getProjectFMP4(projectUuid, measUuid, channel)

Get Project HLS as FMP4

**Deprecated** このエンドポイントの代わりに [&#x60;POST /media/videos/{video_uuid}/mp4s&#x60;](#operation/createMP4) を使用してください。 mp4リソース作成後、 &#x60;MP4&#x60;オブジェクトの &#x60;file_path&#x60;にあるPATHに従って動画を取得してください

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaHlsApi;

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

    MediaHlsApi apiInstance = new MediaHlsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measUuid = "f967c530-f562-410a-991b-031c43142778"; // String | 計測のUUID
    Integer channel = 1; // Integer | チャンネル
    try {
      File result = apiInstance.getProjectFMP4(projectUuid, measUuid, channel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaHlsApi#getProjectFMP4");
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
| **measUuid** | **String**| 計測のUUID | |
| **channel** | **Integer**| チャンネル | |

### Return type

[**File**](File.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: video/mp4

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProjectHLSes"></a>
# **getProjectHLSes**
> HLSList getProjectHLSes(projectUuid, start, end, edgeUuid, channel, limit)

List Project HLSes

**Deprecated** このエンドポイントではなく [&#x60;GET /media/videos&#x60;](#operation/getVideos) を使用してください

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaHlsApi;

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

    MediaHlsApi apiInstance = new MediaHlsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    Integer start = 123456789; // Integer | 取得対象範囲の始点（マイクロ秒単位のUNIX時刻）
    Integer end = 1234567890; // Integer | 取得対象範囲の終点（マイクロ秒単位のUNIX時刻）
    String edgeUuid = "3699e2b9-5d87-4dbd-9b85-098e7dfaee76"; // String | エッジのUUID
    Integer channel = 1; // Integer | チャンネル
    Integer limit = 1000; // Integer | 1回のリクエストで取得する件数
    try {
      HLSList result = apiInstance.getProjectHLSes(projectUuid, start, end, edgeUuid, channel, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaHlsApi#getProjectHLSes");
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
| **start** | **Integer**| 取得対象範囲の始点（マイクロ秒単位のUNIX時刻） | [optional] |
| **end** | **Integer**| 取得対象範囲の終点（マイクロ秒単位のUNIX時刻） | [optional] |
| **edgeUuid** | **String**| エッジのUUID | [optional] |
| **channel** | **Integer**| チャンネル | [optional] |
| **limit** | **Integer**| 1回のリクエストで取得する件数 | [optional] |

### Return type

[**HLSList**](HLSList.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProjectPlaylist"></a>
# **getProjectPlaylist**
> String getProjectPlaylist(projectUuid, measUuid, channel, forceEnd)

Get Project HLS Playlist

**Depricated** このエンドポイントの代わりに、Videoオブジェクトの &#x60;hls&#x60;にあるPATHにしたがってPlaylistを取得してください。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaHlsApi;

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

    MediaHlsApi apiInstance = new MediaHlsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String measUuid = "f967c530-f562-410a-991b-031c43142778"; // String | 計測のUUID
    Integer channel = 1; // Integer | チャンネル
    Boolean forceEnd = true; // Boolean | `true` にすると、取得するm3u8形式のプレイリストに強制的にEXT-X-ENDLISTを追加します。
    try {
      String result = apiInstance.getProjectPlaylist(projectUuid, measUuid, channel, forceEnd);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaHlsApi#getProjectPlaylist");
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
| **measUuid** | **String**| 計測のUUID | |
| **channel** | **Integer**| チャンネル | |
| **forceEnd** | **Boolean**| &#x60;true&#x60; にすると、取得するm3u8形式のプレイリストに強制的にEXT-X-ENDLISTを追加します。 | [optional] |

### Return type

**String**

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.apple.mpegurl

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

