package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hairgram.model.DesignerFavorite;

import com.hairgram.service.interfaces.IDesignerService;

@Controller
public class DesignerFavoriteController {
	
	@Autowired
	private IDesignerService service;
	
	
	@RequestMapping(value = "dfavorite")
	public String getDesigner(@RequestParam(required=true, defaultValue="test@test.com")String userId, Model model) throws Exception {
		List<DesignerFavorite> designerList = service.getDesignerList(userId);
		model.addAttribute("designerList", designerList);
		return "dfavorite";
	}

}
