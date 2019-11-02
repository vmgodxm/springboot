package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserRegist;
import com.example.demo.repository.interfaces.ISearchRepository;

@RestController
public class SearchController {

	@Autowired
	private ISearchRepository repository;
	
	@GetMapping(path = "/searchDesigner")
	public List<UserRegist> getDesigner(@RequestParam(required = true , defaultValue = "desigName1") String userName){
		List<UserRegist> getDesignerList = repository.getDisigner(userName);
		return getDesignerList;
	}
	
}
