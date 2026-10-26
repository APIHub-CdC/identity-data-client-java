package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class VerifyCedulaGetResponseDataResult {
  @SerializedName("source")
  private String source = null;
  
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("SUCCESS")
    SUCCESS("SUCCESS"),
    @SerializedName("NOT_FOUND")
    NOT_FOUND("NOT_FOUND"),
    @SerializedName("UNAVAILABLE")
    UNAVAILABLE("UNAVAILABLE");
    private String value;
    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }
      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("reasonCode")
  private String reasonCode = null;
  @SerializedName("reasonDescription")
  private String reasonDescription = null;
  @SerializedName("records")
  private List<Object> records = null;
  public VerifyCedulaGetResponseDataResult source(String source) {
    this.source = source;
    return this;
  }
   
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }
  public VerifyCedulaGetResponseDataResult status(StatusEnum status) {
    this.status = status;
    return this;
  }
   
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }
  public VerifyCedulaGetResponseDataResult reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }
   
  public String getReasonCode() {
    return reasonCode;
  }
  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }
  public VerifyCedulaGetResponseDataResult reasonDescription(String reasonDescription) {
    this.reasonDescription = reasonDescription;
    return this;
  }
   
  public String getReasonDescription() {
    return reasonDescription;
  }
  public void setReasonDescription(String reasonDescription) {
    this.reasonDescription = reasonDescription;
  }
  public VerifyCedulaGetResponseDataResult records(List<Object> records) {
    this.records = records;
    return this;
  }
  public VerifyCedulaGetResponseDataResult addRecordsItem(Object recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<Object>();
    }
    this.records.add(recordsItem);
    return this;
  }
   
  public List<Object> getRecords() {
    return records;
  }
  public void setRecords(List<Object> records) {
    this.records = records;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyCedulaGetResponseDataResult verifyCedulaGetResponseDataResult = (VerifyCedulaGetResponseDataResult) o;
    return Objects.equals(this.source, verifyCedulaGetResponseDataResult.source) &&
        Objects.equals(this.status, verifyCedulaGetResponseDataResult.status) &&
        Objects.equals(this.reasonCode, verifyCedulaGetResponseDataResult.reasonCode) &&
        Objects.equals(this.reasonDescription, verifyCedulaGetResponseDataResult.reasonDescription) &&
        Objects.equals(this.records, verifyCedulaGetResponseDataResult.records);
  }
  @Override
  public int hashCode() {
    return Objects.hash(source, status, reasonCode, reasonDescription, records);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyCedulaGetResponseDataResult {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    reasonDescription: ").append(toIndentedString(reasonDescription)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
