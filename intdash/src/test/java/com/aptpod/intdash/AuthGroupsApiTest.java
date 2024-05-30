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
import org.openapitools.client.model.CreateGroupRequest;
import org.openapitools.client.model.ErrorProblem;
import org.openapitools.client.model.Group;
import org.openapitools.client.model.Groups;
import org.openapitools.client.model.UpdateGroupRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthGroupsApi
 */
@Disabled
public class AuthGroupsApiTest {

    private final AuthGroupsApi api = new AuthGroupsApi();

    /**
     * Create Group
     *
     * グループを作成します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createGroupTest() throws ApiException {
        CreateGroupRequest createGroupRequest = null;
        Group response = api.createGroup(createGroupRequest);
        // TODO: test validations
    }

    /**
     * Create Sub Group
     *
     * サブグループを作成します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSubGroupTest() throws ApiException {
        String groupUuid = null;
        CreateGroupRequest createGroupRequest = null;
        Group response = api.createSubGroup(groupUuid, createGroupRequest);
        // TODO: test validations
    }

    /**
     * Delete Group
     *
     * グループを削除します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteGroupTest() throws ApiException {
        String groupUuid = null;
        api.deleteGroup(groupUuid);
        // TODO: test validations
    }

    /**
     * Get Group
     *
     * グループを取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGroupTest() throws ApiException {
        String groupUuid = null;
        Group response = api.getGroup(groupUuid);
        // TODO: test validations
    }

    /**
     * List Groups
     *
     * グループのリストを取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listGroupsTest() throws ApiException {
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        Groups response = api.listGroups(page, perPage, sort);
        // TODO: test validations
    }

    /**
     * List My Groups
     *
     * 自分（ユーザー）が所属するグループのリストを取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMyGroupsTest() throws ApiException {
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        Groups response = api.listMyGroups(page, perPage, sort);
        // TODO: test validations
    }

    /**
     * List Sub Groups
     *
     * サブグループを取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSubGroupTest() throws ApiException {
        String groupUuid = null;
        Integer page = null;
        Integer perPage = null;
        String sort = null;
        Groups response = api.listSubGroup(groupUuid, page, perPage, sort);
        // TODO: test validations
    }

    /**
     * Update Group
     *
     * グループを更新します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateGroupTest() throws ApiException {
        String groupUuid = null;
        UpdateGroupRequest updateGroupRequest = null;
        Group response = api.updateGroup(groupUuid, updateGroupRequest);
        // TODO: test validations
    }

}