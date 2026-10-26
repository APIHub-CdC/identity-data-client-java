package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;


public class ErrorItem {
  @SerializedName("codigo")
  private String codigo = null;
  @SerializedName("mensaje")
  private String mensaje = null;
  @SerializedName("code")
  private String code = null;
  @SerializedName("message")
  private String message = null;
  public ErrorItem codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }
   
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  public ErrorItem mensaje(String mensaje) {
    this.mensaje = mensaje;
    return this;
  }
   
  public String getMensaje() {
    return mensaje;
  }
  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }
  public ErrorItem code(String code) {
    this.code = code;
    return this;
  }
   
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  public ErrorItem message(String message) {
    this.message = message;
    return this;
  }
   
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorItem errorItem = (ErrorItem) o;
    return Objects.equals(this.codigo, errorItem.codigo) &&
        Objects.equals(this.mensaje, errorItem.mensaje) &&
        Objects.equals(this.code, errorItem.code) &&
        Objects.equals(this.message, errorItem.message);
  }
  @Override
  public int hashCode() {
    return Objects.hash(codigo, mensaje, code, message);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorItem {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    mensaje: ").append(toIndentedString(mensaje)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
