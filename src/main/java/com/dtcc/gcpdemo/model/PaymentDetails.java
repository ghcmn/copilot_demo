package com.dtcc.gcpdemo.model;

import java.util.Objects;
import com.dtcc.gcpdemo.model.Currency;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-12T15:34:08.343888500+05:30[Asia/Calcutta]")


public class PaymentDetails   {
  @JsonProperty("accountIdentifier")
  private String accountIdentifier = null;

  @JsonProperty("currency")
  private Currency currency = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  public PaymentDetails accountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
    return this;
  }

  /**
   * An identifier for the account. The format is dependent on the value of the paymentMethod attribute
   * @return accountIdentifier
   **/
  @Schema(example = "GB33BUKB20201555555556", required = true, description = "An identifier for the account. The format is dependent on the value of the paymentMethod attribute")
      @NotNull

  @Pattern(regexp="\\w+")   public String getAccountIdentifier() {
    return accountIdentifier;
  }

  public void setAccountIdentifier(String accountIdentifier) {
    this.accountIdentifier = accountIdentifier;
  }

  public PaymentDetails currency(Currency currency) {
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

  public PaymentDetails amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the transaction. It is interpereted as a decimal number. Note that currencies can have zero, two, or even three decimal places.
   * minimum: 0
   * @return amount
   **/
  @Schema(example = "2999.99", required = true, description = "The amount of the transaction. It is interpereted as a decimal number. Note that currencies can have zero, two, or even three decimal places.")
      @NotNull

    @Valid
  @DecimalMin("0")  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDetails paymentDetails = (PaymentDetails) o;
    return Objects.equals(this.accountIdentifier, paymentDetails.accountIdentifier) &&
        Objects.equals(this.currency, paymentDetails.currency) &&
        Objects.equals(this.amount, paymentDetails.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIdentifier, currency, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDetails {\n");
    
    sb.append("    accountIdentifier: ").append(toIndentedString(accountIdentifier)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
