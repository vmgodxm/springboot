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
	public List<DesignerFavorite> getDesignerList() throws Exception {
		return sqlSession.selectList("mapper.DesignerFavoriteMapper.getDesignerList");
	}
	@Override
	public Long getDesigner(Long dfavoriteNo) throws Exception {
		return sqlSession.selectOne("mapper.DesignerFavoriteMapper.getDesigner", dfavoriteNo);
	}
	
	@Override
	public int insertDesigner(DesignerFavorite designerFavorite) throws Exception {
		return sqlSession.insert("mapper.DesignerFavoriteMapper.insertDesigner",designerFavorite);
	}
	
	@Override
	public int updateDesigner(Long dfavoriteNo) throws Exception {
		return sqlSession.update("mapper.DesignerFavoriteMapper.updateDesigner", dfavoriteNo);
	}
	
	@Override
	public int deleteDesigner(Long dfavoriteNo) throws Exception {
		return sqlSession.delete("mapper.DesignerFavoriteMapper.deleteDesigner",dfavoriteNo);
	}
	
}
