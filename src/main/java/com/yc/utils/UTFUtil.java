package com.yc.utils;

import java.io.UnsupportedEncodingException;


/**
 * 解决编码集问题
 * @author Administrator
 *
 */
public class UTFUtil {
	public static String Utf8Util(String str){
		try {
			str = new String(str.trim().getBytes("ISO-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;
	}
	
	
	public static String GbkUtil(String str){
		try {
			str = new String(str.trim().getBytes("ISO-8859-1"), "GBK");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;
	}

}
