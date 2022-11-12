package com.dtcc.gcpdemo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The data in the audit block is populated directly by the API from the security context when the record is modified
 */
@Schema(description = "The data in the audit block is populated directly by the API from the security context when the record is modified")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-12T15:34:08.343888500+05:30[Asia/Calcutta]")


public class AuditBlock   {
  @JsonProperty("user")
  private String user = null;

  @JsonProperty("at")
  private OffsetDateTime at = null;

  public AuditBlock user(String user) {
    this.user = user;
    return this;
  }

  /**
   * The identifier of the user or system user that modified the record
   * @return user
   **/
  @Schema(example = "svc99", required = true, description = "The identifier of the user or system user that modified the record")
      @NotNull

    public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public AuditBlock at(OffsetDateTime at) {
    this.at = at;
    return this;
  }

  /**
   * UTC timestamp of the record modification
   * @return at
   **/
  @Schema(example = "2021-03-03T08:24:51Z", required = true, description = "UTC timestamp of the record modification")
      @NotNull

    @Valid
    public OffsetDateTime getAt() {
    return at;
  }

  public void setAt(OffsetDateTime at) {
    this.at = at;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditBlock auditBlock = (AuditBlock) o;
    return Objects.equals(this.user, auditBlock.user) &&
        Objects.equals(this.at, auditBlock.at);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, at);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditBlock {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    at: ").append(toIndentedString(at)).append("\n");
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
