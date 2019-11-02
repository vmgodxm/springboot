package com.example.demo.repository.interfaces;

import com.hairgram.model.FileStorage;

public interface IFileRepository {

	FileStorage getFile(Long fileNo) throws Exception;

	
	
}