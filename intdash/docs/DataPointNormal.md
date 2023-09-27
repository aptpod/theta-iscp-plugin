

# DataPointNormal

改行で区切られたJSON文字列です。

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**time** | [**DataPointTime**](DataPointTime.md) |  |  |
|**measurementUuid** | **String** | このデータポイントが含まれる計測のUUID |  |
|**createdAt** | **String** | このデータポイントが作成された日時 |  |
|**dataType** | **String** | データタイプ |  |
|**dataId** | **String** | データID |  |
|**data** | **Object** | データのペイロード。ペイロードのJSON表現はデータタイプによって異なります。 [詳説iSCP 1.0](https://docs.intdash.jp/manual/iscp1-essentials/latest/ja/iscp1-essentials-ja.pdf) の「付録: データタイプとペイロードの定義」を参照してください。 iscpv1に当てはまらない場合、下記のフォーマットで固定となります。  &#x60;&#x60;&#x60; {   \&quot;d\&quot;: \&quot;データ本体のBase64表記\&quot; } &#x60;&#x60;&#x60; |  |



