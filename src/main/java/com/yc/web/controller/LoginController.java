package com.yc.web.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.bean.Type;
import com.yc.bean.User;
import com.yc.biz.TypeBiz;
import com.yc.biz.UserBiz;

@Controller
@RequestMapping("/lost") 
public class LoginController {
	
	@Resource(name="userBiz")
	private UserBiz userBiz;
	
	@Resource(name="typeBiz")
	private TypeBiz typeBiz;
	
	
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}

	public void setTypeBiz(TypeBiz typeBiz) {
		this.typeBiz = typeBiz;
	}


	@RequestMapping("/index")  
    public String index(Map<String, Object> model,HttpServletRequest req) { 
		
		String username=(String) req.getSession().getAttribute("username");
		/*if(username==null){
			username="";
		}*/
		List<Type> types=this.typeBiz.findAllType();
        model.put("UserName", username);  
        model.put("index", 1); 
        req.getSession().setAttribute("type", types);
        return "index"; 
    }  
	
	
	@RequestMapping("/login")  
    public String login(Map<String, Object> model,HttpServletRequest req) {
		model.put("info", "");
        return "login"; 
    }  
	
	@RequestMapping("/dologin")  
    public String dologin(Map<String, Object> model,HttpServletRequest req) {
		String name=req.getParameter("name");
		String pwd=req.getParameter("pwd");
		//System.out.println("name==>"+name+"\t"+pwd);
		User user=this.userBiz.findUser(name, pwd);
		if(user!=null){
			req.getSession().setAttribute("username", name);
			req.getSession().setAttribute("uid", user.getUid());
			model.put("UserName", "欢迎您:"+name);
			model.put("index", 1); 
			return "index"; 
		}
		model.put("info", "账号或密码错误");
        return "login"; //自动寻找resources/templates中名字为welcome.vm的文件作为模板，拼装后返回  
    } 
	

}
