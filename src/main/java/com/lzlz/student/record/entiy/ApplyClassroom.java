package com.lzlz.student.record.entiy;

public class ApplyClassroom {
	private long acid;
	private long proposer;
	private String reason;
	private String craddress;
	private String startTime;
	private String endTime;
	private String acstate;

	public ApplyClassroom() {
		super();
	}

	public ApplyClassroom(long acid, long proposer, String reason, String craddress, String startTime, String endTime,
			String acstate) {
		super();
		this.acid = acid;
		this.proposer = proposer;
		this.reason = reason;
		this.craddress = craddress;
		this.startTime = startTime;
		this.endTime = endTime;
		this.acstate = acstate;
	}

	public long getAcid() {
		return acid;
	}

	public void setAcid(long acid) {
		this.acid = acid;
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

	public String getAcstate() {
		return acstate;
	}

	public void setAcstate(String acstate) {
		this.acstate = acstate;
	}

	@Override
	public String toString() {
		return "ApplyClassroom [acid=" + acid + ", proposer=" + proposer + ", reason=" + reason + ", craddress="
				+ craddress + ", startTime=" + startTime + ", endTime=" + endTime + ", acstate=" + acstate + "]";
	}

}
