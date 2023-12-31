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


import org.openapitools.client.model.IssueToken200Response;
import org.openapitools.client.model.OAuth2JWKs;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AuthOAuth2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuthOAuth2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthOAuth2Api(ApiClient apiClient) {
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
     * Build call for authOauth2JwksGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call authOauth2JwksGetCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/auth/oauth2/jwks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/jwk-set+json; charset=utf-8"
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
    private okhttp3.Call authOauth2JwksGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return authOauth2JwksGetCall(_callback);

    }

    /**
     * List JSON Web Keys
     * JSON Web Keysのリストを取得します。 [RFC7517:JSON Web Key](https://tools.ietf.org/html/rfc7517)
     * @return OAuth2JWKs
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public OAuth2JWKs authOauth2JwksGet() throws ApiException {
        ApiResponse<OAuth2JWKs> localVarResp = authOauth2JwksGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * List JSON Web Keys
     * JSON Web Keysのリストを取得します。 [RFC7517:JSON Web Key](https://tools.ietf.org/html/rfc7517)
     * @return ApiResponse&lt;OAuth2JWKs&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OAuth2JWKs> authOauth2JwksGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = authOauth2JwksGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<OAuth2JWKs>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List JSON Web Keys (asynchronously)
     * JSON Web Keysのリストを取得します。 [RFC7517:JSON Web Key](https://tools.ietf.org/html/rfc7517)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call authOauth2JwksGetAsync(final ApiCallback<OAuth2JWKs> _callback) throws ApiException {

        okhttp3.Call localVarCall = authOauth2JwksGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<OAuth2JWKs>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for issueToken
     * @param grantType グラントタイプ (optional)
     * @param refreshToken 認可時に発行されたリフレッシュトークン。grant_typeが &#x60;refresh_token&#x60; の場合にだけ指定します。 (optional)
     * @param tenantUuid テナントのUUID。grant_typeが &#x60;password&#x60; の場合にだけ指定します。 grant_typeが &#x60;password&#x60; で、テナントUUIDを省略した場合は、デフォルトのテナントが使用されます。 (optional, default to 00000000-0000-0000-0000-000000000000)
     * @param username ユーザーの名前。grant_typeが &#x60;password&#x60; の場合にだけ指定します。 (optional)
     * @param password パスワード。grant_typeが &#x60;password&#x60; の場合にだけ指定します。 (optional)
     * @param clientId OAuth2クライアントのID (optional)
     * @param clientSecret OAuth2のクライアントシークレット。 OAuth2クライアントの &#x60;token_endpoint_auth_method&#x60; が &#x60;client_secret_post&#x60; の場合にだけ指定します。 (optional)
     * @param clientCertification OAuth2のクライアント証明書。 OAuth2クライアントの &#x60;token_endpoint_auth_method&#x60; が &#x60;tls_client_auth&#x60; の場合にだけ指定します。 (optional)
     * @param redirectUri 認可後のリダイレクト先URI。 grant_typeが &#x60;authorization_code&#x60; の場合にだけ必要です。 (optional)
     * @param codeVerifier PKCE code verifier.  * 使用可能な文字:  &#x60;[a-Z] / [0-9] / \\\&quot;-\\\&quot; / \\\&quot;.\\\&quot; / \\\&quot;_\\\&quot; / \\\&quot;~\\\&quot;&#x60;  * 長さ: 43文字以上、128文字以下 (optional)
     * @param code 認可コード (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call issueTokenCall(String grantType, String refreshToken, String tenantUuid, String username, String password, String clientId, String clientSecret, String clientCertification, String redirectUri, String codeVerifier, String code, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/auth/oauth2/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (grantType != null) {
            localVarFormParams.put("grant_type", grantType);
        }

        if (refreshToken != null) {
            localVarFormParams.put("refresh_token", refreshToken);
        }

        if (tenantUuid != null) {
            localVarFormParams.put("tenant_uuid", tenantUuid);
        }

        if (username != null) {
            localVarFormParams.put("username", username);
        }

        if (password != null) {
            localVarFormParams.put("password", password);
        }

        if (clientId != null) {
            localVarFormParams.put("client_id", clientId);
        }

        if (clientSecret != null) {
            localVarFormParams.put("client_secret", clientSecret);
        }

        if (clientCertification != null) {
            localVarFormParams.put("client_certification", clientCertification);
        }

        if (redirectUri != null) {
            localVarFormParams.put("redirect_uri", redirectUri);
        }

        if (codeVerifier != null) {
            localVarFormParams.put("code_verifier", codeVerifier);
        }

        if (code != null) {
            localVarFormParams.put("code", code);
        }

        final String[] localVarAccepts = {
            "application/json; charset=utf-8"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "IntdashToken", "OAuth2TokenInCookie", "OAuth2TokenInHeader" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call issueTokenValidateBeforeCall(String grantType, String refreshToken, String tenantUuid, String username, String password, String clientId, String clientSecret, String clientCertification, String redirectUri, String codeVerifier, String code, final ApiCallback _callback) throws ApiException {
        return issueTokenCall(grantType, refreshToken, tenantUuid, username, password, clientId, clientSecret, clientCertification, redirectUri, codeVerifier, code, _callback);

    }

    /**
     * Token Endpoint
     * OAuth2のアクセストークンを取得します。 [RFC6749:The OAuth 2.0 Authorization Framework](https://tools.ietf.org/html/rfc6749)
     * @param grantType グラントタイプ (optional)
     * @param refreshToken 認可時に発行されたリフレッシュトークン。grant_typeが &#x60;refresh_token&#x60; の場合にだけ指定します。 (optional)
     * @param tenantUuid テナントのUUID。grant_typeが &#x60;password&#x60; の場合にだけ指定します。 grant_typeが &#x60;password&#x60; で、テナントUUIDを省略した場合は、デフォルトのテナントが使用されます。 (optional, default to 00000000-0000-0000-0000-000000000000)
     * @param username ユーザーの名前。grant_typeが &#x60;password&#x60; の場合にだけ指定します。 (optional)
     * @param password パスワード。grant_typeが &#x60;password&#x60; の場合にだけ指定します。 (optional)
     * @param clientId OAuth2クライアントのID (optional)
     * @param clientSecret OAuth2のクライアントシークレット。 OAuth2クライアントの &#x60;token_endpoint_auth_method&#x60; が &#x60;client_secret_post&#x60; の場合にだけ指定します。 (optional)
     * @param clientCertification OAuth2のクライアント証明書。 OAuth2クライアントの &#x60;token_endpoint_auth_method&#x60; が &#x60;tls_client_auth&#x60; の場合にだけ指定します。 (optional)
     * @param redirectUri 認可後のリダイレクト先URI。 grant_typeが &#x60;authorization_code&#x60; の場合にだけ必要です。 (optional)
     * @param codeVerifier PKCE code verifier.  * 使用可能な文字:  &#x60;[a-Z] / [0-9] / \\\&quot;-\\\&quot; / \\\&quot;.\\\&quot; / \\\&quot;_\\\&quot; / \\\&quot;~\\\&quot;&#x60;  * 長さ: 43文字以上、128文字以下 (optional)
     * @param code 認可コード (optional)
     * @return IssueToken200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public IssueToken200Response issueToken(String grantType, String refreshToken, String tenantUuid, String username, String password, String clientId, String clientSecret, String clientCertification, String redirectUri, String codeVerifier, String code) throws ApiException {
        ApiResponse<IssueToken200Response> localVarResp = issueTokenWithHttpInfo(grantType, refreshToken, tenantUuid, username, password, clientId, clientSecret, clientCertification, redirectUri, codeVerifier, code);
        return localVarResp.getData();
    }

    /**
     * Token Endpoint
     * OAuth2のアクセストークンを取得します。 [RFC6749:The OAuth 2.0 Authorization Framework](https://tools.ietf.org/html/rfc6749)
     * @param grantType グラントタイプ (optional)
     * @param refreshToken 認可時に発行されたリフレッシュトークン。grant_typeが &#x60;refresh_token&#x60; の場合にだけ指定します。 (optional)
     * @param tenantUuid テナントのUUID。grant_typeが &#x60;password&#x60; の場合にだけ指定します。 grant_typeが &#x60;password&#x60; で、テナントUUIDを省略した場合は、デフォルトのテナントが使用されます。 (optional, default to 00000000-0000-0000-0000-000000000000)
     * @param username ユーザーの名前。grant_typeが &#x60;password&#x60; の場合にだけ指定します。 (optional)
     * @param password パスワード。grant_typeが &#x60;password&#x60; の場合にだけ指定します。 (optional)
     * @param clientId OAuth2クライアントのID (optional)
     * @param clientSecret OAuth2のクライアントシークレット。 OAuth2クライアントの &#x60;token_endpoint_auth_method&#x60; が &#x60;client_secret_post&#x60; の場合にだけ指定します。 (optional)
     * @param clientCertification OAuth2のクライアント証明書。 OAuth2クライアントの &#x60;token_endpoint_auth_method&#x60; が &#x60;tls_client_auth&#x60; の場合にだけ指定します。 (optional)
     * @param redirectUri 認可後のリダイレクト先URI。 grant_typeが &#x60;authorization_code&#x60; の場合にだけ必要です。 (optional)
     * @param codeVerifier PKCE code verifier.  * 使用可能な文字:  &#x60;[a-Z] / [0-9] / \\\&quot;-\\\&quot; / \\\&quot;.\\\&quot; / \\\&quot;_\\\&quot; / \\\&quot;~\\\&quot;&#x60;  * 長さ: 43文字以上、128文字以下 (optional)
     * @param code 認可コード (optional)
     * @return ApiResponse&lt;IssueToken200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IssueToken200Response> issueTokenWithHttpInfo(String grantType, String refreshToken, String tenantUuid, String username, String password, String clientId, String clientSecret, String clientCertification, String redirectUri, String codeVerifier, String code) throws ApiException {
        okhttp3.Call localVarCall = issueTokenValidateBeforeCall(grantType, refreshToken, tenantUuid, username, password, clientId, clientSecret, clientCertification, redirectUri, codeVerifier, code, null);
        Type localVarReturnType = new TypeToken<IssueToken200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Token Endpoint (asynchronously)
     * OAuth2のアクセストークンを取得します。 [RFC6749:The OAuth 2.0 Authorization Framework](https://tools.ietf.org/html/rfc6749)
     * @param grantType グラントタイプ (optional)
     * @param refreshToken 認可時に発行されたリフレッシュトークン。grant_typeが &#x60;refresh_token&#x60; の場合にだけ指定します。 (optional)
     * @param tenantUuid テナントのUUID。grant_typeが &#x60;password&#x60; の場合にだけ指定します。 grant_typeが &#x60;password&#x60; で、テナントUUIDを省略した場合は、デフォルトのテナントが使用されます。 (optional, default to 00000000-0000-0000-0000-000000000000)
     * @param username ユーザーの名前。grant_typeが &#x60;password&#x60; の場合にだけ指定します。 (optional)
     * @param password パスワード。grant_typeが &#x60;password&#x60; の場合にだけ指定します。 (optional)
     * @param clientId OAuth2クライアントのID (optional)
     * @param clientSecret OAuth2のクライアントシークレット。 OAuth2クライアントの &#x60;token_endpoint_auth_method&#x60; が &#x60;client_secret_post&#x60; の場合にだけ指定します。 (optional)
     * @param clientCertification OAuth2のクライアント証明書。 OAuth2クライアントの &#x60;token_endpoint_auth_method&#x60; が &#x60;tls_client_auth&#x60; の場合にだけ指定します。 (optional)
     * @param redirectUri 認可後のリダイレクト先URI。 grant_typeが &#x60;authorization_code&#x60; の場合にだけ必要です。 (optional)
     * @param codeVerifier PKCE code verifier.  * 使用可能な文字:  &#x60;[a-Z] / [0-9] / \\\&quot;-\\\&quot; / \\\&quot;.\\\&quot; / \\\&quot;_\\\&quot; / \\\&quot;~\\\&quot;&#x60;  * 長さ: 43文字以上、128文字以下 (optional)
     * @param code 認可コード (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call issueTokenAsync(String grantType, String refreshToken, String tenantUuid, String username, String password, String clientId, String clientSecret, String clientCertification, String redirectUri, String codeVerifier, String code, final ApiCallback<IssueToken200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = issueTokenValidateBeforeCall(grantType, refreshToken, tenantUuid, username, password, clientId, clientSecret, clientCertification, redirectUri, codeVerifier, code, _callback);
        Type localVarReturnType = new TypeToken<IssueToken200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for oauth2Authorization
     * @param clientId OAuth2クライアントID (required)
     * @param responseType OAuth2のresponse_type。 &#x60;code&#x60; のみサポートされています。 (required)
     * @param redirectUri 認可後のリダイレクト先URI (required)
     * @param state CSRF対策のためのstate (required)
     * @param codeChallenge PKCEコードチャレンジ。 &#x60;code_verifier&#x60; から計算したSHA-256ハッシュを、Base64 URLエンコードしたもの。 (optional)
     * @param codeChallengeMethod PKCEコードチャレンジの方式。 &#x60;S256&#x60; （SHA-256）のみサポートされます。 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 302 </td><td> APIサーバーで設定されているログインページや同意ページへのリダイレクト </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call oauth2AuthorizationCall(String clientId, String responseType, String redirectUri, String state, String codeChallenge, String codeChallengeMethod, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/auth/oauth2/authorization";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (clientId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("client_id", clientId));
        }

        if (responseType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("response_type", responseType));
        }

        if (redirectUri != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("redirect_uri", redirectUri));
        }

        if (state != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("state", state));
        }

        if (codeChallenge != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("code_challenge", codeChallenge));
        }

        if (codeChallengeMethod != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("code_challenge_method", codeChallengeMethod));
        }

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
    private okhttp3.Call oauth2AuthorizationValidateBeforeCall(String clientId, String responseType, String redirectUri, String state, String codeChallenge, String codeChallengeMethod, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling oauth2Authorization(Async)");
        }

        // verify the required parameter 'responseType' is set
        if (responseType == null) {
            throw new ApiException("Missing the required parameter 'responseType' when calling oauth2Authorization(Async)");
        }

        // verify the required parameter 'redirectUri' is set
        if (redirectUri == null) {
            throw new ApiException("Missing the required parameter 'redirectUri' when calling oauth2Authorization(Async)");
        }

        // verify the required parameter 'state' is set
        if (state == null) {
            throw new ApiException("Missing the required parameter 'state' when calling oauth2Authorization(Async)");
        }

        return oauth2AuthorizationCall(clientId, responseType, redirectUri, state, codeChallenge, codeChallengeMethod, _callback);

    }

    /**
     * Authorization Endpoint
     * OAuth2認可エンドポイント。 [RFC6749:The OAuth 2.0 Authorization Framework](https://tools.ietf.org/html/rfc6749)
     * @param clientId OAuth2クライアントID (required)
     * @param responseType OAuth2のresponse_type。 &#x60;code&#x60; のみサポートされています。 (required)
     * @param redirectUri 認可後のリダイレクト先URI (required)
     * @param state CSRF対策のためのstate (required)
     * @param codeChallenge PKCEコードチャレンジ。 &#x60;code_verifier&#x60; から計算したSHA-256ハッシュを、Base64 URLエンコードしたもの。 (optional)
     * @param codeChallengeMethod PKCEコードチャレンジの方式。 &#x60;S256&#x60; （SHA-256）のみサポートされます。 (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 302 </td><td> APIサーバーで設定されているログインページや同意ページへのリダイレクト </td><td>  -  </td></tr>
     </table>
     */
    public void oauth2Authorization(String clientId, String responseType, String redirectUri, String state, String codeChallenge, String codeChallengeMethod) throws ApiException {
        oauth2AuthorizationWithHttpInfo(clientId, responseType, redirectUri, state, codeChallenge, codeChallengeMethod);
    }

    /**
     * Authorization Endpoint
     * OAuth2認可エンドポイント。 [RFC6749:The OAuth 2.0 Authorization Framework](https://tools.ietf.org/html/rfc6749)
     * @param clientId OAuth2クライアントID (required)
     * @param responseType OAuth2のresponse_type。 &#x60;code&#x60; のみサポートされています。 (required)
     * @param redirectUri 認可後のリダイレクト先URI (required)
     * @param state CSRF対策のためのstate (required)
     * @param codeChallenge PKCEコードチャレンジ。 &#x60;code_verifier&#x60; から計算したSHA-256ハッシュを、Base64 URLエンコードしたもの。 (optional)
     * @param codeChallengeMethod PKCEコードチャレンジの方式。 &#x60;S256&#x60; （SHA-256）のみサポートされます。 (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 302 </td><td> APIサーバーで設定されているログインページや同意ページへのリダイレクト </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> oauth2AuthorizationWithHttpInfo(String clientId, String responseType, String redirectUri, String state, String codeChallenge, String codeChallengeMethod) throws ApiException {
        okhttp3.Call localVarCall = oauth2AuthorizationValidateBeforeCall(clientId, responseType, redirectUri, state, codeChallenge, codeChallengeMethod, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Authorization Endpoint (asynchronously)
     * OAuth2認可エンドポイント。 [RFC6749:The OAuth 2.0 Authorization Framework](https://tools.ietf.org/html/rfc6749)
     * @param clientId OAuth2クライアントID (required)
     * @param responseType OAuth2のresponse_type。 &#x60;code&#x60; のみサポートされています。 (required)
     * @param redirectUri 認可後のリダイレクト先URI (required)
     * @param state CSRF対策のためのstate (required)
     * @param codeChallenge PKCEコードチャレンジ。 &#x60;code_verifier&#x60; から計算したSHA-256ハッシュを、Base64 URLエンコードしたもの。 (optional)
     * @param codeChallengeMethod PKCEコードチャレンジの方式。 &#x60;S256&#x60; （SHA-256）のみサポートされます。 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 302 </td><td> APIサーバーで設定されているログインページや同意ページへのリダイレクト </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call oauth2AuthorizationAsync(String clientId, String responseType, String redirectUri, String state, String codeChallenge, String codeChallengeMethod, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = oauth2AuthorizationValidateBeforeCall(clientId, responseType, redirectUri, state, codeChallenge, codeChallengeMethod, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for reovokeToken
     * @param clientId OAuth2クライアントID (required)
     * @param tokenTypeHint OAuth2トークンタイプについてのヒント (optional, default to refresh_token)
     * @param token 無効化したいリフレッシュトークンまたはアクセストークン。 指定を省略した場合、サーバーは、cookieの &#x60;_bearer_token&#x60; に指定されたアクセストークン、または、Authorizationヘッダーに指定されたアクセストークン（ &#x60;Bearer&#x60; トークン）を無効化します。 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call reovokeTokenCall(String clientId, String tokenTypeHint, String token, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/auth/oauth2/revocation";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (clientId != null) {
            localVarFormParams.put("client_id", clientId);
        }

        if (tokenTypeHint != null) {
            localVarFormParams.put("token_type_hint", tokenTypeHint);
        }

        if (token != null) {
            localVarFormParams.put("token", token);
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "IntdashToken", "OAuth2TokenInCookie", "OAuth2TokenInHeader" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call reovokeTokenValidateBeforeCall(String clientId, String tokenTypeHint, String token, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling reovokeToken(Async)");
        }

        return reovokeTokenCall(clientId, tokenTypeHint, token, _callback);

    }

    /**
     * Revoke Token
     * トークンを無効化します。 このエンドポイントをコールしてからトークンが無効化されるまで、通常数秒程度かかります。 [RFC7009:OAuth 2.0 Token Revocation](https://tools.ietf.org/html/rfc7009)
     * @param clientId OAuth2クライアントID (required)
     * @param tokenTypeHint OAuth2トークンタイプについてのヒント (optional, default to refresh_token)
     * @param token 無効化したいリフレッシュトークンまたはアクセストークン。 指定を省略した場合、サーバーは、cookieの &#x60;_bearer_token&#x60; に指定されたアクセストークン、または、Authorizationヘッダーに指定されたアクセストークン（ &#x60;Bearer&#x60; トークン）を無効化します。 (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public void reovokeToken(String clientId, String tokenTypeHint, String token) throws ApiException {
        reovokeTokenWithHttpInfo(clientId, tokenTypeHint, token);
    }

    /**
     * Revoke Token
     * トークンを無効化します。 このエンドポイントをコールしてからトークンが無効化されるまで、通常数秒程度かかります。 [RFC7009:OAuth 2.0 Token Revocation](https://tools.ietf.org/html/rfc7009)
     * @param clientId OAuth2クライアントID (required)
     * @param tokenTypeHint OAuth2トークンタイプについてのヒント (optional, default to refresh_token)
     * @param token 無効化したいリフレッシュトークンまたはアクセストークン。 指定を省略した場合、サーバーは、cookieの &#x60;_bearer_token&#x60; に指定されたアクセストークン、または、Authorizationヘッダーに指定されたアクセストークン（ &#x60;Bearer&#x60; トークン）を無効化します。 (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> reovokeTokenWithHttpInfo(String clientId, String tokenTypeHint, String token) throws ApiException {
        okhttp3.Call localVarCall = reovokeTokenValidateBeforeCall(clientId, tokenTypeHint, token, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Revoke Token (asynchronously)
     * トークンを無効化します。 このエンドポイントをコールしてからトークンが無効化されるまで、通常数秒程度かかります。 [RFC7009:OAuth 2.0 Token Revocation](https://tools.ietf.org/html/rfc7009)
     * @param clientId OAuth2クライアントID (required)
     * @param tokenTypeHint OAuth2トークンタイプについてのヒント (optional, default to refresh_token)
     * @param token 無効化したいリフレッシュトークンまたはアクセストークン。 指定を省略した場合、サーバーは、cookieの &#x60;_bearer_token&#x60; に指定されたアクセストークン、または、Authorizationヘッダーに指定されたアクセストークン（ &#x60;Bearer&#x60; トークン）を無効化します。 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call reovokeTokenAsync(String clientId, String tokenTypeHint, String token, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = reovokeTokenValidateBeforeCall(clientId, tokenTypeHint, token, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
