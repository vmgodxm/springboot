package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.DesignerFavorite;


public interface IDesignerFavoriteRepository {

	List<DesignerFavorite> getDesignerList(String userId) throws Exception;

	

	

}