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
import com.fortify.ssc.restclient.model.CustomTagLookupInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Holds the details about existed custom tag that is assigned or linked with some other entity
 */
@ApiModel(description = "Holds the details about existed custom tag that is assigned or linked with some other entity")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class CustomTagInfo {
  @SerializedName("guid")
  private String guid = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("valueList")
  private List<CustomTagLookupInfo> valueList = null;

   /**
   * Custom tag GUID
   * @return guid
  **/
  @ApiModelProperty(value = "Custom tag GUID")
  public String getGuid() {
    return guid;
  }

  public CustomTagInfo id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Custom tag id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Custom tag id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

   /**
   * Custom tag unique name
   * @return name
  **/
  @ApiModelProperty(value = "Custom tag unique name")
  public String getName() {
    return name;
  }

  public CustomTagInfo valueList(List<CustomTagLookupInfo> valueList) {
    this.valueList = valueList;
    return this;
  }

  public CustomTagInfo addValueListItem(CustomTagLookupInfo valueListItem) {
    if (this.valueList == null) {
      this.valueList = new ArrayList<CustomTagLookupInfo>();
    }
    this.valueList.add(valueListItem);
    return this;
  }

   /**
   * Collection of custom tag values
   * @return valueList
  **/
  @ApiModelProperty(value = "Collection of custom tag values")
  public List<CustomTagLookupInfo> getValueList() {
    return valueList;
  }

  public void setValueList(List<CustomTagLookupInfo> valueList) {
    this.valueList = valueList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomTagInfo customTagInfo = (CustomTagInfo) o;
    return Objects.equals(this.guid, customTagInfo.guid) &&
        Objects.equals(this.id, customTagInfo.id) &&
        Objects.equals(this.name, customTagInfo.name) &&
        Objects.equals(this.valueList, customTagInfo.valueList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guid, id, name, valueList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomTagInfo {\n");
    
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    valueList: ").append(toIndentedString(valueList)).append("\n");
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

