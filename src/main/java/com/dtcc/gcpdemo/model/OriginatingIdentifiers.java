package com.dtcc.gcpdemo.model;

import java.util.Objects;
import com.dtcc.gcpdemo.model.ClaimIds;
import com.dtcc.gcpdemo.model.PremiumIds;
import com.dtcc.gcpdemo.model.TreatyIds;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * External identifiers. Only one of &#x60;treatyIds&#x60;, &#x60;claimIds&#x60; or &#x60;premiumIds&#x60; may be present.
 */
@Schema(description = "External identifiers. Only one of `treatyIds`, `claimIds` or `premiumIds` may be present.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-12T15:34:08.343888500+05:30[Asia/Calcutta]")


public class OriginatingIdentifiers   {
  /**
   * The originating application domain
   */
  public enum ApplicationEnum {
    TREATY("TREATY"),
    
    CLAIM("CLAIM"),
    
    PREMIUM("PREMIUM");

    private String value;

    ApplicationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ApplicationEnum fromValue(String text) {
      for (ApplicationEnum b : ApplicationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("application")
  private ApplicationEnum application = null;

  @JsonProperty("treatyIds")
  private TreatyIds treatyIds = null;

  @JsonProperty("claimIds")
  private ClaimIds claimIds = null;

  @JsonProperty("premiumIds")
  private PremiumIds premiumIds = null;

  public OriginatingIdentifiers application(ApplicationEnum application) {
    this.application = application;
    return this;
  }

  /**
   * The originating application domain
   * @return application
   **/
  @Schema(example = "TREATY", required = true, description = "The originating application domain")
      @NotNull

    public ApplicationEnum getApplication() {
    return application;
  }

  public void setApplication(ApplicationEnum application) {
    this.application = application;
  }

  public OriginatingIdentifiers treatyIds(TreatyIds treatyIds) {
    this.treatyIds = treatyIds;
    return this;
  }

  /**
   * Get treatyIds
   * @return treatyIds
   **/
  @Schema(description = "")
  
    @Valid
    public TreatyIds getTreatyIds() {
    return treatyIds;
  }

  public void setTreatyIds(TreatyIds treatyIds) {
    this.treatyIds = treatyIds;
  }

  public OriginatingIdentifiers claimIds(ClaimIds claimIds) {
    this.claimIds = claimIds;
    return this;
  }

  /**
   * Get claimIds
   * @return claimIds
   **/
  @Schema(description = "")
  
    @Valid
    public ClaimIds getClaimIds() {
    return claimIds;
  }

  public void setClaimIds(ClaimIds claimIds) {
    this.claimIds = claimIds;
  }

  public OriginatingIdentifiers premiumIds(PremiumIds premiumIds) {
    this.premiumIds = premiumIds;
    return this;
  }

  /**
   * Get premiumIds
   * @return premiumIds
   **/
  @Schema(description = "")
  
    @Valid
    public PremiumIds getPremiumIds() {
    return premiumIds;
  }

  public void setPremiumIds(PremiumIds premiumIds) {
    this.premiumIds = premiumIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginatingIdentifiers originatingIdentifiers = (OriginatingIdentifiers) o;
    return Objects.equals(this.application, originatingIdentifiers.application) &&
        Objects.equals(this.treatyIds, originatingIdentifiers.treatyIds) &&
        Objects.equals(this.claimIds, originatingIdentifiers.claimIds) &&
        Objects.equals(this.premiumIds, originatingIdentifiers.premiumIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, treatyIds, claimIds, premiumIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginatingIdentifiers {\n");
    
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    treatyIds: ").append(toIndentedString(treatyIds)).append("\n");
    sb.append("    claimIds: ").append(toIndentedString(claimIds)).append("\n");
    sb.append("    premiumIds: ").append(toIndentedString(premiumIds)).append("\n");
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
