/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
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
import io.kubeblocks.apps.models.V1alpha1ClusterSpecSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha1ClusterSpecVolumeClaimTemplates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-31T07:24:37.743Z[Etc/UTC]")
public class V1alpha1ClusterSpecVolumeClaimTemplates {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private V1alpha1ClusterSpecSpec spec;


  public V1alpha1ClusterSpecVolumeClaimTemplates name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Reference &#x60;ClusterDefinition.spec.componentDefs.containers.volumeMounts.name&#x60;.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Reference `ClusterDefinition.spec.componentDefs.containers.volumeMounts.name`.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ClusterSpecVolumeClaimTemplates spec(V1alpha1ClusterSpecSpec spec) {
    
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ClusterSpecSpec getSpec() {
    return spec;
  }


  public void setSpec(V1alpha1ClusterSpecSpec spec) {
    this.spec = spec;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterSpecVolumeClaimTemplates v1alpha1ClusterSpecVolumeClaimTemplates = (V1alpha1ClusterSpecVolumeClaimTemplates) o;
    return Objects.equals(this.name, v1alpha1ClusterSpecVolumeClaimTemplates.name) &&
        Objects.equals(this.spec, v1alpha1ClusterSpecVolumeClaimTemplates.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, spec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterSpecVolumeClaimTemplates {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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

}
