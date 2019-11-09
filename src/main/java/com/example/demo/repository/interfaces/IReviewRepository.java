package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.Review;

public interface IReviewRepository {

	List<Review> ReplyList() throws Exception;
	Review getReply(String userId) throws Exception;
	int deleteReply(Long replyNo) throws Exception;
	int updateReply(Long replyNo) throws Exception;
	int insertReply(Review review) throws Exception;


}