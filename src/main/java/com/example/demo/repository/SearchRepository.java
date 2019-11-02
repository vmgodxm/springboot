package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserRegist;
import com.example.demo.repository.interfaces.ISearchRepository;

@Repository
public class SearchRepository implements ISearchRepository {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<UserRegist> getDisigner (String userName) {
		List<UserRegist> getDisignerList = sqlSession.selectList("mapper.UserRegistMapper.getDisigner",userName);
		return getDisignerList;
	}
}
