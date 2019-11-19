package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.HairStyleFile;
import com.example.demo.repository.interfaces.IHairStyleFileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HairStyleFileController {

	@Autowired
	private IHairStyleFileRepository repository;
	

	@GetMapping(path ="/hairStyleFile")
	public List<HairStyleFile> HairStyleList() throws Exception {
		return repository.getHairStyleFileList();
	}
	
	
}
