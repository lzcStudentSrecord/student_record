package com.lzlz.student.record.entiy;

public class StudentTextbook {
	private long stno;
	private long sno;
	private String tbname;
	private int num;
	private float price;
	private String state;

	public StudentTextbook() {
		super();
	}

	public StudentTextbook(long stno, long sno, String tbname, int num, float price, String state) {
		super();
		this.stno = stno;
		this.sno = sno;
		this.tbname = tbname;
		this.num = num;
		this.price = price;
		this.state = state;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getStno() {
		return stno;
	}

	public void setStno(long stno) {
		this.stno = stno;
	}

	@Override
	public String toString() {
		return "StudentTextbook [stno=" + stno + ", sno=" + sno + ", tbname=" + tbname + ", num=" + num + ", price="
				+ price + ", state=" + state + "]";
	}

}
