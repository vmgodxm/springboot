package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HairStyleFavorite;
import com.example.demo.repository.interfaces.IHairFavoriteRepository;

@RestController
public class HairStyleFavoriateController {

	@Autowired
	private IHairFavoriteRepository repository;
	
	@GetMapping(path = "/hstylefav")
	public List<HairStyleFavorite> message() throws Exception{
		return repository.getHStyleFavList();
	}
	
	@GetMapping(path="/hstylefav/{hstylefav}")
	public Long getHairStyleFav(Long hfavoriteNo) throws Exception{
		return repository.getHStyleFav(hfavoriteNo);
	}
	@PostMapping(path="hstylefav")
	public int insertHairStyleFav(HairStyleFavorite hairStyleFav) throws Exception{
		return repository.insertHStyleFav(hairStyleFav);
	}
	
	@PutMapping(path="hstylefav")
	public int updateHairStyleFav(Long hfavoriteNo) throws Exception{
		return repository.updateHStyleFav(hfavoriteNo);
	}
	@DeleteMapping(path="hstylefav/{hstylefav}")
	public int deleteHairStyleFav(Long hfavoriteNo) throws Exception{
		return repository.deleteHStyleFav(hfavoriteNo);
	}
	
	
}
