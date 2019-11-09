package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.HairStyle;
import com.example.demo.repository.interfaces.IHairStyleRepository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HairStyleRepository implements IHairStyleRepository {

	@Autowired
	private SqlSession sqlSession;

	/*
	 * @Override public List<HairStyle> getHairStyleList() throws Exception{ return
	 * sqlSession.selectList("mapper.HairStyleMapper.getHairStyleList"); }
	 */

	@Override
	public List<HairStyle> getHairStyleList() throws Exception {
		return sqlSession.selectList("mapper.HairStyleMapper.getHairStyleList");
	}

	@Override
	public HairStyle getHairStyle(Long styleNo) throws Exception {
		return sqlSession.selectOne("mapper.HairStyleMapper.getHairStyle", styleNo);
	}

	@Override
	public int insertHairStyle(com.example.demo.model.HairStyle hairStyle) throws Exception {
		return sqlSession.insert("mapper.HairStyleMapper.insertHairStyle");
	}

	@Override
	public int updateHairStyle(Long styleNo) throws Exception {
		return sqlSession.update("mapper.HairStyleMapper.updateHairStyle");
	}

	@Override
	public int deleteHairStyle(Long styleNo) throws Exception {
		return sqlSession.delete("mapper.HairStyleMapper.deleteHairStyle");
	}

	

}
