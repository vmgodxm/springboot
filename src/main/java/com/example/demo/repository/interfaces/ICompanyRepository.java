package com.example.demo.repository.interfaces;

import com.example.demo.model.Company;

public interface ICompanyRepository {

	Company getBusinessNumber(String businessNumber) throws Exception;

}