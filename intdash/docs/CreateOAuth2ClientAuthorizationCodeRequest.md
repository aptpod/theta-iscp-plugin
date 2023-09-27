

# CreateOAuth2ClientAuthorizationCodeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | 名前 |  |
|**grantType** | [**GrantTypeEnum**](#GrantTypeEnum) | グラントタイプ |  |
|**redirectUris** | **List&lt;String&gt;** |  |  |
|**tokenEndpointAuthMethod** | [**TokenEndpointAuthMethodEnum**](#TokenEndpointAuthMethodEnum) | トークンエンドポイントの認証方式 |  |
|**tlsClientAuthSubjectDn** | **String** | TLSクライアント認証のサブジェクトDN |  [optional] |



## Enum: GrantTypeEnum

| Name | Value |
|---- | -----|
| AUTHORIZATION_CODE | &quot;authorization_code&quot; |
| CLIENT_CREDENTIALS | &quot;client_credentials&quot; |



## Enum: TokenEndpointAuthMethodEnum

| Name | Value |
|---- | -----|
| CLIENT_SECRET_POST | &quot;client_secret_post&quot; |
| TLS_CLIENT_AUTH | &quot;tls_client_auth&quot; |



