
package com.cdc.apihub.mx.employmentVerification.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-12T10:06:28.689207-06:00[America/Mexico_City]")
public class AckSuccessEVConsumption extends AckEmploymentVerification {
	@SerializedName("employmentVerification")
	private SuccessEVConsumption employmentVerification = null;

	public AckSuccessEVConsumption employmentVerification(SuccessEVConsumption employmentVerification) {
		this.employmentVerification = employmentVerification;
		return this;
	}

	public SuccessEVConsumption getEmploymentVerification() {
		return employmentVerification;
	}

	public void setEmploymentVerification(SuccessEVConsumption employmentVerification) {
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
		AckSuccessEVConsumption ackSuccessEVConsumption = (AckSuccessEVConsumption) o;
		return Objects.equals(this.employmentVerification, ackSuccessEVConsumption.employmentVerification)
				&& super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(employmentVerification, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AckSuccessEVConsumption {\n");
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
