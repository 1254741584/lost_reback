package com.yc.bean;

import java.io.Serializable;

public class Manger implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int mid;
	
	private String name;
	
	private String uname;
	
	private String addr;
	
	private String pwd;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Manger [mid=" + mid + ", name=" + name + ", uname=" + uname + ", addr=" + addr + ", pwd=" + pwd + "]";
	}
	
	
	
	
	/*manger{
		mid int primarykey,
		addr varchar2(100),   --位置
		name varchar2(200) ,   --真实名
		uname varchar2(200) ,  --用户名  
		pwd   varchar2(20) ,   --密码
		
	}*/

}
