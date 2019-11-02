package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HairStyleFavorite;
import com.example.demo.repository.interfaces.IFavoriateRepository;
import com.example.demo.repository.interfaces.IHairFavoriteRepository;

@RestController
public class HairStyleFavoriateController {

	@Autowired
	private IHairFavoriteRepository repository;
	
	@GetMapping(path = "hstylefav")
	public String HStyleFavInfo(@RequestParam(required=true, defaultValue="test@test.com")String userId, Model model) throws Exception{
		List<HairStyleFavorite> hstyleFavList = repository.getHStyleFav(userId);
		model.addAttribute("hstylefav",hstyleFavList);
		return "hstylefav";
		
	}
	
}
