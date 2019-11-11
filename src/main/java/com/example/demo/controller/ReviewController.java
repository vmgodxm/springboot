package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Review;
import com.example.demo.repository.interfaces.IReviewRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

	@Autowired
	private IReviewRepository repository;
	
	@GetMapping(path="/review")
	public ResponseEntity<List<Review>> ReplyList() throws Exception {
		ResponseEntity<List<Review>> retVal = null;
		
		List<Review> list = repository.ReplyList();
		if(list != null) {
			retVal = new ResponseEntity<>(list, HttpStatus.OK);
		}else {
			retVal = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return retVal;
	}
	
	@GetMapping(path="/review/{replyNo}")
	public ResponseEntity<Review> getReply(@PathVariable Long replyNo) throws Exception {
		ResponseEntity<Review> retVal = null;
		Review reply = null;

		try {
			reply = repository.getReply(replyNo);
		} catch (Exception e) {
			retVal = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		if (reply !=null) {
			retVal = new ResponseEntity<>(reply, HttpStatus.OK);
		} else {
			retVal = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return retVal;
	}
	
	@PostMapping(path="/review")
	public int insertReply(Review review) throws Exception {
		return repository.insertReply(review);
	}
	
	@DeleteMapping(path="/review/{replyNo}")
	public int deleteReply(@PathVariable Long replyNo) throws Exception {
		int reply = repository.deleteReply(replyNo);
		return reply;
	}
	
	@PutMapping(path="/review")
	public int updateReply(Long replyNo) throws Exception {
		int reply = repository.updateReply(replyNo);
		return reply;
	}
	
}
