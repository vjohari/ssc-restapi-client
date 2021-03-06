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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AlertTriggerDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class AlertTriggerDto {
  @SerializedName("alertDefinitionId")
  private Long alertDefinitionId = null;

  /**
   * Gets or Sets monitoredAttribute
   */
  @JsonAdapter(MonitoredAttributeEnum.Adapter.class)
  public enum MonitoredAttributeEnum {
    SIGN_OFF_STATE("SIGN_OFF_STATE"),
    
    VALUE_GT("VALUE_GT"),
    
    VALUE_LT("VALUE_LT"),
    
    VALUE_EQ("VALUE_EQ"),
    
    VALUE_GTE("VALUE_GTE"),
    
    VALUE_LTE("VALUE_LTE"),
    
    EVENT_TYPE("EVENT_TYPE"),
    
    SCHEDULED_ALERT_TIME("SCHEDULED_ALERT_TIME");

    private String value;

    MonitoredAttributeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MonitoredAttributeEnum fromValue(String text) {
      for (MonitoredAttributeEnum b : MonitoredAttributeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MonitoredAttributeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MonitoredAttributeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MonitoredAttributeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MonitoredAttributeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("monitoredAttribute")
  private MonitoredAttributeEnum monitoredAttribute = null;

  @SerializedName("resetAfterTriggering")
  private Boolean resetAfterTriggering = null;

  @SerializedName("triggeredValue")
  private String triggeredValue = null;

  public AlertTriggerDto alertDefinitionId(Long alertDefinitionId) {
    this.alertDefinitionId = alertDefinitionId;
    return this;
  }

   /**
   * Get alertDefinitionId
   * @return alertDefinitionId
  **/
  @ApiModelProperty(value = "")
  public Long getAlertDefinitionId() {
    return alertDefinitionId;
  }

  public void setAlertDefinitionId(Long alertDefinitionId) {
    this.alertDefinitionId = alertDefinitionId;
  }

  public AlertTriggerDto monitoredAttribute(MonitoredAttributeEnum monitoredAttribute) {
    this.monitoredAttribute = monitoredAttribute;
    return this;
  }

   /**
   * Get monitoredAttribute
   * @return monitoredAttribute
  **/
  @ApiModelProperty(value = "")
  public MonitoredAttributeEnum getMonitoredAttribute() {
    return monitoredAttribute;
  }

  public void setMonitoredAttribute(MonitoredAttributeEnum monitoredAttribute) {
    this.monitoredAttribute = monitoredAttribute;
  }

  public AlertTriggerDto resetAfterTriggering(Boolean resetAfterTriggering) {
    this.resetAfterTriggering = resetAfterTriggering;
    return this;
  }

   /**
   * Get resetAfterTriggering
   * @return resetAfterTriggering
  **/
  @ApiModelProperty(value = "")
  public Boolean isResetAfterTriggering() {
    return resetAfterTriggering;
  }

  public void setResetAfterTriggering(Boolean resetAfterTriggering) {
    this.resetAfterTriggering = resetAfterTriggering;
  }

  public AlertTriggerDto triggeredValue(String triggeredValue) {
    this.triggeredValue = triggeredValue;
    return this;
  }

   /**
   * Get triggeredValue
   * @return triggeredValue
  **/
  @ApiModelProperty(value = "")
  public String getTriggeredValue() {
    return triggeredValue;
  }

  public void setTriggeredValue(String triggeredValue) {
    this.triggeredValue = triggeredValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertTriggerDto alertTriggerDto = (AlertTriggerDto) o;
    return Objects.equals(this.alertDefinitionId, alertTriggerDto.alertDefinitionId) &&
        Objects.equals(this.monitoredAttribute, alertTriggerDto.monitoredAttribute) &&
        Objects.equals(this.resetAfterTriggering, alertTriggerDto.resetAfterTriggering) &&
        Objects.equals(this.triggeredValue, alertTriggerDto.triggeredValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertDefinitionId, monitoredAttribute, resetAfterTriggering, triggeredValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertTriggerDto {\n");
    
    sb.append("    alertDefinitionId: ").append(toIndentedString(alertDefinitionId)).append("\n");
    sb.append("    monitoredAttribute: ").append(toIndentedString(monitoredAttribute)).append("\n");
    sb.append("    resetAfterTriggering: ").append(toIndentedString(resetAfterTriggering)).append("\n");
    sb.append("    triggeredValue: ").append(toIndentedString(triggeredValue)).append("\n");
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

