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
import org.openapitools.client.model.SignalConversion;
import org.openapitools.client.model.SignalDisplay;

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
 * UpdateSignalRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T17:57:54.384855300+09:00[GMT+09:00]")
public class UpdateSignalRequest {
  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private Integer channel;

  public static final String SERIALIZED_NAME_CONVERSION = "conversion";
  @SerializedName(SERIALIZED_NAME_CONVERSION)
  private SignalConversion conversion;

  public static final String SERIALIZED_NAME_DATA_ID = "data_id";
  @SerializedName(SERIALIZED_NAME_DATA_ID)
  private String dataId;

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private Integer dataType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private SignalDisplay display;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public UpdateSignalRequest() {
  }

  public UpdateSignalRequest channel(Integer channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * チャンネル
   * @return channel
  **/
  @javax.annotation.Nullable
  public Integer getChannel() {
    return channel;
  }


  public void setChannel(Integer channel) {
    this.channel = channel;
  }


  public UpdateSignalRequest conversion(SignalConversion conversion) {
    
    this.conversion = conversion;
    return this;
  }

   /**
   * Get conversion
   * @return conversion
  **/
  @javax.annotation.Nullable
  public SignalConversion getConversion() {
    return conversion;
  }


  public void setConversion(SignalConversion conversion) {
    this.conversion = conversion;
  }


  public UpdateSignalRequest dataId(String dataId) {
    
    this.dataId = dataId;
    return this;
  }

   /**
   * データID
   * @return dataId
  **/
  @javax.annotation.Nullable
  public String getDataId() {
    return dataId;
  }


  public void setDataId(String dataId) {
    this.dataId = dataId;
  }


  public UpdateSignalRequest dataType(Integer dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * データタイプ
   * @return dataType
  **/
  @javax.annotation.Nullable
  public Integer getDataType() {
    return dataType;
  }


  public void setDataType(Integer dataType) {
    this.dataType = dataType;
  }


  public UpdateSignalRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 信号定義の説明
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateSignalRequest display(SignalDisplay display) {
    
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  @javax.annotation.Nullable
  public SignalDisplay getDisplay() {
    return display;
  }


  public void setDisplay(SignalDisplay display) {
    this.display = display;
  }


  public UpdateSignalRequest label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * 信号定義のラベル
   * @return label
  **/
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
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
   * @return the UpdateSignalRequest instance itself
   */
  public UpdateSignalRequest putAdditionalProperty(String key, Object value) {
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
    UpdateSignalRequest updateSignalRequest = (UpdateSignalRequest) o;
    return Objects.equals(this.channel, updateSignalRequest.channel) &&
        Objects.equals(this.conversion, updateSignalRequest.conversion) &&
        Objects.equals(this.dataId, updateSignalRequest.dataId) &&
        Objects.equals(this.dataType, updateSignalRequest.dataType) &&
        Objects.equals(this.description, updateSignalRequest.description) &&
        Objects.equals(this.display, updateSignalRequest.display) &&
        Objects.equals(this.label, updateSignalRequest.label)&&
        Objects.equals(this.additionalProperties, updateSignalRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, conversion, dataId, dataType, description, display, label, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSignalRequest {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    conversion: ").append(toIndentedString(conversion)).append("\n");
    sb.append("    dataId: ").append(toIndentedString(dataId)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
    openapiFields.add("channel");
    openapiFields.add("conversion");
    openapiFields.add("data_id");
    openapiFields.add("data_type");
    openapiFields.add("description");
    openapiFields.add("display");
    openapiFields.add("label");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateSignalRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateSignalRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateSignalRequest is not found in the empty JSON string", UpdateSignalRequest.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `conversion`
      if (jsonObj.get("conversion") != null && !jsonObj.get("conversion").isJsonNull()) {
        SignalConversion.validateJsonObject(jsonObj.getAsJsonObject("conversion"));
      }
      if ((jsonObj.get("data_id") != null && !jsonObj.get("data_id").isJsonNull()) && !jsonObj.get("data_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_id").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `display`
      if (jsonObj.get("display") != null && !jsonObj.get("display").isJsonNull()) {
        SignalDisplay.validateJsonObject(jsonObj.getAsJsonObject("display"));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateSignalRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateSignalRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateSignalRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateSignalRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateSignalRequest>() {
           @Override
           public void write(JsonWriter out, UpdateSignalRequest value) throws IOException {
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
           public UpdateSignalRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UpdateSignalRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UpdateSignalRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateSignalRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateSignalRequest
  */
  public static UpdateSignalRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateSignalRequest.class);
  }

 /**
  * Convert an instance of UpdateSignalRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
