package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hairgram.model.HairStyleFavorite;
import com.hairgram.repository.interfaces.IHairFavoriteRepository;

@Repository
public class HairFavoriteRepository implements IHairFavoriteRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<HairStyleFavorite> getHStyleFav(String userId) throws Exception {
		return sqlSession.selectList("mapper.HStyleFavoriteMapper.getHStyleFav",userId);
	}
	
}
