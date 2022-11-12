package com.dtcc.gcpdemo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Metadata is made up of a key and a value
 */
@Schema(description = "Metadata is made up of a key and a value")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-12T15:34:08.343888500+05:30[Asia/Calcutta]")


public class KeyValuePair   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private String value = null;

  public KeyValuePair key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The metadata key. This value is indexed, so it is suitable for searching
   * @return key
   **/
  @Schema(example = "Minimum term", required = true, description = "The metadata key. This value is indexed, so it is suitable for searching")
      @NotNull

    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public KeyValuePair value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The metadata value. This value is not indexed, meaning that it is not suited to searching.
   * @return value
   **/
  @Schema(example = "5 years", required = true, description = "The metadata value. This value is not indexed, meaning that it is not suited to searching.")
      @NotNull

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyValuePair keyValuePair = (KeyValuePair) o;
    return Objects.equals(this.key, keyValuePair.key) &&
        Objects.equals(this.value, keyValuePair.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyValuePair {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
