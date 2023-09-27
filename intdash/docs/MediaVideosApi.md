# MediaVideosApi

All URIs are relative to *https://example.intdash.jp/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelCreatingJpeg**](MediaVideosApi.md#cancelCreatingJpeg) | **PUT** /media/videos/{video_uuid}/jpegs/{jpeg_uuid}/cancel_convert | Cancel Creating JPEG |
| [**cancelCreatingMP4**](MediaVideosApi.md#cancelCreatingMP4) | **PUT** /media/videos/{video_uuid}/mp4s/{mp4_uuid}/cancel_convert | Cancel Creating MP4 |
| [**cancelCreatingProjectJpeg**](MediaVideosApi.md#cancelCreatingProjectJpeg) | **PUT** /media/projects/{project_uuid}/videos/{video_uuid}/jpegs/{jpeg_uuid}/cancel_convert | Cancel Creating Project JPEG |
| [**cancelCreatingProjectMP4**](MediaVideosApi.md#cancelCreatingProjectMP4) | **PUT** /media/projects/{project_uuid}/videos/{video_uuid}/mp4s/{mp4_uuid}/cancel_convert | Cancel Creating Project MP4 |
| [**createJpeg**](MediaVideosApi.md#createJpeg) | **POST** /media/videos/{video_uuid}/jpegs | Create JPEG |
| [**createMP4**](MediaVideosApi.md#createMP4) | **POST** /media/videos/{video_uuid}/mp4s | Create MP4 |
| [**createProjectJpeg**](MediaVideosApi.md#createProjectJpeg) | **POST** /media/projects/{project_uuid}/videos/{video_uuid}/jpegs | Create Project JPEG |
| [**createProjectMP4**](MediaVideosApi.md#createProjectMP4) | **POST** /media/projects/{project_uuid}/videos/{video_uuid}/mp4s | Create Project MP4 |
| [**deleteJpeg**](MediaVideosApi.md#deleteJpeg) | **DELETE** /media/videos/{video_uuid}/jpegs/{jpeg_uuid} | Delete JPEG |
| [**deleteMP4**](MediaVideosApi.md#deleteMP4) | **DELETE** /media/videos/{video_uuid}/mp4s/{mp4_uuid} | Delete MP4 |
| [**deleteProjectJpeg**](MediaVideosApi.md#deleteProjectJpeg) | **DELETE** /media/projects/{project_uuid}/videos/{video_uuid}/jpegs/{jpeg_uuid} | Delete Project JPEG |
| [**deleteProjectMP4**](MediaVideosApi.md#deleteProjectMP4) | **DELETE** /media/projects/{project_uuid}/videos/{video_uuid}/mp4s/{mp4_uuid} | Delete Project MP4 |
| [**getJpeg**](MediaVideosApi.md#getJpeg) | **GET** /media/videos/{video_uuid}/jpegs/{jpeg_uuid} | Get JPEG |
| [**getJpegAsZip**](MediaVideosApi.md#getJpegAsZip) | **GET** /media/videos/{video_uuid}/jpegs/{jpeg_uuid}/images/selected.zip | Get JPEG as zip |
| [**getJpegs**](MediaVideosApi.md#getJpegs) | **GET** /media/videos/{video_uuid}/jpegs | List JPEGs |
| [**getMP4**](MediaVideosApi.md#getMP4) | **GET** /media/videos/{video_uuid}/mp4s/{mp4_uuid} | Get MP4 |
| [**getMP4s**](MediaVideosApi.md#getMP4s) | **GET** /media/videos/{video_uuid}/mp4s | List MP4s |
| [**getProjectJpeg**](MediaVideosApi.md#getProjectJpeg) | **GET** /media/projects/{project_uuid}/videos/{video_uuid}/jpegs/{jpeg_uuid} | Get Project JPEG |
| [**getProjectJpegAsZip**](MediaVideosApi.md#getProjectJpegAsZip) | **GET** /media/projects/{project_uuid}/videos/{video_uuid}/jpegs/{jpeg_uuid}/images/selected.zip | Get Project JPEG as zip |
| [**getProjectJpegs**](MediaVideosApi.md#getProjectJpegs) | **GET** /media/projects/{project_uuid}/videos/{video_uuid}/jpegs | List Project JPEGs |
| [**getProjectMP4**](MediaVideosApi.md#getProjectMP4) | **GET** /media/projects/{project_uuid}/videos/{video_uuid}/mp4s/{mp4_uuid} | Get Project MP4 |
| [**getProjectMP4s**](MediaVideosApi.md#getProjectMP4s) | **GET** /media/projects/{project_uuid}/videos/{video_uuid}/mp4s | List Project MP4s |
| [**getProjectVideo**](MediaVideosApi.md#getProjectVideo) | **GET** /media/projects/{project_uuid}/videos/{video_uuid} | Get Project Video |
| [**getProjectVideos**](MediaVideosApi.md#getProjectVideos) | **GET** /media/projects/{project_uuid}/videos | List Project Videos |
| [**getVideo**](MediaVideosApi.md#getVideo) | **GET** /media/videos/{video_uuid} | Get Video |
| [**getVideos**](MediaVideosApi.md#getVideos) | **GET** /media/videos | List Videos |


<a id="cancelCreatingJpeg"></a>
# **cancelCreatingJpeg**
> Jpeg cancelCreatingJpeg(videoUuid, jpegUuid)

Cancel Creating JPEG

（Deprecated。代わりに Prefix(&#x60;/projects/00000000-0000-0000-0000-000000000000/&#x60;)が付いたエンドポイントを使用してください） 動画（video）からJPEGデータへの変換をキャンセルします。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    String jpegUuid = "3279bdfb-9079-417e-8f94-ee8126da5933"; // String | JPEGのUUID
    try {
      Jpeg result = apiInstance.cancelCreatingJpeg(videoUuid, jpegUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#cancelCreatingJpeg");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |
| **jpegUuid** | **String**| JPEGのUUID | |

### Return type

[**Jpeg**](Jpeg.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a id="cancelCreatingMP4"></a>
# **cancelCreatingMP4**
> MP4 cancelCreatingMP4(videoUuid, mp4Uuid)

Cancel Creating MP4

（Deprecated。代わりに Prefix(&#x60;/projects/00000000-0000-0000-0000-000000000000/&#x60;)が付いたエンドポイントを使用してください） 動画（video）からMP4データへの変換をキャンセルします。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    String mp4Uuid = "34cd9cc6-4c62-4310-bbfd-04541f59ca0f"; // String | MP4のUUID
    try {
      MP4 result = apiInstance.cancelCreatingMP4(videoUuid, mp4Uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#cancelCreatingMP4");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |
| **mp4Uuid** | **String**| MP4のUUID | |

### Return type

[**MP4**](MP4.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a id="cancelCreatingProjectJpeg"></a>
# **cancelCreatingProjectJpeg**
> Jpeg cancelCreatingProjectJpeg(projectUuid, videoUuid, jpegUuid)

Cancel Creating Project JPEG

動画（video）からJPEGデータへの変換をキャンセルします。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    String jpegUuid = "3279bdfb-9079-417e-8f94-ee8126da5933"; // String | JPEGのUUID
    try {
      Jpeg result = apiInstance.cancelCreatingProjectJpeg(projectUuid, videoUuid, jpegUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#cancelCreatingProjectJpeg");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |
| **jpegUuid** | **String**| JPEGのUUID | |

### Return type

[**Jpeg**](Jpeg.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a id="cancelCreatingProjectMP4"></a>
# **cancelCreatingProjectMP4**
> MP4 cancelCreatingProjectMP4(projectUuid, videoUuid, mp4Uuid)

Cancel Creating Project MP4

動画（video）からMP4データへの変換をキャンセルします。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    String mp4Uuid = "34cd9cc6-4c62-4310-bbfd-04541f59ca0f"; // String | MP4のUUID
    try {
      MP4 result = apiInstance.cancelCreatingProjectMP4(projectUuid, videoUuid, mp4Uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#cancelCreatingProjectMP4");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |
| **mp4Uuid** | **String**| MP4のUUID | |

### Return type

[**MP4**](MP4.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a id="createJpeg"></a>
# **createJpeg**
> Jpeg createJpeg(videoUuid, createJpegRequest)

Create JPEG

（Deprecated。代わりに Prefix(&#x60;/projects/00000000-0000-0000-0000-000000000000/&#x60;)が付いたエンドポイントを使用してください） 動画（video）を変換してJPEGデータを作成します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    CreateJpegRequest createJpegRequest = new CreateJpegRequest(); // CreateJpegRequest | 
    try {
      Jpeg result = apiInstance.createJpeg(videoUuid, createJpegRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#createJpeg");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |
| **createJpegRequest** | [**CreateJpegRequest**](CreateJpegRequest.md)|  | [optional] |

### Return type

[**Jpeg**](Jpeg.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |

<a id="createMP4"></a>
# **createMP4**
> MP4 createMP4(videoUuid, createMP4Request)

Create MP4

（Deprecated。代わりに Prefix(&#x60;/projects/00000000-0000-0000-0000-000000000000/&#x60;)が付いたエンドポイントを使用してください） 動画（video）を変換してMP4データを作成します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    CreateMP4Request createMP4Request = new CreateMP4Request(); // CreateMP4Request | 
    try {
      MP4 result = apiInstance.createMP4(videoUuid, createMP4Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#createMP4");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |
| **createMP4Request** | [**CreateMP4Request**](CreateMP4Request.md)|  | [optional] |

### Return type

[**MP4**](MP4.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |

<a id="createProjectJpeg"></a>
# **createProjectJpeg**
> Jpeg createProjectJpeg(projectUuid, videoUuid, createJpegRequest)

Create Project JPEG

動画（video）を変換してJPEGデータを作成します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    CreateJpegRequest createJpegRequest = new CreateJpegRequest(); // CreateJpegRequest | 
    try {
      Jpeg result = apiInstance.createProjectJpeg(projectUuid, videoUuid, createJpegRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#createProjectJpeg");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |
| **createJpegRequest** | [**CreateJpegRequest**](CreateJpegRequest.md)|  | [optional] |

### Return type

[**Jpeg**](Jpeg.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |

<a id="createProjectMP4"></a>
# **createProjectMP4**
> MP4 createProjectMP4(projectUuid, videoUuid, createMP4Request)

Create Project MP4

動画（video）を変換してMP4データを作成します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    CreateMP4Request createMP4Request = new CreateMP4Request(); // CreateMP4Request | 
    try {
      MP4 result = apiInstance.createProjectMP4(projectUuid, videoUuid, createMP4Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#createProjectMP4");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |
| **createMP4Request** | [**CreateMP4Request**](CreateMP4Request.md)|  | [optional] |

### Return type

[**MP4**](MP4.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |

<a id="deleteJpeg"></a>
# **deleteJpeg**
> deleteJpeg(videoUuid, jpegUuid)

Delete JPEG

（Deprecated。代わりに Prefix(&#x60;/projects/00000000-0000-0000-0000-000000000000/&#x60;)が付いたエンドポイントを使用してください） 動画（video）から変換されたJPEGデータを削除します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    String jpegUuid = "3279bdfb-9079-417e-8f94-ee8126da5933"; // String | JPEGのUUID
    try {
      apiInstance.deleteJpeg(videoUuid, jpegUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#deleteJpeg");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |
| **jpegUuid** | **String**| JPEGのUUID | |

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

<a id="deleteMP4"></a>
# **deleteMP4**
> deleteMP4(videoUuid, mp4Uuid)

Delete MP4

（Deprecated。代わりに Prefix(&#x60;/projects/00000000-0000-0000-0000-000000000000/&#x60;)が付いたエンドポイントを使用してください） 動画（video）から変換されたMP4データを削除します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    String mp4Uuid = "34cd9cc6-4c62-4310-bbfd-04541f59ca0f"; // String | MP4のUUID
    try {
      apiInstance.deleteMP4(videoUuid, mp4Uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#deleteMP4");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |
| **mp4Uuid** | **String**| MP4のUUID | |

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

<a id="deleteProjectJpeg"></a>
# **deleteProjectJpeg**
> deleteProjectJpeg(projectUuid, videoUuid, jpegUuid)

Delete Project JPEG

動画（video）から変換されたJPEGデータを削除します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    String jpegUuid = "3279bdfb-9079-417e-8f94-ee8126da5933"; // String | JPEGのUUID
    try {
      apiInstance.deleteProjectJpeg(projectUuid, videoUuid, jpegUuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#deleteProjectJpeg");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |
| **jpegUuid** | **String**| JPEGのUUID | |

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

<a id="deleteProjectMP4"></a>
# **deleteProjectMP4**
> deleteProjectMP4(projectUuid, videoUuid, mp4Uuid)

Delete Project MP4

動画（video）から変換されたMP4データを削除します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    String mp4Uuid = "34cd9cc6-4c62-4310-bbfd-04541f59ca0f"; // String | MP4のUUID
    try {
      apiInstance.deleteProjectMP4(projectUuid, videoUuid, mp4Uuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#deleteProjectMP4");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |
| **mp4Uuid** | **String**| MP4のUUID | |

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

<a id="getJpeg"></a>
# **getJpeg**
> Jpeg getJpeg(videoUuid, jpegUuid)

Get JPEG

（Deprecated。代わりに Prefix(&#x60;/projects/00000000-0000-0000-0000-000000000000/&#x60;)が付いたエンドポイントを使用してください） 動画（video）から変換されたJPEGデータの情報を取得します。 JPEGファイル自体を取得するには、&#x60;GET /media/videos/{video_uuid}/jpegs/{jpeg_uuid}/images/selected.zip&#x60; を使用してください。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    String jpegUuid = "3279bdfb-9079-417e-8f94-ee8126da5933"; // String | JPEGのUUID
    try {
      Jpeg result = apiInstance.getJpeg(videoUuid, jpegUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#getJpeg");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |
| **jpegUuid** | **String**| JPEGのUUID | |

### Return type

[**Jpeg**](Jpeg.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getJpegAsZip"></a>
# **getJpegAsZip**
> File getJpegAsZip(videoUuid, jpegUuid, indexes)

Get JPEG as zip

（Deprecated。代わりに Prefix(&#x60;/projects/00000000-0000-0000-0000-000000000000/&#x60;)が付いたエンドポイントを使用してください） JPEGデータをZIPファイルにまとめた形で取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    String jpegUuid = "3279bdfb-9079-417e-8f94-ee8126da5933"; // String | JPEGのUUID
    List<Integer> indexes = Arrays.asList(); // List<Integer> | 取得したいJPEGのインデックス番号（最初の番号は1）。指定がない場合はすべて取得します。 `indexes` パラメーターを複数回指定することで、複数のJPEGファイルを取得することができます。
    try {
      File result = apiInstance.getJpegAsZip(videoUuid, jpegUuid, indexes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#getJpegAsZip");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |
| **jpegUuid** | **String**| JPEGのUUID | |
| **indexes** | [**List&lt;Integer&gt;**](Integer.md)| 取得したいJPEGのインデックス番号（最初の番号は1）。指定がない場合はすべて取得します。 &#x60;indexes&#x60; パラメーターを複数回指定することで、複数のJPEGファイルを取得することができます。 | [optional] |

### Return type

[**File**](File.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getJpegs"></a>
# **getJpegs**
> Jpegs getJpegs(videoUuid)

List JPEGs

（Deprecated。代わりに Prefix(&#x60;/projects/00000000-0000-0000-0000-000000000000/&#x60;)が付いたエンドポイントを使用してください） 動画（video）から変換されたJPEGデータのリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    try {
      Jpegs result = apiInstance.getJpegs(videoUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#getJpegs");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |

### Return type

[**Jpegs**](Jpegs.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMP4"></a>
# **getMP4**
> MP4 getMP4(videoUuid, mp4Uuid)

Get MP4

（Deprecated。代わりに Prefix(&#x60;/projects/00000000-0000-0000-0000-000000000000/&#x60;)が付いたエンドポイントを使用してください） 動画（video）から変換されたMP4データの情報を取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    String mp4Uuid = "34cd9cc6-4c62-4310-bbfd-04541f59ca0f"; // String | MP4のUUID
    try {
      MP4 result = apiInstance.getMP4(videoUuid, mp4Uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#getMP4");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |
| **mp4Uuid** | **String**| MP4のUUID | |

### Return type

[**MP4**](MP4.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMP4s"></a>
# **getMP4s**
> MP4s getMP4s(videoUuid)

List MP4s

（Deprecated。代わりに Prefix(&#x60;/projects/00000000-0000-0000-0000-000000000000/&#x60;)が付いたエンドポイントを使用してください） 動画（video）から変換されたMP4データのリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    try {
      MP4s result = apiInstance.getMP4s(videoUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#getMP4s");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |

### Return type

[**MP4s**](MP4s.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProjectJpeg"></a>
# **getProjectJpeg**
> Jpeg getProjectJpeg(projectUuid, videoUuid, jpegUuid)

Get Project JPEG

動画（video）から変換されたJPEGデータの情報を取得します。 JPEGファイル自体を取得するには、&#x60;GET /media/videos/{video_uuid}/jpegs/{jpeg_uuid}/images/selected.zip&#x60; を使用してください。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    String jpegUuid = "3279bdfb-9079-417e-8f94-ee8126da5933"; // String | JPEGのUUID
    try {
      Jpeg result = apiInstance.getProjectJpeg(projectUuid, videoUuid, jpegUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#getProjectJpeg");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |
| **jpegUuid** | **String**| JPEGのUUID | |

### Return type

[**Jpeg**](Jpeg.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProjectJpegAsZip"></a>
# **getProjectJpegAsZip**
> File getProjectJpegAsZip(projectUuid, videoUuid, jpegUuid, indexes)

Get Project JPEG as zip

JPEGデータをZIPファイルにまとめた形で取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    String jpegUuid = "3279bdfb-9079-417e-8f94-ee8126da5933"; // String | JPEGのUUID
    List<Integer> indexes = Arrays.asList(); // List<Integer> | 取得したいJPEGのインデックス番号（最初の番号は1）。指定がない場合はすべて取得します。 `indexes` パラメーターを複数回指定することで、複数のJPEGファイルを取得することができます。
    try {
      File result = apiInstance.getProjectJpegAsZip(projectUuid, videoUuid, jpegUuid, indexes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#getProjectJpegAsZip");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |
| **jpegUuid** | **String**| JPEGのUUID | |
| **indexes** | [**List&lt;Integer&gt;**](Integer.md)| 取得したいJPEGのインデックス番号（最初の番号は1）。指定がない場合はすべて取得します。 &#x60;indexes&#x60; パラメーターを複数回指定することで、複数のJPEGファイルを取得することができます。 | [optional] |

### Return type

[**File**](File.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProjectJpegs"></a>
# **getProjectJpegs**
> Jpegs getProjectJpegs(projectUuid, videoUuid)

List Project JPEGs

動画（video）から変換されたJPEGデータのリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    try {
      Jpegs result = apiInstance.getProjectJpegs(projectUuid, videoUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#getProjectJpegs");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |

### Return type

[**Jpegs**](Jpegs.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProjectMP4"></a>
# **getProjectMP4**
> MP4 getProjectMP4(projectUuid, videoUuid, mp4Uuid)

Get Project MP4

動画（video）から変換されたMP4データの情報を取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    String mp4Uuid = "34cd9cc6-4c62-4310-bbfd-04541f59ca0f"; // String | MP4のUUID
    try {
      MP4 result = apiInstance.getProjectMP4(projectUuid, videoUuid, mp4Uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#getProjectMP4");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |
| **mp4Uuid** | **String**| MP4のUUID | |

### Return type

[**MP4**](MP4.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProjectMP4s"></a>
# **getProjectMP4s**
> MP4s getProjectMP4s(projectUuid, videoUuid)

List Project MP4s

動画（video）から変換されたMP4データのリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    try {
      MP4s result = apiInstance.getProjectMP4s(projectUuid, videoUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#getProjectMP4s");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |

### Return type

[**MP4s**](MP4s.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProjectVideo"></a>
# **getProjectVideo**
> Video getProjectVideo(projectUuid, videoUuid)

Get Project Video

動画を取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    try {
      Video result = apiInstance.getProjectVideo(projectUuid, videoUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#getProjectVideo");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |

### Return type

[**Video**](Video.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getProjectVideos"></a>
# **getProjectVideos**
> Videos getProjectVideos(projectUuid, uuid, measUuid, channel, sort, page, perPage)

List Project Videos

動画（video）のリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    String uuid = "3699e2b9-5d87-4dbd-9b85-098e7dfaee76"; // String | 動画（video）のUUID
    String measUuid = "3699e2b9-5d87-4dbd-9b85-098e7dfaee76"; // String | 計測のUUID
    Integer channel = 1; // Integer | チャンネル
    String sort = "create_at+"; // String | 並べ替えに使用するキー。接尾辞 `+` を付けた場合は昇順、 `-` を付けた場合は降順で出力されます。 接尾辞を省略した場合は昇順となります。例えば、 `name-` を指定すると、nameによる降順で出力されます。    - `channel`   - `created_at`   - `updated_at`
    Integer page = 1; // Integer | 取得するページ番号
    Integer perPage = 100; // Integer | 1回のリクエストで取得する件数
    try {
      Videos result = apiInstance.getProjectVideos(projectUuid, uuid, measUuid, channel, sort, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#getProjectVideos");
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
| **uuid** | **String**| 動画（video）のUUID | [optional] |
| **measUuid** | **String**| 計測のUUID | [optional] |
| **channel** | **Integer**| チャンネル | [optional] |
| **sort** | **String**| 並べ替えに使用するキー。接尾辞 &#x60;+&#x60; を付けた場合は昇順、 &#x60;-&#x60; を付けた場合は降順で出力されます。 接尾辞を省略した場合は昇順となります。例えば、 &#x60;name-&#x60; を指定すると、nameによる降順で出力されます。    - &#x60;channel&#x60;   - &#x60;created_at&#x60;   - &#x60;updated_at&#x60; | [optional] [default to create_at+] |
| **page** | **Integer**| 取得するページ番号 | [optional] [default to 1] |
| **perPage** | **Integer**| 1回のリクエストで取得する件数 | [optional] [default to 100] |

### Return type

[**Videos**](Videos.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a id="getVideo"></a>
# **getVideo**
> Video getVideo(videoUuid)

Get Video

（Deprecated。代わりに Prefix(&#x60;/projects/00000000-0000-0000-0000-000000000000/&#x60;)が付いたエンドポイントを使用してください） 動画を取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String videoUuid = "68b91013-47e9-4e68-a965-892549587dfa"; // String | 変換元の動画（video）のUUID
    try {
      Video result = apiInstance.getVideo(videoUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#getVideo");
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
| **videoUuid** | **String**| 変換元の動画（video）のUUID | |

### Return type

[**Video**](Video.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getVideos"></a>
# **getVideos**
> Videos getVideos(uuid, measUuid, channel, sort, page, perPage)

List Videos

（Deprecated。代わりに Prefix(&#x60;/projects/00000000-0000-0000-0000-000000000000/&#x60;)が付いたエンドポイントを使用してください） 動画（video）のリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaVideosApi;

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

    MediaVideosApi apiInstance = new MediaVideosApi(defaultClient);
    String uuid = "3699e2b9-5d87-4dbd-9b85-098e7dfaee76"; // String | 動画（video）のUUID
    String measUuid = "3699e2b9-5d87-4dbd-9b85-098e7dfaee76"; // String | 計測のUUID
    Integer channel = 1; // Integer | チャンネル
    String sort = "create_at+"; // String | 並べ替えに使用するキー。接尾辞 `+` を付けた場合は昇順、 `-` を付けた場合は降順で出力されます。 接尾辞を省略した場合は昇順となります。例えば、 `name-` を指定すると、nameによる降順で出力されます。    - `channel`   - `created_at`   - `updated_at`
    Integer page = 1; // Integer | 取得するページ番号
    Integer perPage = 100; // Integer | 1回のリクエストで取得する件数
    try {
      Videos result = apiInstance.getVideos(uuid, measUuid, channel, sort, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaVideosApi#getVideos");
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
| **uuid** | **String**| 動画（video）のUUID | [optional] |
| **measUuid** | **String**| 計測のUUID | [optional] |
| **channel** | **Integer**| チャンネル | [optional] |
| **sort** | **String**| 並べ替えに使用するキー。接尾辞 &#x60;+&#x60; を付けた場合は昇順、 &#x60;-&#x60; を付けた場合は降順で出力されます。 接尾辞を省略した場合は昇順となります。例えば、 &#x60;name-&#x60; を指定すると、nameによる降順で出力されます。    - &#x60;channel&#x60;   - &#x60;created_at&#x60;   - &#x60;updated_at&#x60; | [optional] [default to create_at+] |
| **page** | **Integer**| 取得するページ番号 | [optional] [default to 1] |
| **perPage** | **Integer**| 1回のリクエストで取得する件数 | [optional] [default to 100] |

### Return type

[**Videos**](Videos.md)

### Authorization

[IntdashToken](../README.md#IntdashToken), [OAuth2TokenInCookie](../README.md#OAuth2TokenInCookie), [OAuth2TokenInHeader](../README.md#OAuth2TokenInHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

