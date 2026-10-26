package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.util.UUID;



public class IdentityValidationRequest {
  @SerializedName("externalId")
  private UUID externalId = null;
  @SerializedName("privacyNotice")
  private PrivacyNotice privacyNotice = null;
  @SerializedName("renapoQuery")
  private AllOfidentityValidationRequestRenapoQuery renapoQuery = null;
  @SerializedName("ineQuery")
  private AllOfidentityValidationRequestIneQuery ineQuery = null;
  public IdentityValidationRequest externalId(UUID externalId) {
    this.externalId = externalId;
    return this;
  }
   
  public UUID getExternalId() {
    return externalId;
  }
  public void setExternalId(UUID externalId) {
    this.externalId = externalId;
  }
  public IdentityValidationRequest privacyNotice(PrivacyNotice privacyNotice) {
    this.privacyNotice = privacyNotice;
    return this;
  }
   
  public PrivacyNotice getPrivacyNotice() {
    return privacyNotice;
  }
  public void setPrivacyNotice(PrivacyNotice privacyNotice) {
    this.privacyNotice = privacyNotice;
  }
  public IdentityValidationRequest renapoQuery(AllOfidentityValidationRequestRenapoQuery renapoQuery) {
    this.renapoQuery = renapoQuery;
    return this;
  }
   
  public AllOfidentityValidationRequestRenapoQuery getRenapoQuery() {
    return renapoQuery;
  }
  public void setRenapoQuery(AllOfidentityValidationRequestRenapoQuery renapoQuery) {
    this.renapoQuery = renapoQuery;
  }
  public IdentityValidationRequest ineQuery(AllOfidentityValidationRequestIneQuery ineQuery) {
    this.ineQuery = ineQuery;
    return this;
  }
   
  public AllOfidentityValidationRequestIneQuery getIneQuery() {
    return ineQuery;
  }
  public void setIneQuery(AllOfidentityValidationRequestIneQuery ineQuery) {
    this.ineQuery = ineQuery;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityValidationRequest identityValidationRequest = (IdentityValidationRequest) o;
    return Objects.equals(this.externalId, identityValidationRequest.externalId) &&
        Objects.equals(this.privacyNotice, identityValidationRequest.privacyNotice) &&
        Objects.equals(this.renapoQuery, identityValidationRequest.renapoQuery) &&
        Objects.equals(this.ineQuery, identityValidationRequest.ineQuery);
  }
  @Override
  public int hashCode() {
    return Objects.hash(externalId, privacyNotice, renapoQuery, ineQuery);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityValidationRequest {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    privacyNotice: ").append(toIndentedString(privacyNotice)).append("\n");
    sb.append("    renapoQuery: ").append(toIndentedString(renapoQuery)).append("\n");
    sb.append("    ineQuery: ").append(toIndentedString(ineQuery)).append("\n");
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
