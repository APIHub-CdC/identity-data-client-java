package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;



public class Cedulas {
  @SerializedName("cedula")
  private String cedula = null;
  @SerializedName("institution")
  private String institution = null;
  @SerializedName("careersDegrees")
  private String careersDegrees = null;
  public Cedulas cedula(String cedula) {
    this.cedula = cedula;
    return this;
  }
  public String getCedula() {
    return cedula;
  }
  public void setCedula(String cedula) {
    this.cedula = cedula;
  }
  public Cedulas institution(String institution) {
    this.institution = institution;
    return this;
  }
  public String getInstitution() {
    return institution;
  }
  public void setInstitution(String institution) {
    this.institution = institution;
  }
  public Cedulas careersDegrees(String careersDegrees) {
    this.careersDegrees = careersDegrees;
    return this;
  }
   
  public String getCareersDegrees() {
    return careersDegrees;
  }
  public void setCareersDegrees(String careersDegrees) {
    this.careersDegrees = careersDegrees;
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
    return Objects.equals(this.cedula, cedulas.cedula) &&
        Objects.equals(this.institution, cedulas.institution) &&
        Objects.equals(this.careersDegrees, cedulas.careersDegrees);
  }
  @Override
  public int hashCode() {
    return Objects.hash(cedula, institution, careersDegrees);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cedulas {\n");
    
    sb.append("    cedula: ").append(toIndentedString(cedula)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    careersDegrees: ").append(toIndentedString(careersDegrees)).append("\n");
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
