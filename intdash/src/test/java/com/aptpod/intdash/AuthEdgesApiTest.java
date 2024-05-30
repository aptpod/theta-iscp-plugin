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
import org.openapitools.client.model.AssignOwnerRequest;
import org.openapitools.client.model.CreateEdgeRequest;
import org.openapitools.client.model.Edge;
import org.openapitools.client.model.EdgeOwner;
import org.openapitools.client.model.Edges;
import org.openapitools.client.model.ErrorProblem;
import org.openapitools.client.model.PatchEdgeRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthEdgesApi
 */
@Disabled
public class AuthEdgesApiTest {

    private final AuthEdgesApi api = new AuthEdgesApi();

    /**
     * Assign Owner
     *
     * エッジに所有者を割り当てます。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void assignOwnerTest() throws ApiException {
        String edgeUuid = null;
        AssignOwnerRequest assignOwnerRequest = null;
        EdgeOwner response = api.assignOwner(edgeUuid, assignOwnerRequest);
        // TODO: test validations
    }

    /**
     * Create Edge
     *
     * 所有者がない状態でエッジを作成します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEdgeTest() throws ApiException {
        CreateEdgeRequest createEdgeRequest = null;
        Edge response = api.createEdge(createEdgeRequest);
        // TODO: test validations
    }

    /**
     * Create My Edge
     *
     * 新しいエッジを作成し、自分（ユーザー）を所有者に設定します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMyEdgeTest() throws ApiException {
        CreateEdgeRequest createEdgeRequest = null;
        Edge response = api.createMyEdge(createEdgeRequest);
        // TODO: test validations
    }

    /**
     * Create My Edge With UUID
     *
     * 指定したUUIDを持つ新しいエッジを作成し、自分を所有者に設定します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMyEdgeWithUUIDTest() throws ApiException {
        String edgeUuid = null;
        CreateEdgeRequest createEdgeRequest = null;
        Edge response = api.createMyEdgeWithUUID(edgeUuid, createEdgeRequest);
        // TODO: test validations
    }

    /**
     * Create User&#39;s Edge
     *
     * 指定されたユーザーを所有者とするエッジを作成します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUsersEdgeTest() throws ApiException {
        String userUuid = null;
        CreateEdgeRequest createEdgeRequest = null;
        Edge response = api.createUsersEdge(userUuid, createEdgeRequest);
        // TODO: test validations
    }

    /**
     * Delete Edge
     *
     * エッジを削除します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteEdgeTest() throws ApiException {
        String edgeUuid = null;
        api.deleteEdge(edgeUuid);
        // TODO: test validations
    }

    /**
     * Delete My Edge
     *
     * 自分（ユーザー）が所有するエッジを削除します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteMyEdgeTest() throws ApiException {
        String edgeUuid = null;
        api.deleteMyEdge(edgeUuid);
        // TODO: test validations
    }

    /**
     * Delete User&#39;s Edge
     *
     * ユーザーが所有するエッジを削除します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUsersEdgeTest() throws ApiException {
        String userUuid = null;
        String edgeUuid = null;
        api.deleteUsersEdge(userUuid, edgeUuid);
        // TODO: test validations
    }

    /**
     * Get Edge
     *
     * エッジを取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEdgeTest() throws ApiException {
        String edgeUuid = null;
        Edge response = api.getEdge(edgeUuid);
        // TODO: test validations
    }

    /**
     * Get Edge having the same UUID as Me
     *
     * 自分のUUIDと同じエッジUUIDを持つエッジを取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMeAsEdgeTest() throws ApiException {
        Edge response = api.getMeAsEdge();
        // TODO: test validations
    }

    /**
     * Get My Edge
     *
     * 自分（ユーザー）が所有するエッジを取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMyEdgeTest() throws ApiException {
        String edgeUuid = null;
        Edge response = api.getMyEdge(edgeUuid);
        // TODO: test validations
    }

    /**
     * Get User&#39;s Edge
     *
     * ユーザーが所有するエッジを取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUsersEdgeTest() throws ApiException {
        String userUuid = null;
        String edgeUuid = null;
        Edge response = api.getUsersEdge(userUuid, edgeUuid);
        // TODO: test validations
    }

    /**
     * List Edges
     *
     * エッジのリストを取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listEdgesTest() throws ApiException {
        List<String> uuid = null;
        List<String> name = null;
        List<String> nickname = null;
        List<String> ownerUuid = null;
        String hasOwner = null;
        String sort = null;
        Integer page = null;
        Integer perPage = null;
        Edges response = api.listEdges(uuid, name, nickname, ownerUuid, hasOwner, sort, page, perPage);
        // TODO: test validations
    }

    /**
     * List My Edges
     *
     * 自分（ユーザー）が所有するエッジのリストを取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMyEdgesTest() throws ApiException {
        Edges response = api.listMyEdges();
        // TODO: test validations
    }

    /**
     * List User&#39;s Edges
     *
     * 指定されたユーザーが所有するエッジのリストを取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUsersEdgesTest() throws ApiException {
        String userUuid = null;
        Edges response = api.listUsersEdges(userUuid);
        // TODO: test validations
    }

    /**
     * Unassign Owner
     *
     * エッジに所有者がない状態にします。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeOwnerTest() throws ApiException {
        String edgeUuid = null;
        api.removeOwner(edgeUuid);
        // TODO: test validations
    }

    /**
     * Update Edge
     *
     * エッジを更新します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateEdgeTest() throws ApiException {
        String edgeUuid = null;
        PatchEdgeRequest patchEdgeRequest = null;
        Edge response = api.updateEdge(edgeUuid, patchEdgeRequest);
        // TODO: test validations
    }

    /**
     * Update My Edge
     *
     * 自分（ユーザー）が所有するエッジを更新します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMyEdgeTest() throws ApiException {
        String edgeUuid = null;
        PatchEdgeRequest patchEdgeRequest = null;
        Edge response = api.updateMyEdge(edgeUuid, patchEdgeRequest);
        // TODO: test validations
    }

    /**
     * Update User&#39;s Edge
     *
     * ユーザーが所有するエッジを更新します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUsersEdgeTest() throws ApiException {
        String userUuid = null;
        String edgeUuid = null;
        PatchEdgeRequest patchEdgeRequest = null;
        Edge response = api.updateUsersEdge(userUuid, edgeUuid, patchEdgeRequest);
        // TODO: test validations
    }

}