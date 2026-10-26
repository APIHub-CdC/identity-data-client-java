package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;


public class CedulaData {
  @SerializedName("curp")
  private String curp = null;
  @SerializedName("names")
  private String names = null;
  @SerializedName("lastName")
  private String lastName = null;
  @SerializedName("secondLastName")
  private String secondLastName = null;
  @SerializedName("gender")
  private String gender = null;
  @SerializedName("birthDate")
  private String birthDate = null;
  @SerializedName("birthPlace")
  private String birthPlace = null;
  @SerializedName("cedulas")
  private List<Cedulas> cedulas = null;
  public CedulaData curp(String curp) {
    this.curp = curp;
    return this;
  }
  public String getCurp() {
    return curp;
  }
  public void setCurp(String curp) {
    this.curp = curp;
  }
  public CedulaData names(String names) {
    this.names = names;
    return this;
  }
   
  public String getNames() {
    return names;
  }
  public void setNames(String names) {
    this.names = names;
  }
  public CedulaData lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public CedulaData secondLastName(String secondLastName) {
    this.secondLastName = secondLastName;
    return this;
  }
  public String getSecondLastName() {
    return secondLastName;
  }
  public void setSecondLastName(String secondLastName) {
    this.secondLastName = secondLastName;
  }
  public CedulaData gender(String gender) {
    this.gender = gender;
    return this;
  }
   
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  public CedulaData birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }
  public String getBirthDate() {
    return birthDate;
  }
  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }
  public CedulaData birthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
    return this;
  }
   
  public String getBirthPlace() {
    return birthPlace;
  }
  public void setBirthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
  }
  public CedulaData cedulas(List<Cedulas> cedulas) {
    this.cedulas = cedulas;
    return this;
  }
  public CedulaData addCedulasItem(Cedulas cedulasItem) {
    if (this.cedulas == null) {
      this.cedulas = new ArrayList<Cedulas>();
    }
    this.cedulas.add(cedulasItem);
    return this;
  }
   
  public List<Cedulas> getCedulas() {
    return cedulas;
  }
  public void setCedulas(List<Cedulas> cedulas) {
    this.cedulas = cedulas;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CedulaData cedulaData = (CedulaData) o;
    return Objects.equals(this.curp, cedulaData.curp) &&
        Objects.equals(this.names, cedulaData.names) &&
        Objects.equals(this.lastName, cedulaData.lastName) &&
        Objects.equals(this.secondLastName, cedulaData.secondLastName) &&
        Objects.equals(this.gender, cedulaData.gender) &&
        Objects.equals(this.birthDate, cedulaData.birthDate) &&
        Objects.equals(this.birthPlace, cedulaData.birthPlace) &&
        Objects.equals(this.cedulas, cedulaData.cedulas);
  }
  @Override
  public int hashCode() {
    return Objects.hash(curp, names, lastName, secondLastName, gender, birthDate, birthPlace, cedulas);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CedulaData {\n");
    
    sb.append("    curp: ").append(toIndentedString(curp)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    secondLastName: ").append(toIndentedString(secondLastName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    birthPlace: ").append(toIndentedString(birthPlace)).append("\n");
    sb.append("    cedulas: ").append(toIndentedString(cedulas)).append("\n");
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
