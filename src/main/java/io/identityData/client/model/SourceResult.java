package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public class SourceResult {
  
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    @SerializedName("RENAPO")
    RENAPO("RENAPO"),
    @SerializedName("INE")
    INE("INE"),
    @SerializedName("SEP")
    SEP("SEP");
    private String value;
    SourceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SourceEnum fromValue(String input) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }
      @Override
      public SourceEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SourceEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("source")
  private SourceEnum source = null;
  
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("SUCCESS")
    SUCCESS("SUCCESS"),
    @SerializedName("NOT_FOUND")
    NOT_FOUND("NOT_FOUND"),
    @SerializedName("ERROR")
    ERROR("ERROR"),
    @SerializedName("PENDING")
    PENDING("PENDING"),
    @SerializedName("PARTIAL")
    PARTIAL("PARTIAL");
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
  @SerializedName("data")
  private Object data = null;
  @SerializedName("additionalInfo")
  private SourceResultAdditionalInfo additionalInfo = null;
  public SourceResult source(SourceEnum source) {
    this.source = source;
    return this;
  }
   
  public SourceEnum getSource() {
    return source;
  }
  public void setSource(SourceEnum source) {
    this.source = source;
  }
  public SourceResult status(StatusEnum status) {
    this.status = status;
    return this;
  }
   
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }
  public SourceResult data(Object data) {
    this.data = data;
    return this;
  }
   
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
    this.data = data;
  }
  public SourceResult additionalInfo(SourceResultAdditionalInfo additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }
   
  public SourceResultAdditionalInfo getAdditionalInfo() {
    return additionalInfo;
  }
  public void setAdditionalInfo(SourceResultAdditionalInfo additionalInfo) {
    this.additionalInfo = additionalInfo;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceResult sourceResult = (SourceResult) o;
    return Objects.equals(this.source, sourceResult.source) &&
        Objects.equals(this.status, sourceResult.status) &&
        Objects.equals(this.data, sourceResult.data) &&
        Objects.equals(this.additionalInfo, sourceResult.additionalInfo);
  }
  @Override
  public int hashCode() {
    return Objects.hash(source, status, data, additionalInfo);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceResult {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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
