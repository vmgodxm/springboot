package com.example.demo.repository;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.demo.model.HairStyleFile;
import com.example.demo.repository.interfaces.IHairStyleFileRepository;

@Repository
public class HairStyleFileRepository implements IHairStyleFileRepository{
	
	private SqlSession sqlSession;
	
	@Override
	public List<HairStyleFile> getHairStyleFileList() throws Exception{
		return sqlSession.selectList("mapper.HairStyleMapper.getRegHairStyle");
	}
	
}
