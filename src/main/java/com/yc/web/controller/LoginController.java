package com.yc.web.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.bean.User;
import com.yc.biz.UserBiz;

@Controller
@RequestMapping("/Test") 
public class LoginController {
	
	@Resource(name="userBiz")
	private UserBiz userBiz;
	
	@RequestMapping("/index")  
    public String index(Map<String, Object> model,HttpServletRequest req) { 
		
		String username=(String) req.getSession().getAttribute("username");
		/*if(username==null){
			username="";
		}*/
        model.put("UserName", username);  
        return "index"; 
    }  
	
	
	@RequestMapping("/login")  
    public String login(Map<String, Object> model,HttpServletRequest req) {
		model.put("info", "账号或密码错误");
        return "login"; 
    }  
	
	@RequestMapping("/dologin")  
    public String dologin(Map<String, Object> model,HttpServletRequest req) {
		String name=req.getParameter("name");
		String pwd=req.getParameter("pwd");
		User user=this.userBiz.findUser(name, pwd);
		if(user!=null){
			req.getSession().setAttribute("username", name);
			model.put("UserName", name);
			return "index"; 
		}
		model.put("info", "账号或密码错误");
        return "login"; //自动寻找resources/templates中名字为welcome.vm的文件作为模板，拼装后返回  
    } 
	

}
