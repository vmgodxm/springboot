package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PreCompany;
import com.example.demo.repository.interfaces.IPreCompanyRepository;

@Repository
public class PreCompanyRepository implements IPreCompanyRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public PreCompany getPreUserId (String userId) throws Exception{
		return sqlSession.selectOne("mapper.PreCompanyMapper.getPreUserId", userId);
	}
	
	@Override
	public List<PreCompany> preCompanyList() throws Exception{
		return sqlSession.selectList("mapper.PreCompanyMapper.PreCompanyList");
	}
	
	@Override
	public int insertPreCompany(PreCompany preCompany) throws Exception{
		return sqlSession.insert("mapper.PreCompanyMapper.insertPreCompany", preCompany);
	}
	
	@Override
	public int updatePreCompany(PreCompany preCompany) throws Exception {
		return sqlSession.update("mapper.PreCompanyMapper.updatePreCompany", preCompany);
	}
	
	@Override
	public int deletePreCompany(String userId) throws Exception{
		return sqlSession.delete("mapper.PreCompanyMapper.deletePreCompany", userId);
	}
}
