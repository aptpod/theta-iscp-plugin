/*
 * intdash API specification
 * ## ベースURL  ベースURLは以下のとおりです。APIエンドポイントはこのベースURLから始まります。  ``` https://<host>/api ``` エンドポイント例: ``` https://example.intdash.jp/api/v1/measurements https://example.intdash.jp/api/media/videos ```  ## レスポンスのステータスコード  サーバーからクライアントに返却されるHTTPレスポンスのステータスコードは以下のとおりです。   | コード                    | 説明                                                                  | |:--------------------------|:----------------------------------------------------------------------| | 101 Switching Protocols   | サーバーはプロトコルを切り替えます。                                  | | 200 OK                    | リクエストは成功しました。                                            | | 201 Created               | 新しいリソースが作成されました。                                      | | 204 No Content            | リクエストは成功しました。返却するコンテンツはありません。            | | 400 Bad Request           | 構文が正しくないなどの理由により、リクエストは処理できませんでした。  | | 401 Unauthorized          | リクエストには認証が必要です。                                        | | 403 Forbidden             | アクセス権がないなどの理由により、リクエストは拒否されました。        | | 404 Not Found             | APIまたはリソースが見つかりません。                                   | | 405 Method Not Allowed    | 指定されたメソッドは許可されていません。                              | | 409 Conflict              | 既存のリソースとのコンフリクトのため、リクエストは失敗しました。      | | 500 Internal Server Error | サーバーで予期しないエラーが発生したため、リクエストは失敗しました。  |   ## 注意 リクエストボディのJSONでは、キーの大文字と小文字は区別されません。 従って、以下の2つのリクエストは同じものと見なされます。  ```  {   \"username\" : \"username\",   \"password\" : \"password\" }  ```   ```  {   \"Username\" : \"username\",   \"Password\" : \"password\" }  ```
 *
 * The version of the OpenAPI document: v2.4.0-next-4a4316946
 * Contact: VM2M-support@aptpod.co.jp
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.aptpod.intdash;

import com.aptpod.ApiCallback;
import com.aptpod.ApiClient;
import com.aptpod.ApiException;
import com.aptpod.ApiResponse;
import com.aptpod.Configuration;
import com.aptpod.Pair;
import com.aptpod.ProgressRequestBody;
import com.aptpod.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ISCPTicket;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class BrokerIScpApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BrokerIScpApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BrokerIScpApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for connectISCPV1
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 101 </td><td> Switching Protocols </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call connectISCPV1Call(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/ws/measurements";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "IntdashToken", "OAuth2TokenInCookie", "OAuth2TokenInHeader" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private okhttp3.Call connectISCPV1ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return connectISCPV1Call(_callback);

    }

    /**
     * Connect ISCPv1
     * （Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/ws/measurements&#x60; を使用してください）  iSCP v1（WebSocket上でリアルタイムデータを送受信するintdash独自プロトコル）の使用を開始するためのエンドポイントです。    このリクエストを送ることで、プロトコルがWebSocketに切り替えられ、iSCP v1を使用できます。   \&quot;permessage-deflate\&quot; (RFC 7692) が使用できます。    iSCP v1の詳細については、別ドキュメント [詳説iSCP 1.0](https://docs.intdash.jp/manual/iscp1-essentials/latest/ja/iscp1-essentials-ja.pdf) を参照してください。    「詳説iSCP 1.0」に記載されいていない事項ついては、 [アプトポッド](https://www.aptpod.co.jp/contact/) にお問い合わせください。
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 101 </td><td> Switching Protocols </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public void connectISCPV1() throws ApiException {
        connectISCPV1WithHttpInfo();
    }

    /**
     * Connect ISCPv1
     * （Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/ws/measurements&#x60; を使用してください）  iSCP v1（WebSocket上でリアルタイムデータを送受信するintdash独自プロトコル）の使用を開始するためのエンドポイントです。    このリクエストを送ることで、プロトコルがWebSocketに切り替えられ、iSCP v1を使用できます。   \&quot;permessage-deflate\&quot; (RFC 7692) が使用できます。    iSCP v1の詳細については、別ドキュメント [詳説iSCP 1.0](https://docs.intdash.jp/manual/iscp1-essentials/latest/ja/iscp1-essentials-ja.pdf) を参照してください。    「詳説iSCP 1.0」に記載されいていない事項ついては、 [アプトポッド](https://www.aptpod.co.jp/contact/) にお問い合わせください。
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 101 </td><td> Switching Protocols </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public ApiResponse<Void> connectISCPV1WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = connectISCPV1ValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Connect ISCPv1 (asynchronously)
     * （Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/ws/measurements&#x60; を使用してください）  iSCP v1（WebSocket上でリアルタイムデータを送受信するintdash独自プロトコル）の使用を開始するためのエンドポイントです。    このリクエストを送ることで、プロトコルがWebSocketに切り替えられ、iSCP v1を使用できます。   \&quot;permessage-deflate\&quot; (RFC 7692) が使用できます。    iSCP v1の詳細については、別ドキュメント [詳説iSCP 1.0](https://docs.intdash.jp/manual/iscp1-essentials/latest/ja/iscp1-essentials-ja.pdf) を参照してください。    「詳説iSCP 1.0」に記載されいていない事項ついては、 [アプトポッド](https://www.aptpod.co.jp/contact/) にお問い合わせください。
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 101 </td><td> Switching Protocols </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public okhttp3.Call connectISCPV1Async(final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = connectISCPV1ValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for connectISCPV2
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 101 </td><td> Switching Protocols </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call connectISCPV2Call(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/iscp/connect";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "IntdashToken", "OAuth2TokenInCookie", "OAuth2TokenInHeader" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call connectISCPV2ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return connectISCPV2Call(_callback);

    }

    /**
     * Connect ISCPv2
     * iSCP v2（WebSocket上でリアルタイムデータを送受信するintdash独自プロトコル）の使用を開始するためのエンドポイントです。 このリクエストを送ることで、プロトコルがWebSocketに切り替えられ、iSCP v2を使用できます。  iSCP v2の詳細については、 [アプトポッド](https://www.aptpod.co.jp/contact/) にお問い合わせください。
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 101 </td><td> Switching Protocols </td><td>  -  </td></tr>
     </table>
     */
    public void connectISCPV2() throws ApiException {
        connectISCPV2WithHttpInfo();
    }

    /**
     * Connect ISCPv2
     * iSCP v2（WebSocket上でリアルタイムデータを送受信するintdash独自プロトコル）の使用を開始するためのエンドポイントです。 このリクエストを送ることで、プロトコルがWebSocketに切り替えられ、iSCP v2を使用できます。  iSCP v2の詳細については、 [アプトポッド](https://www.aptpod.co.jp/contact/) にお問い合わせください。
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 101 </td><td> Switching Protocols </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> connectISCPV2WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = connectISCPV2ValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Connect ISCPv2 (asynchronously)
     * iSCP v2（WebSocket上でリアルタイムデータを送受信するintdash独自プロトコル）の使用を開始するためのエンドポイントです。 このリクエストを送ることで、プロトコルがWebSocketに切り替えられ、iSCP v2を使用できます。  iSCP v2の詳細については、 [アプトポッド](https://www.aptpod.co.jp/contact/) にお問い合わせください。
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 101 </td><td> Switching Protocols </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call connectISCPV2Async(final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = connectISCPV2ValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for connectProjectISCPV1
     * @param projectUuid プロジェクトのUUID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 101 </td><td> Switching Protocols </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call connectProjectISCPV1Call(String projectUuid, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/projects/{project_uuid}/ws/measurements"
            .replace("{" + "project_uuid" + "}", localVarApiClient.escapeString(projectUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "IntdashToken", "OAuth2TokenInCookie", "OAuth2TokenInHeader" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call connectProjectISCPV1ValidateBeforeCall(String projectUuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectUuid' is set
        if (projectUuid == null) {
            throw new ApiException("Missing the required parameter 'projectUuid' when calling connectProjectISCPV1(Async)");
        }

        return connectProjectISCPV1Call(projectUuid, _callback);

    }

    /**
     * Connect Project ISCPv1
     * iSCP v1（WebSocket上でリアルタイムデータを送受信するintdash独自プロトコル）の使用を開始するためのエンドポイントです。  このリクエストを送ることで、プロトコルがWebSocketに切り替えられ、iSCP v1を使用できます。 \&quot;permessage-deflate\&quot; (RFC 7692) が使用できます。  iSCP v1の詳細については、別ドキュメント [詳説iSCP 1.0](https://docs.intdash.jp/manual/iscp1-essentials/latest/ja/iscp1-essentials-ja.pdf) を参照してください。  「詳説iSCP 1.0」に記載されいていない事項ついては、 [アプトポッド](https://www.aptpod.co.jp/contact/) にお問い合わせください。
     * @param projectUuid プロジェクトのUUID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 101 </td><td> Switching Protocols </td><td>  -  </td></tr>
     </table>
     */
    public void connectProjectISCPV1(String projectUuid) throws ApiException {
        connectProjectISCPV1WithHttpInfo(projectUuid);
    }

    /**
     * Connect Project ISCPv1
     * iSCP v1（WebSocket上でリアルタイムデータを送受信するintdash独自プロトコル）の使用を開始するためのエンドポイントです。  このリクエストを送ることで、プロトコルがWebSocketに切り替えられ、iSCP v1を使用できます。 \&quot;permessage-deflate\&quot; (RFC 7692) が使用できます。  iSCP v1の詳細については、別ドキュメント [詳説iSCP 1.0](https://docs.intdash.jp/manual/iscp1-essentials/latest/ja/iscp1-essentials-ja.pdf) を参照してください。  「詳説iSCP 1.0」に記載されいていない事項ついては、 [アプトポッド](https://www.aptpod.co.jp/contact/) にお問い合わせください。
     * @param projectUuid プロジェクトのUUID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 101 </td><td> Switching Protocols </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> connectProjectISCPV1WithHttpInfo(String projectUuid) throws ApiException {
        okhttp3.Call localVarCall = connectProjectISCPV1ValidateBeforeCall(projectUuid, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Connect Project ISCPv1 (asynchronously)
     * iSCP v1（WebSocket上でリアルタイムデータを送受信するintdash独自プロトコル）の使用を開始するためのエンドポイントです。  このリクエストを送ることで、プロトコルがWebSocketに切り替えられ、iSCP v1を使用できます。 \&quot;permessage-deflate\&quot; (RFC 7692) が使用できます。  iSCP v1の詳細については、別ドキュメント [詳説iSCP 1.0](https://docs.intdash.jp/manual/iscp1-essentials/latest/ja/iscp1-essentials-ja.pdf) を参照してください。  「詳説iSCP 1.0」に記載されいていない事項ついては、 [アプトポッド](https://www.aptpod.co.jp/contact/) にお問い合わせください。
     * @param projectUuid プロジェクトのUUID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 101 </td><td> Switching Protocols </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call connectProjectISCPV1Async(String projectUuid, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = connectProjectISCPV1ValidateBeforeCall(projectUuid, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for issueISCPTicket
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call issueISCPTicketCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/iscp/tickets";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json; charset=utf-8"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "IntdashToken", "OAuth2TokenInCookie", "OAuth2TokenInHeader" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call issueISCPTicketValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return issueISCPTicketCall(_callback);

    }

    /**
     * Issue ISCP Ticket
     * iSCPの認証チケットを発行します。  iSCPの認証チケットは、iSCPv2の接続リクエスト時の拡張用アクセストークンとして使用することができます。 また、認証チケットは有効期限内で一回のみ使用することができます。 一度使用した認証チケットは有効期限に関わらず使用することはできません。
     * @return ISCPTicket
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public ISCPTicket issueISCPTicket() throws ApiException {
        ApiResponse<ISCPTicket> localVarResp = issueISCPTicketWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Issue ISCP Ticket
     * iSCPの認証チケットを発行します。  iSCPの認証チケットは、iSCPv2の接続リクエスト時の拡張用アクセストークンとして使用することができます。 また、認証チケットは有効期限内で一回のみ使用することができます。 一度使用した認証チケットは有効期限に関わらず使用することはできません。
     * @return ApiResponse&lt;ISCPTicket&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ISCPTicket> issueISCPTicketWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = issueISCPTicketValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ISCPTicket>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Issue ISCP Ticket (asynchronously)
     * iSCPの認証チケットを発行します。  iSCPの認証チケットは、iSCPv2の接続リクエスト時の拡張用アクセストークンとして使用することができます。 また、認証チケットは有効期限内で一回のみ使用することができます。 一度使用した認証チケットは有効期限に関わらず使用することはできません。
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call issueISCPTicketAsync(final ApiCallback<ISCPTicket> _callback) throws ApiException {

        okhttp3.Call localVarCall = issueISCPTicketValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ISCPTicket>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
