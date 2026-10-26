package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;



public class InlineResponse200 extends StandardEnvelope {
  @SerializedName("data")
  private ConsolidatedResultsData inlineResponse200Data = null;
  public InlineResponse200 inlineResponse200Data(ConsolidatedResultsData inlineResponse200Data) {
    this.inlineResponse200Data = inlineResponse200Data;
    return this;
  }
   
  public ConsolidatedResultsData getInlineResponse200Data() {
    return inlineResponse200Data;
  }
  public void setInlineResponse200Data(ConsolidatedResultsData inlineResponse200Data) {
    this.inlineResponse200Data = inlineResponse200Data;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.inlineResponse200Data, inlineResponse200.inlineResponse200Data) &&
        super.equals(o);
  }
  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse200Data, super.hashCode());
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse200Data: ").append(toIndentedString(inlineResponse200Data)).append("\n");
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
