package com.test.test01.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Name
 */

public class Name   {
  @JsonProperty("instno")
  private String instno;

  @JsonProperty("userno")
  private String userno;

  public Name instno(String instno) {
    this.instno = instno;
    return this;
  }

  /**
   * Get instno
   * @return instno
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getInstno() {
    return instno;
  }

  public void setInstno(String instno) {
    this.instno = instno;
  }

  public Name userno(String userno) {
    this.userno = userno;
    return this;
  }

  /**
   * Get userno
   * @return userno
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUserno() {
    return userno;
  }

  public void setUserno(String userno) {
    this.userno = userno;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(this.instno, name.instno) &&
        Objects.equals(this.userno, name.userno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instno, userno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    
    sb.append("    instno: ").append(toIndentedString(instno)).append("\n");
    sb.append("    userno: ").append(toIndentedString(userno)).append("\n");
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

