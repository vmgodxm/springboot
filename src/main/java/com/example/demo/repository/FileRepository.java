package com.example.demo.repository;

import com.example.demo.model.Admin;
import com.example.demo.model.FileStorage;
import com.example.demo.repository.interfaces.IFileRepository;

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
    public int insertFile(FileStorage file) throws Exception {
        return sqlSession.insert("mapper.FileStorageMapper.insertFile", file);
    }
	
	@Override
	public int updateFile(FileStorage file) throws Exception {
	   return sqlSession.insert("mapper.FileStorageMapper.updateFile", file);
    }
	
	@Override
	public int deleteFile(String fileNo) throws Exception{
		return sqlSession.delete("mapper.FileStorageMapper.deleteFile", fileNo);
	}
	
	
}
