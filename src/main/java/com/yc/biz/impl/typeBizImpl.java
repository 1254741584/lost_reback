package com.yc.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.bean.Type;
import com.yc.biz.TypeBiz;
import com.yc.dao.TypeMapper;

@Service("typeBiz")
public class typeBizImpl implements TypeBiz{

	@Autowired
	private TypeMapper typeMapper;
	
	
	
	public void setTypeMapper(TypeMapper typeMapper) {
		this.typeMapper = typeMapper;
	}



	@Override
	public List<Type> findAllType() {
		return this.typeMapper.findAllType();
	}

}
