package com.yc.bean;

public class Lost {
	
	private int lid;  //id
	
	private String name;  //名字
	
	private String lostdate;  //遗失时间
	
	private String lostinfo;  //失物信息
	
	private String img;  //失物图片地址
	
	private int type;   //失物类型id
	
	private String typename;  //失物类型名称
	
	private String createdata;  //创建时间
	
	private int status;  //状态
	
	private int uid;  //用户id

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
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

	public String getCreatedata() {
		return createdata;
	}

	public void setCreatedata(String createdata) {
		this.createdata = createdata;
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

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	@Override
	public String toString() {
		return "Lost [lid=" + lid + ", name=" + name + ", lostdate=" + lostdate + ", lostinfo=" + lostinfo + ", img="
				+ img + ", type=" + type + ", typename=" + typename + ", createdata=" + createdata + ", status="
				+ status + ", uid=" + uid + "]";
	}

	
	
	
	
	/*lost{									--失物表
		lid 		int primarykey ,   		--主键
		name		varchar2(50),           --遗失物品名称 
		lostdate 	varchar2(100),			--遗失时间
		lostinfo    text,					--遗失物品信息
		img 		varchar2(100),			--遗失物品图片
		type 		int,					--遗失物品类型
		createdata	data,					--提交时间
		status		int,					--状态
		uid			int,					--用户id
	}*/

}
