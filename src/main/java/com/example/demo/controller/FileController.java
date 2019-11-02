package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hairgram.model.FileStorage;
import com.hairgram.service.interfaces.IFileService;

@Controller
public class FileController {

	@Autowired
	private IFileService service;
	
	@RequestMapping(value = "filetest")
	public String getFileInfo(@RequestParam(required=true, defaultValue="1")Long fileNo , Model model) throws Exception {
		FileStorage file = service.getFile(fileNo);
		model.addAttribute("file", file);
		return "filetest";
	}
	
	
	
}
