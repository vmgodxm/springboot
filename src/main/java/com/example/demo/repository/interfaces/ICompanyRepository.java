package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.Company;

public interface ICompanyRepository {

	Company getBusinessNumber(String businessNumber) throws Exception;

	List<Company> companyList() throws Exception;

	int insertCompany(Company company) throws Exception;

	int updateCompany(Company company) throws Exception;

	int deleteCompany(String businessNumber) throws Exception;

}