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
 * MeasurementUploadPostResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T17:57:54.384855300+09:00[GMT+09:00]")
public class MeasurementUploadPostResponse {
  public static final String SERIALIZED_NAME_MEAS_UPLOAD_UUID = "meas_upload_uuid";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_MEAS_UPLOAD_UUID)
  private String measUploadUuid;

  public static final String SERIALIZED_NAME_JOB_UUID = "job_uuid";
  @SerializedName(SERIALIZED_NAME_JOB_UUID)
  private String jobUuid;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public MeasurementUploadPostResponse() {
  }

  @Deprecated
  public MeasurementUploadPostResponse measUploadUuid(String measUploadUuid) {
    
    this.measUploadUuid = measUploadUuid;
    return this;
  }

   /**
   * 計測アップロードのUUID
   * @return measUploadUuid
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  public String getMeasUploadUuid() {
    return measUploadUuid;
  }


  @Deprecated
  public void setMeasUploadUuid(String measUploadUuid) {
    this.measUploadUuid = measUploadUuid;
  }


  public MeasurementUploadPostResponse jobUuid(String jobUuid) {
    
    this.jobUuid = jobUuid;
    return this;
  }

   /**
   * 計測への変換ジョブのUUID
   * @return jobUuid
  **/
  @javax.annotation.Nullable
  public String getJobUuid() {
    return jobUuid;
  }


  public void setJobUuid(String jobUuid) {
    this.jobUuid = jobUuid;
  }


  public MeasurementUploadPostResponse fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * アップロードされたファイルのファイル名
   * @return fileName
  **/
  @javax.annotation.Nonnull
  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
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
   * @return the MeasurementUploadPostResponse instance itself
   */
  public MeasurementUploadPostResponse putAdditionalProperty(String key, Object value) {
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
    MeasurementUploadPostResponse measurementUploadPostResponse = (MeasurementUploadPostResponse) o;
    return Objects.equals(this.measUploadUuid, measurementUploadPostResponse.measUploadUuid) &&
        Objects.equals(this.jobUuid, measurementUploadPostResponse.jobUuid) &&
        Objects.equals(this.fileName, measurementUploadPostResponse.fileName)&&
        Objects.equals(this.additionalProperties, measurementUploadPostResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measUploadUuid, jobUuid, fileName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasurementUploadPostResponse {\n");
    sb.append("    measUploadUuid: ").append(toIndentedString(measUploadUuid)).append("\n");
    sb.append("    jobUuid: ").append(toIndentedString(jobUuid)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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
    openapiFields.add("meas_upload_uuid");
    openapiFields.add("job_uuid");
    openapiFields.add("file_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("meas_upload_uuid");
    openapiRequiredFields.add("file_name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MeasurementUploadPostResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MeasurementUploadPostResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MeasurementUploadPostResponse is not found in the empty JSON string", MeasurementUploadPostResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MeasurementUploadPostResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("meas_upload_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `meas_upload_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("meas_upload_uuid").toString()));
      }
      if ((jsonObj.get("job_uuid") != null && !jsonObj.get("job_uuid").isJsonNull()) && !jsonObj.get("job_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_uuid").toString()));
      }
      if (!jsonObj.get("file_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MeasurementUploadPostResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MeasurementUploadPostResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MeasurementUploadPostResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MeasurementUploadPostResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<MeasurementUploadPostResponse>() {
           @Override
           public void write(JsonWriter out, MeasurementUploadPostResponse value) throws IOException {
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
           public MeasurementUploadPostResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MeasurementUploadPostResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MeasurementUploadPostResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MeasurementUploadPostResponse
  * @throws IOException if the JSON string is invalid with respect to MeasurementUploadPostResponse
  */
  public static MeasurementUploadPostResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MeasurementUploadPostResponse.class);
  }

 /**
  * Convert an instance of MeasurementUploadPostResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

