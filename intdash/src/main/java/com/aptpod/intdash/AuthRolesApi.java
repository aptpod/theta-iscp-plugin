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


import org.openapitools.client.model.ErrorProblem;
import org.openapitools.client.model.Role;
import org.openapitools.client.model.Roles;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AuthRolesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuthRolesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthRolesApi(ApiClient apiClient) {
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
     * Build call for getRole
     * @param roleUuid ロールのUUID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRoleCall(String roleUuid, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/auth/roles/{role_uuid}"
            .replace("{" + "role_uuid" + "}", localVarApiClient.escapeString(roleUuid.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getRoleValidateBeforeCall(String roleUuid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'roleUuid' is set
        if (roleUuid == null) {
            throw new ApiException("Missing the required parameter 'roleUuid' when calling getRole(Async)");
        }

        return getRoleCall(roleUuid, _callback);

    }

    /**
     * Get Role
     * ロールを取得します。
     * @param roleUuid ロールのUUID (required)
     * @return Role
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public Role getRole(String roleUuid) throws ApiException {
        ApiResponse<Role> localVarResp = getRoleWithHttpInfo(roleUuid);
        return localVarResp.getData();
    }

    /**
     * Get Role
     * ロールを取得します。
     * @param roleUuid ロールのUUID (required)
     * @return ApiResponse&lt;Role&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Role> getRoleWithHttpInfo(String roleUuid) throws ApiException {
        okhttp3.Call localVarCall = getRoleValidateBeforeCall(roleUuid, null);
        Type localVarReturnType = new TypeToken<Role>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Role (asynchronously)
     * ロールを取得します。
     * @param roleUuid ロールのUUID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getRoleAsync(String roleUuid, final ApiCallback<Role> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRoleValidateBeforeCall(roleUuid, _callback);
        Type localVarReturnType = new TypeToken<Role>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listRoles
     * @param uuid ロールのUUID (optional)
     * @param name ロールの名前による部分一致検索。文字列をダブルクォーテーションで囲むと、完全一致のものだけを取得します。 (optional)
     * @param page 取得するページの番号 (optional, default to 1)
     * @param perPage 1回のリクエストで取得する件数 (optional, default to 30)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listRolesCall(List<String> uuid, List<String> name, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/auth/roles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (uuid != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "uuid", uuid));
        }

        if (name != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "name", name));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
        }

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listRolesValidateBeforeCall(List<String> uuid, List<String> name, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        return listRolesCall(uuid, name, page, perPage, _callback);

    }

    /**
     * List Roles
     * ロールのリストを取得します。
     * @param uuid ロールのUUID (optional)
     * @param name ロールの名前による部分一致検索。文字列をダブルクォーテーションで囲むと、完全一致のものだけを取得します。 (optional)
     * @param page 取得するページの番号 (optional, default to 1)
     * @param perPage 1回のリクエストで取得する件数 (optional, default to 30)
     * @return Roles
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public Roles listRoles(List<String> uuid, List<String> name, Integer page, Integer perPage) throws ApiException {
        ApiResponse<Roles> localVarResp = listRolesWithHttpInfo(uuid, name, page, perPage);
        return localVarResp.getData();
    }

    /**
     * List Roles
     * ロールのリストを取得します。
     * @param uuid ロールのUUID (optional)
     * @param name ロールの名前による部分一致検索。文字列をダブルクォーテーションで囲むと、完全一致のものだけを取得します。 (optional)
     * @param page 取得するページの番号 (optional, default to 1)
     * @param perPage 1回のリクエストで取得する件数 (optional, default to 30)
     * @return ApiResponse&lt;Roles&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Roles> listRolesWithHttpInfo(List<String> uuid, List<String> name, Integer page, Integer perPage) throws ApiException {
        okhttp3.Call localVarCall = listRolesValidateBeforeCall(uuid, name, page, perPage, null);
        Type localVarReturnType = new TypeToken<Roles>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List Roles (asynchronously)
     * ロールのリストを取得します。
     * @param uuid ロールのUUID (optional)
     * @param name ロールの名前による部分一致検索。文字列をダブルクォーテーションで囲むと、完全一致のものだけを取得します。 (optional)
     * @param page 取得するページの番号 (optional, default to 1)
     * @param perPage 1回のリクエストで取得する件数 (optional, default to 30)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listRolesAsync(List<String> uuid, List<String> name, Integer page, Integer perPage, final ApiCallback<Roles> _callback) throws ApiException {

        okhttp3.Call localVarCall = listRolesValidateBeforeCall(uuid, name, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<Roles>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
