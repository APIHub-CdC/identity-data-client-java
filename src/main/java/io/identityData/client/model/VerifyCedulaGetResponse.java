package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;



public class VerifyCedulaGetResponse {
  @SerializedName("dateTime")
  private OffsetDateTime dateTime = null;
  
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    @SerializedName("request")
    REQUEST("request"),
    @SerializedName("consumption")
    CONSUMPTION("consumption");
    private String value;
    OperationEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OperationEnum fromValue(String input) {
      for (OperationEnum b : OperationEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }
      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return OperationEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("operation")
  private OperationEnum operation = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("data")
  private VerifyCedulaGetResponseData data = null;
  public VerifyCedulaGetResponse dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }
   
  public OffsetDateTime getDateTime() {
    return dateTime;
  }
  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }
  public VerifyCedulaGetResponse operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }
   
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }
   
  public String getMessage() {
    return message;
  }
  public VerifyCedulaGetResponse data(VerifyCedulaGetResponseData data) {
    this.data = data;
    return this;
  }
   
  public VerifyCedulaGetResponseData getData() {
    return data;
  }
  public void setData(VerifyCedulaGetResponseData data) {
    this.data = data;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyCedulaGetResponse verifyCedulaGetResponse = (VerifyCedulaGetResponse) o;
    return Objects.equals(this.dateTime, verifyCedulaGetResponse.dateTime) &&
        Objects.equals(this.operation, verifyCedulaGetResponse.operation) &&
        Objects.equals(this.message, verifyCedulaGetResponse.message) &&
        Objects.equals(this.data, verifyCedulaGetResponse.data);
  }
  @Override
  public int hashCode() {
    return Objects.hash(dateTime, operation, message, data);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyCedulaGetResponse {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
