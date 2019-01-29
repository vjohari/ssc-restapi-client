/*
 * Fortify Software Security Center API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1:18.20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.fortify.ssc.restclient.model;

import java.util.Objects;
import com.fortify.ssc.restclient.model.CloudPoolStats;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Cloudscan worker pool
 */
@ApiModel(description = "Cloudscan worker pool")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class CloudPool {
  @SerializedName("childOfGlobalPool")
  private Boolean childOfGlobalPool = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("isDeletable")
  private Boolean isDeletable = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("stats")
  private CloudPoolStats stats = null;

  @SerializedName("uuid")
  private String uuid = null;

  public CloudPool childOfGlobalPool(Boolean childOfGlobalPool) {
    this.childOfGlobalPool = childOfGlobalPool;
    return this;
  }

   /**
   * Get childOfGlobalPool
   * @return childOfGlobalPool
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isChildOfGlobalPool() {
    return childOfGlobalPool;
  }

  public void setChildOfGlobalPool(Boolean childOfGlobalPool) {
    this.childOfGlobalPool = childOfGlobalPool;
  }

  public CloudPool description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Cloudscan pool description
   * @return description
  **/
  @ApiModelProperty(value = "Cloudscan pool description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * Get isDeletable
   * @return isDeletable
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isIsDeletable() {
    return isDeletable;
  }

  public CloudPool name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Cloudscan pool name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Cloudscan pool name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * Cloudscan pool path
   * @return path
  **/
  @ApiModelProperty(value = "Cloudscan pool path")
  public String getPath() {
    return path;
  }

  public CloudPool stats(CloudPoolStats stats) {
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @ApiModelProperty(value = "")
  public CloudPoolStats getStats() {
    return stats;
  }

  public void setStats(CloudPoolStats stats) {
    this.stats = stats;
  }

   /**
   * Cloudscan pool UUID
   * @return uuid
  **/
  @ApiModelProperty(value = "Cloudscan pool UUID")
  public String getUuid() {
    return uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudPool cloudPool = (CloudPool) o;
    return Objects.equals(this.childOfGlobalPool, cloudPool.childOfGlobalPool) &&
        Objects.equals(this.description, cloudPool.description) &&
        Objects.equals(this.isDeletable, cloudPool.isDeletable) &&
        Objects.equals(this.name, cloudPool.name) &&
        Objects.equals(this.path, cloudPool.path) &&
        Objects.equals(this.stats, cloudPool.stats) &&
        Objects.equals(this.uuid, cloudPool.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childOfGlobalPool, description, isDeletable, name, path, stats, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudPool {\n");
    
    sb.append("    childOfGlobalPool: ").append(toIndentedString(childOfGlobalPool)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isDeletable: ").append(toIndentedString(isDeletable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
