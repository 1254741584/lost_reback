package com.yc.bean;

public class Type {

	private int tid;
	
	private String tname;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Type [tid=" + tid + ", tname=" + tname + "]";
	}
	
	
	
	
	/*type{									--失物类型表
		tid  		int primarykey ,   		--主键
		tname		varchar2(50),			--类型名称
	}*/
}
