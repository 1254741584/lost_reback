package com.yc.dao;

import java.util.List;

import com.yc.bean.Lost;

public interface LostMapper {
	
	public List<Lost> findAll();
	
	public void addLost(Lost lost);
	
	public List<Lost> findLostByType(int id);
}
