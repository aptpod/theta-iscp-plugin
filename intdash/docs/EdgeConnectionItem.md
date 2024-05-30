

# EdgeConnectionItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | エッジ接続のUUID |  |
|**lastLivedAt** | **String** | サーバーがこのエッジ接続を確認できた最後の日時。 エッジとサーバーがWebSocketで接続されている間、この値は数秒おきに最新の日時に更新されます。 WebSocketが切断されると、それ以上更新されなくなります。 更新は数秒おきであるため、WebSocketが切断された場合に その切断の時刻が正確に記録されるわけではありません。 |  |
|**edge** | [**EdgeConnectionEdge**](EdgeConnectionEdge.md) |  |  |
|**createdAt** | **String** | エッジ接続が作成された日時 |  |
|**updatedAt** | **String** | エッジ接続の最終更新日時 |  |



