

# SignalConversionOptionNumFixedPoint


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startbit** | **Integer** | 開始ビット位置 |  |
|**bitsize** | **Integer** | ビットサイズ |  |
|**endian** | [**EndianEnum**](#EndianEnum) | エンディアン |  |
|**sign** | [**SignEnum**](#SignEnum) | 符号有無 |  |
|**scale** | **BigDecimal** | スケールファクター |  |
|**offset** | **BigDecimal** | オフセット |  |



## Enum: EndianEnum

| Name | Value |
|---- | -----|
| BIG | &quot;big&quot; |
| LITTLE | &quot;little&quot; |



## Enum: SignEnum

| Name | Value |
|---- | -----|
| SIGNED | &quot;signed&quot; |
| UNSIGNED | &quot;unsigned&quot; |



