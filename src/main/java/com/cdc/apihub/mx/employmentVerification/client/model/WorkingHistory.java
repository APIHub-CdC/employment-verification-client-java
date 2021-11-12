package com.cdc.apihub.mx.employmentVerification.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

public class WorkingHistory {


	
	@SerializedName(value = "date", alternate = { "date" })
	private String date = null;

	

	@SerializedName(value = "pdfFile", alternate = { "pdf_file" })
	private String pdfFile = null;

	
	@SerializedName(value = "weeksContributed", alternate = { "weeks_contributed" })
	private WeeksContributed weeksContributed = null;

	
	@SerializedName(value = "workingHistoryDetail", alternate = { "working_history_detail" })

	private List<WorkingHistoryDetail> workingHistoryDetail = null;

	public WorkingHistory date(String date) {
		this.date = date;
		return this;
	}

	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public WorkingHistory pdfFile(String pdfFile) {
		this.pdfFile = pdfFile;
		return this;
	}

	public String getPdfFile() {
		return pdfFile;
	}

	public void setPdfFile(String pdfFile) {
		this.pdfFile = pdfFile;
	}

	public WorkingHistory weeksContributed(WeeksContributed weeksContributed) {
		this.weeksContributed = weeksContributed;
		return this;
	}

	

	public WeeksContributed getWeeksContributed() {
		return weeksContributed;
	}

	public void setWeeksContributed(WeeksContributed weeksContributed) {
		this.weeksContributed = weeksContributed;
	}

	public WorkingHistory workingHistoryDetail(List<WorkingHistoryDetail> workingHistoryDetail) {
		this.workingHistoryDetail = workingHistoryDetail;
		return this;
	}

	public WorkingHistory addWorkingHistoryDetailItem(WorkingHistoryDetail workingHistoryDetailItem) {
		if (this.workingHistoryDetail == null) {
			this.workingHistoryDetail = new ArrayList<WorkingHistoryDetail>();
		}
		this.workingHistoryDetail.add(workingHistoryDetailItem);
		return this;
	}

	

	public List<WorkingHistoryDetail> getWorkingHistoryDetail() {
		return workingHistoryDetail;
	}

	public void setWorkingHistoryDetail(List<WorkingHistoryDetail> workingHistoryDetail) {
		this.workingHistoryDetail = workingHistoryDetail;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WorkingHistory workingHistory = (WorkingHistory) o;
		return Objects.equals(this.date, workingHistory.date) && Objects.equals(this.pdfFile, workingHistory.pdfFile)
				&& Objects.equals(this.weeksContributed, workingHistory.weeksContributed)
				&& Objects.equals(this.workingHistoryDetail, workingHistory.workingHistoryDetail);
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, pdfFile, weeksContributed, workingHistoryDetail);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WorkingHistory {\n");

		sb.append("    date: ").append(toIndentedString(date)).append("\n");
		sb.append("    pdfFile: ").append(toIndentedString(pdfFile)).append("\n");
		sb.append("    weeksContributed: ").append(toIndentedString(weeksContributed)).append("\n");
		sb.append("    workingHistoryDetail: ").append(toIndentedString(workingHistoryDetail)).append("\n");
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
