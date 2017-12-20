package com.lzlz.student.record.entiy;

public class ClassRoom {
	private int crno;
	private String craddress;

	public ClassRoom() {
		super();
	}

	public ClassRoom(int crno, String craddress) {
		super();
		this.crno = crno;
		this.craddress = craddress;
	}

	public int getCrno() {
		return crno;
	}

	public void setCrno(int crno) {
		this.crno = crno;
	}

	public String getCraddress() {
		return craddress;
	}

	public void setCraddress(String craddress) {
		this.craddress = craddress;
	}

	@Override
	public String toString() {
		return "ClassRoom [crno=" + crno + ", craddress=" + craddress + "]";
	}

}
