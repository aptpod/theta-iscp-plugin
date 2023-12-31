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

import com.aptpod.ApiException;
import org.openapitools.client.model.ChangePasswordRequest;
import org.openapitools.client.model.CheckPasswordRequest;
import org.openapitools.client.model.CheckPasswordResult;
import org.openapitools.client.model.CreateEmailRequest;
import org.openapitools.client.model.CreateUserAPITokenRequest;
import org.openapitools.client.model.ErrorProblem;
import org.openapitools.client.model.PatchEmailRequest;
import org.openapitools.client.model.PatchUserRequest;
import org.openapitools.client.model.Roles;
import org.openapitools.client.model.UpdateEmailVerifiedRequest;
import org.openapitools.client.model.UpdateUserAPITokenRequest;
import org.openapitools.client.model.User;
import org.openapitools.client.model.UserAPIToken;
import org.openapitools.client.model.UserAPITokens;
import org.openapitools.client.model.UserEmail;
import org.openapitools.client.model.UserEmailVerification;
import org.openapitools.client.model.UserPassword;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthMeApi
 */
@Disabled
public class AuthMeApiTest {

    private final AuthMeApi api = new AuthMeApi();

    /**
     * Change Password
     *
     * パスワードを変更します。 現在のパスワード &#x60;old_password&#x60; または &#x60;recovery_token&#x60; が必要です。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changePasswordTest() throws ApiException {
        ChangePasswordRequest changePasswordRequest = null;
        UserPassword response = api.changePassword(changePasswordRequest);
        // TODO: test validations
    }

    /**
     * Check Password
     *
     * パスワードがポリシーに適合しているかをチェックします。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkPasswordTest() throws ApiException {
        CheckPasswordRequest checkPasswordRequest = null;
        CheckPasswordResult response = api.checkPassword(checkPasswordRequest);
        // TODO: test validations
    }

    /**
     * Create My API Token
     *
     * 自分（ユーザー）のAPIトークンを作成します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMyAPITokenTest() throws ApiException {
        CreateUserAPITokenRequest createUserAPITokenRequest = null;
        UserAPIToken response = api.createMyAPIToken(createUserAPITokenRequest);
        // TODO: test validations
    }

    /**
     * Create My Email
     *
     * 自分（ユーザー）のメールアドレスを設定します。 メールアドレスの設定が成功すると、確認用URLを含むメールがそのアドレスに送信されます。 確認用URLには、メールアドレス確認用トークンとメールアドレスのIDが含まれます。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMyEmailTest() throws ApiException {
        CreateEmailRequest createEmailRequest = null;
        UserEmail response = api.createMyEmail(createEmailRequest);
        // TODO: test validations
    }

    /**
     * Delete My API Token
     *
     * 自分（ユーザー）のAPIトークンを削除します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteMyAPITokenTest() throws ApiException {
        Long userApiTokenId = null;
        api.deleteMyAPIToken(userApiTokenId);
        // TODO: test validations
    }

    /**
     * Delete My Email
     *
     * 自分（ユーザー）のメールアドレスを削除します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteMyEmailTest() throws ApiException {
        Long userEmailId = null;
        api.deleteMyEmail(userEmailId);
        // TODO: test validations
    }

    /**
     * Get Me
     *
     * 自分（ユーザー）を取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMeTest() throws ApiException {
        User response = api.getMe();
        // TODO: test validations
    }

    /**
     * List My API Tokens
     *
     * 自分（ユーザー）のAPIトークンのリストを取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMyAPITokensTest() throws ApiException {
        UserAPITokens response = api.listMyAPITokens();
        // TODO: test validations
    }

    /**
     * List My Roles
     *
     * 自分（ユーザー）に割り当てられたロールのリストを取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMyRolesTest() throws ApiException {
        Roles response = api.listMyRoles();
        // TODO: test validations
    }

    /**
     * Send Verification Email to Me
     *
     * メールアドレスを確認するための確認メールを送信します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendVerificationEmailToMyAddressTest() throws ApiException {
        Long userEmailId = null;
        UserEmailVerification response = api.sendVerificationEmailToMyAddress(userEmailId);
        // TODO: test validations
    }

    /**
     * Update Me
     *
     * 自分（ユーザー）を更新します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMeTest() throws ApiException {
        PatchUserRequest patchUserRequest = null;
        User response = api.updateMe(patchUserRequest);
        // TODO: test validations
    }

    /**
     * Update My API Token
     *
     * 自分（ユーザー）のAPIトークンを作成します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMyAPITokenTest() throws ApiException {
        Long userApiTokenId = null;
        UpdateUserAPITokenRequest updateUserAPITokenRequest = null;
        UserAPIToken response = api.updateMyAPIToken(userApiTokenId, updateUserAPITokenRequest);
        // TODO: test validations
    }

    /**
     * Set My Email as Verified
     *
     * 自分（ユーザー）のメールアドレスを確認済みにします。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMyAddressToVerifiedTest() throws ApiException {
        Long userEmailId = null;
        UpdateEmailVerifiedRequest updateEmailVerifiedRequest = null;
        UserEmail response = api.updateMyAddressToVerified(userEmailId, updateEmailVerifiedRequest);
        // TODO: test validations
    }

    /**
     * Update My Email
     *
     * 自分（ユーザー）のメールアドレスを更新します。 メールアドレスの設定が成功すると、確認用URLを含むメールがそのアドレスに送信されます。 確認用URLには、メールアドレス確認用トークンとメールアドレスのIDが含まれます。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMyEmailTest() throws ApiException {
        Long userEmailId = null;
        PatchEmailRequest patchEmailRequest = null;
        UserEmail response = api.updateMyEmail(userEmailId, patchEmailRequest);
        // TODO: test validations
    }

}
