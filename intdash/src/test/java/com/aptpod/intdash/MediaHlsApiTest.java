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
import java.io.File;
import org.openapitools.client.model.HLSList;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MediaHlsApi
 */
@Disabled
public class MediaHlsApiTest {

    private final MediaHlsApi api = new MediaHlsApi();

    /**
     * Get HLS as FMP4
     *
     * **Deprecated** このエンドポイントの代わりに [&#x60;POST /media/videos/{video_uuid}/mp4s&#x60;](#operation/createMP4) を使用してください。 mp4リソース作成後、 &#x60;MP4&#x60;オブジェクトの &#x60;file_path&#x60;にあるPATHに従って動画を取得してください
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFMP4Test() throws ApiException {
        String measUuid = null;
        Integer channel = null;
        File response = api.getFMP4(measUuid, channel);
        // TODO: test validations
    }

    /**
     * List HLSes
     *
     * **Deprecated** このエンドポイントではなく [&#x60;GET /media/videos&#x60;](#operation/getVideos) を使用してください
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHLSesTest() throws ApiException {
        Integer start = null;
        Integer end = null;
        String edgeUuid = null;
        Integer channel = null;
        Integer limit = null;
        HLSList response = api.getHLSes(start, end, edgeUuid, channel, limit);
        // TODO: test validations
    }

    /**
     * Get HLS Playlist
     *
     * **Depricated** このエンドポイントの代わりに、Videoオブジェクトの &#x60;hls&#x60;にあるPATHにしたがってPlaylistを取得してください。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPlaylistTest() throws ApiException {
        String measUuid = null;
        Integer channel = null;
        Boolean forceEnd = null;
        String response = api.getPlaylist(measUuid, channel, forceEnd);
        // TODO: test validations
    }

    /**
     * Get Project HLS as FMP4
     *
     * **Deprecated** このエンドポイントの代わりに [&#x60;POST /media/videos/{video_uuid}/mp4s&#x60;](#operation/createMP4) を使用してください。 mp4リソース作成後、 &#x60;MP4&#x60;オブジェクトの &#x60;file_path&#x60;にあるPATHに従って動画を取得してください
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectFMP4Test() throws ApiException {
        String projectUuid = null;
        String measUuid = null;
        Integer channel = null;
        File response = api.getProjectFMP4(projectUuid, measUuid, channel);
        // TODO: test validations
    }

    /**
     * List Project HLSes
     *
     * **Deprecated** このエンドポイントではなく [&#x60;GET /media/videos&#x60;](#operation/getVideos) を使用してください
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectHLSesTest() throws ApiException {
        String projectUuid = null;
        Integer start = null;
        Integer end = null;
        String edgeUuid = null;
        Integer channel = null;
        Integer limit = null;
        HLSList response = api.getProjectHLSes(projectUuid, start, end, edgeUuid, channel, limit);
        // TODO: test validations
    }

    /**
     * Get Project HLS Playlist
     *
     * **Depricated** このエンドポイントの代わりに、Videoオブジェクトの &#x60;hls&#x60;にあるPATHにしたがってPlaylistを取得してください。
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectPlaylistTest() throws ApiException {
        String projectUuid = null;
        String measUuid = null;
        Integer channel = null;
        Boolean forceEnd = null;
        String response = api.getProjectPlaylist(projectUuid, measUuid, channel, forceEnd);
        // TODO: test validations
    }

}
