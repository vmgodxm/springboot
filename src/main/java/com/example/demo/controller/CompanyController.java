package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Company;
import com.example.demo.repository.interfaces.ICompanyRepository;

@RestController
public class CompanyController {
	
	@Autowired
	private ICompanyRepository repository;
	
	@GetMapping(path = "/company/{businessNumber}")
	public Company getBusinessNumber(@PathVariable String businessNumber) throws Exception {
		Company getbusinessNumber = repository.getBusinessNumber(businessNumber);
		return getbusinessNumber;
	}
	
	@GetMapping(path="/company") 
	public List<Company> companyList() throws Exception{ 
		return repository.companyList(); 		
	}
	
	@PostMapping(path = "/company")
	public int insertCompany(Company company) throws Exception{
		return repository.insertCompany(company);
	}
	
	@DeleteMapping(path="/company/{businessNumber}")
	public int deleteCompany(@PathVariable String businessNumber) throws Exception{
		return repository.deleteCompany(businessNumber);
	}

}
