package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.HairStyle;
import com.example.demo.repository.interfaces.IHairStyleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HairStyleController {

	@Autowired
	private IHairStyleRepository repository;
	

	// @GetMapping(path="/hairStyle")
	// public ResponseEntity<List<HairStyle>> HairStyleList() throws Exception{
	// ResponseEntity<List<HairStyle>> retVal = null;

	// List<HairStyle> list = repository.getHairStyleList();
	// if (list != null) {
	// retVal = new ResponseEntity<>(list, HttpStatus.OK);
	// } else {
	// retVal = new ResponseEntity<>(HttpStatus.NOT_FOUND);
	// }
	// return retVal;
	// }

	@GetMapping(path ="/hairStyle")
	public List<HairStyle> HairStyleList() throws Exception {
		return repository.getHairStyleList();
	}
	
	@GetMapping(path="/hairStyle/{styleNo}")
	public HairStyle HairStyleInfo(Long styleNo) throws Exception {
		HairStyle hairStyle = repository.getHairStyle(styleNo);
		return hairStyle;
	}
	
	@PostMapping(path="/hairStyleInsert") 
	public int insertHairStyle(HairStyle hairStyle) throws Exception{
		return repository.insertHairStyle(hairStyle);
	}
	
	@PutMapping(path="/hairStyleUpdate/{styleNo}")
	public int updateHairStyle(@PathVariable Long styleNo,HairStyle hairStyle) throws Exception{
		return repository.updateHairStyle(hairStyle);
	}
	
	@DeleteMapping(path="/hairStyleDelete/{styleNo}")
	public int deleteHairStyle(@PathVariable Long styleNo) throws Exception{
		return repository.deleteHairStyle(styleNo);
	}
}
