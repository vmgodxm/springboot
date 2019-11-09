package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.Company;
import com.example.demo.model.PreCompany;
import com.example.demo.model.UserRegist;

public interface ICompanyRepository {

	Company getBusinessNumber(String businessNumber) throws Exception;

	List<Company> companyList() throws Exception;

	int insertCompany(Company company) throws Exception;

	int updateCompany(Company company,String userId,PreCompany preCompany,String businessNumber,UserRegist userRegist) throws Exception;

	int deleteCompany(String businessNumber) throws Exception;

}