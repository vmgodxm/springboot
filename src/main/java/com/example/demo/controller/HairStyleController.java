package com.example.demo.controller;

import com.example.demo.model.HairStyle;
import com.example.demo.repository.interfaces.IHairStyleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HairStyleController {
	
	@Autowired
	private IHairStyleRepository repository;
	
	/*
	 * public ResponseEntity<List<HairStyle>> getHairStyleList() throws Exception{
	 * //ResponseEntity<List<HairStyle>> retVal = null;
	 * 
	 * //List<HairStyle> list = repository.HairStyleList(); return null; }
	 */

	
	@GetMapping(path="/hairStyle")
	public HairStyle HairStyleInfo(@RequestParam(required=true,defaultValue="1") Long styleNo  ) throws Exception {
		HairStyle hairStyle = repository.getHairStyle(styleNo);
		return hairStyle;
	}
}
