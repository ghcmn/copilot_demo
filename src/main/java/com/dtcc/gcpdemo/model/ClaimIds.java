package com.dtcc.gcpdemo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClaimIds
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-12T15:34:08.343888500+05:30[Asia/Calcutta]")


public class ClaimIds   {
  @JsonProperty("claimId")
  private String claimId = null;

  public ClaimIds claimId(String claimId) {
    this.claimId = claimId;
    return this;
  }

  /**
   * claim unique identifier
   * @return claimId
   **/
  @Schema(example = "c1234", required = true, description = "claim unique identifier")
      @NotNull

  @Pattern(regexp="\\w+")   public String getClaimId() {
    return claimId;
  }

  public void setClaimId(String claimId) {
    this.claimId = claimId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClaimIds claimIds = (ClaimIds) o;
    return Objects.equals(this.claimId, claimIds.claimId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaimIds {\n");
    
    sb.append("    claimId: ").append(toIndentedString(claimId)).append("\n");
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
