
package com.cdc.apihub.mx.employmentVerification.client.model;

import java.util.Objects;
import java.util.UUID;

import com.google.gson.annotations.SerializedName;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-12T10:06:28.689207-06:00[America/Mexico_City]")
public class EmploymentVerificationId {
	@SerializedName("employmentVerificationRequestId")
	private UUID employmentVerificationRequestId = null;

	@SerializedName("subscriptionId")
	private UUID subscriptionId = null;

	@SerializedName("inquiryId")
	private UUID inquiryId = null;

	public EmploymentVerificationId employmentVerificationRequestId(UUID employmentVerificationRequestId) {
		this.employmentVerificationRequestId = employmentVerificationRequestId;
		return this;
	}

	public UUID getEmploymentVerificationRequestId() {
		return employmentVerificationRequestId;
	}

	public void setEmploymentVerificationRequestId(UUID employmentVerificationRequestId) {
		this.employmentVerificationRequestId = employmentVerificationRequestId;
	}

	public EmploymentVerificationId subscriptionId(UUID subscriptionId) {
		this.subscriptionId = subscriptionId;
		return this;
	}

	public UUID getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(UUID subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public UUID getInquiryId() {
		return inquiryId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		EmploymentVerificationId employmentVerificationId = (EmploymentVerificationId) o;
		return Objects.equals(this.employmentVerificationRequestId,
				employmentVerificationId.employmentVerificationRequestId)
				&& Objects.equals(this.subscriptionId, employmentVerificationId.subscriptionId)
				&& Objects.equals(this.inquiryId, employmentVerificationId.inquiryId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(employmentVerificationRequestId, subscriptionId, inquiryId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EmploymentVerificationId {\n");

		sb.append("    employmentVerificationRequestId: ").append(toIndentedString(employmentVerificationRequestId))
				.append("\n");
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
