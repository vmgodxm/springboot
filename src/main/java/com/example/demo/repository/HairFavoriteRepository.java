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
	public List<HairStyleFavorite> getHStyleFavList() throws Exception {
		return sqlSession.selectList("mapper.HStyleFavoriteMapper.getHStyleFavList");
	}
	
	@Override
	public Long getHStyleFav(Long hfavoriteNo) throws Exception {
		return sqlSession.selectOne("mapper.HStyleFavoriteMapper.getHStyleFav", hfavoriteNo);
	}
	
	@Override
	public int insertHStyleFav(HairStyleFavorite hairStyleFav) throws Exception {
		return sqlSession.insert("mapper.HStyleFavoriteMapper.insertHStyleFav",hairStyleFav);
	}
	
	@Override
	public int updateHStyleFav(Long hfavoriteNo) throws Exception {
		return sqlSession.update("mapper.HStyleFavoriteMapper.updateHStyleFav", hfavoriteNo);
	}
	
	@Override
	public int deleteHStyleFav(Long hfavoriteNo) throws Exception {
		return sqlSession.delete("mapper.HStyleFavoriteMapper.deleteHStyleFav",hfavoriteNo);
	}
	
}
