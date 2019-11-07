package com.example.demo.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.MultipartConfigElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.RandomStringUtils;

import com.example.demo.model.FileStorage;
import com.example.demo.model.UserRegist;
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
	
	 @PostMapping(path = "/fileUpload")
	    public int insertFile(FileStorage file) throws Exception {
	        return repository.insertFile(file);
	    }
	 
	 	
	
	
	
}
