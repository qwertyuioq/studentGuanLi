package com.wh.bean;

public class FenLei {
	private String sname;
	private String banji;
	private String time;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBanji() {
		return banji;
	}
	public void setBanji(String banji) {
		this.banji = banji;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "FenLei [sname=" + sname + ", banji=" + banji + ", time=" + time + "]";
	}
	
	

}
