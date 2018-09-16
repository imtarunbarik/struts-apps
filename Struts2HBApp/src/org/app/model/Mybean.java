package org.app.model;

/**
 * @Author: Tarun Barik
 * @ProjectName: Struts2HBApp
 * @PackageName: org.app.model
 * @FileName: Mybean.java 
 *
 */
public class Mybean {
	// bean properties
	private int no;
	private String nam = "";
	private String ct = "";

	// getter & setter methods
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getNam() {
		return nam;
	}

	public void setNam(String nam) {
		this.nam = nam;
	}

	public String getCt() {
		return ct;
	}

	public void setCt(String ct) {
		this.ct = ct;
	}

	@Override
	public String toString() {
		return "Mybean [no=" + no + ", nam=" + nam + ", ct=" + ct + "]";
	}

}// class