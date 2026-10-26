package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;



public class ReasonProcess {
  @SerializedName("code")
  private String code = null;
  @SerializedName("message")
  private String message = null;
  public ReasonProcess code(String code) {
    this.code = code;
    return this;
  }
   
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  public ReasonProcess message(String message) {
    this.message = message;
    return this;
  }
   
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReasonProcess reasonProcess = (ReasonProcess) o;
    return Objects.equals(this.code, reasonProcess.code) &&
        Objects.equals(this.message, reasonProcess.message);
  }
  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReasonProcess {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
