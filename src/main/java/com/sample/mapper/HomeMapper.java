package com.sample.mapper;

import org.apache.ibatis.annotations.Select;

public interface HomeMapper {

	@Select("SELECT sysdate FROM dual")
	public String getTime();
	
	public String getTime2();
}
