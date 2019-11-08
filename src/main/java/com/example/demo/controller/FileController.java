package com.example.demo.controller;

import com.example.demo.model.FileStorage;
import com.example.demo.repository.interfaces.IFileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	
	@DeleteMapping(path="/fileDelete/{fileNo}")
	public int deleteFile(@PathVariable String fileNo) throws Exception{
		return repository.deleteFile(fileNo);
	}
	
	@PutMapping(path="/fileUpdate/{fileNo}")
	public int updateFile(@PathVariable String fileNo, FileStorage file) throws Exception {
        return repository.updateFile(file);
    }
	 	
	
	
	
}
