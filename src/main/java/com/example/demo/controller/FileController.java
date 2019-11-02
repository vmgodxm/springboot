package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FileStorage;
import com.example.demo.repository.interfaces.IFileRepository;

@RestController
public class FileController {

	@Autowired
	private IFileRepository repository;
	
	@GetMapping(path = "/filetest")
	public FileStorage getFileInfo(@RequestParam(required=true, defaultValue="1")Long fileNo ) throws Exception {
		FileStorage file = repository.getFile(fileNo);
		return file;
	}
	
	
	
}
