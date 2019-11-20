package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.HairStyle;
import com.example.demo.model.HairStyleListMain;
import com.example.demo.model.UserRegistJoinFile;
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
	

	@GetMapping(path ="/hairStyle")
	public List<HairStyle> HairStyleList() throws Exception {
		return repository.getHairStyleList();
	}
	
	@GetMapping(path ="/hairStyleList")
	public List<HairStyleListMain> getHairStyleListReco() throws Exception {
		return repository.getHairStyleListReco();
	}
	
	@GetMapping(path ="/hairStyleJoin")
	public List<HairStyleListMain> getHairStyleListJoin() throws Exception {
		return repository.getHairStyleListJoin();
	}
	
	@GetMapping(path ="/hairStyleJoinbyUser/{userId}")
	public List<HairStyleListMain> hairStyleJoinbyUserId(@PathVariable String userId) throws Exception {
		return repository.hairStyleJoinbyUserId(userId);
	}
	
	@GetMapping(path ="/hairStylePrice")
	public List<HairStyleListMain> hairStyleListPrice() throws Exception{
		return repository.hairStyleListPrice();
	}
	
	@GetMapping(path="/hairStyle/{styleNo}")
	public HairStyle HairStyleInfo(@PathVariable Long styleNo) throws Exception {
		
		return  repository.getHairStyle(styleNo);
	}
	
	@GetMapping(path="/getHairStyleJoinFile/{userId}")
	public UserRegistJoinFile getHairStyleJoinFile(@PathVariable String userId) throws Exception {
		return  repository.getHairStyleJoinFile(userId); 
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
