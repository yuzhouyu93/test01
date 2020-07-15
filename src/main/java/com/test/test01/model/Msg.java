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
 * Msg
 */

public class Msg   {
  @JsonProperty("rcv_acc_no")
  private String rcvAccNo;

  @JsonProperty("rcv_name")
  private String rcvName;

  public Msg rcvAccNo(String rcvAccNo) {
    this.rcvAccNo = rcvAccNo;
    return this;
  }

  /**
   * Get rcvAccNo
   * @return rcvAccNo
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getRcvAccNo() {
    return rcvAccNo;
  }

  public void setRcvAccNo(String rcvAccNo) {
    this.rcvAccNo = rcvAccNo;
  }

  public Msg rcvName(String rcvName) {
    this.rcvName = rcvName;
    return this;
  }

  /**
   * Get rcvName
   * @return rcvName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getRcvName() {
    return rcvName;
  }

  public void setRcvName(String rcvName) {
    this.rcvName = rcvName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Msg msg = (Msg) o;
    return Objects.equals(this.rcvAccNo, msg.rcvAccNo) &&
        Objects.equals(this.rcvName, msg.rcvName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rcvAccNo, rcvName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Msg {\n");
    
    sb.append("    rcvAccNo: ").append(toIndentedString(rcvAccNo)).append("\n");
    sb.append("    rcvName: ").append(toIndentedString(rcvName)).append("\n");
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

