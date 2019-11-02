package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hairgram.model.Admin;

import com.hairgram.service.interfaces.IAdminService;

@Controller
public class AdminController {
	
	@Autowired
	private IAdminService service;
	
	@RequestMapping(value="admintest")
	public String getAdminInfo(@RequestParam(required=true, defaultValue="admin") String adminUserId,Model model) throws Exception{
		Admin admin = service.getAdminId(adminUserId);
		model.addAttribute("admin",admin);
		return "admintest";
	}
	
	@RequestMapping(value="adminList")
	public String getAdminAll(Model model) throws Exception{
		List<Admin> adminList = service.adminAll();
		model.addAttribute("adminList", adminList);
		return "adminList";
	}
	

}
