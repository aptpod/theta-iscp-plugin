

# MeasurementSequencesSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**receivedChunksRatio** | **BigDecimal** | 計測シーケンス回収率。計測内に含まれる計測シーケンスのうち、 サーバーへの保存が完了した計測シーケンスの割合です。 |  [optional] |
|**receivedDataPoints** | **Long** | サーバーが受信したデータポイントの数。符号無し64bit整数。 |  [optional] |
|**expectedDataPoints** | **Long** | サーバーが受信することが想定されるデータポイントの総数（既に受信済みのデータポイントを含む）。符号無し64bit整数。 |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | 計測のステータス:   - ready     - 計測準備中   - measuring     - 計測中   - resending     - 再送中。計測（エッジにおけるデータの取得）は終了しましたが、エッジにデータが残っており、サーバーに再送中です。   - finished（非推奨。段階的にcompletedへ移行）     - 完了。サーバーへのデータの回収が完了しています。   - completed     - 完了。サーバーへのデータの回収が完了しています。 |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| READY | &quot;ready&quot; |
| MEASURING | &quot;measuring&quot; |
| RESENDING | &quot;resending&quot; |
| FINISHED | &quot;finished&quot; |
| COMPLETED | &quot;completed&quot; |



