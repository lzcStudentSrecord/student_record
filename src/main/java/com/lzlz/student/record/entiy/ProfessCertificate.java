package com.lzlz.student.record.entiy;

public class ProfessCertificate {
	private long pcid;
	private long sno;
	private String pctype;
	private String pctime;
	private String pcoffice;
	private String pcstate;

	public ProfessCertificate() {
		super();
	}

	public ProfessCertificate(long pcid, long sno, String pctype, String pctime, String pcoffice, String pcstate) {
		super();
		this.pcid = pcid;
		this.sno = sno;
		this.pctype = pctype;
		this.pctime = pctime;
		this.pcoffice = pcoffice;
		this.pcstate = pcstate;
	}

	public long getPcid() {
		return pcid;
	}

	public void setPcid(long pcid) {
		this.pcid = pcid;
	}

	public long getSno() {
		return sno;
	}

	public void setSno(long sno) {
		this.sno = sno;
	}

	public String getPctype() {
		return pctype;
	}

	public void setPctype(String pctype) {
		this.pctype = pctype;
	}

	public String getPctime() {
		return pctime;
	}

	public void setPctime(String pctime) {
		this.pctime = pctime;
	}

	public String getPcoffice() {
		return pcoffice;
	}

	public void setPcoffice(String pcoffice) {
		this.pcoffice = pcoffice;
	}

	public String getPcstate() {
		return pcstate;
	}

	public void setPcstate(String pcstate) {
		this.pcstate = pcstate;
	}

	@Override
	public String toString() {
		return "ProfessCertificate [pcid=" + pcid + ", sno=" + sno + ", pctype=" + pctype + ", pctime=" + pctime
				+ ", pcoffice=" + pcoffice + ", pcstate=" + pcstate + "]";
	}

}
