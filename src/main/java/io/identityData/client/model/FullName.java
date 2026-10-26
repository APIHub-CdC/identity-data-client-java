package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.time.LocalDate;



public class FullName {
  @SerializedName("names")
  private String names = null;
  @SerializedName("paternalSurname")
  private String paternalSurname = null;
  @SerializedName("maternalSurname")
  private String maternalSurname = null;
  @SerializedName("birthDate")
  private String birthDate = null;
  public FullName names(String names) {
    this.names = names;
    return this;
  }
   
  public String getNames() {
    return names;
  }
  public void setNames(String names) {
    this.names = names;
  }
  public FullName paternalSurname(String paternalSurname) {
    this.paternalSurname = paternalSurname;
    return this;
  }
  public String getPaternalSurname() {
    return paternalSurname;
  }
  public void setPaternalSurname(String paternalSurname) {
    this.paternalSurname = paternalSurname;
  }
  public FullName maternalSurname(String maternalSurname) {
    this.maternalSurname = maternalSurname;
    return this;
  }
   
  public String getMaternalSurname() {
    return maternalSurname;
  }
  public void setMaternalSurname(String maternalSurname) {
    this.maternalSurname = maternalSurname;
  }
  public FullName birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }
   
  public String getBirthDate() {
    return birthDate;
  }
  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullName fullName = (FullName) o;
    return Objects.equals(this.names, fullName.names) &&
        Objects.equals(this.paternalSurname, fullName.paternalSurname) &&
        Objects.equals(this.maternalSurname, fullName.maternalSurname) &&
        Objects.equals(this.birthDate, fullName.birthDate);
  }
  @Override
  public int hashCode() {
    return Objects.hash(names, paternalSurname, maternalSurname, birthDate);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullName {\n");
    
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    paternalSurname: ").append(toIndentedString(paternalSurname)).append("\n");
    sb.append("    maternalSurname: ").append(toIndentedString(maternalSurname)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
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
