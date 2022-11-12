package com.dtcc.gcpdemo.model;

import java.util.Objects;
import com.dtcc.gcpdemo.model.Currency;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * settlement status of the currency
 */
@Schema(description = "settlement status of the currency")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-12T15:34:08.343888500+05:30[Asia/Calcutta]")


public class CurrencyEntry   {
  @JsonProperty("currency")
  private Currency currency = null;

  @JsonProperty("stfoSettlementAllowed")
  private Boolean stfoSettlementAllowed = null;

  @JsonProperty("swiftSettlementAllowed")
  private Boolean swiftSettlementAllowed = null;

  public CurrencyEntry currency(Currency currency) {
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

  public CurrencyEntry stfoSettlementAllowed(Boolean stfoSettlementAllowed) {
    this.stfoSettlementAllowed = stfoSettlementAllowed;
    return this;
  }

  /**
   * Whether or not settlement is allowed in this currency for STFO
   * @return stfoSettlementAllowed
   **/
  @Schema(example = "true", required = true, description = "Whether or not settlement is allowed in this currency for STFO")
      @NotNull

    public Boolean isStfoSettlementAllowed() {
    return stfoSettlementAllowed;
  }

  public void setStfoSettlementAllowed(Boolean stfoSettlementAllowed) {
    this.stfoSettlementAllowed = stfoSettlementAllowed;
  }

  public CurrencyEntry swiftSettlementAllowed(Boolean swiftSettlementAllowed) {
    this.swiftSettlementAllowed = swiftSettlementAllowed;
    return this;
  }

  /**
   * Whether or not settlement is allowed in this currency for Swift
   * @return swiftSettlementAllowed
   **/
  @Schema(example = "true", required = true, description = "Whether or not settlement is allowed in this currency for Swift")
      @NotNull

    public Boolean isSwiftSettlementAllowed() {
    return swiftSettlementAllowed;
  }

  public void setSwiftSettlementAllowed(Boolean swiftSettlementAllowed) {
    this.swiftSettlementAllowed = swiftSettlementAllowed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyEntry currencyEntry = (CurrencyEntry) o;
    return Objects.equals(this.currency, currencyEntry.currency) &&
        Objects.equals(this.stfoSettlementAllowed, currencyEntry.stfoSettlementAllowed) &&
        Objects.equals(this.swiftSettlementAllowed, currencyEntry.swiftSettlementAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, stfoSettlementAllowed, swiftSettlementAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyEntry {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    stfoSettlementAllowed: ").append(toIndentedString(stfoSettlementAllowed)).append("\n");
    sb.append("    swiftSettlementAllowed: ").append(toIndentedString(swiftSettlementAllowed)).append("\n");
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
