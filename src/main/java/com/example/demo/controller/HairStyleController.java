package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.HairStyle;
import com.example.demo.repository.interfaces.IHairStyleRepository;

@RestController
public class HairStyleController {
	
	@Autowired
	private IHairStyleRepository reposotory;
	
	@GetMapping(path="hairStyle")
	public String HairStyleInfo(@RequestParam(required=true,defaultValue="1") Long styleNo , Model model) throws Exception {
		HairStyle hairStyle = reposotory.getHairStyle(styleNo);
		//System.out.println(hairStyle.getStyleNo());
		model.addAttribute("hairStyle",hairStyle);
		return "hairStyle";
	}
}
