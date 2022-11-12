package com.dtcc.gcpdemo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TreatyIds
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-12T15:34:08.343888500+05:30[Asia/Calcutta]")


public class TreatyIds   {
  @JsonProperty("treatyId")
  private String treatyId = null;

  @JsonProperty("brokerId")
  private String brokerId = null;

  @JsonProperty("brokerGroupId")
  private String brokerGroupId = null;

  @JsonProperty("statementId")
  private String statementId = null;

  @JsonProperty("lineItem")
  private String lineItem = null;

  public TreatyIds treatyId(String treatyId) {
    this.treatyId = treatyId;
    return this;
  }

  /**
   * Treaty identifier
   * @return treatyId
   **/
  @Schema(example = "123456789", required = true, description = "Treaty identifier")
      @NotNull

  @Pattern(regexp="\\w+")   public String getTreatyId() {
    return treatyId;
  }

  public void setTreatyId(String treatyId) {
    this.treatyId = treatyId;
  }

  public TreatyIds brokerId(String brokerId) {
    this.brokerId = brokerId;
    return this;
  }

  /**
   * broker ID, identifies the submitting broker
   * @return brokerId
   **/
  @Schema(example = "666", required = true, description = "broker ID, identifies the submitting broker")
      @NotNull

  @Pattern(regexp="\\w+")   public String getBrokerId() {
    return brokerId;
  }

  public void setBrokerId(String brokerId) {
    this.brokerId = brokerId;
  }

  public TreatyIds brokerGroupId(String brokerGroupId) {
    this.brokerGroupId = brokerGroupId;
    return this;
  }

  /**
   * broker group ID, used to group statements together for submission
   * @return brokerGroupId
   **/
  @Schema(example = "xyz775", required = true, description = "broker group ID, used to group statements together for submission")
      @NotNull

    public String getBrokerGroupId() {
    return brokerGroupId;
  }

  public void setBrokerGroupId(String brokerGroupId) {
    this.brokerGroupId = brokerGroupId;
  }

  public TreatyIds statementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  /**
   * statement ID
   * @return statementId
   **/
  @Schema(example = "s123456", required = true, description = "statement ID")
      @NotNull

  @Pattern(regexp="\\w+")   public String getStatementId() {
    return statementId;
  }

  public void setStatementId(String statementId) {
    this.statementId = statementId;
  }

  public TreatyIds lineItem(String lineItem) {
    this.lineItem = lineItem;
    return this;
  }

  /**
   * line item on a statement
   * @return lineItem
   **/
  @Schema(example = "17", required = true, description = "line item on a statement")
      @NotNull

  @Pattern(regexp="\\w+")   public String getLineItem() {
    return lineItem;
  }

  public void setLineItem(String lineItem) {
    this.lineItem = lineItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TreatyIds treatyIds = (TreatyIds) o;
    return Objects.equals(this.treatyId, treatyIds.treatyId) &&
        Objects.equals(this.brokerId, treatyIds.brokerId) &&
        Objects.equals(this.brokerGroupId, treatyIds.brokerGroupId) &&
        Objects.equals(this.statementId, treatyIds.statementId) &&
        Objects.equals(this.lineItem, treatyIds.lineItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(treatyId, brokerId, brokerGroupId, statementId, lineItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TreatyIds {\n");
    
    sb.append("    treatyId: ").append(toIndentedString(treatyId)).append("\n");
    sb.append("    brokerId: ").append(toIndentedString(brokerId)).append("\n");
    sb.append("    brokerGroupId: ").append(toIndentedString(brokerGroupId)).append("\n");
    sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
    sb.append("    lineItem: ").append(toIndentedString(lineItem)).append("\n");
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
