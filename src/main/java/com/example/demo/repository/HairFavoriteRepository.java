package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.HairStyleFavorite;
import com.example.demo.repository.interfaces.IHairFavoriteRepository;

@Repository
public class HairFavoriteRepository implements IHairFavoriteRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<HairStyleFavorite> getHStyleFav(String userId) throws Exception {
		return sqlSession.selectList("mapper.HStyleFavoriteMapper.getHStyleFav",userId);
	}
	
}
