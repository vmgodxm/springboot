package com.example.demo.repository;

import com.example.demo.model.DeleteFileInfo;
import com.example.demo.model.FileStorage;
import com.example.demo.repository.interfaces.IFileRepository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FileRepository implements IFileRepository {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public FileStorage getFile(Long fileNo) throws Exception {
		return sqlSession.selectOne("mapper.FileStorageMapper.getFile", fileNo);
	}
	
	@Override
	public Long getFileNo(String storageFileName) throws Exception {
		return sqlSession.selectOne("mapper.FileStorageMapper.getFileNo", storageFileName);
	}
	
	@Override
    public int insertFile(FileStorage files) throws Exception {
        return sqlSession.insert("mapper.FileStorageMapper.insertFile", files);
    }
	
	@Override
	public int updateFile(FileStorage file) throws Exception {
	   return sqlSession.insert("mapper.FileStorageMapper.updateFile", file);
    }
	
	@Override
	public int deleteFile(Long fileNo) throws Exception{
		return sqlSession.delete("mapper.FileStorageMapper.deleteFile", fileNo);
	}
	
	@Override
	public int deleteFileByUserID(String userId) throws Exception{
		return sqlSession.delete("mapper.FileStorageMapper.deleteFileByUserID", userId);
	}

	@Override
	public List<DeleteFileInfo> getDeleteFileListByUserId(String userId) throws Exception {
		return sqlSession.selectList("mapper.FileStorageMapper.getDeleteFileListByUserId", userId);
	}
	
	@Override
	public List<DeleteFileInfo> getDeleteFileListByFileNo(Long fileNo ) throws Exception {
		return sqlSession.selectList("mapper.FileStorageMapper.getDeleteFileListByFileNo", fileNo);
	}
}
