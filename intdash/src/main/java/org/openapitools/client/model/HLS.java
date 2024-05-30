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
 * HLS
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T17:57:54.384855300+09:00[GMT+09:00]")
public class HLS {
  public static final String SERIALIZED_NAME_EDGE_UUID = "edge_uuid";
  @SerializedName(SERIALIZED_NAME_EDGE_UUID)
  private String edgeUuid;

  public static final String SERIALIZED_NAME_MEASUREMENT_UUID = "measurement_uuid";
  @SerializedName(SERIALIZED_NAME_MEASUREMENT_UUID)
  private String measurementUuid;

  public static final String SERIALIZED_NAME_BASETIME = "basetime";
  @SerializedName(SERIALIZED_NAME_BASETIME)
  private String basetime;

  public static final String SERIALIZED_NAME_BASETIME_TYPE = "basetime_type";
  @SerializedName(SERIALIZED_NAME_BASETIME_TYPE)
  private String basetimeType;

  public static final String SERIALIZED_NAME_PLAYLIST = "playlist";
  @SerializedName(SERIALIZED_NAME_PLAYLIST)
  private String playlist;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private Integer channel;

  public static final String SERIALIZED_NAME_OFFSET_TIME = "offset_time";
  @SerializedName(SERIALIZED_NAME_OFFSET_TIME)
  private Integer offsetTime;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public HLS() {
  }

  public HLS edgeUuid(String edgeUuid) {
    
    this.edgeUuid = edgeUuid;
    return this;
  }

   /**
   * エッジのUUID
   * @return edgeUuid
  **/
  @javax.annotation.Nonnull
  public String getEdgeUuid() {
    return edgeUuid;
  }


  public void setEdgeUuid(String edgeUuid) {
    this.edgeUuid = edgeUuid;
  }


  public HLS measurementUuid(String measurementUuid) {
    
    this.measurementUuid = measurementUuid;
    return this;
  }

   /**
   * 計測のUUID
   * @return measurementUuid
  **/
  @javax.annotation.Nonnull
  public String getMeasurementUuid() {
    return measurementUuid;
  }


  public void setMeasurementUuid(String measurementUuid) {
    this.measurementUuid = measurementUuid;
  }


  public HLS basetime(String basetime) {
    
    this.basetime = basetime;
    return this;
  }

   /**
   * 基準時刻
   * @return basetime
  **/
  @javax.annotation.Nonnull
  public String getBasetime() {
    return basetime;
  }


  public void setBasetime(String basetime) {
    this.basetime = basetime;
  }


  public HLS basetimeType(String basetimeType) {
    
    this.basetimeType = basetimeType;
    return this;
  }

   /**
   * 基準時刻タイプ
   * @return basetimeType
  **/
  @javax.annotation.Nonnull
  public String getBasetimeType() {
    return basetimeType;
  }


  public void setBasetimeType(String basetimeType) {
    this.basetimeType = basetimeType;
  }


  public HLS playlist(String playlist) {
    
    this.playlist = playlist;
    return this;
  }

   /**
   * プレイリスト
   * @return playlist
  **/
  @javax.annotation.Nonnull
  public String getPlaylist() {
    return playlist;
  }


  public void setPlaylist(String playlist) {
    this.playlist = playlist;
  }


  public HLS channel(Integer channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * チャンネル
   * @return channel
  **/
  @javax.annotation.Nonnull
  public Integer getChannel() {
    return channel;
  }


  public void setChannel(Integer channel) {
    this.channel = channel;
  }


  public HLS offsetTime(Integer offsetTime) {
    
    this.offsetTime = offsetTime;
    return this;
  }

   /**
   * 計測開始から動画の開始までのオフセット（マイクロ秒）
   * @return offsetTime
  **/
  @javax.annotation.Nonnull
  public Integer getOffsetTime() {
    return offsetTime;
  }


  public void setOffsetTime(Integer offsetTime) {
    this.offsetTime = offsetTime;
  }


  public HLS duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 長さ（マイクロ秒）
   * @return duration
  **/
  @javax.annotation.Nonnull
  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
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
   * @return the HLS instance itself
   */
  public HLS putAdditionalProperty(String key, Object value) {
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
    HLS HLS = (HLS) o;
    return Objects.equals(this.edgeUuid, HLS.edgeUuid) &&
        Objects.equals(this.measurementUuid, HLS.measurementUuid) &&
        Objects.equals(this.basetime, HLS.basetime) &&
        Objects.equals(this.basetimeType, HLS.basetimeType) &&
        Objects.equals(this.playlist, HLS.playlist) &&
        Objects.equals(this.channel, HLS.channel) &&
        Objects.equals(this.offsetTime, HLS.offsetTime) &&
        Objects.equals(this.duration, HLS.duration)&&
        Objects.equals(this.additionalProperties, HLS.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edgeUuid, measurementUuid, basetime, basetimeType, playlist, channel, offsetTime, duration, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HLS {\n");
    sb.append("    edgeUuid: ").append(toIndentedString(edgeUuid)).append("\n");
    sb.append("    measurementUuid: ").append(toIndentedString(measurementUuid)).append("\n");
    sb.append("    basetime: ").append(toIndentedString(basetime)).append("\n");
    sb.append("    basetimeType: ").append(toIndentedString(basetimeType)).append("\n");
    sb.append("    playlist: ").append(toIndentedString(playlist)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    offsetTime: ").append(toIndentedString(offsetTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
    openapiFields.add("edge_uuid");
    openapiFields.add("measurement_uuid");
    openapiFields.add("basetime");
    openapiFields.add("basetime_type");
    openapiFields.add("playlist");
    openapiFields.add("channel");
    openapiFields.add("offset_time");
    openapiFields.add("duration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("edge_uuid");
    openapiRequiredFields.add("measurement_uuid");
    openapiRequiredFields.add("basetime");
    openapiRequiredFields.add("basetime_type");
    openapiRequiredFields.add("playlist");
    openapiRequiredFields.add("channel");
    openapiRequiredFields.add("offset_time");
    openapiRequiredFields.add("duration");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HLS
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!HLS.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HLS is not found in the empty JSON string", HLS.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HLS.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("edge_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `edge_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("edge_uuid").toString()));
      }
      if (!jsonObj.get("measurement_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `measurement_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("measurement_uuid").toString()));
      }
      if (!jsonObj.get("basetime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `basetime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("basetime").toString()));
      }
      if (!jsonObj.get("basetime_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `basetime_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("basetime_type").toString()));
      }
      if (!jsonObj.get("playlist").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `playlist` to be a primitive type in the JSON string but got `%s`", jsonObj.get("playlist").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HLS.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HLS' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HLS> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HLS.class));

       return (TypeAdapter<T>) new TypeAdapter<HLS>() {
           @Override
           public void write(JsonWriter out, HLS value) throws IOException {
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
           public HLS read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             HLS instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of HLS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HLS
  * @throws IOException if the JSON string is invalid with respect to HLS
  */
  public static HLS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HLS.class);
  }

 /**
  * Convert an instance of HLS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
