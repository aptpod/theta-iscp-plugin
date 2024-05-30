/*
 * intdash API specification
 * ## ベースURL  ベースURLは以下のとおりです。APIエンドポイントはこのベースURLから始まります。  ``` https://<host>/api ``` エンドポイント例: ``` https://example.intdash.jp/api/v1/measurements https://example.intdash.jp/api/media/videos ```  ## レスポンスのステータスコード  サーバーからクライアントに返却されるHTTPレスポンスのステータスコードは以下のとおりです。   | コード                    | 説明                                                                  | |:--------------------------|:----------------------------------------------------------------------| | 101 Switching Protocols   | サーバーはプロトコルを切り替えます。                                  | | 200 OK                    | リクエストは成功しました。                                            | | 201 Created               | 新しいリソースが作成されました。                                      | | 204 No Content            | リクエストは成功しました。返却するコンテンツはありません。            | | 400 Bad Request           | 構文が正しくないなどの理由により、リクエストは処理できませんでした。  | | 401 Unauthorized          | リクエストには認証が必要です。                                        | | 403 Forbidden             | アクセス権がないなどの理由により、リクエストは拒否されました。        | | 404 Not Found             | APIまたはリソースが見つかりません。                                   | | 405 Method Not Allowed    | 指定されたメソッドは許可されていません。                              | | 409 Conflict              | 既存のリソースとのコンフリクトのため、リクエストは失敗しました。      | | 500 Internal Server Error | サーバーで予期しないエラーが発生したため、リクエストは失敗しました。  |   ## 注意 リクエストボディのJSONでは、キーの大文字と小文字は区別されません。 従って、以下の2つのリクエストは同じものと見なされます。  ```  {   \"username\" : \"username\",   \"password\" : \"password\" }  ```   ```  {   \"Username\" : \"username\",   \"Password\" : \"password\" }  ```
 *
 * The version of the OpenAPI document: v2.4.0-next-4a4316946
 * Contact: VM2M-support@aptpod.co.jp
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.aptpod.JSON;

/**
 * IssueToken200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T17:57:54.384855300+09:00[GMT+09:00]")
public class IssueToken200Response {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expires_in";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private Long expiresIn;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refresh_token";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
  private String refreshToken;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN_EXPIRES_IN = "refresh_token_expires_in";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN_EXPIRES_IN)
  private Long refreshTokenExpiresIn;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "token_type";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private String tokenType;

  public IssueToken200Response() {
  }

  public IssueToken200Response accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * アクセストークン
   * @return accessToken
  **/
  @javax.annotation.Nullable
  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public IssueToken200Response expiresIn(Long expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * アクセストークンの有効期限（期限切れまでの秒数）
   * @return expiresIn
  **/
  @javax.annotation.Nullable
  public Long getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
  }


  public IssueToken200Response refreshToken(String refreshToken) {
    
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * リフレッシュトークン
   * @return refreshToken
  **/
  @javax.annotation.Nullable
  public String getRefreshToken() {
    return refreshToken;
  }


  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  public IssueToken200Response refreshTokenExpiresIn(Long refreshTokenExpiresIn) {
    
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    return this;
  }

   /**
   * リフレッシュトークンの有効期限（期限切れまでの秒数）
   * @return refreshTokenExpiresIn
  **/
  @javax.annotation.Nullable
  public Long getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }


  public void setRefreshTokenExpiresIn(Long refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }


  public IssueToken200Response scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * スコープのリスト（スペース区切り）。 - temporary     - 一時的なユーザーを表します。
   * @return scope
  **/
  @javax.annotation.Nullable
  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public IssueToken200Response tokenType(String tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * トークンタイプ。 &#x60;Bearer&#x60; に固定。
   * @return tokenType
  **/
  @javax.annotation.Nullable
  public String getTokenType() {
    return tokenType;
  }


  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the IssueToken200Response instance itself
   */
  public IssueToken200Response putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueToken200Response issueToken200Response = (IssueToken200Response) o;
    return Objects.equals(this.accessToken, issueToken200Response.accessToken) &&
        Objects.equals(this.expiresIn, issueToken200Response.expiresIn) &&
        Objects.equals(this.refreshToken, issueToken200Response.refreshToken) &&
        Objects.equals(this.refreshTokenExpiresIn, issueToken200Response.refreshTokenExpiresIn) &&
        Objects.equals(this.scope, issueToken200Response.scope) &&
        Objects.equals(this.tokenType, issueToken200Response.tokenType)&&
        Objects.equals(this.additionalProperties, issueToken200Response.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, refreshToken, refreshTokenExpiresIn, scope, tokenType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueToken200Response {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    refreshTokenExpiresIn: ").append(toIndentedString(refreshTokenExpiresIn)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("access_token");
    openapiFields.add("expires_in");
    openapiFields.add("refresh_token");
    openapiFields.add("refresh_token_expires_in");
    openapiFields.add("scope");
    openapiFields.add("token_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueToken200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IssueToken200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueToken200Response is not found in the empty JSON string", IssueToken200Response.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("access_token") != null && !jsonObj.get("access_token").isJsonNull()) && !jsonObj.get("access_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_token").toString()));
      }
      if ((jsonObj.get("refresh_token") != null && !jsonObj.get("refresh_token").isJsonNull()) && !jsonObj.get("refresh_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refresh_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refresh_token").toString()));
      }
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if ((jsonObj.get("token_type") != null && !jsonObj.get("token_type").isJsonNull()) && !jsonObj.get("token_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueToken200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueToken200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueToken200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueToken200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueToken200Response>() {
           @Override
           public void write(JsonWriter out, IssueToken200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueToken200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IssueToken200Response instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueToken200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueToken200Response
  * @throws IOException if the JSON string is invalid with respect to IssueToken200Response
  */
  public static IssueToken200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueToken200Response.class);
  }

 /**
  * Convert an instance of IssueToken200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

