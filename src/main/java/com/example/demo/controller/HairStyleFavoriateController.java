package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hairgram.model.HairStyleFavorite;
import com.hairgram.service.interfaces.IFavoriateService;

@Controller
public class HairStyleFavoriateController {

	@Autowired
	private IFavoriateService service;
	
	@RequestMapping(value = "hstylefav")
	public String HStyleFavInfo(@RequestParam(required=true, defaultValue="test@test.com")String userId, Model model) throws Exception{
		List<HairStyleFavorite> hstyleFavList = service.getHStyleFav(userId);
		model.addAttribute("hstylefav",hstyleFavList);
		return "hstylefav";
		
	}
	
}
