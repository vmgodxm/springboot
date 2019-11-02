package com.example.demo.repository;

import com.example.demo.model.UserRegist;
import com.example.demo.repository.interfaces.IUserRegistRepository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRegistRepository implements IUserRegistRepository {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public UserRegist getUser(String userId) {
        return sqlSession.selectOne("mapper.UserRegistMapper.getUser", userId);
    }

    @Override
	public int insertUser(UserRegist userRegist) throws Exception {
		return sqlSession.insert("mapper.UserRegistMapper.insertUser", userRegist);
	}
}