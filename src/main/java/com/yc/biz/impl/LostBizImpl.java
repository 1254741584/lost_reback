package com.yc.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.bean.Lost;
import com.yc.biz.LostBiz;
import com.yc.dao.LostMapper;

@Service("lostBiz")
public class LostBizImpl implements LostBiz{
	
	@Autowired
	private LostMapper lostmapper;
	
	 public void setLostmapper(LostMapper lostmapper) {
		this.lostmapper = lostmapper;
	}

	@Override
	public List<Lost> findLost(Lost lost) {
		
		
		return null;
	}

	@Override
	public int addLost(Lost lost) {
		this.lostmapper.addLost(lost);
		return 1;
	}

	@Override
	public int getLost(Lost lost) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Lost> findLostByType(int type) {
		
		return this.lostmapper.findLostByType(type);
	}

	@Override
	public List<Lost> findLostByUser(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

}
