package com.example.demo.repository.interfaces;

import com.example.demo.model.FileStorage;

public interface IFileRepository {

	FileStorage getFile(Long fileNo) throws Exception;

	
	
}