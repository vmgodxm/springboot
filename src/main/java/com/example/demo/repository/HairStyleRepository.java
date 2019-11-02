package com.example.demo.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.HairStyle;
import com.example.demo.repository.interfaces.IHairStyleRepository;

@Repository
public class HairStyleRepository implements IHairStyleRepository {
	
	@Autowired	
	private SqlSession sqlSession;
	
	@Override
	public HairStyle getHairStyle(Long styleNo) throws Exception {
		return sqlSession.selectOne("mapper.HairStyleMapper.getHairStyle",styleNo);
	}

}
