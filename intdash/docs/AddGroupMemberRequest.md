

# AddGroupMemberRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userEmailAddress** | **String** | ユーザーのメールアドレス。&#x60;user_uuid&#x60; といずれか必須です。&#x60;user_uuid&#x60; を優先します。 |  [optional] |
|**userUuid** | **String** | ユーザーのUUID。&#x60;user_email_address&#x60; といずれか必須です。&#x60;user_uuid&#x60; を優先します。 |  [optional] |
|**roleUuids** | **List&lt;String&gt;** | ユーザーに割り当てるロールのUUID。オーナーのロールUUIDは変更できません。 |  |



