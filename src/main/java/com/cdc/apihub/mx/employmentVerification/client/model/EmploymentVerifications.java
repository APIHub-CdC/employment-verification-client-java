
package com.cdc.apihub.mx.employmentVerification.client.model;

import java.util.ArrayList;
import java.util.Objects;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-12T10:06:28.689207-06:00[America/Mexico_City]")
public class EmploymentVerifications extends ArrayList<EmploymentVerification> {
	
	private static final long serialVersionUID = 592151209767362087L;

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		return super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EmploymentVerifications {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
