package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.DesignerFavorite;


public interface IDesignerFavoriteRepository {

	List<DesignerFavorite> getDesignerList() throws Exception;
	
	Long getDesigner(Long dfavoriteNo)throws Exception;
	int insertDesigner(DesignerFavorite designerFavorite)throws Exception;
	int updateDesigner(Long dfavoriteNo)throws Exception;
	int deleteDesigner(Long dfavoriteNo)throws Exception;
	

	

}