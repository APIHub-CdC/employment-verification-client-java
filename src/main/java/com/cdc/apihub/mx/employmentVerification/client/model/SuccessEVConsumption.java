

package com.cdc.apihub.mx.employmentVerification.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.cdc.apihub.mx.employmentVerification.client.model.CatalogIndustry;
import com.cdc.apihub.mx.employmentVerification.client.model.EmploymentVerification;

import java.io.IOException;
import org.threeten.bp.LocalDate;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-12T10:06:28.689207-06:00[America/Mexico_City]")
public class SuccessEVConsumption {
  @SerializedName("request")
  private EmploymentVerification request = null;

  @SerializedName("names")
  private String names = null;

  @SerializedName("birthday")
  private LocalDate birthday = null;

  
  @JsonAdapter(WorkStatusEnum.Adapter.class)
  public enum WorkStatusEnum {
    W("W"),
    NW("NW");

    private String value;

    WorkStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static WorkStatusEnum fromValue(String text) {
      for (WorkStatusEnum b : WorkStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<WorkStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WorkStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WorkStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WorkStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("workStatus")
  private WorkStatusEnum workStatus = null;

  @SerializedName("validUntil")
  private LocalDate validUntil = null;

  @SerializedName("industry")
  private CatalogIndustry industry = null;

  
  @JsonAdapter(IndustryRiskSegmentEnum.Adapter.class)
  public enum IndustryRiskSegmentEnum {
    H("H"),
    M("M"),
    L("L");

    private String value;

    IndustryRiskSegmentEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static IndustryRiskSegmentEnum fromValue(String text) {
      for (IndustryRiskSegmentEnum b : IndustryRiskSegmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<IndustryRiskSegmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IndustryRiskSegmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public IndustryRiskSegmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return IndustryRiskSegmentEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("industryRiskSegment")
  private IndustryRiskSegmentEnum industryRiskSegment = null;

  @SerializedName("nssCheck")
  private Boolean nssCheck = null;

  public SuccessEVConsumption request(EmploymentVerification request) {
    this.request = request;
    return this;
  }

   

  public EmploymentVerification getRequest() {
    return request;
  }

  public void setRequest(EmploymentVerification request) {
    this.request = request;
  }

  public String getNames() {
    return names;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public WorkStatusEnum getWorkStatus() {
    return workStatus;
  }

  public LocalDate getValidUntil() {
    return validUntil;
  }

  public SuccessEVConsumption industry(CatalogIndustry industry) {
    this.industry = industry;
    return this;
  }

  public CatalogIndustry getIndustry() {
    return industry;
  }

  public void setIndustry(CatalogIndustry industry) {
    this.industry = industry;
  }

   
  public IndustryRiskSegmentEnum getIndustryRiskSegment() {
    return industryRiskSegment;
  }

   
  public Boolean isNssCheck() {
    return nssCheck;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessEVConsumption successEVConsumption = (SuccessEVConsumption) o;
    return Objects.equals(this.request, successEVConsumption.request) &&
        Objects.equals(this.names, successEVConsumption.names) &&
        Objects.equals(this.birthday, successEVConsumption.birthday) &&
        Objects.equals(this.workStatus, successEVConsumption.workStatus) &&
        Objects.equals(this.validUntil, successEVConsumption.validUntil) &&
        Objects.equals(this.industry, successEVConsumption.industry) &&
        Objects.equals(this.industryRiskSegment, successEVConsumption.industryRiskSegment) &&
        Objects.equals(this.nssCheck, successEVConsumption.nssCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, names, birthday, workStatus, validUntil, industry, industryRiskSegment, nssCheck);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessEVConsumption {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    workStatus: ").append(toIndentedString(workStatus)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    industryRiskSegment: ").append(toIndentedString(industryRiskSegment)).append("\n");
    sb.append("    nssCheck: ").append(toIndentedString(nssCheck)).append("\n");
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
