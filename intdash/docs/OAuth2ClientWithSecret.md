

# OAuth2ClientWithSecret


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | OAuth2クライアントID |  |
|**name** | **String** | 名前 |  |
|**grantTypes** | **List&lt;String&gt;** | グラントタイプ |  |
|**tokenEndpointAuthMethod** | **String** | トークンエンドポイントの認証方式 |  |
|**redirectUris** | **List&lt;String&gt;** | 認可後のリダイレクト先URI |  |
|**responseTypes** | **List&lt;String&gt;** | レスポンスタイプ |  |
|**scopes** | **List&lt;String&gt;** | スコープ |  |
|**audiences** | **List&lt;String&gt;** | オーディエンス |  |
|**tlsClientAuthSubjectDn** | **String** | TLSクライアント認証のサブジェクトDN |  |
|**clientSecret** | **String** | token_endpoint_auth_methodが &#x60;none&#x60; 以外だったら required |  [optional] |



