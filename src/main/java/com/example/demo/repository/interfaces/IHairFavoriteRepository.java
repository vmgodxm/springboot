package com.example.demo.repository.interfaces;

import java.util.List;

import com.hairgram.model.HairStyleFavorite;

public interface IHairFavoriteRepository {

	List<HairStyleFavorite> getHStyleFav(String userId) throws Exception;

}