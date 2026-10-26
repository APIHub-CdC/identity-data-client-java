package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;



public class RenapoQuery {
  @SerializedName("curp")
  private String curp = null;
  public RenapoQuery curp(String curp) {
    this.curp = curp;
    return this;
  }
   
  public String getCurp() {
    return curp;
  }
  public void setCurp(String curp) {
    this.curp = curp;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenapoQuery renapoQuery = (RenapoQuery) o;
    return Objects.equals(this.curp, renapoQuery.curp);
  }
  @Override
  public int hashCode() {
    return Objects.hash(curp);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenapoQuery {\n");
    
    sb.append("    curp: ").append(toIndentedString(curp)).append("\n");
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
