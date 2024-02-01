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

import java.util.ArrayList;
import java.util.List;
/**
 * DataSep
 */


public class DataSep {
  @SerializedName("cedulas")
  private List<Cedulas> cedulas = null;

  @SerializedName("códigoValidacion")
  private String cdigoValidacion = null;

  @SerializedName("estatus")
  private String estatus = null;

  @SerializedName("códigoMensaje")
  private String cdigoMensaje = null;

  public DataSep cedulas(List<Cedulas> cedulas) {
    this.cedulas = cedulas;
    return this;
  }

  public DataSep addCedulasItem(Cedulas cedulasItem) {
    if (this.cedulas == null) {
      this.cedulas = new ArrayList<Cedulas>();
    }
    this.cedulas.add(cedulasItem);
    return this;
  }

   /**
   * Arreglo con información de cédulas
   * @return cedulas
  **/

  public List<Cedulas> getCedulas() {
    return cedulas;
  }

  public void setCedulas(List<Cedulas> cedulas) {
    this.cedulas = cedulas;
  }

  public DataSep cdigoValidacion(String cdigoValidacion) {
    this.cdigoValidacion = cdigoValidacion;
    return this;
  }

   /**
   * Código único de ejecución de la validación. El objetivo de este código es guardar un registro de validaciones solicitadas
   * @return cdigoValidacion
  **/

  public String getCdigoValidacion() {
    return cdigoValidacion;
  }

  public void setCdigoValidacion(String cdigoValidacion) {
    this.cdigoValidacion = cdigoValidacion;
  }

  public DataSep estatus(String estatus) {
    this.estatus = estatus;
    return this;
  }

   /**
   * OK
   * @return estatus
  **/

  public String getEstatus() {
    return estatus;
  }

  public void setEstatus(String estatus) {
    this.estatus = estatus;
  }

  public DataSep cdigoMensaje(String cdigoMensaje) {
    this.cdigoMensaje = cdigoMensaje;
    return this;
  }

   /**
   * código del mensaje
   * @return cdigoMensaje
  **/

  public String getCdigoMensaje() {
    return cdigoMensaje;
  }

  public void setCdigoMensaje(String cdigoMensaje) {
    this.cdigoMensaje = cdigoMensaje;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSep dataSep = (DataSep) o;
    return Objects.equals(this.cedulas, dataSep.cedulas) &&
        Objects.equals(this.cdigoValidacion, dataSep.cdigoValidacion) &&
        Objects.equals(this.estatus, dataSep.estatus) &&
        Objects.equals(this.cdigoMensaje, dataSep.cdigoMensaje);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cedulas, cdigoValidacion, estatus, cdigoMensaje);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSep {\n");
    
    sb.append("    cedulas: ").append(toIndentedString(cedulas)).append("\n");
    sb.append("    cdigoValidacion: ").append(toIndentedString(cdigoValidacion)).append("\n");
    sb.append("    estatus: ").append(toIndentedString(estatus)).append("\n");
    sb.append("    cdigoMensaje: ").append(toIndentedString(cdigoMensaje)).append("\n");
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
