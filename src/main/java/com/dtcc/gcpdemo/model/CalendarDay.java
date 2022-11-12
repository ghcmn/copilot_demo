package com.dtcc.gcpdemo.model;

import java.util.Objects;
import com.dtcc.gcpdemo.model.AuditBlock;
import com.dtcc.gcpdemo.model.CurrencyEntry;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A day in the settlement calendar. For each supported currency, shows whether or not this day is allowed for settlements.
 */
@Schema(description = "A day in the settlement calendar. For each supported currency, shows whether or not this day is allowed for settlements.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-12T15:34:08.343888500+05:30[Asia/Calcutta]")


public class CalendarDay   {
  @JsonProperty("calendarDate")
  private LocalDate calendarDate = null;

  @JsonProperty("currencies")
  @Valid
  private List<CurrencyEntry> currencies = new ArrayList<>();

  @JsonProperty("audit")
  private AuditBlock audit = null;

  public CalendarDay calendarDate(LocalDate calendarDate) {
    this.calendarDate = calendarDate;
    return this;
  }

  /**
   * The date of this calendar entry
   * @return calendarDate
   **/
  @Schema(example = "Sat Dec 31 05:30:00 IST 2022", required = true, description = "The date of this calendar entry")
      @NotNull

    @Valid
    public LocalDate getCalendarDate() {
    return calendarDate;
  }

  public void setCalendarDate(LocalDate calendarDate) {
    this.calendarDate = calendarDate;
  }

  public CalendarDay currencies(List<CurrencyEntry> currencies) {
    this.currencies = currencies;
    return this;
  }

  public CalendarDay addCurrenciesItem(CurrencyEntry currenciesItem) {
    this.currencies.add(currenciesItem);
    return this;
  }

  /**
   * There must be one entry for each of the 14 supported currencies
   * @return currencies
   **/
  @Schema(example = "[   {     \"currency\": \"AUD\",     \"stfoSettlementAllowed\": true,     \"swiftSettlementAllowed\": true   },   {     \"currency\": \"CAD\",     \"stfoSettlementAllowed\": true,     \"swiftSettlementAllowed\": true   },   {     \"currency\": \"CHF\",     \"stfoSettlementAllowed\": true,     \"swiftSettlementAllowed\": true   },   {     \"currency\": \"DKK\",     \"stfoSettlementAllowed\": true,     \"swiftSettlementAllowed\": true   },   {     \"currency\": \"EUR\",     \"stfoSettlementAllowed\": true,     \"swiftSettlementAllowed\": true   },   {     \"currency\": \"GBP\",     \"stfoSettlementAllowed\": false,     \"swiftSettlementAllowed\": false   },   {     \"currency\": \"HKD\",     \"stfoSettlementAllowed\": true,     \"swiftSettlementAllowed\": true   },   {     \"currency\": \"JPY\",     \"stfoSettlementAllowed\": true,     \"swiftSettlementAllowed\": true   },   {     \"currency\": \"NOK\",     \"stfoSettlementAllowed\": true,     \"swiftSettlementAllowed\": true   },   {     \"currency\": \"NZD\",     \"stfoSettlementAllowed\": true,     \"swiftSettlementAllowed\": true   },   {     \"currency\": \"SEK\",     \"stfoSettlementAllowed\": true,     \"swiftSettlementAllowed\": true   },   {     \"currency\": \"SGD\",     \"stfoSettlementAllowed\": true,     \"swiftSettlementAllowed\": true   },   {     \"currency\": \"USD\",     \"stfoSettlementAllowed\": true,     \"swiftSettlementAllowed\": true   },   {     \"currency\": \"ZAR\",     \"stfoSettlementAllowed\": true,     \"swiftSettlementAllowed\": true   } ] ", required = true, description = "There must be one entry for each of the 14 supported currencies")
      @NotNull
    @Valid
  @Size(min=14,max=14)   public List<CurrencyEntry> getCurrencies() {
    return currencies;
  }

  public void setCurrencies(List<CurrencyEntry> currencies) {
    this.currencies = currencies;
  }

  public CalendarDay audit(AuditBlock audit) {
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
    CalendarDay calendarDay = (CalendarDay) o;
    return Objects.equals(this.calendarDate, calendarDay.calendarDate) &&
        Objects.equals(this.currencies, calendarDay.currencies) &&
        Objects.equals(this.audit, calendarDay.audit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calendarDate, currencies, audit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarDay {\n");
    
    sb.append("    calendarDate: ").append(toIndentedString(calendarDate)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
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
