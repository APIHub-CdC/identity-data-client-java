package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


public class CedulaValidator {
  @SerializedName("externalId")
  private String externalId = null;
  @SerializedName("subscriptionId")
  private String subscriptionId = null;
  @SerializedName("names")
  private String names = null;
  @SerializedName("lastName")
  private String lastName = null;
  @SerializedName("secondLastName")
  private String secondLastName = null;
  @SerializedName("curp")
  private String curp = null;
  public CedulaValidator externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }
   
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }
  public CedulaValidator subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }
   
  public String getSubscriptionId() {
    return subscriptionId;
  }
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }
  public CedulaValidator names(String names) {
    this.names = names;
    return this;
  }
  public String getNames() {
    return names;
  }
  public void setNames(String names) {
    this.names = names;
  }
  public CedulaValidator lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
   
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public CedulaValidator secondLastName(String secondLastName) {
    this.secondLastName = secondLastName;
    return this;
  }
   
  public String getSecondLastName() {
    return secondLastName;
  }
  public void setSecondLastName(String secondLastName) {
    this.secondLastName = secondLastName;
  }
  public CedulaValidator curp(String curp) {
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
    CedulaValidator cedulaValidator = (CedulaValidator) o;
    return Objects.equals(this.externalId, cedulaValidator.externalId) &&
        Objects.equals(this.subscriptionId, cedulaValidator.subscriptionId) &&
        Objects.equals(this.names, cedulaValidator.names) &&
        Objects.equals(this.lastName, cedulaValidator.lastName) &&
        Objects.equals(this.secondLastName, cedulaValidator.secondLastName) &&
        Objects.equals(this.curp, cedulaValidator.curp);
  }
  @Override
  public int hashCode() {
    return Objects.hash(externalId, subscriptionId, names, lastName, secondLastName, curp);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CedulaValidator {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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
