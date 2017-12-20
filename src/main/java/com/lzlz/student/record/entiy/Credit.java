package com.lzlz.student.record.entiy;

public class Credit {
	private long credId;
	private long sno;
	private String cname;
	private String ctype;
	private int cscore;

	public Credit() {
		super();
	}

	public Credit(long credId, long sno, String cname, String ctype, int cscore) {
		super();
		this.credId = credId;
		this.sno = sno;
		this.cname = cname;
		this.ctype = ctype;
		this.cscore = cscore;
	}

	public long getCredId() {
		return credId;
	}

	public void setCredId(long credId) {
		this.credId = credId;
	}

	public long getSno() {
		return sno;
	}

	public void setSno(long sno) {
		this.sno = sno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public int getCscore() {
		return cscore;
	}

	public void setCscore(int cscore) {
		this.cscore = cscore;
	}

	@Override
	public String toString() {
		return "Credit [sno=" + sno + ", cname=" + cname + ", ctype=" + ctype + ", cscore=" + cscore + "]";
	}

}
