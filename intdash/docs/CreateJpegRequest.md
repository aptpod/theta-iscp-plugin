

# CreateJpegRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**trim** | **Boolean** | 時間範囲を指定してその部分のJPEGを作成する場合は &#x60;true&#x60; にします。 |  [optional] |
|**startOffset** | **Integer** | 計測開始からのオフセット（マイクロ秒）。trimがtrueの場合は必須です。 |  [optional] |
|**duration** | **Integer** | 長さ（マイクロ秒）。trimがtrueの場合は必須です。 |  [optional] |
|**fps** | **Float** | フレームレート。値が省略された場合は、元のデータと同じフレームレートが使用されます。 |  [optional] |
|**quality** | **JpegQuality** |  |  [optional] |



