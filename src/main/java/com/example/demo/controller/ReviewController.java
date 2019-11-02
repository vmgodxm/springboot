package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Review;
import com.example.demo.repository.interfaces.IReviewRepository;

@RestController
public class ReviewController {

	@Autowired
	private IReviewRepository repository;
	
	@GetMapping(path="/review")
	public Review getReply(@RequestParam(required=true, defaultValue="test@test.com")String userId) throws Exception {
		Review reply = repository.getReply(userId);
		return reply;
	}
	
}
