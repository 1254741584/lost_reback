package com.yc.biz;

import java.util.List;

import com.yc.bean.Lost;

public interface LostBiz {
	
	/*
	 * --hwh
	 * 查找失物
	 */
	public List<Lost> findLost(Lost lost);
	
	/*
	 * --hwh
	 * 按类型查看失物
	 * @param type   类型
	 * @return
	 */
	public List<Lost> findLostByType(int type);
	
	
	/*
	 *--hwh
	 *	按用户查看失物 
	 * @param uid  用户id
	 * @return
	 */
	public List<Lost> findLostByUser(int uid);
	
	/*
	 * --hwh
	 * 添加失物
	 */
	public int addLost(Lost lost);
	
	/*
	 * --hwh
	 * 找回失物
	 */
	public int getLost(Lost lost);
}	
