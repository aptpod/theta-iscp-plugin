

# UserPassword


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attemptCount** | **Long** | ログイン失敗回数。ログインに成功すると0にリセットされます。 |  |
|**isTemporary** | **Boolean** | &#x60;true&#x60; の場合、このユーザーのパスワードは一時パスワードです。 |  |
|**temporaryPassword** | **String** | 一時パスワード |  [optional] |
|**lastAttemptAt** | **Date** | 最終ログイン試行日時 |  |
|**expiredAt** | **Date** | パスワードの有効期限 |  [optional] |
|**createdAt** | **Date** | 作成日時 |  |
|**updatedAt** | **Date** | 最終更新日時 |  |



