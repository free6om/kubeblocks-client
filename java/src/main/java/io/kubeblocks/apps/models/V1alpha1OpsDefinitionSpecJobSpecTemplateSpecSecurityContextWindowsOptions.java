/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.27.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubeblocks.apps.models;

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

import io.kubernetes.client.openapi.JSON;

/**
 * The Windows specific settings applied to all containers. If unspecified, the options within a container&#39;s SecurityContext will be used. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. Note that this field cannot be set when spec.os.name is linux.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions {
  public static final String SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC = "gmsaCredentialSpec";
  @SerializedName(SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC)
  private String gmsaCredentialSpec;

  public static final String SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC_NAME = "gmsaCredentialSpecName";
  @SerializedName(SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC_NAME)
  private String gmsaCredentialSpecName;

  public static final String SERIALIZED_NAME_HOST_PROCESS = "hostProcess";
  @SerializedName(SERIALIZED_NAME_HOST_PROCESS)
  private Boolean hostProcess;

  public static final String SERIALIZED_NAME_RUN_AS_USER_NAME = "runAsUserName";
  @SerializedName(SERIALIZED_NAME_RUN_AS_USER_NAME)
  private String runAsUserName;

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions() {
  }

  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions gmsaCredentialSpec(String gmsaCredentialSpec) {
    
    this.gmsaCredentialSpec = gmsaCredentialSpec;
    return this;
  }

   /**
   * GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field.
   * @return gmsaCredentialSpec
  **/
  @jakarta.annotation.Nullable
  public String getGmsaCredentialSpec() {
    return gmsaCredentialSpec;
  }


  public void setGmsaCredentialSpec(String gmsaCredentialSpec) {
    this.gmsaCredentialSpec = gmsaCredentialSpec;
  }


  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions gmsaCredentialSpecName(String gmsaCredentialSpecName) {
    
    this.gmsaCredentialSpecName = gmsaCredentialSpecName;
    return this;
  }

   /**
   * GMSACredentialSpecName is the name of the GMSA credential spec to use.
   * @return gmsaCredentialSpecName
  **/
  @jakarta.annotation.Nullable
  public String getGmsaCredentialSpecName() {
    return gmsaCredentialSpecName;
  }


  public void setGmsaCredentialSpecName(String gmsaCredentialSpecName) {
    this.gmsaCredentialSpecName = gmsaCredentialSpecName;
  }


  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions hostProcess(Boolean hostProcess) {
    
    this.hostProcess = hostProcess;
    return this;
  }

   /**
   * HostProcess determines if a container should be run as a &#39;Host Process&#39; container. All of a Pod&#39;s containers must have the same effective HostProcess value (it is not allowed to have a mix of HostProcess containers and non-HostProcess containers). In addition, if HostProcess is true then HostNetwork must also be set to true.
   * @return hostProcess
  **/
  @jakarta.annotation.Nullable
  public Boolean getHostProcess() {
    return hostProcess;
  }


  public void setHostProcess(Boolean hostProcess) {
    this.hostProcess = hostProcess;
  }


  public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions runAsUserName(String runAsUserName) {
    
    this.runAsUserName = runAsUserName;
    return this;
  }

   /**
   * The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   * @return runAsUserName
  **/
  @jakarta.annotation.Nullable
  public String getRunAsUserName() {
    return runAsUserName;
  }


  public void setRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions v1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions = (V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions) o;
    return Objects.equals(this.gmsaCredentialSpec, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions.gmsaCredentialSpec) &&
        Objects.equals(this.gmsaCredentialSpecName, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions.gmsaCredentialSpecName) &&
        Objects.equals(this.hostProcess, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions.hostProcess) &&
        Objects.equals(this.runAsUserName, v1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions.runAsUserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gmsaCredentialSpec, gmsaCredentialSpecName, hostProcess, runAsUserName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions {\n");
    sb.append("    gmsaCredentialSpec: ").append(toIndentedString(gmsaCredentialSpec)).append("\n");
    sb.append("    gmsaCredentialSpecName: ").append(toIndentedString(gmsaCredentialSpecName)).append("\n");
    sb.append("    hostProcess: ").append(toIndentedString(hostProcess)).append("\n");
    sb.append("    runAsUserName: ").append(toIndentedString(runAsUserName)).append("\n");
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
    openapiFields.add("gmsaCredentialSpec");
    openapiFields.add("gmsaCredentialSpecName");
    openapiFields.add("hostProcess");
    openapiFields.add("runAsUserName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions is not found in the empty JSON string", V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("gmsaCredentialSpec") != null && !jsonObj.get("gmsaCredentialSpec").isJsonNull()) && !jsonObj.get("gmsaCredentialSpec").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmsaCredentialSpec` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmsaCredentialSpec").toString()));
      }
      if ((jsonObj.get("gmsaCredentialSpecName") != null && !jsonObj.get("gmsaCredentialSpecName").isJsonNull()) && !jsonObj.get("gmsaCredentialSpecName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmsaCredentialSpecName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmsaCredentialSpecName").toString()));
      }
      if ((jsonObj.get("runAsUserName") != null && !jsonObj.get("runAsUserName").isJsonNull()) && !jsonObj.get("runAsUserName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runAsUserName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runAsUserName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions
  */
  public static V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions.class);
  }

 /**
  * Convert an instance of V1alpha1OpsDefinitionSpecJobSpecTemplateSpecSecurityContextWindowsOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

