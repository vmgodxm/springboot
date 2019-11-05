package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Admin;
import com.example.demo.repository.interfaces.IAdminRepository;

@RestController
public class AdminController {
	
	@Autowired
	private IAdminRepository repository;
	
	@PostMapping(path="/login")
	public boolean loginAdmin(@RequestBody Admin admin) throws Exception{
				
		boolean result = repository.loginAdmin(admin);
		return result;
		
//		model.addAttribute("admin",admin);
//		return "admintest";
	}
	
	@GetMapping(path="/admintest")
	public Admin getAdminInfo(@RequestParam(required=true, defaultValue="admin") String adminUserId,Model model) throws Exception{
		Admin admin = repository.getAdminId(adminUserId);
		return admin;
		
//		model.addAttribute("admin",admin);
//		return "admintest";
	}
	
	@GetMapping(path="/adminList")
	public List<Admin> getAdminAll() throws Exception{
		List<Admin> adminList = repository.adminAll();
		return adminList;
	}
	

}
