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
 * See [JSON Web Key (JWK)](https://datatracker.ietf.org/doc/html/rfc7517)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T17:57:54.384855300+09:00[GMT+09:00]")
public class JSONWebKey {
  public static final String SERIALIZED_NAME_USE = "use";
  @SerializedName(SERIALIZED_NAME_USE)
  private String use;

  public static final String SERIALIZED_NAME_KTY = "kty";
  @SerializedName(SERIALIZED_NAME_KTY)
  private String kty;

  public static final String SERIALIZED_NAME_KID = "kid";
  @SerializedName(SERIALIZED_NAME_KID)
  private String kid;

  public static final String SERIALIZED_NAME_CRV = "crv";
  @SerializedName(SERIALIZED_NAME_CRV)
  private String crv;

  public static final String SERIALIZED_NAME_ALG = "alg";
  @SerializedName(SERIALIZED_NAME_ALG)
  private String alg;

  public static final String SERIALIZED_NAME_K = "k";
  @SerializedName(SERIALIZED_NAME_K)
  private byte[] k;

  public static final String SERIALIZED_NAME_X = "x";
  @SerializedName(SERIALIZED_NAME_X)
  private byte[] x;

  public static final String SERIALIZED_NAME_Y = "y";
  @SerializedName(SERIALIZED_NAME_Y)
  private byte[] y;

  public static final String SERIALIZED_NAME_N = "n";
  @SerializedName(SERIALIZED_NAME_N)
  private byte[] n;

  public static final String SERIALIZED_NAME_E = "e";
  @SerializedName(SERIALIZED_NAME_E)
  private byte[] e;

  public static final String SERIALIZED_NAME_D = "d";
  @SerializedName(SERIALIZED_NAME_D)
  private byte[] d;

  public static final String SERIALIZED_NAME_P = "p";
  @SerializedName(SERIALIZED_NAME_P)
  private byte[] p;

  public static final String SERIALIZED_NAME_Q = "q";
  @SerializedName(SERIALIZED_NAME_Q)
  private byte[] q;

  public static final String SERIALIZED_NAME_DP = "dp";
  @SerializedName(SERIALIZED_NAME_DP)
  private byte[] dp;

  public static final String SERIALIZED_NAME_DQ = "dq";
  @SerializedName(SERIALIZED_NAME_DQ)
  private byte[] dq;

  public static final String SERIALIZED_NAME_QI = "qi";
  @SerializedName(SERIALIZED_NAME_QI)
  private byte[] qi;

  public static final String SERIALIZED_NAME_X5C = "x5c";
  @SerializedName(SERIALIZED_NAME_X5C)
  private List<String> x5c;

  public static final String SERIALIZED_NAME_X5U = "x5u";
  @SerializedName(SERIALIZED_NAME_X5U)
  private String x5u;

  public static final String SERIALIZED_NAME_X5T = "x5t";
  @SerializedName(SERIALIZED_NAME_X5T)
  private String x5t;

  public static final String SERIALIZED_NAME_X5T_HASH_S256 = "x5t#S256";
  @SerializedName(SERIALIZED_NAME_X5T_HASH_S256)
  private String x5tHashS256;

  public JSONWebKey() {
  }

  public JSONWebKey use(String use) {
    
    this.use = use;
    return this;
  }

   /**
   * Get use
   * @return use
  **/
  @javax.annotation.Nullable
  public String getUse() {
    return use;
  }


  public void setUse(String use) {
    this.use = use;
  }


  public JSONWebKey kty(String kty) {
    
    this.kty = kty;
    return this;
  }

   /**
   * Get kty
   * @return kty
  **/
  @javax.annotation.Nullable
  public String getKty() {
    return kty;
  }


  public void setKty(String kty) {
    this.kty = kty;
  }


  public JSONWebKey kid(String kid) {
    
    this.kid = kid;
    return this;
  }

   /**
   * Get kid
   * @return kid
  **/
  @javax.annotation.Nullable
  public String getKid() {
    return kid;
  }


  public void setKid(String kid) {
    this.kid = kid;
  }


  public JSONWebKey crv(String crv) {
    
    this.crv = crv;
    return this;
  }

   /**
   * Get crv
   * @return crv
  **/
  @javax.annotation.Nullable
  public String getCrv() {
    return crv;
  }


  public void setCrv(String crv) {
    this.crv = crv;
  }


  public JSONWebKey alg(String alg) {
    
    this.alg = alg;
    return this;
  }

   /**
   * Get alg
   * @return alg
  **/
  @javax.annotation.Nullable
  public String getAlg() {
    return alg;
  }


  public void setAlg(String alg) {
    this.alg = alg;
  }


  public JSONWebKey k(byte[] k) {
    
    this.k = k;
    return this;
  }

   /**
   * Get k
   * @return k
  **/
  @javax.annotation.Nullable
  public byte[] getK() {
    return k;
  }


  public void setK(byte[] k) {
    this.k = k;
  }


  public JSONWebKey x(byte[] x) {
    
    this.x = x;
    return this;
  }

   /**
   * Get x
   * @return x
  **/
  @javax.annotation.Nullable
  public byte[] getX() {
    return x;
  }


  public void setX(byte[] x) {
    this.x = x;
  }


  public JSONWebKey y(byte[] y) {
    
    this.y = y;
    return this;
  }

   /**
   * Get y
   * @return y
  **/
  @javax.annotation.Nullable
  public byte[] getY() {
    return y;
  }


  public void setY(byte[] y) {
    this.y = y;
  }


  public JSONWebKey n(byte[] n) {
    
    this.n = n;
    return this;
  }

   /**
   * Get n
   * @return n
  **/
  @javax.annotation.Nullable
  public byte[] getN() {
    return n;
  }


  public void setN(byte[] n) {
    this.n = n;
  }


  public JSONWebKey e(byte[] e) {
    
    this.e = e;
    return this;
  }

   /**
   * Get e
   * @return e
  **/
  @javax.annotation.Nullable
  public byte[] getE() {
    return e;
  }


  public void setE(byte[] e) {
    this.e = e;
  }


  public JSONWebKey d(byte[] d) {
    
    this.d = d;
    return this;
  }

   /**
   * Get d
   * @return d
  **/
  @javax.annotation.Nullable
  public byte[] getD() {
    return d;
  }


  public void setD(byte[] d) {
    this.d = d;
  }


  public JSONWebKey p(byte[] p) {
    
    this.p = p;
    return this;
  }

   /**
   * Get p
   * @return p
  **/
  @javax.annotation.Nullable
  public byte[] getP() {
    return p;
  }


  public void setP(byte[] p) {
    this.p = p;
  }


  public JSONWebKey q(byte[] q) {
    
    this.q = q;
    return this;
  }

   /**
   * Get q
   * @return q
  **/
  @javax.annotation.Nullable
  public byte[] getQ() {
    return q;
  }


  public void setQ(byte[] q) {
    this.q = q;
  }


  public JSONWebKey dp(byte[] dp) {
    
    this.dp = dp;
    return this;
  }

   /**
   * Get dp
   * @return dp
  **/
  @javax.annotation.Nullable
  public byte[] getDp() {
    return dp;
  }


  public void setDp(byte[] dp) {
    this.dp = dp;
  }


  public JSONWebKey dq(byte[] dq) {
    
    this.dq = dq;
    return this;
  }

   /**
   * Get dq
   * @return dq
  **/
  @javax.annotation.Nullable
  public byte[] getDq() {
    return dq;
  }


  public void setDq(byte[] dq) {
    this.dq = dq;
  }


  public JSONWebKey qi(byte[] qi) {
    
    this.qi = qi;
    return this;
  }

   /**
   * Get qi
   * @return qi
  **/
  @javax.annotation.Nullable
  public byte[] getQi() {
    return qi;
  }


  public void setQi(byte[] qi) {
    this.qi = qi;
  }


  public JSONWebKey x5c(List<String> x5c) {
    
    this.x5c = x5c;
    return this;
  }

  public JSONWebKey addX5cItem(String x5cItem) {
    if (this.x5c == null) {
      this.x5c = new ArrayList<>();
    }
    this.x5c.add(x5cItem);
    return this;
  }

   /**
   * Get x5c
   * @return x5c
  **/
  @javax.annotation.Nullable
  public List<String> getX5c() {
    return x5c;
  }


  public void setX5c(List<String> x5c) {
    this.x5c = x5c;
  }


  public JSONWebKey x5u(String x5u) {
    
    this.x5u = x5u;
    return this;
  }

   /**
   * Get x5u
   * @return x5u
  **/
  @javax.annotation.Nullable
  public String getX5u() {
    return x5u;
  }


  public void setX5u(String x5u) {
    this.x5u = x5u;
  }


  public JSONWebKey x5t(String x5t) {
    
    this.x5t = x5t;
    return this;
  }

   /**
   * Get x5t
   * @return x5t
  **/
  @javax.annotation.Nullable
  public String getX5t() {
    return x5t;
  }


  public void setX5t(String x5t) {
    this.x5t = x5t;
  }


  public JSONWebKey x5tHashS256(String x5tHashS256) {
    
    this.x5tHashS256 = x5tHashS256;
    return this;
  }

   /**
   * Get x5tHashS256
   * @return x5tHashS256
  **/
  @javax.annotation.Nullable
  public String getX5tHashS256() {
    return x5tHashS256;
  }


  public void setX5tHashS256(String x5tHashS256) {
    this.x5tHashS256 = x5tHashS256;
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
   * @return the JSONWebKey instance itself
   */
  public JSONWebKey putAdditionalProperty(String key, Object value) {
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
    JSONWebKey jsONWebKey = (JSONWebKey) o;
    return Objects.equals(this.use, jsONWebKey.use) &&
        Objects.equals(this.kty, jsONWebKey.kty) &&
        Objects.equals(this.kid, jsONWebKey.kid) &&
        Objects.equals(this.crv, jsONWebKey.crv) &&
        Objects.equals(this.alg, jsONWebKey.alg) &&
        Arrays.equals(this.k, jsONWebKey.k) &&
        Arrays.equals(this.x, jsONWebKey.x) &&
        Arrays.equals(this.y, jsONWebKey.y) &&
        Arrays.equals(this.n, jsONWebKey.n) &&
        Arrays.equals(this.e, jsONWebKey.e) &&
        Arrays.equals(this.d, jsONWebKey.d) &&
        Arrays.equals(this.p, jsONWebKey.p) &&
        Arrays.equals(this.q, jsONWebKey.q) &&
        Arrays.equals(this.dp, jsONWebKey.dp) &&
        Arrays.equals(this.dq, jsONWebKey.dq) &&
        Arrays.equals(this.qi, jsONWebKey.qi) &&
        Objects.equals(this.x5c, jsONWebKey.x5c) &&
        Objects.equals(this.x5u, jsONWebKey.x5u) &&
        Objects.equals(this.x5t, jsONWebKey.x5t) &&
        Objects.equals(this.x5tHashS256, jsONWebKey.x5tHashS256)&&
        Objects.equals(this.additionalProperties, jsONWebKey.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(use, kty, kid, crv, alg, Arrays.hashCode(k), Arrays.hashCode(x), Arrays.hashCode(y), Arrays.hashCode(n), Arrays.hashCode(e), Arrays.hashCode(d), Arrays.hashCode(p), Arrays.hashCode(q), Arrays.hashCode(dp), Arrays.hashCode(dq), Arrays.hashCode(qi), x5c, x5u, x5t, x5tHashS256, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSONWebKey {\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
    sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    crv: ").append(toIndentedString(crv)).append("\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
    sb.append("    d: ").append(toIndentedString(d)).append("\n");
    sb.append("    p: ").append(toIndentedString(p)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    dp: ").append(toIndentedString(dp)).append("\n");
    sb.append("    dq: ").append(toIndentedString(dq)).append("\n");
    sb.append("    qi: ").append(toIndentedString(qi)).append("\n");
    sb.append("    x5c: ").append(toIndentedString(x5c)).append("\n");
    sb.append("    x5u: ").append(toIndentedString(x5u)).append("\n");
    sb.append("    x5t: ").append(toIndentedString(x5t)).append("\n");
    sb.append("    x5tHashS256: ").append(toIndentedString(x5tHashS256)).append("\n");
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
    openapiFields.add("use");
    openapiFields.add("kty");
    openapiFields.add("kid");
    openapiFields.add("crv");
    openapiFields.add("alg");
    openapiFields.add("k");
    openapiFields.add("x");
    openapiFields.add("y");
    openapiFields.add("n");
    openapiFields.add("e");
    openapiFields.add("d");
    openapiFields.add("p");
    openapiFields.add("q");
    openapiFields.add("dp");
    openapiFields.add("dq");
    openapiFields.add("qi");
    openapiFields.add("x5c");
    openapiFields.add("x5u");
    openapiFields.add("x5t");
    openapiFields.add("x5t#S256");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JSONWebKey
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JSONWebKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JSONWebKey is not found in the empty JSON string", JSONWebKey.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("use") != null && !jsonObj.get("use").isJsonNull()) && !jsonObj.get("use").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `use` to be a primitive type in the JSON string but got `%s`", jsonObj.get("use").toString()));
      }
      if ((jsonObj.get("kty") != null && !jsonObj.get("kty").isJsonNull()) && !jsonObj.get("kty").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kty` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kty").toString()));
      }
      if ((jsonObj.get("kid") != null && !jsonObj.get("kid").isJsonNull()) && !jsonObj.get("kid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kid").toString()));
      }
      if ((jsonObj.get("crv") != null && !jsonObj.get("crv").isJsonNull()) && !jsonObj.get("crv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crv").toString()));
      }
      if ((jsonObj.get("alg") != null && !jsonObj.get("alg").isJsonNull()) && !jsonObj.get("alg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alg").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("x5c") != null && !jsonObj.get("x5c").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `x5c` to be an array in the JSON string but got `%s`", jsonObj.get("x5c").toString()));
      }
      if ((jsonObj.get("x5u") != null && !jsonObj.get("x5u").isJsonNull()) && !jsonObj.get("x5u").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `x5u` to be a primitive type in the JSON string but got `%s`", jsonObj.get("x5u").toString()));
      }
      if ((jsonObj.get("x5t") != null && !jsonObj.get("x5t").isJsonNull()) && !jsonObj.get("x5t").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `x5t` to be a primitive type in the JSON string but got `%s`", jsonObj.get("x5t").toString()));
      }
      if ((jsonObj.get("x5t#S256") != null && !jsonObj.get("x5t#S256").isJsonNull()) && !jsonObj.get("x5t#S256").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `x5t#S256` to be a primitive type in the JSON string but got `%s`", jsonObj.get("x5t#S256").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JSONWebKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JSONWebKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JSONWebKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JSONWebKey.class));

       return (TypeAdapter<T>) new TypeAdapter<JSONWebKey>() {
           @Override
           public void write(JsonWriter out, JSONWebKey value) throws IOException {
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
           public JSONWebKey read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JSONWebKey instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JSONWebKey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JSONWebKey
  * @throws IOException if the JSON string is invalid with respect to JSONWebKey
  */
  public static JSONWebKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JSONWebKey.class);
  }

 /**
  * Convert an instance of JSONWebKey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

