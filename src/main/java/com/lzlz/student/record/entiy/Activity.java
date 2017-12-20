package com.lzlz.student.record.entiy;

public class Activity {
	private long aid;
	private long proposer;
	private String aname;
	private String acontent;
	private String aaffect;
	private String astate;

	public Activity() {
		super();
	}

	public Activity(long aid, long proposer, String aname, String acontent, String aaffect, String astate) {
		super();
		this.aid = aid;
		this.proposer = proposer;
		this.aname = aname;
		this.acontent = acontent;
		this.aaffect = aaffect;
		this.astate = astate;
	}

	public long getAid() {
		return aid;
	}

	public void setAid(long aid) {
		this.aid = aid;
	}

	public long getProposer() {
		return proposer;
	}

	public void setProposer(long proposer) {
		this.proposer = proposer;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAcontent() {
		return acontent;
	}

	public void setAcontent(String acontent) {
		this.acontent = acontent;
	}

	public String getAaffect() {
		return aaffect;
	}

	public void setAaffect(String aaffect) {
		this.aaffect = aaffect;
	}

	public String getAstate() {
		return astate;
	}

	public void setAstate(String astate) {
		this.astate = astate;
	}

}
