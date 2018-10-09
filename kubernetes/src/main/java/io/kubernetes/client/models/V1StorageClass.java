/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.11.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.models.V1TopologySelectorTerm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.  StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.
 */
@ApiModel(description = "StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.  StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.")

public class V1StorageClass {
  @SerializedName("allowVolumeExpansion")
  private Boolean allowVolumeExpansion = null;

  @SerializedName("allowedTopologies")
  private List<V1TopologySelectorTerm> allowedTopologies = null;

  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("mountOptions")
  private List<String> mountOptions = null;

  @SerializedName("parameters")
  private Map<String, String> parameters = null;

  @SerializedName("provisioner")
  private String provisioner = null;

  @SerializedName("reclaimPolicy")
  private String reclaimPolicy = null;

  @SerializedName("volumeBindingMode")
  private String volumeBindingMode = null;

  public V1StorageClass allowVolumeExpansion(Boolean allowVolumeExpansion) {
    this.allowVolumeExpansion = allowVolumeExpansion;
    return this;
  }

   /**
   * AllowVolumeExpansion shows whether the storage class allow volume expand
   * @return allowVolumeExpansion
  **/
  @ApiModelProperty(value = "AllowVolumeExpansion shows whether the storage class allow volume expand")
  public Boolean isAllowVolumeExpansion() {
    return allowVolumeExpansion;
  }

  public void setAllowVolumeExpansion(Boolean allowVolumeExpansion) {
    this.allowVolumeExpansion = allowVolumeExpansion;
  }

  public V1StorageClass allowedTopologies(List<V1TopologySelectorTerm> allowedTopologies) {
    this.allowedTopologies = allowedTopologies;
    return this;
  }

  public V1StorageClass addAllowedTopologiesItem(V1TopologySelectorTerm allowedTopologiesItem) {
    if (this.allowedTopologies == null) {
      this.allowedTopologies = new ArrayList<V1TopologySelectorTerm>();
    }
    this.allowedTopologies.add(allowedTopologiesItem);
    return this;
  }

   /**
   * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is alpha-level and is only honored by servers that enable the DynamicProvisioningScheduling feature.
   * @return allowedTopologies
  **/
  @ApiModelProperty(value = "Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is alpha-level and is only honored by servers that enable the DynamicProvisioningScheduling feature.")
  public List<V1TopologySelectorTerm> getAllowedTopologies() {
    return allowedTopologies;
  }

  public void setAllowedTopologies(List<V1TopologySelectorTerm> allowedTopologies) {
    this.allowedTopologies = allowedTopologies;
  }

  public V1StorageClass apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1StorageClass kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1StorageClass metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1StorageClass mountOptions(List<String> mountOptions) {
    this.mountOptions = mountOptions;
    return this;
  }

  public V1StorageClass addMountOptionsItem(String mountOptionsItem) {
    if (this.mountOptions == null) {
      this.mountOptions = new ArrayList<String>();
    }
    this.mountOptions.add(mountOptionsItem);
    return this;
  }

   /**
   * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. [\&quot;ro\&quot;, \&quot;soft\&quot;]. Not validated - mount of the PVs will simply fail if one is invalid.
   * @return mountOptions
  **/
  @ApiModelProperty(value = "Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. [\"ro\", \"soft\"]. Not validated - mount of the PVs will simply fail if one is invalid.")
  public List<String> getMountOptions() {
    return mountOptions;
  }

  public void setMountOptions(List<String> mountOptions) {
    this.mountOptions = mountOptions;
  }

  public V1StorageClass parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public V1StorageClass putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<String, String>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
   * @return parameters
  **/
  @ApiModelProperty(value = "Parameters holds the parameters for the provisioner that should create volumes of this storage class.")
  public Map<String, String> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }

  public V1StorageClass provisioner(String provisioner) {
    this.provisioner = provisioner;
    return this;
  }

   /**
   * Provisioner indicates the type of the provisioner.
   * @return provisioner
  **/
  @ApiModelProperty(required = true, value = "Provisioner indicates the type of the provisioner.")
  public String getProvisioner() {
    return provisioner;
  }

  public void setProvisioner(String provisioner) {
    this.provisioner = provisioner;
  }

  public V1StorageClass reclaimPolicy(String reclaimPolicy) {
    this.reclaimPolicy = reclaimPolicy;
    return this;
  }

   /**
   * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
   * @return reclaimPolicy
  **/
  @ApiModelProperty(value = "Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.")
  public String getReclaimPolicy() {
    return reclaimPolicy;
  }

  public void setReclaimPolicy(String reclaimPolicy) {
    this.reclaimPolicy = reclaimPolicy;
  }

  public V1StorageClass volumeBindingMode(String volumeBindingMode) {
    this.volumeBindingMode = volumeBindingMode;
    return this;
  }

   /**
   * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is alpha-level and is only honored by servers that enable the VolumeScheduling feature.
   * @return volumeBindingMode
  **/
  @ApiModelProperty(value = "VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is alpha-level and is only honored by servers that enable the VolumeScheduling feature.")
  public String getVolumeBindingMode() {
    return volumeBindingMode;
  }

  public void setVolumeBindingMode(String volumeBindingMode) {
    this.volumeBindingMode = volumeBindingMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1StorageClass v1StorageClass = (V1StorageClass) o;
    return Objects.equals(this.allowVolumeExpansion, v1StorageClass.allowVolumeExpansion) &&
        Objects.equals(this.allowedTopologies, v1StorageClass.allowedTopologies) &&
        Objects.equals(this.apiVersion, v1StorageClass.apiVersion) &&
        Objects.equals(this.kind, v1StorageClass.kind) &&
        Objects.equals(this.metadata, v1StorageClass.metadata) &&
        Objects.equals(this.mountOptions, v1StorageClass.mountOptions) &&
        Objects.equals(this.parameters, v1StorageClass.parameters) &&
        Objects.equals(this.provisioner, v1StorageClass.provisioner) &&
        Objects.equals(this.reclaimPolicy, v1StorageClass.reclaimPolicy) &&
        Objects.equals(this.volumeBindingMode, v1StorageClass.volumeBindingMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowVolumeExpansion, allowedTopologies, apiVersion, kind, metadata, mountOptions, parameters, provisioner, reclaimPolicy, volumeBindingMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1StorageClass {\n");
    
    sb.append("    allowVolumeExpansion: ").append(toIndentedString(allowVolumeExpansion)).append("\n");
    sb.append("    allowedTopologies: ").append(toIndentedString(allowedTopologies)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    mountOptions: ").append(toIndentedString(mountOptions)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    provisioner: ").append(toIndentedString(provisioner)).append("\n");
    sb.append("    reclaimPolicy: ").append(toIndentedString(reclaimPolicy)).append("\n");
    sb.append("    volumeBindingMode: ").append(toIndentedString(volumeBindingMode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

