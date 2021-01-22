
package com.cdc.apihub.mx.employmentVerification.client.model;

import java.util.Objects;
import java.util.UUID;

import com.google.gson.annotations.SerializedName;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-12T10:06:28.689207-06:00[America/Mexico_City]")
public class AckEVRequest extends AckEmploymentVerification {
	@SerializedName("employmentVerificationRequestId")
	private UUID employmentVerificationRequestId = null;

	@SerializedName("subscriptionId")
	private UUID subscriptionId = null;

	@SerializedName("inquiryId")
	private UUID inquiryId = null;

	public AckEVRequest employmentVerificationRequestId(UUID employmentVerificationRequestId) {
		this.employmentVerificationRequestId = employmentVerificationRequestId;
		return this;
	}

	public UUID getEmploymentVerificationRequestId() {
		return employmentVerificationRequestId;
	}

	public void setEmploymentVerificationRequestId(UUID employmentVerificationRequestId) {
		this.employmentVerificationRequestId = employmentVerificationRequestId;
	}

	public AckEVRequest subscriptionId(UUID subscriptionId) {
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
		AckEVRequest ackEVRequest = (AckEVRequest) o;
		return Objects.equals(this.employmentVerificationRequestId, ackEVRequest.employmentVerificationRequestId)
				&& Objects.equals(this.subscriptionId, ackEVRequest.subscriptionId)
				&& Objects.equals(this.inquiryId, ackEVRequest.inquiryId) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(employmentVerificationRequestId, subscriptionId, inquiryId, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AckEVRequest {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
