package com.cdc.apihub.mx.employmentVerification.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class WorkingHistoryDetail {

	@SerializedName(value = "employerName", alternate = { "employer_name", "employerName" })
	private String employerName = null;

	@SerializedName(value = "employerRegister", alternate = { "employer_register", "employerRegister" })
	private String employerRegister = null;

	@SerializedName(value = "federalEntity", alternate = { "federal_entity", "federalEntity" })
	private String federalEntity = null;

	@SerializedName(value = "startDate", alternate = { "start_date", "startDate" })
	private String startDate = null;

	@SerializedName(value = "endDate", alternate = { "end_date", "endDate" })
	private String endDate = null;

	@SerializedName(value = "lastContributionBaseSalary", alternate = { "last_contribution_base_salary",
			"lastContributionBaseSalary" })
	private Integer lastContributionBaseSalary = null;

	@SerializedName(value = "workStatusEvents", alternate = { "work_status_events" ,"workStatusEvents"})
	private List<WorkStatusEvent> workStatusEvents = null;

	public WorkingHistoryDetail employerName(String employerName) {
		this.employerName = employerName;
		return this;
	}

	public String getemployerName() {
		return employerName;
	}

	public void setemployerName(String employerName) {
		this.employerName = employerName;
	}

	public WorkingHistoryDetail employerRegister(String employerRegister) {
		this.employerRegister = employerRegister;
		return this;
	}

	public String getemployerRegister() {
		return employerRegister;
	}

	public void setemployerRegister(String employerRegister) {
		this.employerRegister = employerRegister;
	}

	public WorkingHistoryDetail federalEntity(String federalEntity) {
		this.federalEntity = federalEntity;
		return this;
	}

	public String getFederalEntity() {
		return federalEntity;
	}

	public void setFederalEntity(String federalEntity) {
		this.federalEntity = federalEntity;
	}

	public WorkingHistoryDetail startDate(String startDate) {
		this.startDate = startDate;
		return this;
	}

	

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public WorkingHistoryDetail endDate(String endDate) {
		this.endDate = endDate;
		return this;
	}

	

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public WorkingHistoryDetail lastContributionBaseSalary(Integer lastContributionBaseSalary) {
		this.lastContributionBaseSalary = lastContributionBaseSalary;
		return this;
	}

	public Integer getLastContributionBaseSalary() {
		return lastContributionBaseSalary;
	}

	public void setLastContributionBaseSalary(Integer lastContributionBaseSalary) {
		this.lastContributionBaseSalary = lastContributionBaseSalary;
	}

	public WorkingHistoryDetail workStatusEvents(List<WorkStatusEvent> workStatusEvents) {
		this.workStatusEvents = workStatusEvents;
		return this;
	}

	public WorkingHistoryDetail addWorkStatusEventsItem(WorkStatusEvent workStatusEventsItem) {
		if (this.workStatusEvents == null) {
			this.workStatusEvents = new ArrayList<WorkStatusEvent>();
		}
		this.workStatusEvents.add(workStatusEventsItem);
		return this;
	}

	

	public List<WorkStatusEvent> getWorkStatusEvents() {
		return workStatusEvents;
	}

	public void setWorkStatusEvents(List<WorkStatusEvent> workStatusEvents) {
		this.workStatusEvents = workStatusEvents;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WorkingHistoryDetail workingHistoryDetail = (WorkingHistoryDetail) o;
		return Objects.equals(this.employerName, workingHistoryDetail.employerName)
				&& Objects.equals(this.employerRegister, workingHistoryDetail.employerRegister)
				&& Objects.equals(this.federalEntity, workingHistoryDetail.federalEntity)
				&& Objects.equals(this.startDate, workingHistoryDetail.startDate)
				&& Objects.equals(this.endDate, workingHistoryDetail.endDate)
				&& Objects.equals(this.lastContributionBaseSalary, workingHistoryDetail.lastContributionBaseSalary)
				&& Objects.equals(this.workStatusEvents, workingHistoryDetail.workStatusEvents);
	}

	@Override
	public int hashCode() {
		return Objects.hash(employerName, employerRegister, federalEntity, startDate, endDate,
				lastContributionBaseSalary, workStatusEvents);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WorkingHistoryDetail {\n");

		sb.append("    employerName: ").append(toIndentedString(employerName)).append("\n");
		sb.append("    employerRegister: ").append(toIndentedString(employerRegister)).append("\n");
		sb.append("    federalEntity: ").append(toIndentedString(federalEntity)).append("\n");
		sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
		sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
		sb.append("    lastContributionBaseSalary: ").append(toIndentedString(lastContributionBaseSalary)).append("\n");
		sb.append("    workStatusEvents: ").append(toIndentedString(workStatusEvents)).append("\n");
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
