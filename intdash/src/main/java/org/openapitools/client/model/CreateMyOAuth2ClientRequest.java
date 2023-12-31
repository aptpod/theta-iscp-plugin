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
import org.openapitools.client.model.CreateOAuth2ClientAuthorizationCodeRequest;
import org.openapitools.client.model.CreateOAuth2ClientClientCredentialsRequest;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.aptpod.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T17:57:54.384855300+09:00[GMT+09:00]")
public class CreateMyOAuth2ClientRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateMyOAuth2ClientRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateMyOAuth2ClientRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateMyOAuth2ClientRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateOAuth2ClientAuthorizationCodeRequest> adapterCreateOAuth2ClientAuthorizationCodeRequest = gson.getDelegateAdapter(this, TypeToken.get(CreateOAuth2ClientAuthorizationCodeRequest.class));
            final TypeAdapter<CreateOAuth2ClientClientCredentialsRequest> adapterCreateOAuth2ClientClientCredentialsRequest = gson.getDelegateAdapter(this, TypeToken.get(CreateOAuth2ClientClientCredentialsRequest.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateMyOAuth2ClientRequest>() {
                @Override
                public void write(JsonWriter out, CreateMyOAuth2ClientRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CreateOAuth2ClientAuthorizationCodeRequest`
                    if (value.getActualInstance() instanceof CreateOAuth2ClientAuthorizationCodeRequest) {
                        JsonObject obj = adapterCreateOAuth2ClientAuthorizationCodeRequest.toJsonTree((CreateOAuth2ClientAuthorizationCodeRequest)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `CreateOAuth2ClientClientCredentialsRequest`
                    if (value.getActualInstance() instanceof CreateOAuth2ClientClientCredentialsRequest) {
                        JsonObject obj = adapterCreateOAuth2ClientClientCredentialsRequest.toJsonTree((CreateOAuth2ClientClientCredentialsRequest)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CreateOAuth2ClientAuthorizationCodeRequest, CreateOAuth2ClientClientCredentialsRequest");
                }

                @Override
                public CreateMyOAuth2ClientRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CreateOAuth2ClientAuthorizationCodeRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateOAuth2ClientAuthorizationCodeRequest.validateJsonObject(jsonObject);
                        actualAdapter = adapterCreateOAuth2ClientAuthorizationCodeRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CreateOAuth2ClientAuthorizationCodeRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateOAuth2ClientAuthorizationCodeRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateOAuth2ClientAuthorizationCodeRequest'", e);
                    }

                    // deserialize CreateOAuth2ClientClientCredentialsRequest
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateOAuth2ClientClientCredentialsRequest.validateJsonObject(jsonObject);
                        actualAdapter = adapterCreateOAuth2ClientClientCredentialsRequest;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CreateOAuth2ClientClientCredentialsRequest'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateOAuth2ClientClientCredentialsRequest failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateOAuth2ClientClientCredentialsRequest'", e);
                    }

                    if (match == 1) {
                        CreateMyOAuth2ClientRequest ret = new CreateMyOAuth2ClientRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateMyOAuth2ClientRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public CreateMyOAuth2ClientRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateMyOAuth2ClientRequest(CreateOAuth2ClientAuthorizationCodeRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateMyOAuth2ClientRequest(CreateOAuth2ClientClientCredentialsRequest o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateOAuth2ClientAuthorizationCodeRequest", new GenericType<CreateOAuth2ClientAuthorizationCodeRequest>() {
        });
        schemas.put("CreateOAuth2ClientClientCredentialsRequest", new GenericType<CreateOAuth2ClientClientCredentialsRequest>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CreateMyOAuth2ClientRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateOAuth2ClientAuthorizationCodeRequest, CreateOAuth2ClientClientCredentialsRequest
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CreateOAuth2ClientAuthorizationCodeRequest) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateOAuth2ClientClientCredentialsRequest) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateOAuth2ClientAuthorizationCodeRequest, CreateOAuth2ClientClientCredentialsRequest");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateOAuth2ClientAuthorizationCodeRequest, CreateOAuth2ClientClientCredentialsRequest
     *
     * @return The actual instance (CreateOAuth2ClientAuthorizationCodeRequest, CreateOAuth2ClientClientCredentialsRequest)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateOAuth2ClientAuthorizationCodeRequest`. If the actual instance is not `CreateOAuth2ClientAuthorizationCodeRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateOAuth2ClientAuthorizationCodeRequest`
     * @throws ClassCastException if the instance is not `CreateOAuth2ClientAuthorizationCodeRequest`
     */
    public CreateOAuth2ClientAuthorizationCodeRequest getCreateOAuth2ClientAuthorizationCodeRequest() throws ClassCastException {
        return (CreateOAuth2ClientAuthorizationCodeRequest)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateOAuth2ClientClientCredentialsRequest`. If the actual instance is not `CreateOAuth2ClientClientCredentialsRequest`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateOAuth2ClientClientCredentialsRequest`
     * @throws ClassCastException if the instance is not `CreateOAuth2ClientClientCredentialsRequest`
     */
    public CreateOAuth2ClientClientCredentialsRequest getCreateOAuth2ClientClientCredentialsRequest() throws ClassCastException {
        return (CreateOAuth2ClientClientCredentialsRequest)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateMyOAuth2ClientRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CreateOAuth2ClientAuthorizationCodeRequest
    try {
      CreateOAuth2ClientAuthorizationCodeRequest.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateOAuth2ClientAuthorizationCodeRequest failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CreateOAuth2ClientClientCredentialsRequest
    try {
      CreateOAuth2ClientClientCredentialsRequest.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateOAuth2ClientClientCredentialsRequest failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for CreateMyOAuth2ClientRequest with oneOf schemas: CreateOAuth2ClientAuthorizationCodeRequest, CreateOAuth2ClientClientCredentialsRequest. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of CreateMyOAuth2ClientRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateMyOAuth2ClientRequest
  * @throws IOException if the JSON string is invalid with respect to CreateMyOAuth2ClientRequest
  */
  public static CreateMyOAuth2ClientRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateMyOAuth2ClientRequest.class);
  }

 /**
  * Convert an instance of CreateMyOAuth2ClientRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

