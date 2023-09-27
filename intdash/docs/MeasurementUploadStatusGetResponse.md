

# MeasurementUploadStatusGetResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | 計測アップロードのUUID |  |
|**measUuid** | **String** | 計測のUUID |  |
|**state** | [**StateEnum**](#StateEnum) | 計測への変換ジョブのステータス |  |
|**message** | **String** | 計測への変換ジョブの結果 |  |
|**fileName** | **String** | 計測に変換する対象のファイル名。 同じ日に同じ名前のファイルがアップロードされた場合は、 ランダムな接頭辞が付与されます。 |  |
|**createdAt** | **String** | 計測アップロードの作成日時 |  |
|**updatedAt** | **String** | 計測アップロードの最終更新日時 |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| READY | &quot;ready&quot; |
| PROCESSING | &quot;processing&quot; |
| SUCCEED | &quot;succeed&quot; |
| FAILED | &quot;failed&quot; |
| CANCELED | &quot;canceled&quot; |



