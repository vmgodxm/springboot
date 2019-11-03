package com.example.demo.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Review;
import com.example.demo.repository.interfaces.IReviewRepository;

@Repository
public class ReviewRepository implements IReviewRepository {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public Review getReply(String userId) throws Exception {
		return sqlSession.selectOne("mapper.ReviewMapper.getReply", userId);
	}
	@Override
	public int cereteReply(Review review) throws Exception {
		return sqlSession.insert("mapper.ReviewMapper.cereteReply", review);
	}
	@Override
	public Review deleteReply(Long replyNo) throws Exception {
		return sqlSession.selectOne("mapper.ReviewMapper.deleteReply", replyNo);
	}
	@Override
	public Review updateReply(Long replyNo) throws Exception {
		return sqlSession.selectOne("mapper.ReviewMapper.updateReply", replyNo);
	}
	
}
