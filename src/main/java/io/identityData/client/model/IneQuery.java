package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;



public class IneQuery {
  @SerializedName("cic")
  private String cic = null;
  @SerializedName("ocr")
  private String ocr = null;
  @SerializedName("electorKey")
  private String electorKey = null;
  @SerializedName("issuingNumber")
  private String issuingNumber = null;
  public IneQuery cic(String cic) {
    this.cic = cic;
    return this;
  }
   
  public String getCic() {
    return cic;
  }
  public void setCic(String cic) {
    this.cic = cic;
  }
  public IneQuery ocr(String ocr) {
    this.ocr = ocr;
    return this;
  }
  public String getOcr() {
    return ocr;
  }
  public void setOcr(String ocr) {
    this.ocr = ocr;
  }
  public IneQuery electorKey(String electorKey) {
    this.electorKey = electorKey;
    return this;
  }
   
  public String getElectorKey() {
    return electorKey;
  }
  public void setElectorKey(String electorKey) {
    this.electorKey = electorKey;
  }
  public IneQuery issuingNumber(String issuingNumber) {
    this.issuingNumber = issuingNumber;
    return this;
  }
   
  public String getIssuingNumber() {
    return issuingNumber;
  }
  public void setIssuingNumber(String issuingNumber) {
    this.issuingNumber = issuingNumber;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IneQuery ineQuery = (IneQuery) o;
    return Objects.equals(this.cic, ineQuery.cic) &&
        Objects.equals(this.ocr, ineQuery.ocr) &&
        Objects.equals(this.electorKey, ineQuery.electorKey) &&
        Objects.equals(this.issuingNumber, ineQuery.issuingNumber);
  }
  @Override
  public int hashCode() {
    return Objects.hash(cic, ocr, electorKey, issuingNumber);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IneQuery {\n");
    
    sb.append("    cic: ").append(toIndentedString(cic)).append("\n");
    sb.append("    ocr: ").append(toIndentedString(ocr)).append("\n");
    sb.append("    electorKey: ").append(toIndentedString(electorKey)).append("\n");
    sb.append("    issuingNumber: ").append(toIndentedString(issuingNumber)).append("\n");
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
