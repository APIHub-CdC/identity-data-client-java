package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


public class VerifyCedulaGetResponseData {
  @SerializedName("request")
  private VerifyCedulaGetResponseDataRequest request = null;
  @SerializedName("result")
  private VerifyCedulaGetResponseDataResult result = null;
  public VerifyCedulaGetResponseData request(VerifyCedulaGetResponseDataRequest request) {
    this.request = request;
    return this;
  }
   
  public VerifyCedulaGetResponseDataRequest getRequest() {
    return request;
  }
  public void setRequest(VerifyCedulaGetResponseDataRequest request) {
    this.request = request;
  }
  public VerifyCedulaGetResponseData result(VerifyCedulaGetResponseDataResult result) {
    this.result = result;
    return this;
  }
   
  public VerifyCedulaGetResponseDataResult getResult() {
    return result;
  }
  public void setResult(VerifyCedulaGetResponseDataResult result) {
    this.result = result;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyCedulaGetResponseData verifyCedulaGetResponseData = (VerifyCedulaGetResponseData) o;
    return Objects.equals(this.request, verifyCedulaGetResponseData.request) &&
        Objects.equals(this.result, verifyCedulaGetResponseData.result);
  }
  @Override
  public int hashCode() {
    return Objects.hash(request, result);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyCedulaGetResponseData {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
