package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;



public class SourceResultAdditionalInfo {
  @SerializedName("referenceId")
  private String referenceId = null;
  public SourceResultAdditionalInfo referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }
   
  public String getReferenceId() {
    return referenceId;
  }
  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceResultAdditionalInfo sourceResultAdditionalInfo = (SourceResultAdditionalInfo) o;
    return Objects.equals(this.referenceId, sourceResultAdditionalInfo.referenceId);
  }
  @Override
  public int hashCode() {
    return Objects.hash(referenceId);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceResultAdditionalInfo {\n");
    
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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
