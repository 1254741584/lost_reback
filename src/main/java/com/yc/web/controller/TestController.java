package com.yc.web.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller// 标记为：restful
@RequestMapping("/Test") 
public class TestController {

	@RequestMapping("/hi")  
    public String hi(Map<String, Object> model) {  
        model.put("time", "2017-8-27");  
        model.put("message", "这是测试的内容。。。");  
        model.put("toUserName", "张三");  
        model.put("fromUserName", "老许");  
        return "welcome"; //自动寻找resources/templates中名字为welcome.vm的文件作为模板，拼装后返回  
    }  
	
}
