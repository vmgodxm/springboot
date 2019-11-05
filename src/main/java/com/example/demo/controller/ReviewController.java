package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Review;
import com.example.demo.repository.interfaces.IReviewRepository;

@RestController
public class ReviewController {

	@Autowired
	private IReviewRepository repository;
	
	@GetMapping(path="/review")
	public List<Review> getReply(@RequestParam(required=true, defaultValue="test@test.com")String userId) throws Exception {
		return repository.getReply(userId);
	}
	
	@PostMapping(path="/review")
	public int insertReply(Review review) throws Exception {
		return repository.insertReply(review);
	}
	
	@DeleteMapping(path="/review")
	public int deleteReply(@RequestParam(required=true, defaultValue="test@test.com")Long replyNo) throws Exception {
		int reply = repository.deleteReply(replyNo);
		return reply;
	}
	
	@PutMapping(path="/review")
	public int updateReply(@RequestParam(required=true, defaultValue="test@test.com")Long replyNo) throws Exception {
		int reply = repository.updateReply(replyNo);
		return reply;
	}
	
}
