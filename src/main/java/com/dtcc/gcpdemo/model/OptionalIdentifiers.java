package com.dtcc.gcpdemo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OptionalIdentifiers
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-12T15:34:08.343888500+05:30[Asia/Calcutta]")


public class OptionalIdentifiers   {
  @JsonProperty("netSettlementId")
  private UUID netSettlementId = null;

  @JsonProperty("paymentId")
  private UUID paymentId = null;

  @JsonProperty("cancellationId")
  private UUID cancellationId = null;

  public OptionalIdentifiers netSettlementId(UUID netSettlementId) {
    this.netSettlementId = netSettlementId;
    return this;
  }

  /**
   * If this settlement has been aggregated, the ID of the netSettlement it belongs to
   * @return netSettlementId
   **/
  @Schema(example = "d5eecee5-6173-4c94-8e01-26cef1dbde5a", description = "If this settlement has been aggregated, the ID of the netSettlement it belongs to")
  
    @Valid
    public UUID getNetSettlementId() {
    return netSettlementId;
  }

  public void setNetSettlementId(UUID netSettlementId) {
    this.netSettlementId = netSettlementId;
  }

  public OptionalIdentifiers paymentId(UUID paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * If this settlement has been paid, the ID of the payment it belongs to
   * @return paymentId
   **/
  @Schema(example = "13356f3d-fcff-423b-870f-553fac0675f1", description = "If this settlement has been paid, the ID of the payment it belongs to")
  
    @Valid
    public UUID getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(UUID paymentId) {
    this.paymentId = paymentId;
  }

  public OptionalIdentifiers cancellationId(UUID cancellationId) {
    this.cancellationId = cancellationId;
    return this;
  }

  /**
   * If this settlement has been cancelled, the ID of the cancellation request
   * @return cancellationId
   **/
  @Schema(example = "37e9882a-984f-453e-a676-ed9e841c3150", description = "If this settlement has been cancelled, the ID of the cancellation request")
  
    @Valid
    public UUID getCancellationId() {
    return cancellationId;
  }

  public void setCancellationId(UUID cancellationId) {
    this.cancellationId = cancellationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionalIdentifiers optionalIdentifiers = (OptionalIdentifiers) o;
    return Objects.equals(this.netSettlementId, optionalIdentifiers.netSettlementId) &&
        Objects.equals(this.paymentId, optionalIdentifiers.paymentId) &&
        Objects.equals(this.cancellationId, optionalIdentifiers.cancellationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netSettlementId, paymentId, cancellationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionalIdentifiers {\n");
    
    sb.append("    netSettlementId: ").append(toIndentedString(netSettlementId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    cancellationId: ").append(toIndentedString(cancellationId)).append("\n");
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
