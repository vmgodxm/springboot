package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Company;
import com.example.demo.repository.interfaces.ICompanyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
	
	@Autowired
	private ICompanyRepository repository;
	
	@GetMapping(path = "/company/{userId}")
	public Company getUserId(@PathVariable String userId) throws Exception {
		Company getUserId = repository.getUserId(userId);
		return getUserId;
	}
	
	@GetMapping(path="/company") 
	public List<Company> companyList() throws Exception{ 
		return repository.companyList(); 		
	}
	
	@PostMapping(path = "/company")
	public int insertCompany(Company company) throws Exception{
		return repository.insertCompany(company);
	}
	
	@PutMapping(path = "/company/{userId}")
	public int updateCompany(@PathVariable String userId, Company company) throws Exception{
		return repository.updateCompany(company);
	}
	
	@DeleteMapping(path="/company/{userId}")
	public int deleteCompany(@PathVariable String userId) throws Exception{
		return repository.deleteCompany(userId);
	}
}
