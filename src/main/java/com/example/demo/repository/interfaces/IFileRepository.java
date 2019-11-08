package com.example.demo.repository.interfaces;

import com.example.demo.model.FileStorage;

public interface IFileRepository {

	FileStorage getFile(Long fileNo) throws Exception;

	int insertFile(FileStorage file) throws Exception;

	int updateFile(FileStorage file) throws Exception;

	int deleteFile(String fileNo) throws Exception;

	
	
}