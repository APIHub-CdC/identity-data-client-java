package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;


public class StandardEnvelope {
  @SerializedName("code")
  private String code = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("datetime")
  private OffsetDateTime datetime = null;
  @SerializedName("externalId")
  private UUID externalId = null;
  @SerializedName("data")
  private Object data = null;
  public StandardEnvelope code(String code) {
    this.code = code;
    return this;
  }
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  public StandardEnvelope message(String message) {
    this.message = message;
    return this;
  }
   
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  public StandardEnvelope datetime(OffsetDateTime datetime) {
    this.datetime = datetime;
    return this;
  }
   
  public OffsetDateTime getDatetime() {
    return datetime;
  }
  public void setDatetime(OffsetDateTime datetime) {
    this.datetime = datetime;
  }
  public StandardEnvelope externalId(UUID externalId) {
    this.externalId = externalId;
    return this;
  }
   
  public UUID getExternalId() {
    return externalId;
  }
  public void setExternalId(UUID externalId) {
    this.externalId = externalId;
  }
  public StandardEnvelope data(Object data) {
    this.data = data;
    return this;
  }
   
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
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
    StandardEnvelope standardEnvelope = (StandardEnvelope) o;
    return Objects.equals(this.code, standardEnvelope.code) &&
        Objects.equals(this.message, standardEnvelope.message) &&
        Objects.equals(this.datetime, standardEnvelope.datetime) &&
        Objects.equals(this.externalId, standardEnvelope.externalId) &&
        Objects.equals(this.data, standardEnvelope.data);
  }
  @Override
  public int hashCode() {
    return Objects.hash(code, message, datetime, externalId, data);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardEnvelope {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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
