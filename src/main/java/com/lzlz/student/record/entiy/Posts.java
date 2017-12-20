package com.lzlz.student.record.entiy;

public class Posts {
	private long pid;
	private String ptitle;
	private String pcontent;
	private long pauthor;
	private String pdate;
	public Posts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Posts(long pid, String ptitle, String pcontent, long pauthor, String pdate) {
		super();
		this.pid = pid;
		this.ptitle = ptitle;
		this.pcontent = pcontent;
		this.pauthor = pauthor;
		this.pdate = pdate;
	}

	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getPtitle() {
		return ptitle;
	}
	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}
	public String getPcontent() {
		return pcontent;
	}
	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}
	public long getPauthor() {
		return pauthor;
	}
	public void setPauthor(long pauthor) {
		this.pauthor = pauthor;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}

	@Override
	public String toString() {
		return "Posts [pid=" + pid + ", ptitle=" + ptitle + ", pcontent=" + pcontent + ", pauthor=" + pauthor
				+ ", pdate=" + pdate + "]";
	}
	
}
