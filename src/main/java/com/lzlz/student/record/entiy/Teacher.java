package com.lzlz.student.record.entiy;

public class Teacher {
	private long tno;
	private String tname;
	private String tgender;
	private String tpassword;
	private long tfrom;

	public Teacher() {
		super();
	}

	public Teacher(long tno, String tname, String tgender, String tpassword, long tfrom) {
		super();
		this.tno = tno;
		this.tname = tname;
		this.tgender = tgender;
		this.tpassword = tpassword;
		this.tfrom = tfrom;
	}

	public long getTfrom() {
		return tfrom;
	}

	public void setTfrom(long tfrom) {
		this.tfrom = tfrom;
	}

	public long getTno() {
		return tno;
	}

	public void setTno(long tno) {
		this.tno = tno;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTgender() {
		return tgender;
	}

	public void setTgender(String tgender) {
		this.tgender = tgender;
	}

	public String getTpassword() {
		return tpassword;
	}

	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}

	@Override
	public String toString() {
		return "Teacher [tno=" + tno + ", tname=" + tname + ", tgender=" + tgender + ", tpassword=" + tpassword + "]";
	}

}
