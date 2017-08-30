package com.yc.utils;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

public class UploadFileUtilbyimg {

	
	/*public String upload2(HttpServletRequest request,String filepath) throws IllegalStateException, IOException {  
        //创建一个通用的多部分解析器  
		String url="";
		String username=(String) request.getSession().getAttribute("username");
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());  
        //判断 request 是否有文件上传,即多部分请求  
        if(multipartResolver.isMultipart(request)){  
            //转换成多部分request    
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;  
            //取得request中的所有文件名  
            Iterator<String> iter = multiRequest.getFileNames();  
            int i=0;
            while(iter.hasNext()){  
            	i++;
                //记录上传过程起始时的时间，用来计算上传时间  
                int pre = (int) System.currentTimeMillis();  
                //取得上传文件  
                MultipartFile file = multiRequest.getFile(iter.next());
                System.out.println(iter.next());
                if(file != null){  
                    //取得当前上传文件的文件名称  
                    String myFileName = file.getOriginalFilename();  
                    //如果名称不为“”,说明该文件存在，否则说明该文件不存在  
                    if(myFileName.trim() !=""){  
                        System.out.println(myFileName);  
                        //重命名上传后的文件名  
                        String fileName = filepath +File.separator+ i+".png";  
                        //定义上传路径  
                        String path = Utils.uri + fileName;
                        System.out.println("path===>"+path);
                        File pfile=new File(Utils.uri+filepath);
                        if(!pfile.exists()){
                        	pfile.mkdirs();
                        	System.out.println(pfile.exists());
                        }
                        File localFile = new File(path);  
                        file.transferTo(localFile);
                        url+=fileName+",";
                    }  
                }  
                //记录上传该文件后的时间  
                int finaltime = (int) System.currentTimeMillis();  
                System.out.println(finaltime - pre);  
            }  
              
        }  
        return url.substring(0, url.lastIndexOf(","));  
    }  */
      

	
	public  Map<String, String> uploadFile(HttpServletRequest req, String filepath) throws Exception {
		String username=(String) req.getSession().getAttribute("username");
		Map<String, String> map = new HashMap<String, String>();
		String url="";
		CommonsMultipartResolver resolver = new CommonsMultipartResolver(req.getSession().getServletContext());
		if (resolver.isMultipart(req)) {
			MultipartHttpServletRequest request = (MultipartHttpServletRequest) req;
			Iterator<String> iterable = request.getFileNames();
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
			MultiValueMap<String, MultipartFile> multiValueMap = multipartRequest.getMultiFileMap();  
			List<MultipartFile> file = multiValueMap.get("lostimg");
			int i=0;
			if(!file.isEmpty()){  
				for(MultipartFile mf:file){
					i++;
					 if(file != null){  
		                    //取得当前上传文件的文件名称  
		                    String myFileName = mf.getOriginalFilename();  
		                    //如果名称不为“”,说明该文件存在，否则说明该文件不存在  
		                    if(myFileName.trim() !=""){  
		                        System.out.println(myFileName);  
		                        //重命名上传后的文件名  
		                        String fileName = filepath +File.separator+username+i+".png";  
		                        //定义上传路径  
		                        String path = Utils.uri + fileName;
		                        File pfile=new File(Utils.uri+filepath);
		                        if(!pfile.exists()){
		                        	pfile.mkdirs();
		                        	System.out.println(pfile.exists());
		                        }
		                        File localFile = new File(path);  
		                        mf.transferTo(localFile);
		                        url+=fileName+",";
		                    }  
		                }  
					/*byte[] mfs = mf.getBytes();
					String fileName = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
					Random random = new Random();
					for (int i = 0; i < 3; i++) {
						fileName = username+fileName + random.nextInt(10);
					}*/
					/*String oriFileName = mf.getOriginalFilename();
					String suffix="";*/
					/*try {
						suffix = oriFileName.substring(oriFileName.lastIndexOf("."));
					} catch (Exception e) {
						map.put("lostimg", "");
						return map;
					}*/
					//System.out.println(req.getContextPath());
					//String localPath ="C:/Users/hwh/Desktop/apache-tomcat-7.0.47/webapps/"+uri + fileName + suffix;
					//mf.transferTo(new File(localPath));

					/*BufferedImage bufferedImage = ImageIO.read(new FileInputStream(new File(localPath)));
					resetimage(bufferedImage, new FileOutputStream(new File(localPath)));
					str+=uri + fileName + suffix+","; */
				}
			} 


		}
		if(url.contains(",")){
			url=url.substring(0, url.lastIndexOf(","));
		}
		map.put("lostimg", url);
		return map;
	}



	public void resetimage(BufferedImage prevImage, FileOutputStream fos)throws Exception{
		double width = prevImage.getWidth();  
		double height = prevImage.getHeight();  
		double percent = 200/height;  
		int newWidth = (int)(width * percent);  
		int newHeight = 200;  
		BufferedImage image = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_BGR);  
		Graphics graphics = image.createGraphics();  
		graphics.drawImage(prevImage, 0, 0, newWidth, newHeight, null);  
		ImageIO.write(image, "jpg", fos);
		fos.flush();  
		fos.close(); 
	}


}
