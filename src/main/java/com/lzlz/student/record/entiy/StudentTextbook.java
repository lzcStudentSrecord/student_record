package com.lzlz.student.record.entiy;

public class StudentTextbook {
	private long sno;
	private String tbname;
	private int num;
	private float price;

	public StudentTextbook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentTextbook(long sno, String tbname, int num, float price) {
		super();
		this.sno = sno;
		this.tbname = tbname;
		this.num = num;
		this.price = price;
	}

	public long getSno() {
		return sno;
	}

	public void setSno(long sno) {
		this.sno = sno;
	}

	public String getTbname() {
		return tbname;
	}

	public void setTbname(String tbname) {
		this.tbname = tbname;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "StudentTextbook [sno=" + sno + ", tbname=" + tbname + ", num=" + num + ", price=" + price + "]";
	}

}
