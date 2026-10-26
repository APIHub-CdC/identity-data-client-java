package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;



public class IdentityCedulaValidationResponse {
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
  @SerializedName("externalId")
  private String externalId = null;
  @SerializedName("subscriptionId")
  private String subscriptionId = null;
  @SerializedName("inquiryId")
  private String inquiryId = null;
  public IdentityCedulaValidationResponse dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }
   
  public OffsetDateTime getDateTime() {
    return dateTime;
  }
  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }
  public IdentityCedulaValidationResponse operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }
   
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }
  public IdentityCedulaValidationResponse message(String message) {
    this.message = message;
    return this;
  }
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  public IdentityCedulaValidationResponse externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }
  public IdentityCedulaValidationResponse subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }
   
  public String getSubscriptionId() {
    return subscriptionId;
  }
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }
  public IdentityCedulaValidationResponse inquiryId(String inquiryId) {
    this.inquiryId = inquiryId;
    return this;
  }
   
  public String getInquiryId() {
    return inquiryId;
  }
  public void setInquiryId(String inquiryId) {
    this.inquiryId = inquiryId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityCedulaValidationResponse identityCedulaValidationResponse = (IdentityCedulaValidationResponse) o;
    return Objects.equals(this.dateTime, identityCedulaValidationResponse.dateTime) &&
        Objects.equals(this.operation, identityCedulaValidationResponse.operation) &&
        Objects.equals(this.message, identityCedulaValidationResponse.message) &&
        Objects.equals(this.externalId, identityCedulaValidationResponse.externalId) &&
        Objects.equals(this.subscriptionId, identityCedulaValidationResponse.subscriptionId) &&
        Objects.equals(this.inquiryId, identityCedulaValidationResponse.inquiryId);
  }
  @Override
  public int hashCode() {
    return Objects.hash(dateTime, operation, message, externalId, subscriptionId, inquiryId);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityCedulaValidationResponse {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    inquiryId: ").append(toIndentedString(inquiryId)).append("\n");
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
