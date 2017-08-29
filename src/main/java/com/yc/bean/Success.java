package com.yc.bean;

import java.io.Serializable;

public class Success implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int sid;
	
	private int lid;
	
	private int cid;
	
	private String sdata;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getSdata() {
		return sdata;
	}

	public void setSdata(String sdata) {
		this.sdata = sdata;
	}

	@Override
	public String toString() {
		return "Success [sid=" + sid + ", lid=" + lid + ", cid=" + cid + ", sdata=" + sdata + "]";
	}
	
	
	/*success{								--成功记录表
		sid			int primarykey ,   		--主键
		lid			int,					--遗失物品id
		cid			int,					--捡取物品id
		sdata		data,					--成功时间时间
	}*/

}
