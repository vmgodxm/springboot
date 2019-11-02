package com.example.demo.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserRegist;
import com.example.demo.repository.interfaces.IUserRegistRepository;

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
		// TODO Auto-generated method stub
		return 0;
	}

}