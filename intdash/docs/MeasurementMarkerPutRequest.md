

# MeasurementMarkerPutRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | 計測マーカーの名前 |  [optional] |
|**description** | **String** | 計測マーカーの説明 |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | 計測マーカーのタイプ - &#x60;point&#x60; : ポイントマーカー - &#x60;range&#x60; : 範囲マーカー |  [optional] |
|**tag** | **Object** | この計測マーカーに付与するタグ。タグはキーと値からなるペア（いずれもstring）で設定します。 複数のタグを一度に設定することができます。 値の中にオブジェクトを入れる（ネストする）ことはできません。 &#x60;&#x60;&#x60; // Not good {   \&quot;tagkey\&quot; : {     \&quot;nestKey\&quot;: \&quot;not allowed\&quot;   } } &#x60;&#x60;&#x60;  &#x60;&#x60;&#x60; // OK {   \&quot;tagkey1\&quot; : \&quot;ok1\&quot;,   \&quot;tagkey2\&quot; : \&quot;ok2\&quot; } &#x60;&#x60;&#x60; |  [optional] |
|**detail** | [**MeasurementMarkerDetailRange**](MeasurementMarkerDetailRange.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| POINT | &quot;point&quot; |
| RANGE | &quot;range&quot; |



