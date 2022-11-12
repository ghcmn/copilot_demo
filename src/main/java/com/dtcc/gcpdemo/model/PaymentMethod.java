package com.dtcc.gcpdemo.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The payment method to be used for this settlement
 */
public enum PaymentMethod {
  SWIFT("SWIFT"),
    VITESSE("VITESSE"),
    STFO("STFO"),
    NONE("NONE");

  private String value;

  PaymentMethod(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PaymentMethod fromValue(String text) {
    for (PaymentMethod b : PaymentMethod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
