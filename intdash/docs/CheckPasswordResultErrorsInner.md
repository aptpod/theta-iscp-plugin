

# CheckPasswordResultErrorsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | ポリシーの種類 |  |
|**value** | **String** | ポリシーで指定されている数値 |  [optional] |
|**message** | **String** | ポリシーに関する説明 |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MIN_LENGTH | &quot;min_length&quot; |
| MAX_LENGTH | &quot;max_length&quot; |
| MIN_SYMBOL_NUM | &quot;min_symbol_num&quot; |
| MIN_UPPERCASE_ALPHABET_NUM | &quot;min_uppercase_alphabet_num&quot; |
| MIN_LOWERCASE_ALPHABET_NUM | &quot;min_lowercase_alphabet_num&quot; |
| MIN_NUMBER_NUM | &quot;min_number_num&quot; |
| MIN_LENGTHMIN_ALPHABET_NUM | &quot;min_lengthmin_alphabet_num&quot; |
| ALLOWED_SAME_USERNAME | &quot;allowed_same_username&quot; |
| ALLOWED_SAME_PREVIOUS_PASSWORD | &quot;allowed_same_previous_password&quot; |



