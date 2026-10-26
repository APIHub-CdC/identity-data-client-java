package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.util.UUID;


public class CedulaValidatorGet {
  @SerializedName("inquiryId")
  private UUID inquiryId = null;
  @SerializedName("externalId")
  private String externalId = null;
  @SerializedName("subscriptionId")
  private String subscriptionId = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("lastName")
  private String lastName = null;
  @SerializedName("secondLastName")
  private String secondLastName = null;
  @SerializedName("curp")
  private String curp = null;
  public CedulaValidatorGet inquiryId(UUID inquiryId) {
    this.inquiryId = inquiryId;
    return this;
  }
   
  public UUID getInquiryId() {
    return inquiryId;
  }
  public void setInquiryId(UUID inquiryId) {
    this.inquiryId = inquiryId;
  }
  public CedulaValidatorGet externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }
   
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }
  public CedulaValidatorGet subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }
   
  public String getSubscriptionId() {
    return subscriptionId;
  }
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }
  public CedulaValidatorGet name(String name) {
    this.name = name;
    return this;
  }
   
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public CedulaValidatorGet lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
   
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public CedulaValidatorGet secondLastName(String secondLastName) {
    this.secondLastName = secondLastName;
    return this;
  }
   
  public String getSecondLastName() {
    return secondLastName;
  }
  public void setSecondLastName(String secondLastName) {
    this.secondLastName = secondLastName;
  }
  public CedulaValidatorGet curp(String curp) {
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
    CedulaValidatorGet cedulaValidatorGet = (CedulaValidatorGet) o;
    return Objects.equals(this.inquiryId, cedulaValidatorGet.inquiryId) &&
        Objects.equals(this.externalId, cedulaValidatorGet.externalId) &&
        Objects.equals(this.subscriptionId, cedulaValidatorGet.subscriptionId) &&
        Objects.equals(this.name, cedulaValidatorGet.name) &&
        Objects.equals(this.lastName, cedulaValidatorGet.lastName) &&
        Objects.equals(this.secondLastName, cedulaValidatorGet.secondLastName) &&
        Objects.equals(this.curp, cedulaValidatorGet.curp);
  }
  @Override
  public int hashCode() {
    return Objects.hash(inquiryId, externalId, subscriptionId, name, lastName, secondLastName, curp);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CedulaValidatorGet {\n");
    
    sb.append("    inquiryId: ").append(toIndentedString(inquiryId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    secondLastName: ").append(toIndentedString(secondLastName)).append("\n");
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
