

package com.cdc.apihub.mx.employmentVerification.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.cdc.apihub.mx.employmentVerification.client.model.AckEmploymentVerification;
import com.cdc.apihub.mx.employmentVerification.client.model.FailureEVConsumption;

import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-12T10:06:28.689207-06:00[America/Mexico_City]")
public class AckFailureEVConsumption extends AckEmploymentVerification {
  @SerializedName("employmentVerification")
  private FailureEVConsumption employmentVerification = null;

  public AckFailureEVConsumption employmentVerification(FailureEVConsumption employmentVerification) {
    this.employmentVerification = employmentVerification;
    return this;
  }

   
  public FailureEVConsumption getEmploymentVerification() {
    return employmentVerification;
  }

  public void setEmploymentVerification(FailureEVConsumption employmentVerification) {
    this.employmentVerification = employmentVerification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AckFailureEVConsumption ackFailureEVConsumption = (AckFailureEVConsumption) o;
    return Objects.equals(this.employmentVerification, ackFailureEVConsumption.employmentVerification) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employmentVerification, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AckFailureEVConsumption {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    employmentVerification: ").append(toIndentedString(employmentVerification)).append("\n");
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
