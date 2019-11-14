package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.PreCompany;
import com.example.demo.repository.interfaces.IPreCompanyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PreCompanyController {

	@Autowired
	private IPreCompanyRepository repository;

	@GetMapping(path = "/precompany/{userId}")
	public PreCompany getPreUserId(@PathVariable String userId) throws Exception {
		return repository.getPreUserId(userId);
	}

	@GetMapping(path = "/preCompanyList/{userId}")
	public List<PreCompany> preCompanyList(@PathVariable String userId) throws Exception {
		return repository.preCompanyList(userId);
	}

	@PostMapping(path = "/precompany")
	public int insertPreCompany(PreCompany preCompany) throws Exception {
		return repository.insertPreCompany(preCompany);
	}

	@PostMapping(path = "/preCompanyList")
	public HttpStatus insertPreCompany(HttpEntity<List<PreCompany>> httpEntity) throws Exception{
		HttpStatus retVal = HttpStatus.BAD_REQUEST;

		List<PreCompany> list = httpEntity.getBody();
		try {
			if (list != null) {
				for (PreCompany preCompany : list) {
					repository.insertPreCompany(preCompany);
				}

				retVal = HttpStatus.OK;
			}
		} catch (Exception e) {
			retVal = HttpStatus.BAD_REQUEST;
		}

		return retVal;
	}

	@PutMapping(path = "/precompany/{preCompanyNo}")
	public int updatePreCompany(@PathVariable Long preCompanyNo, PreCompany preCompany) throws Exception {
		return repository.updatePreCompany(preCompany);
	}

	@DeleteMapping(path = "/precompany/{userId}")
	public int deletePreCompany(@PathVariable String userId) throws Exception {
		return repository.deletePreCompany(userId);
	}

}
