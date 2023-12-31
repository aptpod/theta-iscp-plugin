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



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class MediaLiveApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MediaLiveApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MediaLiveApi(ApiClient apiClient) {
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
     * Build call for connectLive
     * @param edgeUuid エッジのUUID (required)
     * @param channel チャンネル (required)
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
    public okhttp3.Call connectLiveCall(String edgeUuid, Integer channel, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/media/ws/edges/{edge_uuid}/fmp4s/{channel}"
            .replace("{" + "edge_uuid" + "}", localVarApiClient.escapeString(edgeUuid.toString()))
            .replace("{" + "channel" + "}", localVarApiClient.escapeString(channel.toString()));

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
    private okhttp3.Call connectLiveValidateBeforeCall(String edgeUuid, Integer channel, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'edgeUuid' is set
        if (edgeUuid == null) {
            throw new ApiException("Missing the required parameter 'edgeUuid' when calling connectLive(Async)");
        }

        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new ApiException("Missing the required parameter 'channel' when calling connectLive(Async)");
        }

        return connectLiveCall(edgeUuid, channel, _callback);

    }

    /**
     * Get realtime video stream
     * **Deprecated** このエンドポイントの代わりに [&#x60;GET /v1/stream&#x60;](#operation/Stream) でデータを取得し、WebCodecsを使用して取得したデータをデコードしてください。
     * @param edgeUuid エッジのUUID (required)
     * @param channel チャンネル (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 101 </td><td> Switching Protocols </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public void connectLive(String edgeUuid, Integer channel) throws ApiException {
        connectLiveWithHttpInfo(edgeUuid, channel);
    }

    /**
     * Get realtime video stream
     * **Deprecated** このエンドポイントの代わりに [&#x60;GET /v1/stream&#x60;](#operation/Stream) でデータを取得し、WebCodecsを使用して取得したデータをデコードしてください。
     * @param edgeUuid エッジのUUID (required)
     * @param channel チャンネル (required)
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
    public ApiResponse<Void> connectLiveWithHttpInfo(String edgeUuid, Integer channel) throws ApiException {
        okhttp3.Call localVarCall = connectLiveValidateBeforeCall(edgeUuid, channel, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Get realtime video stream (asynchronously)
     * **Deprecated** このエンドポイントの代わりに [&#x60;GET /v1/stream&#x60;](#operation/Stream) でデータを取得し、WebCodecsを使用して取得したデータをデコードしてください。
     * @param edgeUuid エッジのUUID (required)
     * @param channel チャンネル (required)
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
    public okhttp3.Call connectLiveAsync(String edgeUuid, Integer channel, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = connectLiveValidateBeforeCall(edgeUuid, channel, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for connectProjectLive
     * @param projectUuid プロジェクトのUUID (required)
     * @param edgeUuid エッジのUUID (required)
     * @param channel チャンネル (required)
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
    public okhttp3.Call connectProjectLiveCall(String projectUuid, String edgeUuid, Integer channel, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/media/projects/{project_uuid}/ws/edges/{edge_uuid}/fmp4s/{channel}"
            .replace("{" + "project_uuid" + "}", localVarApiClient.escapeString(projectUuid.toString()))
            .replace("{" + "edge_uuid" + "}", localVarApiClient.escapeString(edgeUuid.toString()))
            .replace("{" + "channel" + "}", localVarApiClient.escapeString(channel.toString()));

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
    private okhttp3.Call connectProjectLiveValidateBeforeCall(String projectUuid, String edgeUuid, Integer channel, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectUuid' is set
        if (projectUuid == null) {
            throw new ApiException("Missing the required parameter 'projectUuid' when calling connectProjectLive(Async)");
        }

        // verify the required parameter 'edgeUuid' is set
        if (edgeUuid == null) {
            throw new ApiException("Missing the required parameter 'edgeUuid' when calling connectProjectLive(Async)");
        }

        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new ApiException("Missing the required parameter 'channel' when calling connectProjectLive(Async)");
        }

        return connectProjectLiveCall(projectUuid, edgeUuid, channel, _callback);

    }

    /**
     * Get Project realtime video stream
     * **Deprecated** このエンドポイントの代わりに [&#x60;GET /v1/stream&#x60;](#operation/Stream) でデータを取得し、WebCodecsを使用して取得したデータをデコードしてください。
     * @param projectUuid プロジェクトのUUID (required)
     * @param edgeUuid エッジのUUID (required)
     * @param channel チャンネル (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 101 </td><td> Switching Protocols </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public void connectProjectLive(String projectUuid, String edgeUuid, Integer channel) throws ApiException {
        connectProjectLiveWithHttpInfo(projectUuid, edgeUuid, channel);
    }

    /**
     * Get Project realtime video stream
     * **Deprecated** このエンドポイントの代わりに [&#x60;GET /v1/stream&#x60;](#operation/Stream) でデータを取得し、WebCodecsを使用して取得したデータをデコードしてください。
     * @param projectUuid プロジェクトのUUID (required)
     * @param edgeUuid エッジのUUID (required)
     * @param channel チャンネル (required)
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
    public ApiResponse<Void> connectProjectLiveWithHttpInfo(String projectUuid, String edgeUuid, Integer channel) throws ApiException {
        okhttp3.Call localVarCall = connectProjectLiveValidateBeforeCall(projectUuid, edgeUuid, channel, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Get Project realtime video stream (asynchronously)
     * **Deprecated** このエンドポイントの代わりに [&#x60;GET /v1/stream&#x60;](#operation/Stream) でデータを取得し、WebCodecsを使用して取得したデータをデコードしてください。
     * @param projectUuid プロジェクトのUUID (required)
     * @param edgeUuid エッジのUUID (required)
     * @param channel チャンネル (required)
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
    public okhttp3.Call connectProjectLiveAsync(String projectUuid, String edgeUuid, Integer channel, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = connectProjectLiveValidateBeforeCall(projectUuid, edgeUuid, channel, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
