package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;



public class ResultCedula {
  @SerializedName("reasonProcess")
  private AllOfResultCedulaReasonProcess reasonProcess = null;
  @SerializedName("request")
  private AllOfResultCedulaRequest request = null;
  @SerializedName("cedulaData")
  private AllOfResultCedulaCedulaData cedulaData = null;
  public ResultCedula reasonProcess(AllOfResultCedulaReasonProcess reasonProcess) {
    this.reasonProcess = reasonProcess;
    return this;
  }
  public AllOfResultCedulaReasonProcess getReasonProcess() {
    return reasonProcess;
  }
  public void setReasonProcess(AllOfResultCedulaReasonProcess reasonProcess) {
    this.reasonProcess = reasonProcess;
  }
  public ResultCedula request(AllOfResultCedulaRequest request) {
    this.request = request;
    return this;
  }
  public AllOfResultCedulaRequest getRequest() {
    return request;
  }
  public void setRequest(AllOfResultCedulaRequest request) {
    this.request = request;
  }
  public ResultCedula cedulaData(AllOfResultCedulaCedulaData cedulaData) {
    this.cedulaData = cedulaData;
    return this;
  }
   
  public AllOfResultCedulaCedulaData getCedulaData() {
    return cedulaData;
  }
  public void setCedulaData(AllOfResultCedulaCedulaData cedulaData) {
    this.cedulaData = cedulaData;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultCedula resultCedula = (ResultCedula) o;
    return Objects.equals(this.reasonProcess, resultCedula.reasonProcess) &&
        Objects.equals(this.request, resultCedula.request) &&
        Objects.equals(this.cedulaData, resultCedula.cedulaData);
  }
  @Override
  public int hashCode() {
    return Objects.hash(reasonProcess, request, cedulaData);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultCedula {\n");
    
    sb.append("    reasonProcess: ").append(toIndentedString(reasonProcess)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    cedulaData: ").append(toIndentedString(cedulaData)).append("\n");
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
