package com.dtcc.gcpdemo.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * ISO alpha-3 currency code. There are 14 allowed settlement currencies
 */
public enum Currency {
  AUD("AUD"),
    CAD("CAD"),
    CHF("CHF"),
    DKK("DKK"),
    EUR("EUR"),
    GBP("GBP"),
    HKD("HKD"),
    JPY("JPY"),
    NOK("NOK"),
    NZD("NZD"),
    SEK("SEK"),
    SGD("SGD"),
    USD("USD"),
    ZAR("ZAR");

  private String value;

  Currency(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Currency fromValue(String text) {
    for (Currency b : Currency.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
