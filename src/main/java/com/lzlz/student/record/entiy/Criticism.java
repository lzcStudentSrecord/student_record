package com.lzlz.student.record.entiy;

public class Criticism {
	private long crid;
	private long sno;
	private String ctime;
	private String creason;
	private String ctype;
	private String cpunishment;

	public Criticism() {
		super();
	}

	public Criticism(long crid, long sno, String ctime, String creason, String ctype, String cpunishment) {
		super();
		this.crid = crid;
		this.sno = sno;
		this.ctime = ctime;
		this.creason = creason;
		this.ctype = ctype;
		this.cpunishment = cpunishment;
	}

	public long getCrid() {
		return crid;
	}

	public void setCrid(long crid) {
		this.crid = crid;
	}

	public long getSno() {
		return sno;
	}

	public void setSno(long sno) {
		this.sno = sno;
	}

	public String getCtime() {
		return ctime;
	}

	public void setCtime(String ctime) {
		this.ctime = ctime;
	}

	public String getCreason() {
		return creason;
	}

	public void setCreason(String creason) {
		this.creason = creason;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public String getCpunishment() {
		return cpunishment;
	}

	public void setCpunishment(String cpunishment) {
		this.cpunishment = cpunishment;
	}

	@Override
	public String toString() {
		return "Criticism [crid=" + crid + ", sno=" + sno + ", ctime=" + ctime + ", creason=" + creason + ", ctype="
				+ ctype + ", cpunishment=" + cpunishment + "]";
	}

}
