

# ErrorProblem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | エラーのタイプ |  |
|**title** | **String** | エラーのタイトル |  |
|**properties** | **Object** | 無効なパラメーターについての情報 |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ABOUT_BLANK | &quot;about:blank&quot; |
| INVALID_REQUEST | &quot;invalid_request&quot; |
| CONFLICT | &quot;conflict&quot; |
| FORBIDDEN | &quot;forbidden&quot; |
| ACCOUNT_LOCKED | &quot;account_locked&quot; |
| EXCEEDED_MAX_GROUPS_COUNT | &quot;exceeded_max_groups_count&quot; |
| EXCEEDED_MAX_PROJECTS_COUNT_PER_GROUP | &quot;exceeded_max_projects_count_per_group&quot; |
| CONFLICT_PROJECT_EDGE_UUID | &quot;conflict_project_edge_uuid&quot; |
| CONFLICT_PROJECT_EDGE_NICKNAME | &quot;conflict_project_edge_nickname&quot; |



