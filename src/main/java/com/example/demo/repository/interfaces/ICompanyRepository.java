package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.Company;

public interface ICompanyRepository {

	Company getUserId(String userId) throws Exception;

	List<Company> companyList() throws Exception;

	int insertCompany(Company company) throws Exception;

	int updateCompany(Company company) throws Exception;

	int deleteCompany(String userId) throws Exception;


	//int updateCompany(Company company,String userId,PreCompany preCompany,String businessNumber,UserRegist userRegist) throws Exception;
}