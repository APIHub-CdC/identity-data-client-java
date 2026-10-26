package io.identityData.client.model;

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.JsonReader;



public class Address {
  private String street = null;
  private String neighborhood = null;
  private String city = null;
  private String municipality = null;
  
  public enum StateEnum {
    @SerializedName("MX-AGU")
    AGU("MX-AGU"),
    @SerializedName("MX-BCN")
    BCN("MX-BCN"),
    @SerializedName("MX-BCS")
    BCS("MX-BCS"),
    @SerializedName("MX-CAM")
    CAM("MX-CAM"),
    @SerializedName("MX-CHP")
    CHP("MX-CHP"),
    @SerializedName("MX-CHH")
    CHH("MX-CHH"),
    @SerializedName("MX-CMX")
    CMX("MX-CMX"),
    @SerializedName("MX-COA")
    COA("MX-COA"),
    @SerializedName("MX-COL")
    COL("MX-COL"),
    @SerializedName("MX-DUR")
    DUR("MX-DUR"),
    @SerializedName("MX-GUA")
    GUA("MX-GUA"),
    @SerializedName("MX-GRO")
    GRO("MX-GRO"),
    @SerializedName("MX-HID")
    HID("MX-HID"),
    @SerializedName("MX-JAL")
    JAL("MX-JAL"),
    @SerializedName("MX-MIC")
    MIC("MX-MIC"),
    @SerializedName("MX-MOR")
    MOR("MX-MOR"),
    @SerializedName("MX-MEX")
    MEX("MX-MEX"),
    @SerializedName("MX-NAY")
    NAY("MX-NAY"),
    @SerializedName("MX-NLE")
    NLE("MX-NLE"),
    @SerializedName("MX-OAX")
    OAX("MX-OAX"),
    @SerializedName("MX-PUE")
    PUE("MX-PUE"),
    @SerializedName("MX-QUE")
    QUE("MX-QUE"),
    @SerializedName("MX-ROO")
    ROO("MX-ROO"),
    @SerializedName("MX-SLP")
    SLP("MX-SLP"),
    @SerializedName("MX-SIN")
    SIN("MX-SIN"),
    @SerializedName("MX-SON")
    SON("MX-SON"),
    @SerializedName("MX-TAB")
    TAB("MX-TAB"),
    @SerializedName("MX-TAM")
    TAM("MX-TAM"),
    @SerializedName("MX-TLA")
    TLA("MX-TLA"),
    @SerializedName("MX-VER")
    VER("MX-VER"),
    @SerializedName("MX-YUC")
    YUC("MX-YUC"),
    @SerializedName("MX-ZAC")
    ZAC("MX-ZAC");
    private String value;
    StateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StateEnum fromValue(String input) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }
      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StateEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("state")
  private StateEnum state = null;
  @SerializedName("postalCode")
  private String postalCode = null;
  public Address street(String street) {
    this.street = street;
    return this;
  }
   
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }
  public Address neighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
    return this;
  }
   
  public String getNeighborhood() {
    return neighborhood;
  }
  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }
  public Address city(String city) {
    this.city = city;
    return this;
  }
   
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public Address municipality(String municipality) {
    this.municipality = municipality;
    return this;
  }
   
  public String getMunicipality() {
    return municipality;
  }
  public void setMunicipality(String municipality) {
    this.municipality = municipality;
  }
  public Address state(StateEnum state) {
    this.state = state;
    return this;
  }
   
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }
  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }
   
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.street, address.street) &&
        Objects.equals(this.neighborhood, address.neighborhood) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.municipality, address.municipality) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.postalCode, address.postalCode);
  }
  @Override
  public int hashCode() {
    return Objects.hash(street, neighborhood, city, municipality, state, postalCode);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    neighborhood: ").append(toIndentedString(neighborhood)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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
