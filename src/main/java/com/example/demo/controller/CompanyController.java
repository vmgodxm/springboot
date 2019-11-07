package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Company;
import com.example.demo.repository.interfaces.ICompanyRepository;

@RestController
public class CompanyController {
	
	@Autowired
	private ICompanyRepository repository;
	
	@GetMapping(path = "/company")
	public Company getBusinessNumber(@RequestParam(required=true, defaultValue="000-00-00000")String businessNumber) throws Exception {
		Company getbusinessNumber = repository.getBusinessNumber(businessNumber);
		return getbusinessNumber;
	}
	
	@GetMapping(path="/company")
	public List<Company> companyList() throws Exception{
		return repository.companyList();
	}

}
