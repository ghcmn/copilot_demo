package com.dtcc.gcpdemo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProblemFormatItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-12T15:34:08.343888500+05:30[Asia/Calcutta]")


public class ProblemFormatItem   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("detail")
  private String detail = null;

  /**
   * Gets or Sets domain
   */
  public enum DomainEnum {
    RISK("RISK"),
    
    PREMIUM("PREMIUM"),
    
    CLAIM("CLAIM"),
    
    DOCUMENT("DOCUMENT"),
    
    EXPERTFEES("EXPERTFEES"),
    
    PARTY("PARTY"),
    
    NOTIFICATION("NOTIFICATION"),
    
    SETTLEMENTS("SETTLEMENTS");

    private String value;

    DomainEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DomainEnum fromValue(String text) {
      for (DomainEnum b : DomainEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("domain")
  private DomainEnum domain = null;

  @JsonProperty("errorCode")
  private Integer errorCode = null;

  public ProblemFormatItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(example = "https://dxc.com/typerror/premium/2470", required = true, description = "")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProblemFormatItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  @Schema(example = "title example", required = true, description = "")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ProblemFormatItem detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
   **/
  @Schema(example = "Detailed description of the problem", description = "")
  
    public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ProblemFormatItem domain(DomainEnum domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Get domain
   * @return domain
   **/
  @Schema(example = "PREMIUM", required = true, description = "")
      @NotNull

    public DomainEnum getDomain() {
    return domain;
  }

  public void setDomain(DomainEnum domain) {
    this.domain = domain;
  }

  public ProblemFormatItem errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   **/
  @Schema(example = "2470", required = true, description = "")
      @NotNull

    public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemFormatItem problemFormatItem = (ProblemFormatItem) o;
    return Objects.equals(this.type, problemFormatItem.type) &&
        Objects.equals(this.title, problemFormatItem.title) &&
        Objects.equals(this.detail, problemFormatItem.detail) &&
        Objects.equals(this.domain, problemFormatItem.domain) &&
        Objects.equals(this.errorCode, problemFormatItem.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, detail, domain, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemFormatItem {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
