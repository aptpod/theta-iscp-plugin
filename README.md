# THETA iSCP Plugin

[RICHO THETA](https://www.ricoh360.com/ja/theta/) で [intdash](https://www.aptpod.co.jp/products/software/intdash/) サーバーへ360°画像データをストリーミング可能なプラグインです。


THETAのOSはAndroidOSとなっており、[iscp-kt](https://github.com/aptpod/iscp-kt)を利用してデータ伝送を行うことが可能です。

※ご利用には intdash との契約が必要です。

※動作確認済みのTEHTAは THETA V (3.82.1) のみです。他の機種でも動く可能性もありますが動作未検証です。


## セットアップ

ご利用にはいくつかの作業が必要です。

#### 1\. THETAを開発者モードにする。

プラグインの利用にはプラグインを動かすTHETAを開発者モードにする必要があります。

また、開発者モードにするには [RICOH THETA プラグイン パートナープログラム](https://jp.ricoh.com/release/2018/0628_1) に登録する必要があります。

パートナープログラムへの登録は [こちら](https://www8.webcas.net/db/pub/ricoh/thetaplugin/create/input) より行いました。

参考記事: https://qiita.com/mShiiina/items/55d98f366e650ca42251

#### 2\. アプリのインストール

開発者モードにすることができたら、[adb](https://developer.android.com/studio/command-line/adb?hl=ja) コマンドを利用してプラグインをTHETAへインストールします。

```
adb install theta-iscp-plugin.apk
```

#### 3\. アプリへのパーミッション付与。

THETA Vへプラグインをインストールする場合、端末に画面が無いためOSを直接操作できません。
その為、[scrcpy](https://github.com/Genymobile/scrcpy) 等を用いてAndroidOSの画面ミラーリングします。

ミラーリングができたら `Settings` -> `Apps` -> `THETA iSCP Streaming` -> `Permissions` を選択し

- Camera
- Microphone
- Storage

の権限を付与してください。

※ミラーリングした段階でホーム画面以外が表示されていた場合は `ALTキー+Hキー` でホーム画面を表示してください。

#### 4\. THETAをクライアントモードにしインターネットと接続

THETA Vを利用する場合は [こちら](https://support.theta360.com/ja/manual/v/content/prepare/prepare_08.html) を参考にインターネットに繋がる様にしてください。

#### 5\. ストリーム設定

アクセス情報や、ストリーム設定は [iscp_plugin_settings.json](iscp_plugin_settings.json) を利用します。

```json
{
    "intdash" : {
        "server_url" : "https://example.com",
        "server_path" : "/api",
        "node_client_id" : "00000000-0000-0000-0000-000000000000",
        "node_client_secret" : "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
        "save_to_server" : false
    },
    "video" : {
        "enabled" : true,
        "resolution" : {  // THETA V supported resolutions: [ 3840x1920, 1920x960, 1024x512, 640x320 ]
            "width" : 1920,
            "height" : 960
        },
        "sample_rate" : 29.97, // THETA V's frame rate is fixed at 29.97 fps.
        "encode_rate" : 15, // Frame rate to be encoded and transmitted.
        "bit_rate" : 2000000,
        "i_frame_interval" : 2
    }
}
```

`node_client_id` と `node_client_secret` には intdashサービスのエッジを作成時に発行されるIDとシークレット情報を設定してください。

上記を修正後、adbコマンドで設定ファイルをTHETA内に設置します。

```
adb push iscp_plugin_settings.json /storage/self/primary/
```

#### 6\. プラグインアプリ設定

[こちら](https://support.theta360.com/ja/download/pcmac/) よりRICHO THETAアプリをインストールし、アプリ上部の `プラグイン` -> `プラグイン管理...` より起動するプラグインを `THETA iSCP Streaming` に設定してください。

## 利用方法

THETAがクライアントモードでかつ、WiFiに接続している事を確認します。

プラグインアプリ設定まで行えた場合は、THETAのモードボタンを長押しして、プラグインアプリを起動できます。

計測開始・停止は端末中央のシャッターボタンを押すことで行えます。

## 開発者向け情報

以下は、開発者向けの情報になります。

### 開発環境

- Android™ Studio Chipmunk | 2021.2.1 Patch 2
- Android Gradle Plugin Version 7.2.2
- Gradle Version 7.3.3
- Kotlin Gradle Plugin Version 1.8.20
- compileSdk 26
- minSdk 25
- targetSdk 33

### intdash API Client

intdash APIと連携には[OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator)より自動生成されたクライアントを利用します。

クライアントの生成に利用したコマンドは下記を利用しました。

```
openapi-generator-cli generate -i openapi_public.yaml -g java -o intdash --additional-properties=library=okhttp-gson,apiPackage=com.aptpod.intdash,groupId=com.aptpod,artifactId=intdash,sourceFolder=src/main/java,disallowAdditionalPropertiesIfNotPresent=false,dateLibrary=legacy
```

その他の intdash API Client の設定方法は [こちら](https://docs.intdash.jp/manual/api-sdk-docs-site/latest/ja/rest/rest-client-examples.html) を参照してください。