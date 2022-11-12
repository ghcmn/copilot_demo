package com.dtcc.gcpdemo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PremiumIds
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-12T15:34:08.343888500+05:30[Asia/Calcutta]")


public class PremiumIds   {
  @JsonProperty("premiumId")
  private String premiumId = null;

  public PremiumIds premiumId(String premiumId) {
    this.premiumId = premiumId;
    return this;
  }

  /**
   * premium unique identifier
   * @return premiumId
   **/
  @Schema(example = "c1234", required = true, description = "premium unique identifier")
      @NotNull

  @Pattern(regexp="\\w+")   public String getPremiumId() {
    return premiumId;
  }

  public void setPremiumId(String premiumId) {
    this.premiumId = premiumId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PremiumIds premiumIds = (PremiumIds) o;
    return Objects.equals(this.premiumId, premiumIds.premiumId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(premiumId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PremiumIds {\n");
    
    sb.append("    premiumId: ").append(toIndentedString(premiumId)).append("\n");
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
