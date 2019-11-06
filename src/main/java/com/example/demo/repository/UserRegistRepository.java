package com.example.demo.repository;

import java.util.List;

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
    public List<UserRegist> getUserList() throws Exception {
        return sqlSession.selectList("mapper.UserRegistMapper.getUserList");
    }

    @Override
    public UserRegist getUser(String userId) {
        return sqlSession.selectOne("mapper.UserRegistMapper.getUser", userId);
    }

    @Override
    public int insertUser(UserRegist userRegist) throws Exception {
        return sqlSession.insert("mapper.UserRegistMapper.insertUser", userRegist);
    }

    @Override
    public int updateUser(UserRegist userRegist) throws Exception {
        return sqlSession.update("mapper.UserRegistMapper.updateUser", userRegist);
    }

    @Override
    public int deleteUser(String userId) {
        //deleteHFavorite
        sqlSession.delete("mapper.UserRegistMapper.deleteHFavorite", userId);
        sqlSession.delete("mapper.UserRegistMapper.deleteDFavorite", userId);
        return sqlSession.delete("mapper.UserRegistMapper.deleteUser", userId);
    }

    
}