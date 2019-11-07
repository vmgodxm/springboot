package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Company;
import com.example.demo.repository.interfaces.ICompanyRepository;

@Repository
public class CompanyRepository implements ICompanyRepository {

	@Autowired
	private SqlSession sqlSession;


	@Override
	 public Company getBusinessNumber(String businessNumber) throws Exception { 
		 return sqlSession.selectOne("mapper.CompanyMapper.getBusinessNumber", businessNumber); 
	 }
	 
	@Override
	 public List<Company> companyList() throws Exception{
		 return sqlSession.selectList("mapper.CompanyMapper.companyList");
	 }
	
	@Override
	 public int insertCompany(Company company) throws Exception{
		return sqlSession.insert("mapper.CompanyMapper.insertCompany",company);
	 }
		
	@Override
	 public int updateCompany(Company company) throws Exception{
		return sqlSession.update("mapper.CompanyMapper.updateCompany", company);
	}
	
	@Override
	public int deleteCompany(String businessNumber) throws Exception{
		return sqlSession.delete("mapper.CompanyMapper.deleteCompany", businessNumber);
	}
}
