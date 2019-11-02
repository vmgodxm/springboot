package com.example.demo.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hairgram.model.FileStorage;
import com.hairgram.repository.interfaces.IFileRepository;

@Repository
public class FileRepository implements IFileRepository {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public FileStorage getFile(Long fileNo) throws Exception {
		return sqlSession.selectOne("mapper.FileStorageMapper.getFile", fileNo);
	}
	
	
}
