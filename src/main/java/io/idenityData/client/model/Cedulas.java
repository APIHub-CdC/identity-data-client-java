/*
 * API Identity Data
 * <p>Identity Data API es un facilitador de funcionalidades que engloba información de distintas fuentes de acceso públicas y privadas en el progreso del producto para realizar la validación de identidad del Cliente. El objetivo es que a través de una sola API, el usuario puede acceder, corroborar y validar la identidad de la persona haciendo la solicitud de un producto o servicio.</p><br/>
 *
 * OpenAPI spec version: 1.0
 * Contact: api@circulodecredito.com.mx
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.idenityData.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Cedulas
 */


public class Cedulas {
  @SerializedName("institucion")
  private String institucion = null;

  @SerializedName("nombres")
  private String nombres = null;

  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;

  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;

  @SerializedName("cedula")
  private String cedula = null;

  @SerializedName("sexo")
  private String sexo = null;

  @SerializedName("tipo")
  private String tipo = null;

  @SerializedName("titulo")
  private String titulo = null;

  public Cedulas institucion(String institucion) {
    this.institucion = institucion;
    return this;
  }

   /**
   * Institución que solicitó la cédula
   * @return institucion
  **/

  public String getInstitucion() {
    return institucion;
  }

  public void setInstitucion(String institucion) {
    this.institucion = institucion;
  }

  public Cedulas nombres(String nombres) {
    this.nombres = nombres;
    return this;
  }

   /**
   * Nombres de la persona
   * @return nombres
  **/

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public Cedulas apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }

   /**
   * Apellido paterno de la persona
   * @return apellidoPaterno
  **/

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public Cedulas apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }

   /**
   * Apellido materno de la persona
   * @return apellidoMaterno
  **/

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public Cedulas cedula(String cedula) {
    this.cedula = cedula;
    return this;
  }

   /**
   * Número de cédula
   * @return cedula
  **/

  public String getCedula() {
    return cedula;
  }

  public void setCedula(String cedula) {
    this.cedula = cedula;
  }

  public Cedulas sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }

   /**
   * Sexo de la persona {“M” | “F” }
   * @return sexo
  **/

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public Cedulas tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

   /**
   * Tipo de cédula { “C1” | “A1” }
   * @return tipo
  **/

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public Cedulas titulo(String titulo) {
    this.titulo = titulo;
    return this;
  }

   /**
   * Nombre del título
   * @return titulo
  **/

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cedulas cedulas = (Cedulas) o;
    return Objects.equals(this.institucion, cedulas.institucion) &&
        Objects.equals(this.nombres, cedulas.nombres) &&
        Objects.equals(this.apellidoPaterno, cedulas.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, cedulas.apellidoMaterno) &&
        Objects.equals(this.cedula, cedulas.cedula) &&
        Objects.equals(this.sexo, cedulas.sexo) &&
        Objects.equals(this.tipo, cedulas.tipo) &&
        Objects.equals(this.titulo, cedulas.titulo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institucion, nombres, apellidoPaterno, apellidoMaterno, cedula, sexo, tipo, titulo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cedulas {\n");
    
    sb.append("    institucion: ").append(toIndentedString(institucion)).append("\n");
    sb.append("    nombres: ").append(toIndentedString(nombres)).append("\n");
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    cedula: ").append(toIndentedString(cedula)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    titulo: ").append(toIndentedString(titulo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
