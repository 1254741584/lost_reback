package com.yc.bean;

import java.io.Serializable;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int uid;
	
	private String uname;
	
	private String name;
	
	private String pwd;
	
	private String weixin;
	
	private String qq;
	
	private String tel;
	
	private String sign;
	
	private String img;
	
	private String ceatetime;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getWeixin() {
		return weixin;
	}

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getCeatetime() {
		return ceatetime;
	}

	public void setCeatetime(String ceatetime) {
		this.ceatetime = ceatetime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", name=" + name + ", pwd=" + pwd + ", weixin=" + weixin
				+ ", qq=" + qq + ", tel=" + tel + ", sign=" + sign + ", img=" + img + ", ceatetime=" + ceatetime + "]";
	}

	
	
	
	
	/*user{					   --用户表
		uid int primarykey ,   --主键
		name varchar2(200) ,   --真实名
		uname varchar2(200) ,  --用户名  
		pwd   varchar2(20) ,   --密码
		weixin varchar2(200),  --绑定微信
		qq		varchar2(200), --绑定qq
		tel 	varchar2(200), --电话
		sign   varchar2(500)， --个性签名
		img		varchar2(50)， --头像
		ceatetime date,        --注册时间
	}*/

}
