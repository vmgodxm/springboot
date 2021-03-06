package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DesignerFavorite;
import com.example.demo.repository.interfaces.IDesignerFavoriteRepository;

@RestController
public class DesignerFavoriteController {
	
	@Autowired
	private IDesignerFavoriteRepository repository;
	
	
	@GetMapping(path = "/dfavorite")
	public List<DesignerFavorite> getDesigner() throws Exception {
		return repository.getDesignerList();
	}

}
