package com.example.demo.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.interfaces.ICompanyRepository;

@Repository
public class CompanyRepository implements ICompanyRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
			
}
