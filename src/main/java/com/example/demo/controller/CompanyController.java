package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Company;
import com.example.demo.model.UserRegist;
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
	
	
		// -> 웹에서 입력한 데이터는 currentCompany(클래스 변수)에 넣고 -- Controller 에서 받는 정보
		// -> DB에서 Company 정보를 preCompany(클래스 변수)에 담는다. -- DB에서 가져오는 정보
		//   -> preCompancy 테이블에 넣는다.

		// -> currentCompany 정보를 Company 테이블에 넣는다
		//  ( 현재 있는 정보를 지우고)
	public void getCompany(UserRegist user, Company com){
		Company preCompany = null; // repository.getBusinessNumber(user.getBusinessNUmber());

		//CompanyUser comUser = new CompanyUser(user, com, preCom);
	}

	/*
	 * @GetMapping(path="/company") public List<Company> companyList() throws
	 * Exception{ return repository.companyList(); }
	 */

}
