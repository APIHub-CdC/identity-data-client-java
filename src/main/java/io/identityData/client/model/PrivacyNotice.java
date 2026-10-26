package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;



public class PrivacyNotice {
  @SerializedName("termsAcceptedAt")
  private String termsAcceptedAt = null;
  @SerializedName("fullName")
  private FullName fullName = null;
  @SerializedName("address")
  private Address address = null;
  public PrivacyNotice termsAcceptedAt(String termsAcceptedAt) {
    this.termsAcceptedAt = termsAcceptedAt;
    return this;
  }
  public String getTermsAcceptedAt() {
    return termsAcceptedAt;
  }
  public void setTermsAcceptedAt(String termsAcceptedAt) {
    this.termsAcceptedAt = termsAcceptedAt;
  }
  public PrivacyNotice fullName(FullName fullName) {
    this.fullName = fullName;
    return this;
  }
   
  public FullName getFullName() {
    return fullName;
  }
  public void setFullName(FullName fullName) {
    this.fullName = fullName;
  }
  public PrivacyNotice address(Address address) {
    this.address = address;
    return this;
  }
   
  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivacyNotice privacyNotice = (PrivacyNotice) o;
    return Objects.equals(this.termsAcceptedAt, privacyNotice.termsAcceptedAt) &&
        Objects.equals(this.fullName, privacyNotice.fullName) &&
        Objects.equals(this.address, privacyNotice.address);
  }
  @Override
  public int hashCode() {
    return Objects.hash(termsAcceptedAt, fullName, address);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivacyNotice {\n");
    
    sb.append("    termsAcceptedAt: ").append(toIndentedString(termsAcceptedAt)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
