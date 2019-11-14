package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.DeleteFileInfo;
import com.example.demo.model.FileStorage;

public interface IFileRepository {
	
	FileStorage getFile(Long fileNo) throws Exception;

	int insertFile(FileStorage files) throws Exception;

	int updateFile(FileStorage file) throws Exception;

	int deleteFile(Long fileNo) throws Exception;

	List<DeleteFileInfo> getDeleteFileListByUserId(String userId) throws Exception;

	List<DeleteFileInfo> getDeleteFileListByFileNo(Long fileNo) throws Exception;

	Long getFileNo(String storageFileName) throws Exception;

	int deleteFileByUserID(String userId) throws Exception;

	
	
}