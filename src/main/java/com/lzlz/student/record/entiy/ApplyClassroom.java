package com.lzlz.student.record.entiy;

public class ApplyClassroom {
	private long proposer;
	private String reason;
	private String craddress;
	private String startTime;
	private String endTime;

	public ApplyClassroom() {
		super();
	}

	public ApplyClassroom(long proposer, String reason, String craddress, String startTime, String endTime) {
		super();
		this.proposer = proposer;
		this.reason = reason;
		this.craddress = craddress;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public long getProposer() {
		return proposer;
	}

	public void setProposer(long proposer) {
		this.proposer = proposer;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getCraddress() {
		return craddress;
	}

	public void setCraddress(String craddress) {
		this.craddress = craddress;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "ApplyClassroom [proposer=" + proposer + ", reason=" + reason + ", craddress=" + craddress
				+ ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
}
