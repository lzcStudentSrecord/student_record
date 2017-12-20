package com.lzlz.student.record.entiy;

public class Well {
	private long weid;
	private long sno;
	private String getTime;
	private String wtype;
	private String wname;

	public Well() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Well(long weid, long sno, String getTime, String wtype, String wname) {
		super();
		this.weid = weid;
		this.sno = sno;
		this.getTime = getTime;
		this.wtype = wtype;
		this.wname = wname;
	}

	public long getWeid() {
		return weid;
	}

	public void setWeid(long weid) {
		this.weid = weid;
	}

	public long getSno() {
		return sno;
	}

	public void setSno(long sno) {
		this.sno = sno;
	}

	public String getGetTime() {
		return getTime;
	}

	public void setGetTime(String getTime) {
		this.getTime = getTime;
	}

	public String getWtype() {
		return wtype;
	}

	public void setWtype(String wtype) {
		this.wtype = wtype;
	}

	public String getWname() {
		return wname;
	}

	public void setWname(String wname) {
		this.wname = wname;
	}

	@Override
	public String toString() {
		return "Well [weid=" + weid + ", sno=" + sno + ", getTime=" + getTime + ", wtype=" + wtype + ", wname=" + wname
				+ "]";
	}

}
