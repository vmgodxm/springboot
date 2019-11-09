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
import com.example.demo.model.UserRegist;
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
	
<<<<<<< HEAD
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
=======
	
		// -> 웹에서 입력한 데이터는 currentCompany(클래스 변수)에 넣고 -- Controller 에서 받는 정보
		// -> DB에서 Company 정보를 preCompany(클래스 변수)에 담는다. -- DB에서 가져오는 정보
		//   -> preCompancy 테이블에 넣는다.

		// -> currentCompany 정보를 Company 테이블에 넣는다
		//  ( 현재 있는 정보를 지우고)
	public void getCompany(UserRegist user, Company com){
		Company preCompany = null; // repository.getBusinessNumber(user.getBusinessNUmber());

		CompanyUser comUser = new CompanyUser(user, com, preCom);
	}

	/*
	 * @GetMapping(path="/company") public List<Company> companyList() throws
	 * Exception{ return repository.companyList(); }
	 */
>>>>>>> branch 'master' of https://github.com/vmgodxm/springboot

}
