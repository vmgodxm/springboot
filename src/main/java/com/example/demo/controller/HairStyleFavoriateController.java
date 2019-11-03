package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.binding.MapperMethod.ParamMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HairStyleFavorite;
import com.example.demo.repository.interfaces.IHairFavoriteRepository;

@RestController
public class HairStyleFavoriateController {

	@Autowired
	private IHairFavoriteRepository repository;
	
	@GetMapping(path = "/hstylefav")
	public List<HairStyleFavorite> message(@RequestParam(required=true, defaultValue="test@test.com")String userId) throws Exception{
		List<HairStyleFavorite> hstyleFavList = repository.getHStyleFav(userId);
		return hstyleFavList;
	}
	
	
}
