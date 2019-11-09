package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Company;
import com.example.demo.model.PreCompany;
import com.example.demo.model.UserRegist;
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
	public List<Company> companyList() throws Exception {
		return sqlSession.selectList("mapper.CompanyMapper.companyList");
	}

	@Override
	public int insertCompany(Company company) throws Exception {
		return sqlSession.insert("mapper.CompanyMapper.insertCompany", company);
	}
	
	//사용자 사업자번호 변경시 company,precompany 사업자번호 변경
	@Override
	public int updateCompany(Company company,String userId,PreCompany preCompany,String businessNumber,UserRegist userRegist) throws Exception {
		//사용자(userRegist)의 사업자 번호 null로 변경
		sqlSession.update("mapper.CompanyMapper.updateRegist",userId);
		//Company에 있는 내용을 PreCompany로 삽입
		sqlSession.insert("mapper.CompanyMapper.insertPreCompany",preCompany);
		//Company 번호 삭제
		sqlSession.delete("mapper.CompanyMapper.deleteCompany", businessNumber);
		//변경된 사업자 번호를 company에 삽입
		sqlSession.insert("mapper.CompanyMapper.changeCompany", company);
		//변경된 사업자 번호를 사용자 테이블에 수정
		return sqlSession.update("mapper.CompanyMapper.updateRegCompany", userRegist);
	}

	@Override
	public int deleteCompany(String businessNumber) throws Exception {
		return sqlSession.delete("mapper.CompanyMapper.deleteCompany", businessNumber);
	}
}
