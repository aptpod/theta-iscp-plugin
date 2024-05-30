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
 * &#x60;error_type&#x60; が &#x60;converted_error&#x60; である場合の追加情報
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T17:57:54.384855300+09:00[GMT+09:00]")
public class ErrorConvertedAllOfErrorExtra {
  public static final String SERIALIZED_NAME_SIGNAL_LABEL = "signal_label";
  @SerializedName(SERIALIZED_NAME_SIGNAL_LABEL)
  private String signalLabel;

  public static final String SERIALIZED_NAME_SIGNAL_DATA_ID = "signal_data_id";
  @SerializedName(SERIALIZED_NAME_SIGNAL_DATA_ID)
  private String signalDataId;

  public static final String SERIALIZED_NAME_SIGNAL_CHANNEL = "signal_channel";
  @SerializedName(SERIALIZED_NAME_SIGNAL_CHANNEL)
  private Integer signalChannel;

  public static final String SERIALIZED_NAME_SIGNAL_DATA_TYPE = "signal_data_type";
  @SerializedName(SERIALIZED_NAME_SIGNAL_DATA_TYPE)
  private Integer signalDataType;

  public ErrorConvertedAllOfErrorExtra() {
  }

  public ErrorConvertedAllOfErrorExtra signalLabel(String signalLabel) {
    
    this.signalLabel = signalLabel;
    return this;
  }

   /**
   * 信号定義のラベル
   * @return signalLabel
  **/
  @javax.annotation.Nonnull
  public String getSignalLabel() {
    return signalLabel;
  }


  public void setSignalLabel(String signalLabel) {
    this.signalLabel = signalLabel;
  }


  public ErrorConvertedAllOfErrorExtra signalDataId(String signalDataId) {
    
    this.signalDataId = signalDataId;
    return this;
  }

   /**
   * 信号定義のデータID
   * @return signalDataId
  **/
  @javax.annotation.Nonnull
  public String getSignalDataId() {
    return signalDataId;
  }


  public void setSignalDataId(String signalDataId) {
    this.signalDataId = signalDataId;
  }


  public ErrorConvertedAllOfErrorExtra signalChannel(Integer signalChannel) {
    
    this.signalChannel = signalChannel;
    return this;
  }

   /**
   * 信号定義のチャンネル
   * @return signalChannel
  **/
  @javax.annotation.Nonnull
  public Integer getSignalChannel() {
    return signalChannel;
  }


  public void setSignalChannel(Integer signalChannel) {
    this.signalChannel = signalChannel;
  }


  public ErrorConvertedAllOfErrorExtra signalDataType(Integer signalDataType) {
    
    this.signalDataType = signalDataType;
    return this;
  }

   /**
   * 信号定義のデータタイプ
   * @return signalDataType
  **/
  @javax.annotation.Nonnull
  public Integer getSignalDataType() {
    return signalDataType;
  }


  public void setSignalDataType(Integer signalDataType) {
    this.signalDataType = signalDataType;
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
   * @return the ErrorConvertedAllOfErrorExtra instance itself
   */
  public ErrorConvertedAllOfErrorExtra putAdditionalProperty(String key, Object value) {
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
    ErrorConvertedAllOfErrorExtra errorConvertedAllOfErrorExtra = (ErrorConvertedAllOfErrorExtra) o;
    return Objects.equals(this.signalLabel, errorConvertedAllOfErrorExtra.signalLabel) &&
        Objects.equals(this.signalDataId, errorConvertedAllOfErrorExtra.signalDataId) &&
        Objects.equals(this.signalChannel, errorConvertedAllOfErrorExtra.signalChannel) &&
        Objects.equals(this.signalDataType, errorConvertedAllOfErrorExtra.signalDataType)&&
        Objects.equals(this.additionalProperties, errorConvertedAllOfErrorExtra.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signalLabel, signalDataId, signalChannel, signalDataType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorConvertedAllOfErrorExtra {\n");
    sb.append("    signalLabel: ").append(toIndentedString(signalLabel)).append("\n");
    sb.append("    signalDataId: ").append(toIndentedString(signalDataId)).append("\n");
    sb.append("    signalChannel: ").append(toIndentedString(signalChannel)).append("\n");
    sb.append("    signalDataType: ").append(toIndentedString(signalDataType)).append("\n");
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
    openapiFields.add("signal_label");
    openapiFields.add("signal_data_id");
    openapiFields.add("signal_channel");
    openapiFields.add("signal_data_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("signal_label");
    openapiRequiredFields.add("signal_data_id");
    openapiRequiredFields.add("signal_channel");
    openapiRequiredFields.add("signal_data_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ErrorConvertedAllOfErrorExtra
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ErrorConvertedAllOfErrorExtra.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ErrorConvertedAllOfErrorExtra is not found in the empty JSON string", ErrorConvertedAllOfErrorExtra.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ErrorConvertedAllOfErrorExtra.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("signal_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signal_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signal_label").toString()));
      }
      if (!jsonObj.get("signal_data_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signal_data_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signal_data_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ErrorConvertedAllOfErrorExtra.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ErrorConvertedAllOfErrorExtra' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ErrorConvertedAllOfErrorExtra> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ErrorConvertedAllOfErrorExtra.class));

       return (TypeAdapter<T>) new TypeAdapter<ErrorConvertedAllOfErrorExtra>() {
           @Override
           public void write(JsonWriter out, ErrorConvertedAllOfErrorExtra value) throws IOException {
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
           public ErrorConvertedAllOfErrorExtra read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ErrorConvertedAllOfErrorExtra instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ErrorConvertedAllOfErrorExtra given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ErrorConvertedAllOfErrorExtra
  * @throws IOException if the JSON string is invalid with respect to ErrorConvertedAllOfErrorExtra
  */
  public static ErrorConvertedAllOfErrorExtra fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ErrorConvertedAllOfErrorExtra.class);
  }

 /**
  * Convert an instance of ErrorConvertedAllOfErrorExtra to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
