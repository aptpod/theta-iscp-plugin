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
import java.util.Date;
import org.openapitools.client.model.MeasurementBaseTimeType;

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
 * MeasCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T17:57:54.384855300+09:00[GMT+09:00]")
public class MeasCreate {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BASETIME = "basetime";
  @SerializedName(SERIALIZED_NAME_BASETIME)
  private Date basetime;

  public static final String SERIALIZED_NAME_BASETIME_TYPE = "basetime_type";
  @SerializedName(SERIALIZED_NAME_BASETIME_TYPE)
  private MeasurementBaseTimeType basetimeType;

  public static final String SERIALIZED_NAME_EDGE_UUID = "edge_uuid";
  @SerializedName(SERIALIZED_NAME_EDGE_UUID)
  private String edgeUuid;

  public static final String SERIALIZED_NAME_PROTECTED = "protected";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_PROTECTED)
  private Boolean _protected;

  public MeasCreate() {
  }

  public MeasCreate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 計測の名前
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public MeasCreate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 計測の説明
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public MeasCreate basetime(Date basetime) {
    
    this.basetime = basetime;
    return this;
  }

   /**
   * 計測の基準時刻（計測が開始された時刻）
   * @return basetime
  **/
  @javax.annotation.Nonnull
  public Date getBasetime() {
    return basetime;
  }


  public void setBasetime(Date basetime) {
    this.basetime = basetime;
  }


  public MeasCreate basetimeType(MeasurementBaseTimeType basetimeType) {
    
    this.basetimeType = basetimeType;
    return this;
  }

   /**
   * Get basetimeType
   * @return basetimeType
  **/
  @javax.annotation.Nonnull
  public MeasurementBaseTimeType getBasetimeType() {
    return basetimeType;
  }


  public void setBasetimeType(MeasurementBaseTimeType basetimeType) {
    this.basetimeType = basetimeType;
  }


  public MeasCreate edgeUuid(String edgeUuid) {
    
    this.edgeUuid = edgeUuid;
    return this;
  }

   /**
   * この計測に関連付けられたエッジのUUID
   * @return edgeUuid
  **/
  @javax.annotation.Nonnull
  public String getEdgeUuid() {
    return edgeUuid;
  }


  public void setEdgeUuid(String edgeUuid) {
    this.edgeUuid = edgeUuid;
  }


  @Deprecated
  public MeasCreate _protected(Boolean _protected) {
    
    this._protected = _protected;
    return this;
  }

   /**
   * &#x60;true&#x60; の場合、計測は保護されます。保護されている計測は削除できません。
   * @return _protected
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  public Boolean getProtected() {
    return _protected;
  }


  @Deprecated
  public void setProtected(Boolean _protected) {
    this._protected = _protected;
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
   * @return the MeasCreate instance itself
   */
  public MeasCreate putAdditionalProperty(String key, Object value) {
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
    MeasCreate measCreate = (MeasCreate) o;
    return Objects.equals(this.name, measCreate.name) &&
        Objects.equals(this.description, measCreate.description) &&
        Objects.equals(this.basetime, measCreate.basetime) &&
        Objects.equals(this.basetimeType, measCreate.basetimeType) &&
        Objects.equals(this.edgeUuid, measCreate.edgeUuid) &&
        Objects.equals(this._protected, measCreate._protected)&&
        Objects.equals(this.additionalProperties, measCreate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, basetime, basetimeType, edgeUuid, _protected, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasCreate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    basetime: ").append(toIndentedString(basetime)).append("\n");
    sb.append("    basetimeType: ").append(toIndentedString(basetimeType)).append("\n");
    sb.append("    edgeUuid: ").append(toIndentedString(edgeUuid)).append("\n");
    sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("basetime");
    openapiFields.add("basetime_type");
    openapiFields.add("edge_uuid");
    openapiFields.add("protected");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("basetime");
    openapiRequiredFields.add("basetime_type");
    openapiRequiredFields.add("edge_uuid");
    openapiRequiredFields.add("protected");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MeasCreate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MeasCreate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MeasCreate is not found in the empty JSON string", MeasCreate.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MeasCreate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("edge_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `edge_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("edge_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MeasCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MeasCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MeasCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MeasCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<MeasCreate>() {
           @Override
           public void write(JsonWriter out, MeasCreate value) throws IOException {
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
           public MeasCreate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MeasCreate instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MeasCreate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MeasCreate
  * @throws IOException if the JSON string is invalid with respect to MeasCreate
  */
  public static MeasCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MeasCreate.class);
  }

 /**
  * Convert an instance of MeasCreate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
