package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Admin;
import com.example.demo.repository.interfaces.IAdminRepository;

@RestController
public class AdminController {
	
	@Autowired
	private IAdminRepository repository;
	
	@GetMapping(path="/admintest")
	public String getAdminInfo(@RequestParam(required=true, defaultValue="admin") String adminUserId,Model model) throws Exception{
		Admin admin = repository.getAdminId(adminUserId);
		model.addAttribute("admin",admin);
		return "admintest";
	}
	
	@GetMapping(path="/adminList")
	public String getAdminAll(Model model) throws Exception{
		List<Admin> adminList = repository.adminAll();
		model.addAttribute("adminList", adminList);
		return "adminList";
	}
	

}
