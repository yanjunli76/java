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
import io.kubernetes.client.models.V1beta1Webhook;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ValidatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and object without changing it.
 */
@ApiModel(description = "ValidatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and object without changing it.")

public class V1beta1ValidatingWebhookConfiguration {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("webhooks")
  private List<V1beta1Webhook> webhooks = null;

  public V1beta1ValidatingWebhookConfiguration apiVersion(String apiVersion) {
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

  public V1beta1ValidatingWebhookConfiguration kind(String kind) {
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

  public V1beta1ValidatingWebhookConfiguration metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
   * @return metadata
  **/
  @ApiModelProperty(value = "Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1beta1ValidatingWebhookConfiguration webhooks(List<V1beta1Webhook> webhooks) {
    this.webhooks = webhooks;
    return this;
  }

  public V1beta1ValidatingWebhookConfiguration addWebhooksItem(V1beta1Webhook webhooksItem) {
    if (this.webhooks == null) {
      this.webhooks = new ArrayList<V1beta1Webhook>();
    }
    this.webhooks.add(webhooksItem);
    return this;
  }

   /**
   * Webhooks is a list of webhooks and the affected resources and operations.
   * @return webhooks
  **/
  @ApiModelProperty(value = "Webhooks is a list of webhooks and the affected resources and operations.")
  public List<V1beta1Webhook> getWebhooks() {
    return webhooks;
  }

  public void setWebhooks(List<V1beta1Webhook> webhooks) {
    this.webhooks = webhooks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ValidatingWebhookConfiguration v1beta1ValidatingWebhookConfiguration = (V1beta1ValidatingWebhookConfiguration) o;
    return Objects.equals(this.apiVersion, v1beta1ValidatingWebhookConfiguration.apiVersion) &&
        Objects.equals(this.kind, v1beta1ValidatingWebhookConfiguration.kind) &&
        Objects.equals(this.metadata, v1beta1ValidatingWebhookConfiguration.metadata) &&
        Objects.equals(this.webhooks, v1beta1ValidatingWebhookConfiguration.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, webhooks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ValidatingWebhookConfiguration {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
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

