package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PreCompany;
import com.example.demo.repository.interfaces.IPreCompanyRepository;

@RestController
public class PreCompanyController {
	
	@Autowired
	private IPreCompanyRepository preCompanyRepository;
	
	@GetMapping(path="/precompany/{userId}")
	public PreCompany getPreUserId(@PathVariable String userId) throws Exception{
		return preCompanyRepository.getPreUserId(userId);
	}
	
	@GetMapping(path="/precompany")
	public List<PreCompany> preCompanyList() throws Exception{
		return preCompanyRepository.preCompanyList();
	}
	
	@PostMapping(path="/precompany")
	public int insertPreCompany(PreCompany preCompany) throws Exception{
		return preCompanyRepository.insertPreCompany(preCompany);
	}
	
	@PutMapping(path="/precompany/{preCompanyNo}")
	public int updatePreCompany(@PathVariable Long preCompanyNo, PreCompany preCompany) throws Exception{
		return preCompanyRepository.updatePreCompany(preCompany);
	}
	
	@DeleteMapping(path="/precompany/{userId}")
	public int deletePreCompany(@PathVariable String userId) throws Exception{
		return preCompanyRepository.deletePreCompany(userId);
	}
	
}
