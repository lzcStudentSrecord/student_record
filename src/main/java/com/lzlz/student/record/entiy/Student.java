package com.lzlz.student.record.entiy;

public class Student {
	private long sno;
	private String sname;
	private String sgender;
	private int sgrade;
	private int sclass;
	private String sdept;
	private String saddress;
	private String sphone;
	private String sparent;
	private String sparent_phone;
	private String sjob;
	private long tfrom;
	private String sstate;

	public Student() {
		super();
	}

	public Student(long sno, String sname, String sgender, int sgrade, int sclass, String sdept, String saddress,
			String sphone, String sparent, String sparent_phone, String sjob, long tfrom, String sstate) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sgender = sgender;
		this.sgrade = sgrade;
		this.sclass = sclass;
		this.sdept = sdept;
		this.saddress = saddress;
		this.sphone = sphone;
		this.sparent = sparent;
		this.sparent_phone = sparent_phone;
		this.sjob = sjob;
		this.tfrom = tfrom;
		this.sstate = sstate;
	}

	public long getSno() {
		return sno;
	}

	public void setSno(long sno) {
		this.sno = sno;
	}

	public int getSgrade() {
		return sgrade;
	}

	public void setSgrade(int sgrade) {
		this.sgrade = sgrade;
	}

	public int getSclass() {
		return sclass;
	}

	public void setSclass(int sclass) {
		this.sclass = sclass;
	}

	public String getSdept() {
		return sdept;
	}

	public void setSdept(String sdept) {
		this.sdept = sdept;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public String getSphone() {
		return sphone;
	}

	public void setSphone(String sphone) {
		this.sphone = sphone;
	}

	public String getSparent() {
		return sparent;
	}

	public void setSparent(String sparent) {
		this.sparent = sparent;
	}

	public String getSparent_phone() {
		return sparent_phone;
	}

	public void setSparent_phone(String sparent_phone) {
		this.sparent_phone = sparent_phone;
	}

	public String getSjob() {
		return sjob;
	}

	public void setSjob(String sjob) {
		this.sjob = sjob;
	}

	public long getSfrom() {
		return tfrom;
	}

	public void setSfrom(long sfrom) {
		this.tfrom = sfrom;
	}

	public String getSstate() {
		return sstate;
	}

	public void setSstate(String sstate) {
		this.sstate = sstate;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSgender() {
		return sgender;
	}

	public void setSgender(String sgender) {
		this.sgender = sgender;
	}

	public long getTfrom() {
		return tfrom;
	}

	public void setTfrom(long tfrom) {
		this.tfrom = tfrom;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sgrade=" + sgrade + ", sclass=" + sclass + ", sdept=" + sdept + ", saddress="
				+ saddress + ", sphone=" + sphone + ", sparent=" + sparent + ", sparent_phone=" + sparent_phone
				+ ", sjob=" + sjob + ", sfrom=" + tfrom + ", sstate=" + sstate + "]";
	}

}
