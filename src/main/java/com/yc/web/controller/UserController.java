package com.yc.web.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.biz.UserBiz;
import com.yc.dao.LostMapper;

@RestController// 标记为：restful
@RequestMapping("/user")  
public class UserController {
	
	@Resource(name="userBiz")
	private UserBiz userBiz;

	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
	
	



}
