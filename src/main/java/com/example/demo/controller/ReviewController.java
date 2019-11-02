package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hairgram.model.Review;
import com.hairgram.service.interfaces.IReviewService;

@Controller
public class ReviewController {

	@Autowired
	private IReviewService service;
	
	@RequestMapping(value="review")
	public String getReply(@RequestParam(required=true, defaultValue="test@test.com")String userId, Model model) throws Exception {
		Review reply = service.getReply(userId);
		model.addAttribute("reply",reply);
		return "review";
	}
	
}
