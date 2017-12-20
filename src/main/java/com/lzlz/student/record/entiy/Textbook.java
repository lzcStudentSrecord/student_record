package com.lzlz.student.record.entiy;

public class Textbook {
	private String tbname;
	private float tbprice;

	public Textbook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Textbook(String tbname, float tbprice) {
		super();
		this.tbname = tbname;
		this.tbprice = tbprice;
	}

	public String getTbname() {
		return tbname;
	}

	public void setTbname(String tbname) {
		this.tbname = tbname;
	}

	public float getTbprice() {
		return tbprice;
	}

	public void setTbprice(float tbprice) {
		this.tbprice = tbprice;
	}

	@Override
	public String toString() {
		return "Textbook [tbname=" + tbname + ", tbprice=" + tbprice + "]";
	}

}
