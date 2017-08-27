package com.yc.biz.impl;

import org.springframework.stereotype.Service;

import com.yc.bean.User;
import com.yc.biz.UserBiz;


@Service("userBiz")
public class userBizImpl implements UserBiz{

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User findUser(String name, String pwd) {
		// TODO Auto-generated method stub
		return null;
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
