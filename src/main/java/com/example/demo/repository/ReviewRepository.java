package com.example.demo.repository;

import java.util.List;

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
	public List<Review> ReplyList() throws Exception {
		return sqlSession.selectList("mapper.ReviewMapper.getReplyList");
	}
	@Override
	public Review getReply(Long replyNo) throws Exception {
		return sqlSession.selectOne("mapper.ReviewMapper.getReply", replyNo);
	}
	@Override
	public int insertReply(Review review) throws Exception {
		return sqlSession.insert("mapper.ReviewMapper.insertReply", review);
	}
	@Override
	public int deleteReply(Long replyNo) throws Exception {
		return sqlSession.delete("mapper.ReviewMapper.deleteReply", replyNo);
	}
	@Override
	public int updateReply(Long replyNo) throws Exception {
		return sqlSession.update("mapper.ReviewMapper.updateReply", replyNo);
	}
	
}
