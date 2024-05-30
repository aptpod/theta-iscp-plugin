

# CreateOAuth2ClientAuthorizationCodeRequestAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | 名前 |  [optional] |
|**grantType** | **String** | グラントタイプ |  [optional] |
|**redirectUris** | **List&lt;String&gt;** |  |  |
|**tokenEndpointAuthMethod** | [**TokenEndpointAuthMethodEnum**](#TokenEndpointAuthMethodEnum) | トークンエンドポイントの認証方式 |  [optional] |
|**tlsClientAuthSubjectDn** | **String** | TLSクライアント認証のサブジェクトDN |  [optional] |



## Enum: TokenEndpointAuthMethodEnum

| Name | Value |
|---- | -----|
| CLIENT_SECRET_BASIC | &quot;client_secret_basic&quot; |
| NONE | &quot;none&quot; |



