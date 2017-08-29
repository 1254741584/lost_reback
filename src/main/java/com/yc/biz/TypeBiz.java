package com.yc.biz;

import java.util.List;

import com.yc.bean.Type;

public interface TypeBiz {

	/**
	 * 查看所有的类型
	 * @return  所有的类型
	 */
	public List<Type> findAllType();
}
