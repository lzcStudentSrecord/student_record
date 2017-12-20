package com.lzlz.student.record.entiy;

public class _Class {
	private long c_no;
	private String c_name;

	public _Class() {
		super();
		// TODO Auto-generated constructor stub
	}

	public _Class(long c_no, String c_name) {
		super();
		this.c_no = c_no;
		this.c_name = c_name;
	}

	public long getC_no() {
		return c_no;
	}

	public void setC_no(long c_no) {
		this.c_no = c_no;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	@Override
	public String toString() {
		return "_Class [c_no=" + c_no + ", c_name=" + c_name + "]";
	}

}
