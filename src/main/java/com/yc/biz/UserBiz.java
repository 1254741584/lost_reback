package com.yc.biz;

import com.yc.bean.User;

public interface UserBiz {
	
	/*
	 * --hwh
	 * 创建用户
	 */
	public int addUser(User user);
	
	/*
	 * --hwh
	 * 登录时查询用户
	 */
	public User findUser(String name,String pwd);
	
	/*
	 * --hwh
	 * 查询用户
	 */
	public User findUser(int uid);
	
	/*
	 * --hwh
	 * 修改密码
	 */
	public int updateUserPwd(int uid,String pwd);
	
	
	/*
	 * --hwh
	 * 修改个性签名
	 * @param uid
	 * @param sign  //个性签名
	 * @return
	 */
	public int updateUserSign(int uid,String sign);
	
	public int updateUserQQ(int uid,String qq);
	
	public int updateUserWeixin(int uid,String weixin);
	
	public int updateUserTel(int uid,String tel);
	
	/**
	 * 修改用户信息
	 * --hwh
	 * @param user
	 * @return
	 */
	public int updateUserS(User user);
	

}
