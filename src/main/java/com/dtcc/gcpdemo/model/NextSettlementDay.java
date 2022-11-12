package com.dtcc.gcpdemo.model;

import java.util.Objects;
import com.dtcc.gcpdemo.model.Currency;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Next available settlement date for a currency
 */
@Schema(description = "Next available settlement date for a currency")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-12T15:34:08.343888500+05:30[Asia/Calcutta]")


public class NextSettlementDay   {
  @JsonProperty("currency")
  private Currency currency = null;

  @JsonProperty("nextSettlementDate")
  private LocalDate nextSettlementDate = null;

  public NextSettlementDay currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public NextSettlementDay nextSettlementDate(LocalDate nextSettlementDate) {
    this.nextSettlementDate = nextSettlementDate;
    return this;
  }

  /**
   * The next settlement date for this currency
   * @return nextSettlementDate
   **/
  @Schema(example = "Sat Dec 31 05:30:00 IST 2022", required = true, description = "The next settlement date for this currency")
      @NotNull

    @Valid
    public LocalDate getNextSettlementDate() {
    return nextSettlementDate;
  }

  public void setNextSettlementDate(LocalDate nextSettlementDate) {
    this.nextSettlementDate = nextSettlementDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NextSettlementDay nextSettlementDay = (NextSettlementDay) o;
    return Objects.equals(this.currency, nextSettlementDay.currency) &&
        Objects.equals(this.nextSettlementDate, nextSettlementDay.nextSettlementDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, nextSettlementDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextSettlementDay {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    nextSettlementDate: ").append(toIndentedString(nextSettlementDate)).append("\n");
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
