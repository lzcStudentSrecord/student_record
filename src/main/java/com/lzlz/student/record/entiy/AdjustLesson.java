package com.lzlz.student.record.entiy;

public class AdjustLesson {
	private long tno;
	private String reason;
	private String course;
	private String oldtime;
	private String oldaddress;
	private String newtime;
	private String newaddress;

	public AdjustLesson() {
		super();
	}

	public AdjustLesson(long tno, String reason, String course, String oldtime, String oldaddress, String newtime,
			String newaddress) {
		super();
		this.tno = tno;
		this.reason = reason;
		this.course = course;
		this.oldtime = oldtime;
		this.oldaddress = oldaddress;
		this.newtime = newtime;
		this.newaddress = newaddress;
	}

	public long getTno() {
		return tno;
	}

	public void setTno(long tno) {
		this.tno = tno;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getOldtime() {
		return oldtime;
	}

	public void setOldtime(String oldtime) {
		this.oldtime = oldtime;
	}

	public String getOldaddress() {
		return oldaddress;
	}

	public void setOldaddress(String oldaddress) {
		this.oldaddress = oldaddress;
	}

	public String getNewtime() {
		return newtime;
	}

	public void setNewtime(String newtime) {
		this.newtime = newtime;
	}

	public String getNewaddress() {
		return newaddress;
	}

	public void setNewaddress(String newaddress) {
		this.newaddress = newaddress;
	}

	@Override
	public String toString() {
		return "Adjustlesson [tno=" + tno + ", reason=" + reason + ", course=" + course + ", oldtime=" + oldtime
				+ ", oldaddress=" + oldaddress + ", newtime=" + newtime + ", newaddress=" + newaddress + "]";
	}

}
