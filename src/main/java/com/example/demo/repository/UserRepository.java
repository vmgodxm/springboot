package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.UserRegist;
import com.example.demo.repository.interfaces.IUserRepository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements IUserRepository {

    @Autowired
    private SqlSession sqlSession;

    private final String NAMESPACE = "mapper.UserMapper.";

    @Override
    public List<UserRegist> getUserList() throws Exception {
        return sqlSession.selectList(NAMESPACE + "getUserList");
    }

    @Override
    public String getUserId(String userId) throws Exception {
        return sqlSession.selectOne(NAMESPACE + "getUserId", userId);
    }

    @Override
    public UserRegist getUser(String userId) {
        return sqlSession.selectOne(NAMESPACE + "getUser", userId);
    }

    @Override
    public int insertUser(UserRegist userRegist) throws Exception {
        return sqlSession.insert(NAMESPACE + "insertUser", userRegist);
    }

    @Override
    public int updateUser(UserRegist userRegist) throws Exception {
        return sqlSession.update(NAMESPACE + "updateUser", userRegist);
    }

    @Override
    public int deleteUser(String userId) {
        //deleteHFavorite
        sqlSession.delete(NAMESPACE + "deleteHFavorite", userId);
        sqlSession.delete(NAMESPACE + "deleteDFavorite", userId);
        return sqlSession.delete(NAMESPACE + "deleteUser", userId);
    }

    

    
}