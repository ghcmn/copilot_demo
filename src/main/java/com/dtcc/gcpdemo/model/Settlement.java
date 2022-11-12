package com.dtcc.gcpdemo.model;

import java.util.Objects;
import com.dtcc.gcpdemo.model.AuditBlock;
import com.dtcc.gcpdemo.model.OptionalIdentifiers;
import com.dtcc.gcpdemo.model.OriginatingIdentifiers;
import com.dtcc.gcpdemo.model.PaymentDetails;
import com.dtcc.gcpdemo.model.PaymentMethod;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Settlement
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-12T15:34:08.343888500+05:30[Asia/Calcutta]")


public class Settlement   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("paymentMethod")
  private PaymentMethod paymentMethod = null;

  @JsonProperty("scheduleDate")
  private OffsetDateTime scheduleDate = null;

  @JsonProperty("exchangeRate")
  private BigDecimal exchangeRate = new BigDecimal(1);

  @JsonProperty("debit")
  private PaymentDetails debit = null;

  @JsonProperty("credit")
  private PaymentDetails credit = null;

  @JsonProperty("optionalIdentifiers")
  private OptionalIdentifiers optionalIdentifiers = null;

  @JsonProperty("uniqueRef")
  private String uniqueRef = null;

  @JsonProperty("originatingIdentifiers")
  private OriginatingIdentifiers originatingIdentifiers = null;

  @JsonProperty("audit")
  private AuditBlock audit = null;

  public Settlement id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * unique ID of this settlement
   * @return id
   **/
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "unique ID of this settlement")
  
    @Valid
    public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Settlement paymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public Settlement scheduleDate(OffsetDateTime scheduleDate) {
    this.scheduleDate = scheduleDate;
    return this;
  }

  /**
   * The earliest time that this settlement can be paid
   * @return scheduleDate
   **/
  @Schema(example = "2021-08-29T09:12:33.001Z", required = true, description = "The earliest time that this settlement can be paid")
      @NotNull

    @Valid
    public OffsetDateTime getScheduleDate() {
    return scheduleDate;
  }

  public void setScheduleDate(OffsetDateTime scheduleDate) {
    this.scheduleDate = scheduleDate;
  }

  public Settlement exchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  /**
   * The rate used to convert the debit currency to the credit currency. When both currencies are the same this has a value of 1 (the default)
   * minimum: 0
   * @return exchangeRate
   **/
  @Schema(example = "1", description = "The rate used to convert the debit currency to the credit currency. When both currencies are the same this has a value of 1 (the default)")
  
    @Valid
  @DecimalMin("0")  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }

  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }

  public Settlement debit(PaymentDetails debit) {
    this.debit = debit;
    return this;
  }

  /**
   * Get debit
   * @return debit
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PaymentDetails getDebit() {
    return debit;
  }

  public void setDebit(PaymentDetails debit) {
    this.debit = debit;
  }

  public Settlement credit(PaymentDetails credit) {
    this.credit = credit;
    return this;
  }

  /**
   * Get credit
   * @return credit
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PaymentDetails getCredit() {
    return credit;
  }

  public void setCredit(PaymentDetails credit) {
    this.credit = credit;
  }

  public Settlement optionalIdentifiers(OptionalIdentifiers optionalIdentifiers) {
    this.optionalIdentifiers = optionalIdentifiers;
    return this;
  }

  /**
   * Get optionalIdentifiers
   * @return optionalIdentifiers
   **/
  @Schema(description = "")
  
    @Valid
    public OptionalIdentifiers getOptionalIdentifiers() {
    return optionalIdentifiers;
  }

  public void setOptionalIdentifiers(OptionalIdentifiers optionalIdentifiers) {
    this.optionalIdentifiers = optionalIdentifiers;
  }

  public Settlement uniqueRef(String uniqueRef) {
    this.uniqueRef = uniqueRef;
    return this;
  }

  /**
   * the checksum of all the attributes contained in the OriginatingIdentifiers object. Used to enforce uniqueness when creating new resources
   * @return uniqueRef
   **/
  @Schema(example = "77add1d5f41223d5582fca736a5cb335", accessMode = Schema.AccessMode.READ_ONLY, description = "the checksum of all the attributes contained in the OriginatingIdentifiers object. Used to enforce uniqueness when creating new resources")
  
    public String getUniqueRef() {
    return uniqueRef;
  }

  public void setUniqueRef(String uniqueRef) {
    this.uniqueRef = uniqueRef;
  }

  public Settlement originatingIdentifiers(OriginatingIdentifiers originatingIdentifiers) {
    this.originatingIdentifiers = originatingIdentifiers;
    return this;
  }

  /**
   * Get originatingIdentifiers
   * @return originatingIdentifiers
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OriginatingIdentifiers getOriginatingIdentifiers() {
    return originatingIdentifiers;
  }

  public void setOriginatingIdentifiers(OriginatingIdentifiers originatingIdentifiers) {
    this.originatingIdentifiers = originatingIdentifiers;
  }

  public Settlement audit(AuditBlock audit) {
    this.audit = audit;
    return this;
  }

  /**
   * Get audit
   * @return audit
   **/
  @Schema(description = "")
  
    @Valid
    public AuditBlock getAudit() {
    return audit;
  }

  public void setAudit(AuditBlock audit) {
    this.audit = audit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Settlement settlement = (Settlement) o;
    return Objects.equals(this.id, settlement.id) &&
        Objects.equals(this.paymentMethod, settlement.paymentMethod) &&
        Objects.equals(this.scheduleDate, settlement.scheduleDate) &&
        Objects.equals(this.exchangeRate, settlement.exchangeRate) &&
        Objects.equals(this.debit, settlement.debit) &&
        Objects.equals(this.credit, settlement.credit) &&
        Objects.equals(this.optionalIdentifiers, settlement.optionalIdentifiers) &&
        Objects.equals(this.uniqueRef, settlement.uniqueRef) &&
        Objects.equals(this.originatingIdentifiers, settlement.originatingIdentifiers) &&
        Objects.equals(this.audit, settlement.audit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, paymentMethod, scheduleDate, exchangeRate, debit, credit, optionalIdentifiers, uniqueRef, originatingIdentifiers, audit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settlement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    scheduleDate: ").append(toIndentedString(scheduleDate)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    debit: ").append(toIndentedString(debit)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    optionalIdentifiers: ").append(toIndentedString(optionalIdentifiers)).append("\n");
    sb.append("    uniqueRef: ").append(toIndentedString(uniqueRef)).append("\n");
    sb.append("    originatingIdentifiers: ").append(toIndentedString(originatingIdentifiers)).append("\n");
    sb.append("    audit: ").append(toIndentedString(audit)).append("\n");
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
