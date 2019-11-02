package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.DesignerFavorite;
import com.example.demo.repository.interfaces.IDesignerFavoriteRepository;


@Repository
public class DesignerFavoriteRepository implements  IDesignerFavoriteRepository {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<DesignerFavorite> getDesignerList(String userId) throws Exception {
		return sqlSession.selectList("mapper.DesignerFavoriteMapper.getDesignerList", userId);
	}
	
}
