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
import org.openapitools.client.model.CreateSignalRequest;
import org.openapitools.client.model.Signal;
import org.openapitools.client.model.Signals;
import org.openapitools.client.model.UpdateSignalRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MeasSignalsApi
 */
@Disabled
public class MeasSignalsApiTest {

    private final MeasSignalsApi api = new MeasSignalsApi();

    /**
     * Create Project Signal
     *
     * 信号定義を作成します。  * **Note**     - 既存の信号定義と &#x60;label&#x60; が重複する場合、または &#x60;uuid&#x60; が重複する場合は、       ステータスコード &#x60;409 Conflict&#x60; が返却されます。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectSignalTest() throws ApiException {
        String projectUuid = null;
        CreateSignalRequest createSignalRequest = null;
        Signal response = api.createProjectSignal(projectUuid, createSignalRequest);
        // TODO: test validations
    }

    /**
     * Create Signal
     *
     * （Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/signals&#x60; を使用してください）  信号定義を作成します。   * **Note**      - 既存の信号定義と &#x60;label&#x60; が重複する場合、または &#x60;uuid&#x60; が重複する場合は、        ステータスコード &#x60;409 Conflict&#x60; が返却されます。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSignalTest() throws ApiException {
        CreateSignalRequest createSignalRequest = null;
        Signal response = api.createSignal(createSignalRequest);
        // TODO: test validations
    }

    /**
     * Delete Project Signal
     *
     * 信号定義を削除します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProjectSignalTest() throws ApiException {
        String projectUuid = null;
        String signalUuid = null;
        api.deleteProjectSignal(projectUuid, signalUuid);
        // TODO: test validations
    }

    /**
     * Delete Signal
     *
     * （Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/signals/{signal_uuid}&#x60; を使用してください） 信号定義を削除します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSignalTest() throws ApiException {
        String signalUuid = null;
        api.deleteSignal(signalUuid);
        // TODO: test validations
    }

    /**
     * Get Project Signal
     *
     * 信号定義を取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectSignalTest() throws ApiException {
        String projectUuid = null;
        String signalUuid = null;
        Signal response = api.getProjectSignal(projectUuid, signalUuid);
        // TODO: test validations
    }

    /**
     * Get Signal
     *
     * （Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/signals/{signal_uuid}&#x60; を使用してください） 信号定義を取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSignalTest() throws ApiException {
        String signalUuid = null;
        Signal response = api.getSignal(signalUuid);
        // TODO: test validations
    }

    /**
     * List Project Signals
     *
     * 信号定義のリストを取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listProjectSignalsTest() throws ApiException {
        String projectUuid = null;
        List<String> label = null;
        String sort = null;
        String order = null;
        Integer limit = null;
        Integer page = null;
        Signals response = api.listProjectSignals(projectUuid, label, sort, order, limit, page);
        // TODO: test validations
    }

    /**
     * List Signals
     *
     * （Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/signals&#x60; を使用してください） 信号定義のリストを取得します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSignalsTest() throws ApiException {
        List<String> label = null;
        String sort = null;
        String order = null;
        Integer limit = null;
        Integer page = null;
        Signals response = api.listSignals(label, sort, order, limit, page);
        // TODO: test validations
    }

    /**
     * Update Project Signal
     *
     * 信号定義を更新します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateProjectSignalTest() throws ApiException {
        String projectUuid = null;
        String signalUuid = null;
        UpdateSignalRequest updateSignalRequest = null;
        Signal response = api.updateProjectSignal(projectUuid, signalUuid, updateSignalRequest);
        // TODO: test validations
    }

    /**
     * Update Signal
     *
     * （Deprecated。このエンドポイントでなく &#x60;/projects/00000000-0000-0000-0000-000000000000/signals/{signal_uuid}&#x60; を使用してください） 信号定義を更新します。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSignalTest() throws ApiException {
        String signalUuid = null;
        UpdateSignalRequest updateSignalRequest = null;
        Signal response = api.updateSignal(signalUuid, updateSignalRequest);
        // TODO: test validations
    }

}