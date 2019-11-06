package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.HairStyleFavorite;

public interface IHairFavoriteRepository {

	List<HairStyleFavorite> getHStyleFavList() throws Exception;

	int insertHStyleFav(HairStyleFavorite hairStyleFav) throws Exception;

	Long getHStyleFav(Long hfavoriteNo) throws Exception;

	int updateHStyleFav(Long hfavoriteNo) throws Exception;

	int deleteHStyleFav(Long hfavoriteNo) throws Exception;

}