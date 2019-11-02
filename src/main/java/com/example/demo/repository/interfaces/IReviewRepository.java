package com.example.demo.repository.interfaces;

import com.hairgram.model.Review;

public interface IReviewRepository {

	Review getReply(String userId) throws Exception;

}