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

		// -> 웹에서 입력한 데이터는 currentCompany(클래스 변수)에 넣고 -- Controller 에서 받는 정보
		// -> DB에서 Company 정보를 preCompany(클래스 변수)에 담는다. -- DB에서 가져오는 정보
		//   -> preCompancy 테이블에 넣는다.

		// -> currentCompany 정보를 Company 테이블에 넣는다
		//  ( 현재 있는 정보를 지우고)
	/*
	public void getCompany(UserRegist user, Company com) throws Exception{
		//Company currentCompany = new Company(user.getBusinessNumber(),com.getCompanyName());
		Company company =repository.getBusinessNumber(user.getBusinessNumber());
		PreCompany preCom = new PreCompany(company.getCompanyName(), user.getUserId());
		//CompanyUser comUser = new CompanyUser(user, com, preCom);
	}
	*/
	

}
