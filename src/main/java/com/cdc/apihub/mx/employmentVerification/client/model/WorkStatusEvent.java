package com.cdc.apihub.mx.employmentVerification.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class WorkStatusEvent {

	@SerializedName(value = "changeType", alternate = { "change_type", "changeType" })
	private Integer changeType = null;

	@SerializedName(value = "eventDate", alternate = { "event_date", "eventDate" })
	private String eventDate = null;

	@SerializedName(value = "baseSalary", alternate = { "base_salary", "baseSalary" })
	private String baseSalary = null;

	public WorkStatusEvent changeType(Integer changeType) {
		this.changeType = changeType;
		return this;
	}

	public Integer getChangeType() {
		return changeType;
	}

	public void setChangeType(Integer changeType) {
		this.changeType = changeType;
	}

	public WorkStatusEvent eventDate(String eventDate) {
		this.eventDate = eventDate;
		return this;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public WorkStatusEvent baseSalary(String baseSalary) {
		this.baseSalary = baseSalary;
		return this;
	}

	public String getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(String baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WorkStatusEvent workStatusEvent = (WorkStatusEvent) o;
		return Objects.equals(this.changeType, workStatusEvent.changeType)
				&& Objects.equals(this.eventDate, workStatusEvent.eventDate)
				&& Objects.equals(this.baseSalary, workStatusEvent.baseSalary);
	}

	@Override
	public int hashCode() {
		return Objects.hash(changeType, eventDate, baseSalary);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WorkStatusEvent {\n");

		sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
		sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
		sb.append("    baseSalary: ").append(toIndentedString(baseSalary)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
