

# User


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | ユーザーのUUID |  |
|**name** | **String** | ユーザーの名前 |  |
|**nickname** | **String** | ユーザーの表示名 |  |
|**disabled** | **Boolean** | * &#x60;true&#x60;: このユーザーは無効化されています * &#x60;false&#x60; : このユーザーは有効です。 |  |
|**description** | **String** | ユーザーの説明 |  |
|**isSuper** | **Boolean** | &#x60;true&#x60; の場合、このユーザーはスーパーユーザーです。 |  |
|**emails** | [**List&lt;UserEmail&gt;**](UserEmail.md) |  |  |
|**lastSignInAt** | **Date** | 最後にログインした日時 |  |
|**roles** | **List&lt;String&gt;** | 割り当てられたロールのUUID |  |
|**password** | [**UserPassword**](UserPassword.md) |  |  |
|**createdAt** | **Date** | 作成日時 |  |
|**updatedAt** | **Date** | 最終更新日時 |  |



