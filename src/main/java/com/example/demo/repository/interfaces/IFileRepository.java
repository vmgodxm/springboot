package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.DeleteFileInfo;
import com.example.demo.model.FileStorage;

public interface IFileRepository {
	
	List<DeleteFileInfo> getDeleteFileInfoList(String userId) throws Exception;

	FileStorage getFile(Long fileNo) throws Exception;

	int insertFile(FileStorage file) throws Exception;

	int updateFile(FileStorage file) throws Exception;

	int deleteFile(String fileNo) throws Exception;

	
	
}