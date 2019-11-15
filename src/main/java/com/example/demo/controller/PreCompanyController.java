package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.PreCompany;
import com.example.demo.repository.interfaces.IPreCompanyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	@GetMapping(path = "/preCompany/{userId}")
	public PreCompany getPreUserId(@PathVariable String userId) throws Exception {
		return repository.getPreUserId(userId);
	}

	@GetMapping(path = "/preCompanyList/{userId}")
	public List<PreCompany> preCompanyList(@PathVariable String userId) throws Exception {
		return repository.preCompanyList(userId);
	}

	@PostMapping(path = "/preCompany")
	public ResponseEntity<Integer> insertPreCompany(HttpEntity<PreCompany> httpEntity) throws Exception {
		ResponseEntity<Integer> retVal = null;

		PreCompany preCompany = httpEntity.getBody();
		try {
			if (preCompany != null) {
				int preCompanyNo = repository.insertPreCompany(preCompany);
				retVal = new ResponseEntity<>(preCompanyNo, HttpStatus.OK);
			}
			
		} catch (Exception e) {
			retVal = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		return retVal;
	}

	@PostMapping(path = "/preCompanyList")
	public HttpStatus insertPreCompanyList(HttpEntity<List<PreCompany>> httpEntity) throws Exception{
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

	@PutMapping(path = "/preCompany/{preCompanyNo}")
	public int updatePreCompany(@PathVariable int preCompanyNo, PreCompany preCompany) throws Exception {
		return repository.updatePreCompany(preCompany);
	}

	@DeleteMapping(path = "/preCompany/{preCompanyNo}")
	public int deletePreCompany(@PathVariable int preCompanyNo) throws Exception {
		return repository.deletePreCompany(preCompanyNo);
	}
}