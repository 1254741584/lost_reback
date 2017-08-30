package com.yc.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.bean.User;
import com.yc.biz.UserBiz;
import com.yc.dao.UserMapper;


@Service("userBiz")
public class userBizImpl implements UserBiz{

	@Autowired
	private UserMapper userMapper;
	
	
	
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User findUser(String name, String pwd) {
		User user=new User();
		user.setUname(name);
		user.setPwd(pwd);
		return this.userMapper.login(user);
	}

	@Override
	public User findUser(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateUserPwd(int uid, String pwd) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUserSign(int uid, String sign) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUserQQ(int uid, String qq) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUserWeixin(int uid, String weixin) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUserTel(int uid, String tel) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUserS(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
