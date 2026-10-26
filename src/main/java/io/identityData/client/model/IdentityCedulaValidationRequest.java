package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


public class IdentityCedulaValidationRequest {
  @SerializedName("privacyNotice")
  private PrivacyNotice privacyNotice = null;
  @SerializedName("cedulaValidator")
  private AllOfIdentityCedulaValidationRequestCedulaValidator cedulaValidator = null;
  public IdentityCedulaValidationRequest privacyNotice(PrivacyNotice privacyNotice) {
    this.privacyNotice = privacyNotice;
    return this;
  }
   
  public PrivacyNotice getPrivacyNotice() {
    return privacyNotice;
  }
  public void setPrivacyNotice(PrivacyNotice privacyNotice) {
    this.privacyNotice = privacyNotice;
  }
  public IdentityCedulaValidationRequest cedulaValidator(AllOfIdentityCedulaValidationRequestCedulaValidator cedulaValidator) {
    this.cedulaValidator = cedulaValidator;
    return this;
  }
   
  public AllOfIdentityCedulaValidationRequestCedulaValidator getCedulaValidator() {
    return cedulaValidator;
  }
  public void setCedulaValidator(AllOfIdentityCedulaValidationRequestCedulaValidator cedulaValidator) {
    this.cedulaValidator = cedulaValidator;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityCedulaValidationRequest identityCedulaValidationRequest = (IdentityCedulaValidationRequest) o;
    return Objects.equals(this.privacyNotice, identityCedulaValidationRequest.privacyNotice) &&
        Objects.equals(this.cedulaValidator, identityCedulaValidationRequest.cedulaValidator);
  }
  @Override
  public int hashCode() {
    return Objects.hash(privacyNotice, cedulaValidator);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityCedulaValidationRequest {\n");
    
    sb.append("    privacyNotice: ").append(toIndentedString(privacyNotice)).append("\n");
    sb.append("    cedulaValidator: ").append(toIndentedString(cedulaValidator)).append("\n");
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
