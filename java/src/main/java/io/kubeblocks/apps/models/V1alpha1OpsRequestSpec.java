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
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecBackupSpec;
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecCustomSpec;
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecExposeInner;
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecHorizontalScalingInner;
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecReconfigure;
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecReconfiguresInner;
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecRestartInner;
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecRestoreFrom;
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecRestoreSpec;
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecScriptSpec;
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecSwitchoverInner;
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecUpgrade;
import io.kubeblocks.apps.models.V1alpha1OpsRequestSpecVolumeExpansionInner;
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

import io.kubernetes.client.openapi.JSON;

/**
 * OpsRequestSpec defines the desired state of OpsRequest
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T10:01:20.252122Z[Etc/UTC]")
public class V1alpha1OpsRequestSpec {
  public static final String SERIALIZED_NAME_BACKUP_SPEC = "backupSpec";
  @SerializedName(SERIALIZED_NAME_BACKUP_SPEC)
  private V1alpha1OpsRequestSpecBackupSpec backupSpec;

  public static final String SERIALIZED_NAME_CANCEL = "cancel";
  @SerializedName(SERIALIZED_NAME_CANCEL)
  private Boolean cancel;

  public static final String SERIALIZED_NAME_CLUSTER_REF = "clusterRef";
  @SerializedName(SERIALIZED_NAME_CLUSTER_REF)
  private String clusterRef;

  public static final String SERIALIZED_NAME_CUSTOM_SPEC = "customSpec";
  @SerializedName(SERIALIZED_NAME_CUSTOM_SPEC)
  private V1alpha1OpsRequestSpecCustomSpec customSpec;

  public static final String SERIALIZED_NAME_EXPOSE = "expose";
  @SerializedName(SERIALIZED_NAME_EXPOSE)
  private List<V1alpha1OpsRequestSpecExposeInner> expose;

  public static final String SERIALIZED_NAME_HORIZONTAL_SCALING = "horizontalScaling";
  @SerializedName(SERIALIZED_NAME_HORIZONTAL_SCALING)
  private List<V1alpha1OpsRequestSpecHorizontalScalingInner> horizontalScaling;

  public static final String SERIALIZED_NAME_RECONFIGURE = "reconfigure";
  @SerializedName(SERIALIZED_NAME_RECONFIGURE)
  private V1alpha1OpsRequestSpecReconfigure reconfigure;

  public static final String SERIALIZED_NAME_RECONFIGURES = "reconfigures";
  @SerializedName(SERIALIZED_NAME_RECONFIGURES)
  private List<V1alpha1OpsRequestSpecReconfiguresInner> reconfigures;

  public static final String SERIALIZED_NAME_RESTART = "restart";
  @SerializedName(SERIALIZED_NAME_RESTART)
  private List<V1alpha1OpsRequestSpecRestartInner> restart;

  public static final String SERIALIZED_NAME_RESTORE_FROM = "restoreFrom";
  @SerializedName(SERIALIZED_NAME_RESTORE_FROM)
  private V1alpha1OpsRequestSpecRestoreFrom restoreFrom;

  public static final String SERIALIZED_NAME_RESTORE_SPEC = "restoreSpec";
  @SerializedName(SERIALIZED_NAME_RESTORE_SPEC)
  private V1alpha1OpsRequestSpecRestoreSpec restoreSpec;

  public static final String SERIALIZED_NAME_SCRIPT_SPEC = "scriptSpec";
  @SerializedName(SERIALIZED_NAME_SCRIPT_SPEC)
  private V1alpha1OpsRequestSpecScriptSpec scriptSpec;

  public static final String SERIALIZED_NAME_SWITCHOVER = "switchover";
  @SerializedName(SERIALIZED_NAME_SWITCHOVER)
  private List<V1alpha1OpsRequestSpecSwitchoverInner> switchover;

  public static final String SERIALIZED_NAME_TTL_SECONDS_AFTER_SUCCEED = "ttlSecondsAfterSucceed";
  @SerializedName(SERIALIZED_NAME_TTL_SECONDS_AFTER_SUCCEED)
  private Integer ttlSecondsAfterSucceed;

  public static final String SERIALIZED_NAME_TTL_SECONDS_BEFORE_ABORT = "ttlSecondsBeforeAbort";
  @SerializedName(SERIALIZED_NAME_TTL_SECONDS_BEFORE_ABORT)
  private Integer ttlSecondsBeforeAbort;

  /**
   * type defines the operation type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UPGRADE("Upgrade"),
    
    VERTICALSCALING("VerticalScaling"),
    
    VOLUMEEXPANSION("VolumeExpansion"),
    
    HORIZONTALSCALING("HorizontalScaling"),
    
    RESTART("Restart"),
    
    RECONFIGURING("Reconfiguring"),
    
    START("Start"),
    
    STOP("Stop"),
    
    EXPOSE("Expose"),
    
    SWITCHOVER("Switchover"),
    
    DATASCRIPT("DataScript"),
    
    BACKUP("Backup"),
    
    RESTORE("Restore"),
    
    CUSTOM("Custom");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_UPGRADE = "upgrade";
  @SerializedName(SERIALIZED_NAME_UPGRADE)
  private V1alpha1OpsRequestSpecUpgrade upgrade;

  public static final String SERIALIZED_NAME_VERTICAL_SCALING = "verticalScaling";
  @SerializedName(SERIALIZED_NAME_VERTICAL_SCALING)
  private List<Object> verticalScaling;

  public static final String SERIALIZED_NAME_VOLUME_EXPANSION = "volumeExpansion";
  @SerializedName(SERIALIZED_NAME_VOLUME_EXPANSION)
  private List<V1alpha1OpsRequestSpecVolumeExpansionInner> volumeExpansion;

  public V1alpha1OpsRequestSpec() {
  }

  public V1alpha1OpsRequestSpec backupSpec(V1alpha1OpsRequestSpecBackupSpec backupSpec) {
    
    this.backupSpec = backupSpec;
    return this;
  }

   /**
   * Get backupSpec
   * @return backupSpec
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsRequestSpecBackupSpec getBackupSpec() {
    return backupSpec;
  }


  public void setBackupSpec(V1alpha1OpsRequestSpecBackupSpec backupSpec) {
    this.backupSpec = backupSpec;
  }


  public V1alpha1OpsRequestSpec cancel(Boolean cancel) {
    
    this.cancel = cancel;
    return this;
  }

   /**
   * cancel defines the action to cancel the Pending/Creating/Running opsRequest, supported types: [VerticalScaling, HorizontalScaling]. once cancel is set to true, this opsRequest will be canceled and modifying this property again will not take effect.
   * @return cancel
  **/
  @jakarta.annotation.Nullable
  public Boolean getCancel() {
    return cancel;
  }


  public void setCancel(Boolean cancel) {
    this.cancel = cancel;
  }


  public V1alpha1OpsRequestSpec clusterRef(String clusterRef) {
    
    this.clusterRef = clusterRef;
    return this;
  }

   /**
   * clusterRef references cluster object.
   * @return clusterRef
  **/
  @jakarta.annotation.Nonnull
  public String getClusterRef() {
    return clusterRef;
  }


  public void setClusterRef(String clusterRef) {
    this.clusterRef = clusterRef;
  }


  public V1alpha1OpsRequestSpec customSpec(V1alpha1OpsRequestSpecCustomSpec customSpec) {
    
    this.customSpec = customSpec;
    return this;
  }

   /**
   * Get customSpec
   * @return customSpec
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsRequestSpecCustomSpec getCustomSpec() {
    return customSpec;
  }


  public void setCustomSpec(V1alpha1OpsRequestSpecCustomSpec customSpec) {
    this.customSpec = customSpec;
  }


  public V1alpha1OpsRequestSpec expose(List<V1alpha1OpsRequestSpecExposeInner> expose) {
    
    this.expose = expose;
    return this;
  }

  public V1alpha1OpsRequestSpec addExposeItem(V1alpha1OpsRequestSpecExposeInner exposeItem) {
    if (this.expose == null) {
      this.expose = new ArrayList<>();
    }
    this.expose.add(exposeItem);
    return this;
  }

   /**
   * expose defines services the component needs to expose.
   * @return expose
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1OpsRequestSpecExposeInner> getExpose() {
    return expose;
  }


  public void setExpose(List<V1alpha1OpsRequestSpecExposeInner> expose) {
    this.expose = expose;
  }


  public V1alpha1OpsRequestSpec horizontalScaling(List<V1alpha1OpsRequestSpecHorizontalScalingInner> horizontalScaling) {
    
    this.horizontalScaling = horizontalScaling;
    return this;
  }

  public V1alpha1OpsRequestSpec addHorizontalScalingItem(V1alpha1OpsRequestSpecHorizontalScalingInner horizontalScalingItem) {
    if (this.horizontalScaling == null) {
      this.horizontalScaling = new ArrayList<>();
    }
    this.horizontalScaling.add(horizontalScalingItem);
    return this;
  }

   /**
   * horizontalScaling defines what component need to horizontal scale the specified replicas.
   * @return horizontalScaling
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1OpsRequestSpecHorizontalScalingInner> getHorizontalScaling() {
    return horizontalScaling;
  }


  public void setHorizontalScaling(List<V1alpha1OpsRequestSpecHorizontalScalingInner> horizontalScaling) {
    this.horizontalScaling = horizontalScaling;
  }


  public V1alpha1OpsRequestSpec reconfigure(V1alpha1OpsRequestSpecReconfigure reconfigure) {
    
    this.reconfigure = reconfigure;
    return this;
  }

   /**
   * Get reconfigure
   * @return reconfigure
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsRequestSpecReconfigure getReconfigure() {
    return reconfigure;
  }


  public void setReconfigure(V1alpha1OpsRequestSpecReconfigure reconfigure) {
    this.reconfigure = reconfigure;
  }


  public V1alpha1OpsRequestSpec reconfigures(List<V1alpha1OpsRequestSpecReconfiguresInner> reconfigures) {
    
    this.reconfigures = reconfigures;
    return this;
  }

  public V1alpha1OpsRequestSpec addReconfiguresItem(V1alpha1OpsRequestSpecReconfiguresInner reconfiguresItem) {
    if (this.reconfigures == null) {
      this.reconfigures = new ArrayList<>();
    }
    this.reconfigures.add(reconfiguresItem);
    return this;
  }

   /**
   * reconfigure defines the variables that need to input when updating configuration.
   * @return reconfigures
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1OpsRequestSpecReconfiguresInner> getReconfigures() {
    return reconfigures;
  }


  public void setReconfigures(List<V1alpha1OpsRequestSpecReconfiguresInner> reconfigures) {
    this.reconfigures = reconfigures;
  }


  public V1alpha1OpsRequestSpec restart(List<V1alpha1OpsRequestSpecRestartInner> restart) {
    
    this.restart = restart;
    return this;
  }

  public V1alpha1OpsRequestSpec addRestartItem(V1alpha1OpsRequestSpecRestartInner restartItem) {
    if (this.restart == null) {
      this.restart = new ArrayList<>();
    }
    this.restart.add(restartItem);
    return this;
  }

   /**
   * restart the specified components.
   * @return restart
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1OpsRequestSpecRestartInner> getRestart() {
    return restart;
  }


  public void setRestart(List<V1alpha1OpsRequestSpecRestartInner> restart) {
    this.restart = restart;
  }


  public V1alpha1OpsRequestSpec restoreFrom(V1alpha1OpsRequestSpecRestoreFrom restoreFrom) {
    
    this.restoreFrom = restoreFrom;
    return this;
  }

   /**
   * Get restoreFrom
   * @return restoreFrom
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsRequestSpecRestoreFrom getRestoreFrom() {
    return restoreFrom;
  }


  public void setRestoreFrom(V1alpha1OpsRequestSpecRestoreFrom restoreFrom) {
    this.restoreFrom = restoreFrom;
  }


  public V1alpha1OpsRequestSpec restoreSpec(V1alpha1OpsRequestSpecRestoreSpec restoreSpec) {
    
    this.restoreSpec = restoreSpec;
    return this;
  }

   /**
   * Get restoreSpec
   * @return restoreSpec
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsRequestSpecRestoreSpec getRestoreSpec() {
    return restoreSpec;
  }


  public void setRestoreSpec(V1alpha1OpsRequestSpecRestoreSpec restoreSpec) {
    this.restoreSpec = restoreSpec;
  }


  public V1alpha1OpsRequestSpec scriptSpec(V1alpha1OpsRequestSpecScriptSpec scriptSpec) {
    
    this.scriptSpec = scriptSpec;
    return this;
  }

   /**
   * Get scriptSpec
   * @return scriptSpec
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsRequestSpecScriptSpec getScriptSpec() {
    return scriptSpec;
  }


  public void setScriptSpec(V1alpha1OpsRequestSpecScriptSpec scriptSpec) {
    this.scriptSpec = scriptSpec;
  }


  public V1alpha1OpsRequestSpec switchover(List<V1alpha1OpsRequestSpecSwitchoverInner> switchover) {
    
    this.switchover = switchover;
    return this;
  }

  public V1alpha1OpsRequestSpec addSwitchoverItem(V1alpha1OpsRequestSpecSwitchoverInner switchoverItem) {
    if (this.switchover == null) {
      this.switchover = new ArrayList<>();
    }
    this.switchover.add(switchoverItem);
    return this;
  }

   /**
   * switchover the specified components.
   * @return switchover
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1OpsRequestSpecSwitchoverInner> getSwitchover() {
    return switchover;
  }


  public void setSwitchover(List<V1alpha1OpsRequestSpecSwitchoverInner> switchover) {
    this.switchover = switchover;
  }


  public V1alpha1OpsRequestSpec ttlSecondsAfterSucceed(Integer ttlSecondsAfterSucceed) {
    
    this.ttlSecondsAfterSucceed = ttlSecondsAfterSucceed;
    return this;
  }

   /**
   * ttlSecondsAfterSucceed OpsRequest will be deleted after TTLSecondsAfterSucceed second when OpsRequest.status.phase is Succeed.
   * @return ttlSecondsAfterSucceed
  **/
  @jakarta.annotation.Nullable
  public Integer getTtlSecondsAfterSucceed() {
    return ttlSecondsAfterSucceed;
  }


  public void setTtlSecondsAfterSucceed(Integer ttlSecondsAfterSucceed) {
    this.ttlSecondsAfterSucceed = ttlSecondsAfterSucceed;
  }


  public V1alpha1OpsRequestSpec ttlSecondsBeforeAbort(Integer ttlSecondsBeforeAbort) {
    
    this.ttlSecondsBeforeAbort = ttlSecondsBeforeAbort;
    return this;
  }

   /**
   * ttlSecondsBeforeAbort OpsRequest will wait at most TTLSecondsBeforeAbort seconds for start-conditions to be met. If not specified, the default value is 0, which means that the start-conditions must be met immediately.
   * @return ttlSecondsBeforeAbort
  **/
  @jakarta.annotation.Nullable
  public Integer getTtlSecondsBeforeAbort() {
    return ttlSecondsBeforeAbort;
  }


  public void setTtlSecondsBeforeAbort(Integer ttlSecondsBeforeAbort) {
    this.ttlSecondsBeforeAbort = ttlSecondsBeforeAbort;
  }


  public V1alpha1OpsRequestSpec type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * type defines the operation type.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public V1alpha1OpsRequestSpec upgrade(V1alpha1OpsRequestSpecUpgrade upgrade) {
    
    this.upgrade = upgrade;
    return this;
  }

   /**
   * Get upgrade
   * @return upgrade
  **/
  @jakarta.annotation.Nullable
  public V1alpha1OpsRequestSpecUpgrade getUpgrade() {
    return upgrade;
  }


  public void setUpgrade(V1alpha1OpsRequestSpecUpgrade upgrade) {
    this.upgrade = upgrade;
  }


  public V1alpha1OpsRequestSpec verticalScaling(List<Object> verticalScaling) {
    
    this.verticalScaling = verticalScaling;
    return this;
  }

  public V1alpha1OpsRequestSpec addVerticalScalingItem(Object verticalScalingItem) {
    if (this.verticalScaling == null) {
      this.verticalScaling = new ArrayList<>();
    }
    this.verticalScaling.add(verticalScalingItem);
    return this;
  }

   /**
   * verticalScaling defines what component need to vertical scale the specified compute resources.
   * @return verticalScaling
  **/
  @jakarta.annotation.Nullable
  public List<Object> getVerticalScaling() {
    return verticalScaling;
  }


  public void setVerticalScaling(List<Object> verticalScaling) {
    this.verticalScaling = verticalScaling;
  }


  public V1alpha1OpsRequestSpec volumeExpansion(List<V1alpha1OpsRequestSpecVolumeExpansionInner> volumeExpansion) {
    
    this.volumeExpansion = volumeExpansion;
    return this;
  }

  public V1alpha1OpsRequestSpec addVolumeExpansionItem(V1alpha1OpsRequestSpecVolumeExpansionInner volumeExpansionItem) {
    if (this.volumeExpansion == null) {
      this.volumeExpansion = new ArrayList<>();
    }
    this.volumeExpansion.add(volumeExpansionItem);
    return this;
  }

   /**
   * volumeExpansion defines what component and volumeClaimTemplate need to expand the specified storage.
   * @return volumeExpansion
  **/
  @jakarta.annotation.Nullable
  public List<V1alpha1OpsRequestSpecVolumeExpansionInner> getVolumeExpansion() {
    return volumeExpansion;
  }


  public void setVolumeExpansion(List<V1alpha1OpsRequestSpecVolumeExpansionInner> volumeExpansion) {
    this.volumeExpansion = volumeExpansion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1OpsRequestSpec v1alpha1OpsRequestSpec = (V1alpha1OpsRequestSpec) o;
    return Objects.equals(this.backupSpec, v1alpha1OpsRequestSpec.backupSpec) &&
        Objects.equals(this.cancel, v1alpha1OpsRequestSpec.cancel) &&
        Objects.equals(this.clusterRef, v1alpha1OpsRequestSpec.clusterRef) &&
        Objects.equals(this.customSpec, v1alpha1OpsRequestSpec.customSpec) &&
        Objects.equals(this.expose, v1alpha1OpsRequestSpec.expose) &&
        Objects.equals(this.horizontalScaling, v1alpha1OpsRequestSpec.horizontalScaling) &&
        Objects.equals(this.reconfigure, v1alpha1OpsRequestSpec.reconfigure) &&
        Objects.equals(this.reconfigures, v1alpha1OpsRequestSpec.reconfigures) &&
        Objects.equals(this.restart, v1alpha1OpsRequestSpec.restart) &&
        Objects.equals(this.restoreFrom, v1alpha1OpsRequestSpec.restoreFrom) &&
        Objects.equals(this.restoreSpec, v1alpha1OpsRequestSpec.restoreSpec) &&
        Objects.equals(this.scriptSpec, v1alpha1OpsRequestSpec.scriptSpec) &&
        Objects.equals(this.switchover, v1alpha1OpsRequestSpec.switchover) &&
        Objects.equals(this.ttlSecondsAfterSucceed, v1alpha1OpsRequestSpec.ttlSecondsAfterSucceed) &&
        Objects.equals(this.ttlSecondsBeforeAbort, v1alpha1OpsRequestSpec.ttlSecondsBeforeAbort) &&
        Objects.equals(this.type, v1alpha1OpsRequestSpec.type) &&
        Objects.equals(this.upgrade, v1alpha1OpsRequestSpec.upgrade) &&
        Objects.equals(this.verticalScaling, v1alpha1OpsRequestSpec.verticalScaling) &&
        Objects.equals(this.volumeExpansion, v1alpha1OpsRequestSpec.volumeExpansion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupSpec, cancel, clusterRef, customSpec, expose, horizontalScaling, reconfigure, reconfigures, restart, restoreFrom, restoreSpec, scriptSpec, switchover, ttlSecondsAfterSucceed, ttlSecondsBeforeAbort, type, upgrade, verticalScaling, volumeExpansion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1OpsRequestSpec {\n");
    sb.append("    backupSpec: ").append(toIndentedString(backupSpec)).append("\n");
    sb.append("    cancel: ").append(toIndentedString(cancel)).append("\n");
    sb.append("    clusterRef: ").append(toIndentedString(clusterRef)).append("\n");
    sb.append("    customSpec: ").append(toIndentedString(customSpec)).append("\n");
    sb.append("    expose: ").append(toIndentedString(expose)).append("\n");
    sb.append("    horizontalScaling: ").append(toIndentedString(horizontalScaling)).append("\n");
    sb.append("    reconfigure: ").append(toIndentedString(reconfigure)).append("\n");
    sb.append("    reconfigures: ").append(toIndentedString(reconfigures)).append("\n");
    sb.append("    restart: ").append(toIndentedString(restart)).append("\n");
    sb.append("    restoreFrom: ").append(toIndentedString(restoreFrom)).append("\n");
    sb.append("    restoreSpec: ").append(toIndentedString(restoreSpec)).append("\n");
    sb.append("    scriptSpec: ").append(toIndentedString(scriptSpec)).append("\n");
    sb.append("    switchover: ").append(toIndentedString(switchover)).append("\n");
    sb.append("    ttlSecondsAfterSucceed: ").append(toIndentedString(ttlSecondsAfterSucceed)).append("\n");
    sb.append("    ttlSecondsBeforeAbort: ").append(toIndentedString(ttlSecondsBeforeAbort)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    upgrade: ").append(toIndentedString(upgrade)).append("\n");
    sb.append("    verticalScaling: ").append(toIndentedString(verticalScaling)).append("\n");
    sb.append("    volumeExpansion: ").append(toIndentedString(volumeExpansion)).append("\n");
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
    openapiFields.add("backupSpec");
    openapiFields.add("cancel");
    openapiFields.add("clusterRef");
    openapiFields.add("customSpec");
    openapiFields.add("expose");
    openapiFields.add("horizontalScaling");
    openapiFields.add("reconfigure");
    openapiFields.add("reconfigures");
    openapiFields.add("restart");
    openapiFields.add("restoreFrom");
    openapiFields.add("restoreSpec");
    openapiFields.add("scriptSpec");
    openapiFields.add("switchover");
    openapiFields.add("ttlSecondsAfterSucceed");
    openapiFields.add("ttlSecondsBeforeAbort");
    openapiFields.add("type");
    openapiFields.add("upgrade");
    openapiFields.add("verticalScaling");
    openapiFields.add("volumeExpansion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("clusterRef");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1alpha1OpsRequestSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1alpha1OpsRequestSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha1OpsRequestSpec is not found in the empty JSON string", V1alpha1OpsRequestSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1alpha1OpsRequestSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha1OpsRequestSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1alpha1OpsRequestSpec.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `backupSpec`
      if (jsonObj.get("backupSpec") != null && !jsonObj.get("backupSpec").isJsonNull()) {
        V1alpha1OpsRequestSpecBackupSpec.validateJsonObject(jsonObj.getAsJsonObject("backupSpec"));
      }
      if (!jsonObj.get("clusterRef").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clusterRef` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clusterRef").toString()));
      }
      // validate the optional field `customSpec`
      if (jsonObj.get("customSpec") != null && !jsonObj.get("customSpec").isJsonNull()) {
        V1alpha1OpsRequestSpecCustomSpec.validateJsonObject(jsonObj.getAsJsonObject("customSpec"));
      }
      if (jsonObj.get("expose") != null && !jsonObj.get("expose").isJsonNull()) {
        JsonArray jsonArrayexpose = jsonObj.getAsJsonArray("expose");
        if (jsonArrayexpose != null) {
          // ensure the json data is an array
          if (!jsonObj.get("expose").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `expose` to be an array in the JSON string but got `%s`", jsonObj.get("expose").toString()));
          }

          // validate the optional field `expose` (array)
          for (int i = 0; i < jsonArrayexpose.size(); i++) {
            V1alpha1OpsRequestSpecExposeInner.validateJsonObject(jsonArrayexpose.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("horizontalScaling") != null && !jsonObj.get("horizontalScaling").isJsonNull()) {
        JsonArray jsonArrayhorizontalScaling = jsonObj.getAsJsonArray("horizontalScaling");
        if (jsonArrayhorizontalScaling != null) {
          // ensure the json data is an array
          if (!jsonObj.get("horizontalScaling").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `horizontalScaling` to be an array in the JSON string but got `%s`", jsonObj.get("horizontalScaling").toString()));
          }

          // validate the optional field `horizontalScaling` (array)
          for (int i = 0; i < jsonArrayhorizontalScaling.size(); i++) {
            V1alpha1OpsRequestSpecHorizontalScalingInner.validateJsonObject(jsonArrayhorizontalScaling.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `reconfigure`
      if (jsonObj.get("reconfigure") != null && !jsonObj.get("reconfigure").isJsonNull()) {
        V1alpha1OpsRequestSpecReconfigure.validateJsonObject(jsonObj.getAsJsonObject("reconfigure"));
      }
      if (jsonObj.get("reconfigures") != null && !jsonObj.get("reconfigures").isJsonNull()) {
        JsonArray jsonArrayreconfigures = jsonObj.getAsJsonArray("reconfigures");
        if (jsonArrayreconfigures != null) {
          // ensure the json data is an array
          if (!jsonObj.get("reconfigures").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `reconfigures` to be an array in the JSON string but got `%s`", jsonObj.get("reconfigures").toString()));
          }

          // validate the optional field `reconfigures` (array)
          for (int i = 0; i < jsonArrayreconfigures.size(); i++) {
            V1alpha1OpsRequestSpecReconfiguresInner.validateJsonObject(jsonArrayreconfigures.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("restart") != null && !jsonObj.get("restart").isJsonNull()) {
        JsonArray jsonArrayrestart = jsonObj.getAsJsonArray("restart");
        if (jsonArrayrestart != null) {
          // ensure the json data is an array
          if (!jsonObj.get("restart").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `restart` to be an array in the JSON string but got `%s`", jsonObj.get("restart").toString()));
          }

          // validate the optional field `restart` (array)
          for (int i = 0; i < jsonArrayrestart.size(); i++) {
            V1alpha1OpsRequestSpecRestartInner.validateJsonObject(jsonArrayrestart.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `restoreFrom`
      if (jsonObj.get("restoreFrom") != null && !jsonObj.get("restoreFrom").isJsonNull()) {
        V1alpha1OpsRequestSpecRestoreFrom.validateJsonObject(jsonObj.getAsJsonObject("restoreFrom"));
      }
      // validate the optional field `restoreSpec`
      if (jsonObj.get("restoreSpec") != null && !jsonObj.get("restoreSpec").isJsonNull()) {
        V1alpha1OpsRequestSpecRestoreSpec.validateJsonObject(jsonObj.getAsJsonObject("restoreSpec"));
      }
      // validate the optional field `scriptSpec`
      if (jsonObj.get("scriptSpec") != null && !jsonObj.get("scriptSpec").isJsonNull()) {
        V1alpha1OpsRequestSpecScriptSpec.validateJsonObject(jsonObj.getAsJsonObject("scriptSpec"));
      }
      if (jsonObj.get("switchover") != null && !jsonObj.get("switchover").isJsonNull()) {
        JsonArray jsonArrayswitchover = jsonObj.getAsJsonArray("switchover");
        if (jsonArrayswitchover != null) {
          // ensure the json data is an array
          if (!jsonObj.get("switchover").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `switchover` to be an array in the JSON string but got `%s`", jsonObj.get("switchover").toString()));
          }

          // validate the optional field `switchover` (array)
          for (int i = 0; i < jsonArrayswitchover.size(); i++) {
            V1alpha1OpsRequestSpecSwitchoverInner.validateJsonObject(jsonArrayswitchover.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `upgrade`
      if (jsonObj.get("upgrade") != null && !jsonObj.get("upgrade").isJsonNull()) {
        V1alpha1OpsRequestSpecUpgrade.validateJsonObject(jsonObj.getAsJsonObject("upgrade"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("verticalScaling") != null && !jsonObj.get("verticalScaling").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `verticalScaling` to be an array in the JSON string but got `%s`", jsonObj.get("verticalScaling").toString()));
      }
      if (jsonObj.get("volumeExpansion") != null && !jsonObj.get("volumeExpansion").isJsonNull()) {
        JsonArray jsonArrayvolumeExpansion = jsonObj.getAsJsonArray("volumeExpansion");
        if (jsonArrayvolumeExpansion != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumeExpansion").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumeExpansion` to be an array in the JSON string but got `%s`", jsonObj.get("volumeExpansion").toString()));
          }

          // validate the optional field `volumeExpansion` (array)
          for (int i = 0; i < jsonArrayvolumeExpansion.size(); i++) {
            V1alpha1OpsRequestSpecVolumeExpansionInner.validateJsonObject(jsonArrayvolumeExpansion.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha1OpsRequestSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha1OpsRequestSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha1OpsRequestSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha1OpsRequestSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha1OpsRequestSpec>() {
           @Override
           public void write(JsonWriter out, V1alpha1OpsRequestSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha1OpsRequestSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha1OpsRequestSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha1OpsRequestSpec
  * @throws IOException if the JSON string is invalid with respect to V1alpha1OpsRequestSpec
  */
  public static V1alpha1OpsRequestSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha1OpsRequestSpec.class);
  }

 /**
  * Convert an instance of V1alpha1OpsRequestSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
