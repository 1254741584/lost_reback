package com.yc.web.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.yc.bean.Lost;
import com.yc.biz.LostBiz;
import com.yc.dao.LostMapper;
import com.yc.utils.UploadFileUtilbyimg;

@Controller
@RequestMapping("/lost")  
public class LostController {

	@Resource(name="lostBiz")
	private LostBiz lostBiz;

	public void setLostBiz(LostBiz lostBiz) {
		this.lostBiz = lostBiz;
	}

	
	@RequestMapping("/addlost")
	public String addlost(){
		return "addlost";
	}
	
	@RequestMapping("/findlostdetail/{id}")
	public String findLostDetail(@PathVariable int id,Model model,HttpServletRequest request){
		Lost lost=this.lostBiz.findLostById(id);
		
		String uname=lost.getUname();
		
		String[] str=uname.split("");
		String name=str[0];
		for(int i=1,len=str.length;i<len;i++){
			name+="*";
		}
		lost.setUname(name);
		model.addAttribute("lost", lost);
		model.addAttribute("request", request.getRequestURI());
		return "lostdetail";
	}
	
	@RequestMapping("/addlost.do")
	public String addlost_do(HttpServletRequest request,Model model,Lost lost) throws Exception{
		int uid=Integer.valueOf(String.valueOf(request.getSession().getAttribute("uid")));
		lost.setUid(uid);
		UploadFileUtilbyimg upload=new UploadFileUtilbyimg(); 
		String date=request.getParameter("date");
		lost.setLostdate(date);
		Calendar c=Calendar.getInstance();
		Date d=c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
		String createdate=sdf.format(d);
		lost.setCreatedate(createdate);
		
		String url=c.get(Calendar.YEAR)+File.separator+(c.get(Calendar.MONTH) + 1)+File.separator+c.get(Calendar.DAY_OF_MONTH);
		String img=upload.uploadFile(request, url).get("lostimg");
		lost.setImg(img);
		String str="";
		try {
			this.lostBiz.addLost(lost);
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("error", "添加失败");
			return "addlost";
		}
		model.addAttribute("index", 1);
		return "index";
	}

	@RequestMapping("/findlost/{id}")
	public String findlostByTypeid(@PathVariable int id,Model model){
		List<Lost> list=this.lostBiz.findLostByType(id);
		model.addAttribute("lost", list);
		model.addAttribute("index", id);
		return "losttype";
	}


}
