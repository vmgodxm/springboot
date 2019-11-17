package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.DeleteFileInfo;
import com.example.demo.model.FileStorage;
import com.example.demo.repository.interfaces.IFileRepository;
import com.example.demo.service.FileUploadDownloadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

	@Autowired
	private IFileRepository repository;
	
	@Autowired
    private FileUploadDownloadService service;
	
	@GetMapping(path = "/file/{fileNo}")
	public FileStorage getFileInfo(@PathVariable int fileNo ) throws Exception {
		FileStorage file = repository.getFile(new Long(fileNo));
		return file;
	}
	
	// @GetMapping(path = "/file/{fileName}")
	// public Long getFileInfo(@PathVariable String storageFileName ) throws Exception {
	// 	return repository.getFileNo(storageFileName);
	// }
	
	@PostMapping(path = "/fileUpload")
	public int insertFile(FileStorage files) throws Exception {
	        return repository.insertFile(files);
	}
	
	@DeleteMapping(path="/fileDelete/{fileNo}")
	public int deleteFile(@PathVariable Long fileNo) throws Exception{
		return repository.deleteFile(fileNo);
	}
	
	@DeleteMapping(path="/fileDeleteByUserId/{userId}")
	public int deleteFile(@PathVariable String userId) throws Exception{
		return repository.deleteFileByUserID(userId);
	}
	
	@PutMapping(path="/fileUpdate/{fileNo}")
	public int updateFile(@PathVariable Long fileNo, FileStorage file) throws Exception {
        return repository.updateFile(file);
    }
	 	
	@DeleteMapping(path = "/fileDeleteStorageByuserId/{userId}" )
    public boolean getDeleteFileListByUserId(@PathVariable String userId) throws Exception {
		List<DeleteFileInfo> deleteFilelist = repository.getDeleteFileListByUserId(userId);
		boolean result = service.deleteFile(deleteFilelist);
		
		return result;
	}
	@DeleteMapping(path = "/fileDeleteStorageByfileNo/{fileNo}" )
    public boolean getDeleteFileListByFileNo(@PathVariable Long fileNo) throws Exception {
		List<DeleteFileInfo> deleteFilelist = repository.getDeleteFileListByFileNo(fileNo);
		boolean result = service.deleteFile(deleteFilelist);
		
		return result;
	}

	
	
}
