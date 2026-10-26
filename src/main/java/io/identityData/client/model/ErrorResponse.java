package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;



public class ErrorResponse {
  @SerializedName("errores")
  private List<ErrorItem> errores = null;
  @SerializedName("errors")
  private List<ErrorItem> errors = null;
  public ErrorResponse errores(List<ErrorItem> errores) {
    this.errores = errores;
    return this;
  }
  public ErrorResponse addErroresItem(ErrorItem erroresItem) {
    if (this.errores == null) {
      this.errores = new ArrayList<ErrorItem>();
    }
    this.errores.add(erroresItem);
    return this;
  }
  public List<ErrorItem> getErrores() {
    return errores;
  }
  public void setErrores(List<ErrorItem> errores) {
    this.errores = errores;
  }
  public ErrorResponse errors(List<ErrorItem> errors) {
    this.errors = errors;
    return this;
  }
  public ErrorResponse addErrorsItem(ErrorItem errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ErrorItem>();
    }
    this.errors.add(errorsItem);
    return this;
  }
   
  public List<ErrorItem> getErrors() {
    return errors;
  }
  public void setErrors(List<ErrorItem> errors) {
    this.errors = errors;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.errores, errorResponse.errores) &&
        Objects.equals(this.errors, errorResponse.errors);
  }
  @Override
  public int hashCode() {
    return Objects.hash(errores, errors);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    errores: ").append(toIndentedString(errores)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
