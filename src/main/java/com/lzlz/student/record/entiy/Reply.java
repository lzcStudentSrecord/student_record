package com.lzlz.student.record.entiy;

public class Reply {
	private long rid;
	private long pid;
	private String rcontent;
	private long rauthor;
	private String rdate;

	public Reply() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reply(long rid, long pid, String rcontent, long rauthor, String rdate) {
		super();
		this.rid = rid;
		this.pid = pid;
		this.rcontent = rcontent;
		this.rauthor = rauthor;
		this.rdate = rdate;
	}

	public long getRid() {
		return rid;
	}

	public void setRid(long rid) {
		this.rid = rid;
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getRcontent() {
		return rcontent;
	}

	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}

	public long getRauthor() {
		return rauthor;
	}

	public void setRauthor(long rauthor) {
		this.rauthor = rauthor;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

	@Override
	public String toString() {
		return "Reply [rid=" + rid + ", pid=" + pid + ", rcontent=" + rcontent + ", rauthor=" + rauthor + ", rdate="
				+ rdate + "]";
	}

}
