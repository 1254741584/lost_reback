package com.yc.bean;

import java.io.Serializable;

public class Collect implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int cid;
	
	private String name;
	
	private String lostdate; 
	
	private String lostinfo; 
	
	private String img; 
	
	private int type;
	
	private int status;
	
	private int uid;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLostdate() {
		return lostdate;
	}

	public void setLostdate(String lostdate) {
		this.lostdate = lostdate;
	}

	public String getLostinfo() {
		return lostinfo;
	}

	public void setLostinfo(String lostinfo) {
		this.lostinfo = lostinfo;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "Collect [cid=" + cid + ", name=" + name + ", lostdate=" + lostdate + ", lostinfo=" + lostinfo + ", img="
				+ img + ", type=" + type + ", status=" + status + ", uid=" + uid + "]";
	}
	
	
	
	
	/*collect{								--捡取表
		cid			int primarykey ,   		--主键
		name		varchar2(50),           --捡取物品名称 
		lostdate 	data,					--捡取时间
		lostinfo    text,					--捡取物品信息
		img 		varchar2(100),			--遗失物品图片
		type 		int,					--捡取物品类型
		status		int,					--状态
		uid			int,					--用户id
	}*/

}
