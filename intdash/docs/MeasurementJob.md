

# MeasurementJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | ジョブのUUID |  |
|**measUuid** | **String** | 計測のUUID |  |
|**measurement** | [**Measurement**](Measurement.md) |  |  |
|**status** | **MeasurementJobStatus** |  |  |
|**message** | **String** | ジョブの結果を表すメッセージ。 ジョブのステータスが &#x60;failed&#x60; の場合、メッセージが以下の形式で表示されます。  &#x60;&lt;row_number&gt;:&lt;column_number&gt;:&lt;column_name&gt;:&lt;cell_value&gt;:&lt;error_message&gt;&#x60;  行番号や列番号が不明の場合は &#x60;0&#x60; が出力されます。 * ex.1 &#x60;2:1:time:1539263580:A time must be after the base_time\\: BaseTime&#x3D;2018-10-11 13\\:13\\:03 +0000 UTC&#x60; * ex.2 &#x60;4:0:::Wrong number of fields&#x60; * ex.3 &#x60;0:0:::Unexpected Error&#x60;  &#x60;:&#x60; と &#x60;\\&#x60; はエスケープされ、 &#x60;\\:&#x60; と &#x60;\\\\&#x60; として出力されます。 |  |
|**fileName** | **String** | ジョブの対象のファイル名。 同じ日に同じ名前のファイルがアップロードされた場合は、ランダムな接頭辞が付与されます。 |  |
|**createdAt** | **String** | ジョブの作成日時 |  |
|**updatedAt** | **String** | ジョブの最終更新日時 |  |



