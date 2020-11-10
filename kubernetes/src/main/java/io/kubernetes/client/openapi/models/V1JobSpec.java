/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** JobSpec describes how the job execution will look like. */
@ApiModel(description = "JobSpec describes how the job execution will look like.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2020-11-06T08:58:17.566Z[Etc/UTC]")
public class V1JobSpec {
  public static final String SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS = "activeDeadlineSeconds";

  @SerializedName(SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS)
  private Long activeDeadlineSeconds;

  public static final String SERIALIZED_NAME_BACKOFF_LIMIT = "backoffLimit";

  @SerializedName(SERIALIZED_NAME_BACKOFF_LIMIT)
  private Integer backoffLimit;

  public static final String SERIALIZED_NAME_COMPLETIONS = "completions";

  @SerializedName(SERIALIZED_NAME_COMPLETIONS)
  private Integer completions;

  public static final String SERIALIZED_NAME_MANUAL_SELECTOR = "manualSelector";

  @SerializedName(SERIALIZED_NAME_MANUAL_SELECTOR)
  private Boolean manualSelector;

  public static final String SERIALIZED_NAME_PARALLELISM = "parallelism";

  @SerializedName(SERIALIZED_NAME_PARALLELISM)
  private Integer parallelism;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";

  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1LabelSelector selector;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";

  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private V1PodTemplateSpec template;

  public static final String SERIALIZED_NAME_TTL_SECONDS_AFTER_FINISHED = "ttlSecondsAfterFinished";

  @SerializedName(SERIALIZED_NAME_TTL_SECONDS_AFTER_FINISHED)
  private Integer ttlSecondsAfterFinished;

  public V1JobSpec activeDeadlineSeconds(Long activeDeadlineSeconds) {

    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

  /**
   * Specifies the duration in seconds relative to the startTime that the job may be active before
   * the system tries to terminate it; value must be positive integer
   *
   * @return activeDeadlineSeconds
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it; value must be positive integer")
  public Long getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }

  public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }

  public V1JobSpec backoffLimit(Integer backoffLimit) {

    this.backoffLimit = backoffLimit;
    return this;
  }

  /**
   * Specifies the number of retries before marking this job failed. Defaults to 6
   *
   * @return backoffLimit
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value = "Specifies the number of retries before marking this job failed. Defaults to 6")
  public Integer getBackoffLimit() {
    return backoffLimit;
  }

  public void setBackoffLimit(Integer backoffLimit) {
    this.backoffLimit = backoffLimit;
  }

  public V1JobSpec completions(Integer completions) {

    this.completions = completions;
    return this;
  }

  /**
   * Specifies the desired number of successfully finished pods the job should be run with. Setting
   * to nil means that the success of any pod signals the success of all pods, and allows
   * parallelism to have any positive value. Setting to 1 means that parallelism is limited to 1 and
   * the success of that pod signals the success of the job. More info:
   * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   *
   * @return completions
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Specifies the desired number of successfully finished pods the job should be run with.  Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/")
  public Integer getCompletions() {
    return completions;
  }

  public void setCompletions(Integer completions) {
    this.completions = completions;
  }

  public V1JobSpec manualSelector(Boolean manualSelector) {

    this.manualSelector = manualSelector;
    return this;
  }

  /**
   * manualSelector controls generation of pod labels and pod selectors. Leave
   * &#x60;manualSelector&#x60; unset unless you are certain what you are doing. When false or
   * unset, the system pick labels unique to this job and appends those labels to the pod template.
   * When true, the user is responsible for picking unique labels and specifying the selector.
   * Failure to pick a unique label may cause this and other jobs to not function correctly.
   * However, You may see &#x60;manualSelector&#x3D;true&#x60; in jobs that were created with the
   * old &#x60;extensions/v1beta1&#x60; API. More info:
   * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
   *
   * @return manualSelector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see `manualSelector=true` in jobs that were created with the old `extensions/v1beta1` API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector")
  public Boolean getManualSelector() {
    return manualSelector;
  }

  public void setManualSelector(Boolean manualSelector) {
    this.manualSelector = manualSelector;
  }

  public V1JobSpec parallelism(Integer parallelism) {

    this.parallelism = parallelism;
    return this;
  }

  /**
   * Specifies the maximum desired number of pods the job should run at any given time. The actual
   * number of pods running in steady state will be less than this number when ((.spec.completions -
   * .status.successful) &lt; .spec.parallelism), i.e. when the work left to do is less than max
   * parallelism. More info:
   * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
   *
   * @return parallelism
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/")
  public Integer getParallelism() {
    return parallelism;
  }

  public void setParallelism(Integer parallelism) {
    this.parallelism = parallelism;
  }

  public V1JobSpec selector(V1LabelSelector selector) {

    this.selector = selector;
    return this;
  }

  /**
   * Get selector
   *
   * @return selector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }

  public V1JobSpec template(V1PodTemplateSpec template) {

    this.template = template;
    return this;
  }

  /**
   * Get template
   *
   * @return template
   */
  @ApiModelProperty(required = true, value = "")
  public V1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(V1PodTemplateSpec template) {
    this.template = template;
  }

  public V1JobSpec ttlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {

    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    return this;
  }

  /**
   * ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either
   * Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it
   * is eligible to be automatically deleted. When the Job is being deleted, its lifecycle
   * guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won&#39;t be
   * automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted
   * immediately after it finishes. This field is alpha-level and is only honored by servers that
   * enable the TTLAfterFinished feature.
   *
   * @return ttlSecondsAfterFinished
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes. This field is alpha-level and is only honored by servers that enable the TTLAfterFinished feature.")
  public Integer getTtlSecondsAfterFinished() {
    return ttlSecondsAfterFinished;
  }

  public void setTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1JobSpec v1JobSpec = (V1JobSpec) o;
    return Objects.equals(this.activeDeadlineSeconds, v1JobSpec.activeDeadlineSeconds)
        && Objects.equals(this.backoffLimit, v1JobSpec.backoffLimit)
        && Objects.equals(this.completions, v1JobSpec.completions)
        && Objects.equals(this.manualSelector, v1JobSpec.manualSelector)
        && Objects.equals(this.parallelism, v1JobSpec.parallelism)
        && Objects.equals(this.selector, v1JobSpec.selector)
        && Objects.equals(this.template, v1JobSpec.template)
        && Objects.equals(this.ttlSecondsAfterFinished, v1JobSpec.ttlSecondsAfterFinished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        activeDeadlineSeconds,
        backoffLimit,
        completions,
        manualSelector,
        parallelism,
        selector,
        template,
        ttlSecondsAfterFinished);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1JobSpec {\n");
    sb.append("    activeDeadlineSeconds: ")
        .append(toIndentedString(activeDeadlineSeconds))
        .append("\n");
    sb.append("    backoffLimit: ").append(toIndentedString(backoffLimit)).append("\n");
    sb.append("    completions: ").append(toIndentedString(completions)).append("\n");
    sb.append("    manualSelector: ").append(toIndentedString(manualSelector)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    ttlSecondsAfterFinished: ")
        .append(toIndentedString(ttlSecondsAfterFinished))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
