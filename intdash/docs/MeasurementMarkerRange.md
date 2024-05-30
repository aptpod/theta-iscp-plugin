

# MeasurementMarkerRange


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | 計測マーカーのUUID |  |
|**name** | **String** | 計測マーカーの名前 |  |
|**description** | **String** | 計測マーカーの説明 |  |
|**type** | [**TypeEnum**](#TypeEnum) | 計測マーカーのタイプ - &#x60;point&#x60; : ポイントマーカー - &#x60;range&#x60; : 範囲マーカー |  |
|**tag** | **Object** | 計測マーカーに付与されたタグ |  |
|**createdAt** | **String** | 計測マーカーの作成日時 |  |
|**createdBy** | **String** | 計測マーカー作成者 |  |
|**updatedAt** | **String** | 計測マーカーの最終更新日時 |  |
|**updatedBy** | **String** | 計測マーカーの最終更新者 |  |
|**detail** | [**MeasurementMarkerDetailRange**](MeasurementMarkerDetailRange.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| POINT | &quot;point&quot; |
| RANGE | &quot;range&quot; |



