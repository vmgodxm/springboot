package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hairgram.model.HairStyle;
import com.hairgram.service.interfaces.IHairStyleService;

@Controller
public class HairStyleController {
	
	@Autowired
	private IHairStyleService service;
	
	@RequestMapping(value="hairStyle")
	public String HairStyleInfo(@RequestParam(required=true,defaultValue="1") Long styleNo , Model model) throws Exception {
		HairStyle hairStyle = service.getHairStyle(styleNo);
		//System.out.println(hairStyle.getStyleNo());
		model.addAttribute("hairStyle",hairStyle);
		return "hairStyle";
	}
}
