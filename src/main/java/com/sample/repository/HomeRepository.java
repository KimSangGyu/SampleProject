package com.sample.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HomeRepository{

	@Autowired
	SqlSession sqlSession;
	
	public String getTime() {
		return sqlSession.selectOne("TimeMapper.getTime", null);
	}
}
