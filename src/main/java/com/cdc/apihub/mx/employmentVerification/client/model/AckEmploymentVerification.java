package com.cdc.apihub.mx.employmentVerification.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-12T10:06:28.689207-06:00[America/Mexico_City]")
public class AckEmploymentVerification {
  @SerializedName("acknowledgeId")
  private UUID acknowledgeId = null;

  @SerializedName("dateTime")
  private OffsetDateTime dateTime = null;

  
  @JsonAdapter(OperationEnum.Adapter.class)
  public enum OperationEnum {
    REQUEST("request"),
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
    public static OperationEnum fromValue(String text) {
      for (OperationEnum b : OperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OperationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OperationEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("operation")
  private OperationEnum operation = null;

  @SerializedName("message")
  private String message = null;

   
  public UUID getAcknowledgeId() {
    return acknowledgeId;
  }

   
  public OffsetDateTime getDateTime() {
    return dateTime;
  }

   
  public OperationEnum getOperation() {
    return operation;
  }

   
  public String getMessage() {
    return message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AckEmploymentVerification ackEmploymentVerification = (AckEmploymentVerification) o;
    return Objects.equals(this.acknowledgeId, ackEmploymentVerification.acknowledgeId) &&
        Objects.equals(this.dateTime, ackEmploymentVerification.dateTime) &&
        Objects.equals(this.operation, ackEmploymentVerification.operation) &&
        Objects.equals(this.message, ackEmploymentVerification.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acknowledgeId, dateTime, operation, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AckEmploymentVerification {\n");
    
    sb.append("    acknowledgeId: ").append(toIndentedString(acknowledgeId)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
