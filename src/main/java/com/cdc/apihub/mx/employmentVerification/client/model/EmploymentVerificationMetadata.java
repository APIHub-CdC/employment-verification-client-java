

package com.cdc.apihub.mx.employmentVerification.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.cdc.apihub.mx.employmentVerification.client.model.EmploymentVerifications;
import com.cdc.apihub.mx.employmentVerification.client.model.Metadata;

import java.io.IOException;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-12T10:06:28.689207-06:00[America/Mexico_City]")
public class EmploymentVerificationMetadata {
  @SerializedName("_metadata")
  private Metadata _metadata = null;

  @SerializedName("inquiries")
  private EmploymentVerifications inquiries = null;

  public EmploymentVerificationMetadata _metadata(Metadata _metadata) {
    this._metadata = _metadata;
    return this;
  }

   

  public Metadata getMetadata() {
    return _metadata;
  }

  public void setMetadata(Metadata _metadata) {
    this._metadata = _metadata;
  }

  public EmploymentVerificationMetadata inquiries(EmploymentVerifications inquiries) {
    this.inquiries = inquiries;
    return this;
  }

   

  public EmploymentVerifications getInquiries() {
    return inquiries;
  }

  public void setInquiries(EmploymentVerifications inquiries) {
    this.inquiries = inquiries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmploymentVerificationMetadata employmentVerificationMetadata = (EmploymentVerificationMetadata) o;
    return Objects.equals(this._metadata, employmentVerificationMetadata._metadata) &&
        Objects.equals(this.inquiries, employmentVerificationMetadata.inquiries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_metadata, inquiries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmploymentVerificationMetadata {\n");
    
    sb.append("    _metadata: ").append(toIndentedString(_metadata)).append("\n");
    sb.append("    inquiries: ").append(toIndentedString(inquiries)).append("\n");
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
