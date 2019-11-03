package com.example.demo.repository.interfaces;

import com.example.demo.model.Review;

public interface IReviewRepository {

	Review getReply(String userId) throws Exception;

	Review deleteReply(Long replyNo) throws Exception;

	Review updateReply(Long replyNo) throws Exception;

	Review cereteReply(Review review) throws Exception;

}