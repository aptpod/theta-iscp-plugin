

# Video


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **UUID** | 動画（video）のUUID |  |
|**measurementUuid** | **UUID** | 計測のUUID |  |
|**measurement** | [**MediaMeasurement**](MediaMeasurement.md) |  |  [optional] |
|**edgeUuid** | **UUID** | エッジのUUID |  |
|**channel** | **Integer** | チャンネル |  |
|**codec** | **VideoCodecs** |  |  |
|**sourceDataType** | **VideoSourceDataType** |  |  |
|**offsetTime** | **Integer** | 計測開始からのオフセット（マイクロ秒） |  |
|**duration** | **Integer** | 長さ（マイクロ秒） |  |
|**fps** | **BigDecimal** | フレームレート（fps） |  |
|**width** | **Integer** | 動画の幅 |  |
|**height** | **Integer** | 動画の高さ |  |
|**status** | **VideoStatus** |  |  |
|**hls** | [**Playlist**](Playlist.md) |  |  [optional] |
|**mp4s** | [**List&lt;MP4&gt;**](MP4.md) | この動画を変換して作成されたMP4のリスト |  |
|**jpegs** | [**List&lt;Jpeg&gt;**](Jpeg.md) | この動画を変換して作成されたJPEGのリスト |  |
|**createdAt** | **Date** | 作成された日時 |  |
|**updatedAt** | **Date** | 最終更新日時 |  |



