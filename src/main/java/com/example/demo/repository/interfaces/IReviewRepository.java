package com.example.demo.repository.interfaces;

import com.example.demo.model.Review;

public interface IReviewRepository {

	Review getReply(String userId) throws Exception;

}