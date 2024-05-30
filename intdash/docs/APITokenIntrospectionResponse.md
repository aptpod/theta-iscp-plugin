

# APITokenIntrospectionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | &#x60;true&#x60; の場合、このAPIトークンは有効です。 |  |
|**tenantId** | **Long** | テナントID。デフォルトテナント以外を対象とする場合にのみ返されます。 |  [optional] |
|**userUuid** | **String** | ユーザーのUUID |  [optional] |
|**scopes** | [**List&lt;Scope&gt;**](Scope.md) | APIトークンが認可されているスコープ |  [optional] |
|**expiredAt** | **Date** | APIトークンの有効期限 |  [optional] |
|**createdAt** | **Date** | APIトークンの作成日時 |  [optional] |



