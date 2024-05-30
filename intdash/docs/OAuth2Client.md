

# OAuth2Client


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | OAuth2クライアントID |  |
|**name** | **String** | 名前 |  |
|**grantTypes** | **List&lt;OAuth2ClientGrantType&gt;** | グラントタイプ |  |
|**tokenEndpointAuthMethod** | [**TokenEndpointAuthMethodEnum**](#TokenEndpointAuthMethodEnum) | トークンエンドポイントの認証方式 |  |
|**redirectUris** | **List&lt;String&gt;** | 認可後のリダイレクト先URI |  |
|**responseTypes** | **List&lt;OAuth2ClientResponseType&gt;** | レスポンスタイプ |  |
|**scopes** | **List&lt;String&gt;** | スコープ |  |
|**audiences** | **List&lt;String&gt;** | オーディエンス |  |
|**tlsClientAuthSubjectDn** | **String** | TLSクライアント認証のサブジェクトDN |  |



## Enum: TokenEndpointAuthMethodEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| CLIENT_SECRET_POST | &quot;client_secret_post&quot; |
| CLIENT_SECRET_BASIC | &quot;client_secret_basic&quot; |
| TLS_CLIENT_AUTH | &quot;tls_client_auth&quot; |



