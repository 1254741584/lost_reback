package com.yc.dao;

import java.util.List;
import java.util.Map;

import com.yc.bean.Lost;

public interface LostMapper {
	
	public List<Lost> findAll(Map<String ,Object> map);
	
	public void addLost(Lost lost);
	
	public Lost findLostById(int id);
	
	public List<Lost> findLostByType(int id);
}
