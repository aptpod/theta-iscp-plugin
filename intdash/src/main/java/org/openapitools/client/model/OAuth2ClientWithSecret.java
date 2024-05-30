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
import java.util.ArrayList;
import java.util.List;

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
 * OAuth2ClientWithSecret
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T17:57:54.384855300+09:00[GMT+09:00]")
public class OAuth2ClientWithSecret {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_GRANT_TYPES = "grant_types";
  @SerializedName(SERIALIZED_NAME_GRANT_TYPES)
  private List<String> grantTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOKEN_ENDPOINT_AUTH_METHOD = "token_endpoint_auth_method";
  @SerializedName(SERIALIZED_NAME_TOKEN_ENDPOINT_AUTH_METHOD)
  private String tokenEndpointAuthMethod;

  public static final String SERIALIZED_NAME_REDIRECT_URIS = "redirect_uris";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URIS)
  private List<String> redirectUris = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESPONSE_TYPES = "response_types";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TYPES)
  private List<String> responseTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private List<String> scopes = new ArrayList<>();

  public static final String SERIALIZED_NAME_AUDIENCES = "audiences";
  @SerializedName(SERIALIZED_NAME_AUDIENCES)
  private List<String> audiences = new ArrayList<>();

  public static final String SERIALIZED_NAME_TLS_CLIENT_AUTH_SUBJECT_DN = "tls_client_auth_subject_dn";
  @SerializedName(SERIALIZED_NAME_TLS_CLIENT_AUTH_SUBJECT_DN)
  private String tlsClientAuthSubjectDn;

  public static final String SERIALIZED_NAME_CLIENT_SECRET = "client_secret";
  @SerializedName(SERIALIZED_NAME_CLIENT_SECRET)
  private String clientSecret;

  public OAuth2ClientWithSecret() {
  }

  public OAuth2ClientWithSecret clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * OAuth2クライアントID
   * @return clientId
  **/
  @javax.annotation.Nonnull
  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public OAuth2ClientWithSecret name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 名前
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OAuth2ClientWithSecret grantTypes(List<String> grantTypes) {
    
    this.grantTypes = grantTypes;
    return this;
  }

  public OAuth2ClientWithSecret addGrantTypesItem(String grantTypesItem) {
    if (this.grantTypes == null) {
      this.grantTypes = new ArrayList<>();
    }
    this.grantTypes.add(grantTypesItem);
    return this;
  }

   /**
   * グラントタイプ
   * @return grantTypes
  **/
  @javax.annotation.Nonnull
  public List<String> getGrantTypes() {
    return grantTypes;
  }


  public void setGrantTypes(List<String> grantTypes) {
    this.grantTypes = grantTypes;
  }


  public OAuth2ClientWithSecret tokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
    return this;
  }

   /**
   * トークンエンドポイントの認証方式
   * @return tokenEndpointAuthMethod
  **/
  @javax.annotation.Nonnull
  public String getTokenEndpointAuthMethod() {
    return tokenEndpointAuthMethod;
  }


  public void setTokenEndpointAuthMethod(String tokenEndpointAuthMethod) {
    this.tokenEndpointAuthMethod = tokenEndpointAuthMethod;
  }


  public OAuth2ClientWithSecret redirectUris(List<String> redirectUris) {
    
    this.redirectUris = redirectUris;
    return this;
  }

  public OAuth2ClientWithSecret addRedirectUrisItem(String redirectUrisItem) {
    if (this.redirectUris == null) {
      this.redirectUris = new ArrayList<>();
    }
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

   /**
   * 認可後のリダイレクト先URI
   * @return redirectUris
  **/
  @javax.annotation.Nonnull
  public List<String> getRedirectUris() {
    return redirectUris;
  }


  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }


  public OAuth2ClientWithSecret responseTypes(List<String> responseTypes) {
    
    this.responseTypes = responseTypes;
    return this;
  }

  public OAuth2ClientWithSecret addResponseTypesItem(String responseTypesItem) {
    if (this.responseTypes == null) {
      this.responseTypes = new ArrayList<>();
    }
    this.responseTypes.add(responseTypesItem);
    return this;
  }

   /**
   * レスポンスタイプ
   * @return responseTypes
  **/
  @javax.annotation.Nonnull
  public List<String> getResponseTypes() {
    return responseTypes;
  }


  public void setResponseTypes(List<String> responseTypes) {
    this.responseTypes = responseTypes;
  }


  public OAuth2ClientWithSecret scopes(List<String> scopes) {
    
    this.scopes = scopes;
    return this;
  }

  public OAuth2ClientWithSecret addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * スコープ
   * @return scopes
  **/
  @javax.annotation.Nonnull
  public List<String> getScopes() {
    return scopes;
  }


  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  public OAuth2ClientWithSecret audiences(List<String> audiences) {
    
    this.audiences = audiences;
    return this;
  }

  public OAuth2ClientWithSecret addAudiencesItem(String audiencesItem) {
    if (this.audiences == null) {
      this.audiences = new ArrayList<>();
    }
    this.audiences.add(audiencesItem);
    return this;
  }

   /**
   * オーディエンス
   * @return audiences
  **/
  @javax.annotation.Nonnull
  public List<String> getAudiences() {
    return audiences;
  }


  public void setAudiences(List<String> audiences) {
    this.audiences = audiences;
  }


  public OAuth2ClientWithSecret tlsClientAuthSubjectDn(String tlsClientAuthSubjectDn) {
    
    this.tlsClientAuthSubjectDn = tlsClientAuthSubjectDn;
    return this;
  }

   /**
   * TLSクライアント認証のサブジェクトDN
   * @return tlsClientAuthSubjectDn
  **/
  @javax.annotation.Nonnull
  public String getTlsClientAuthSubjectDn() {
    return tlsClientAuthSubjectDn;
  }


  public void setTlsClientAuthSubjectDn(String tlsClientAuthSubjectDn) {
    this.tlsClientAuthSubjectDn = tlsClientAuthSubjectDn;
  }


  public OAuth2ClientWithSecret clientSecret(String clientSecret) {
    
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * token_endpoint_auth_methodが &#x60;none&#x60; 以外だったら required
   * @return clientSecret
  **/
  @javax.annotation.Nullable
  public String getClientSecret() {
    return clientSecret;
  }


  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
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
   * @return the OAuth2ClientWithSecret instance itself
   */
  public OAuth2ClientWithSecret putAdditionalProperty(String key, Object value) {
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
    OAuth2ClientWithSecret oauth2ClientWithSecret = (OAuth2ClientWithSecret) o;
    return Objects.equals(this.clientId, oauth2ClientWithSecret.clientId) &&
        Objects.equals(this.name, oauth2ClientWithSecret.name) &&
        Objects.equals(this.grantTypes, oauth2ClientWithSecret.grantTypes) &&
        Objects.equals(this.tokenEndpointAuthMethod, oauth2ClientWithSecret.tokenEndpointAuthMethod) &&
        Objects.equals(this.redirectUris, oauth2ClientWithSecret.redirectUris) &&
        Objects.equals(this.responseTypes, oauth2ClientWithSecret.responseTypes) &&
        Objects.equals(this.scopes, oauth2ClientWithSecret.scopes) &&
        Objects.equals(this.audiences, oauth2ClientWithSecret.audiences) &&
        Objects.equals(this.tlsClientAuthSubjectDn, oauth2ClientWithSecret.tlsClientAuthSubjectDn) &&
        Objects.equals(this.clientSecret, oauth2ClientWithSecret.clientSecret)&&
        Objects.equals(this.additionalProperties, oauth2ClientWithSecret.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, name, grantTypes, tokenEndpointAuthMethod, redirectUris, responseTypes, scopes, audiences, tlsClientAuthSubjectDn, clientSecret, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2ClientWithSecret {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    grantTypes: ").append(toIndentedString(grantTypes)).append("\n");
    sb.append("    tokenEndpointAuthMethod: ").append(toIndentedString(tokenEndpointAuthMethod)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    responseTypes: ").append(toIndentedString(responseTypes)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    audiences: ").append(toIndentedString(audiences)).append("\n");
    sb.append("    tlsClientAuthSubjectDn: ").append(toIndentedString(tlsClientAuthSubjectDn)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
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
    openapiFields.add("client_id");
    openapiFields.add("name");
    openapiFields.add("grant_types");
    openapiFields.add("token_endpoint_auth_method");
    openapiFields.add("redirect_uris");
    openapiFields.add("response_types");
    openapiFields.add("scopes");
    openapiFields.add("audiences");
    openapiFields.add("tls_client_auth_subject_dn");
    openapiFields.add("client_secret");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("client_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("grant_types");
    openapiRequiredFields.add("token_endpoint_auth_method");
    openapiRequiredFields.add("redirect_uris");
    openapiRequiredFields.add("response_types");
    openapiRequiredFields.add("scopes");
    openapiRequiredFields.add("audiences");
    openapiRequiredFields.add("tls_client_auth_subject_dn");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OAuth2ClientWithSecret
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OAuth2ClientWithSecret.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OAuth2ClientWithSecret is not found in the empty JSON string", OAuth2ClientWithSecret.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OAuth2ClientWithSecret.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("client_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("grant_types") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("grant_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `grant_types` to be an array in the JSON string but got `%s`", jsonObj.get("grant_types").toString()));
      }
      if (!jsonObj.get("token_endpoint_auth_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_endpoint_auth_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_endpoint_auth_method").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("redirect_uris") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("redirect_uris").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirect_uris` to be an array in the JSON string but got `%s`", jsonObj.get("redirect_uris").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("response_types") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("response_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `response_types` to be an array in the JSON string but got `%s`", jsonObj.get("response_types").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("scopes") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("scopes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scopes` to be an array in the JSON string but got `%s`", jsonObj.get("scopes").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("audiences") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("audiences").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `audiences` to be an array in the JSON string but got `%s`", jsonObj.get("audiences").toString()));
      }
      if (!jsonObj.get("tls_client_auth_subject_dn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tls_client_auth_subject_dn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tls_client_auth_subject_dn").toString()));
      }
      if ((jsonObj.get("client_secret") != null && !jsonObj.get("client_secret").isJsonNull()) && !jsonObj.get("client_secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_secret").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OAuth2ClientWithSecret.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OAuth2ClientWithSecret' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OAuth2ClientWithSecret> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OAuth2ClientWithSecret.class));

       return (TypeAdapter<T>) new TypeAdapter<OAuth2ClientWithSecret>() {
           @Override
           public void write(JsonWriter out, OAuth2ClientWithSecret value) throws IOException {
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
           public OAuth2ClientWithSecret read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OAuth2ClientWithSecret instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OAuth2ClientWithSecret given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OAuth2ClientWithSecret
  * @throws IOException if the JSON string is invalid with respect to OAuth2ClientWithSecret
  */
  public static OAuth2ClientWithSecret fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OAuth2ClientWithSecret.class);
  }

 /**
  * Convert an instance of OAuth2ClientWithSecret to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
