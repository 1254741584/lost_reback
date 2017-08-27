package com.yc.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.dao.LostMapper;

@RestController// 标记为：restful
@RequestMapping("/lost")  
public class LostController {
	
	@Autowired
	private LostMapper lostmapper;
	
	 public void setLostmapper(LostMapper lostmapper) {
		this.lostmapper = lostmapper;
	}



	@RequestMapping("/findall")
	    public String hello(){
			
	       return this.lostmapper.findAll().toString();
	    }
}
