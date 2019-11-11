package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.PreCompany;

public interface IPreCompanyRepository {

	PreCompany getPreUserId(String userId) throws Exception;

	List<PreCompany> preCompanyList() throws Exception;

	int insertPreCompany(PreCompany preCompany) throws Exception;

	int updatePreCompany(PreCompany preCompany) throws Exception;

	int deletePreCompany(String userId) throws Exception;

	
}