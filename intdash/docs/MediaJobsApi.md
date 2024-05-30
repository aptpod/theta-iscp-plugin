# MediaJobsApi

All URIs are relative to *https://example.intdash.jp/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createJob**](MediaJobsApi.md#createJob) | **POST** /media/jobs | Create Job |
| [**createProjectJob**](MediaJobsApi.md#createProjectJob) | **POST** /media/projects/{project_uuid}/jobs | Create Project Job |
| [**getJobs**](MediaJobsApi.md#getJobs) | **GET** /media/jobs | List Jobs |
| [**getProjectJobs**](MediaJobsApi.md#getProjectJobs) | **GET** /media/projects/{project_uuid}/jobs | List Project Jobs |


<a id="createJob"></a>
# **createJob**
> Job createJob(createJobRequest)

Create Job

（Deprecated。代わりに Prefix(&#x60;/projects/00000000-0000-0000-0000-000000000000/&#x60;)が付いたエンドポイントを使用してください） HLSへの変換ジョブを作成します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaJobsApi;

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

    MediaJobsApi apiInstance = new MediaJobsApi(defaultClient);
    CreateJobRequest createJobRequest = new CreateJobRequest(); // CreateJobRequest | 
    try {
      Job result = apiInstance.createJob(createJobRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaJobsApi#createJob");
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
| **createJobRequest** | [**CreateJobRequest**](CreateJobRequest.md)|  | [optional] |

### Return type

[**Job**](Job.md)

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
| **409** | Conflict |  -  |

<a id="createProjectJob"></a>
# **createProjectJob**
> Job createProjectJob(projectUuid, createJobRequest)

Create Project Job

HLSへの変換ジョブを作成します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaJobsApi;

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

    MediaJobsApi apiInstance = new MediaJobsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    CreateJobRequest createJobRequest = new CreateJobRequest(); // CreateJobRequest | 
    try {
      Job result = apiInstance.createProjectJob(projectUuid, createJobRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaJobsApi#createProjectJob");
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
| **createJobRequest** | [**CreateJobRequest**](CreateJobRequest.md)|  | [optional] |

### Return type

[**Job**](Job.md)

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
| **409** | Conflict |  -  |

<a id="getJobs"></a>
# **getJobs**
> JobList getJobs(uuid, measUuid, type, status, limit, page, sort, order)

List Jobs

（Deprecated。代わりに Prefix(&#x60;/projects/00000000-0000-0000-0000-000000000000/&#x60;)が付いたエンドポイントを使用してください） HLSへの変換ジョブのリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaJobsApi;

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

    MediaJobsApi apiInstance = new MediaJobsApi(defaultClient);
    List<String> uuid = Arrays.asList(); // List<String> | 取得したいジョブのUUID
    List<String> measUuid = Arrays.asList(); // List<String> | 計測のUUID
    List<JobType> type = Arrays.asList(); // List<JobType> | - update   - 計測内の動画データのうち、新しくサーバーが受信した部分（HLSにまだ変換されていない部分）を     HLSに変換するジョブ。通常は計測実行中に行います。 - finalize   - 計測全体をサーバーに回収した後に、動画データ全体をHLSに変換するジョブ - delete   - 変換によって作成されたHLSデータを削除するジョブ。     このジョブを実行すると、HLSプレイリスト、セグメントファイル、     データベース内のHLSに関する情報が削除され、この動画のHLSによる再生はできなくなります。
    List<JobStatus> status = Arrays.asList(); // List<JobStatus> | ジョブのステータス
    BigDecimal limit = new BigDecimal("1000"); // BigDecimal | 1回のリクエストで取得する件数
    Integer page = 1; // Integer | 取得するページ番号
    String sort = "created_at"; // String | 並べ替えに使用するキー
    String order = "asc"; // String | 並べ替えの順序
    try {
      JobList result = apiInstance.getJobs(uuid, measUuid, type, status, limit, page, sort, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaJobsApi#getJobs");
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
| **uuid** | [**List&lt;String&gt;**](String.md)| 取得したいジョブのUUID | [optional] |
| **measUuid** | [**List&lt;String&gt;**](String.md)| 計測のUUID | [optional] |
| **type** | [**List&lt;JobType&gt;**](JobType.md)| - update   - 計測内の動画データのうち、新しくサーバーが受信した部分（HLSにまだ変換されていない部分）を     HLSに変換するジョブ。通常は計測実行中に行います。 - finalize   - 計測全体をサーバーに回収した後に、動画データ全体をHLSに変換するジョブ - delete   - 変換によって作成されたHLSデータを削除するジョブ。     このジョブを実行すると、HLSプレイリスト、セグメントファイル、     データベース内のHLSに関する情報が削除され、この動画のHLSによる再生はできなくなります。 | [optional] |
| **status** | [**List&lt;JobStatus&gt;**](JobStatus.md)| ジョブのステータス | [optional] |
| **limit** | **BigDecimal**| 1回のリクエストで取得する件数 | [optional] |
| **page** | **Integer**| 取得するページ番号 | [optional] [default to 1] |
| **sort** | **String**| 並べ替えに使用するキー | [optional] [default to created_at] [enum: created_at, updated_at] |
| **order** | **String**| 並べ替えの順序 | [optional] [enum: asc, desc] |

### Return type

[**JobList**](JobList.md)

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

<a id="getProjectJobs"></a>
# **getProjectJobs**
> JobList getProjectJobs(projectUuid, uuid, measUuid, type, status, limit, page, sort, order)

List Project Jobs

HLSへの変換ジョブのリストを取得します。

### Example
```java
// Import classes:
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.Configuration;
import com.aptpod.auth.*;
import com.aptpod.models.*;
import com.aptpod.intdash.MediaJobsApi;

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

    MediaJobsApi apiInstance = new MediaJobsApi(defaultClient);
    String projectUuid = "75c55669-b2ab-4f14-a871-8571c6afa1ef"; // String | プロジェクトのUUID
    List<String> uuid = Arrays.asList(); // List<String> | 取得したいジョブのUUID
    List<String> measUuid = Arrays.asList(); // List<String> | 計測のUUID
    List<JobType> type = Arrays.asList(); // List<JobType> | - update   - 計測内の動画データのうち、新しくサーバーが受信した部分（HLSにまだ変換されていない部分）を     HLSに変換するジョブ。通常は計測実行中に行います。 - finalize   - 計測全体をサーバーに回収した後に、動画データ全体をHLSに変換するジョブ - delete   - 変換によって作成されたHLSデータを削除するジョブ。     このジョブを実行すると、HLSプレイリスト、セグメントファイル、     データベース内のHLSに関する情報が削除され、この動画のHLSによる再生はできなくなります。
    List<JobStatus> status = Arrays.asList(); // List<JobStatus> | ジョブのステータス
    BigDecimal limit = new BigDecimal("1000"); // BigDecimal | 1回のリクエストで取得する件数
    Integer page = 1; // Integer | 取得するページ番号
    String sort = "created_at"; // String | 並べ替えに使用するキー
    String order = "asc"; // String | 並べ替えの順序
    try {
      JobList result = apiInstance.getProjectJobs(projectUuid, uuid, measUuid, type, status, limit, page, sort, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MediaJobsApi#getProjectJobs");
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
| **uuid** | [**List&lt;String&gt;**](String.md)| 取得したいジョブのUUID | [optional] |
| **measUuid** | [**List&lt;String&gt;**](String.md)| 計測のUUID | [optional] |
| **type** | [**List&lt;JobType&gt;**](JobType.md)| - update   - 計測内の動画データのうち、新しくサーバーが受信した部分（HLSにまだ変換されていない部分）を     HLSに変換するジョブ。通常は計測実行中に行います。 - finalize   - 計測全体をサーバーに回収した後に、動画データ全体をHLSに変換するジョブ - delete   - 変換によって作成されたHLSデータを削除するジョブ。     このジョブを実行すると、HLSプレイリスト、セグメントファイル、     データベース内のHLSに関する情報が削除され、この動画のHLSによる再生はできなくなります。 | [optional] |
| **status** | [**List&lt;JobStatus&gt;**](JobStatus.md)| ジョブのステータス | [optional] |
| **limit** | **BigDecimal**| 1回のリクエストで取得する件数 | [optional] |
| **page** | **Integer**| 取得するページ番号 | [optional] [default to 1] |
| **sort** | **String**| 並べ替えに使用するキー | [optional] [default to created_at] [enum: created_at, updated_at] |
| **order** | **String**| 並べ替えの順序 | [optional] [enum: asc, desc] |

### Return type

[**JobList**](JobList.md)

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

