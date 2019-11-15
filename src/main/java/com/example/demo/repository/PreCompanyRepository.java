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
	public PreCompany getPreUserId (final String userId) throws Exception {
		return sqlSession.selectOne("mapper.PreCompanyMapper.getPreUserId", userId);
	}

	@Override
	public List<PreCompany> preCompanyList(final String userId) throws Exception {
		return sqlSession.selectList("mapper.PreCompanyMapper.getPreCompanyList", userId);
	}

	@Override
	public int insertPreCompany(final PreCompany preCompany) throws Exception {
		final int result = sqlSession.insert("mapper.PreCompanyMapper.insertPreCompany", preCompany);
		return result > 0 ? preCompany.getPreCompanyNo() : result;
	}

	@Override
	public int updatePreCompany(final PreCompany preCompany) throws Exception {
		return sqlSession.update("mapper.PreCompanyMapper.updatePreCompany", preCompany);
	}

	@Override
	public int deletePreCompany(final String userId) throws Exception {
		return sqlSession.delete("mapper.PreCompanyMapper.deletePreCompanyAsUserId", userId);
	}

	@Override
	public int deletePreCompany(final int preCompanyNo) throws Exception {
		return sqlSession.delete("mapper.PreCompanyMapper.deletePreCompanyAsPreCompanyNo", preCompanyNo);
	}

	
}
