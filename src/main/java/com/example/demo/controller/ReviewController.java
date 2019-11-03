package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	@GetMapping(path="/review")
	public Review cereteReply(@RequestParam(required=true, defaultValue="test@test.com")
			Review review) throws Exception {
		Review reply = repository.cereteReply(review);
		return reply;
	}
	@DeleteMapping(path="/review")
	public Review deleteReply(@RequestParam(required=true, defaultValue="1")Long replyNo) throws Exception {
		Review reply = repository.deleteReply(replyNo);
		return reply;
	}
	@GetMapping(path="/review")
	public Review updateReply(@RequestParam(required=true, defaultValue="1")Long replyNo) throws Exception {
		Review reply = repository.updateReply(replyNo);
		return reply;
	}
	
}
