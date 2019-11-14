package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DeleteFileInfo;
import com.example.demo.model.FileStorage;
import com.example.demo.repository.interfaces.IFileRepository;
import com.example.demo.service.FileUploadDownloadService;

@RestController
public class FileController {

	@Autowired
	private IFileRepository repository;
	
	@Autowired
    private FileUploadDownloadService service;
	
	@GetMapping(path = "/filetest")
	public FileStorage getFileInfo(@RequestParam(required=true, defaultValue="1")Long fileNo ) throws Exception {
		FileStorage file = repository.getFile(fileNo);
		return file;
	}
	
	@PostMapping(path = "/fileUpload")
	public int insertFile(FileStorage files) throws Exception {
	        return repository.insertFile(files);
	}
	
	@DeleteMapping(path="/fileDelete/{fileNo}")
	public int deleteFile(@PathVariable Long fileNo) throws Exception{
		return repository.deleteFile(fileNo);
	}
	
	@PutMapping(path="/fileUpdate/{fileNo}")
	public int updateFile(@PathVariable Long fileNo, FileStorage file) throws Exception {
        return repository.updateFile(file);
    }
	 	
	@DeleteMapping(path = "/fileDeleteStorage/{userId}" )
    public boolean getDeleteFileListByUserId(@PathVariable String userId) throws Exception {
		List<DeleteFileInfo> deleteFilelist = repository.getDeleteFileListByUserId(userId);
		boolean result = service.deleteFile(deleteFilelist);
		
		return result;
	}
	@DeleteMapping(path = "/fileDeleteStorage/{fileNo}" )
    public boolean getDeleteFileListByFileNo(@PathVariable Long fileNo) throws Exception {
		List<DeleteFileInfo> deleteFilelist = repository.getDeleteFileListByFileNo(fileNo);
		boolean result = service.deleteFile(deleteFilelist);
		
		return result;
	}
//	
//	@DeleteMapping("/deleteFiles")
//    public  boolean deleteFiles(List<DeleteFileInfo> deleteFilelist){
//        return service.deleteFile(deleteFilelist);
//    }
	
	
}
