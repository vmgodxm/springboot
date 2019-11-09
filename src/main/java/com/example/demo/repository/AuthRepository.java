package com.example.demo.repository;

import com.example.demo.model.LoginInfo;
import com.example.demo.repository.interfaces.IAuthRepository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AuthRepository implements IAuthRepository {
    
    @Autowired
    private SqlSession sqlSession;
    
    @Override
    public int insertAuthentication(LoginInfo loginInfo) {

        sqlSession.insert("mapper.AuthenticationMapper.insertAuthentication", loginInfo);
        return sqlSession.insert("mapper.AuthenticationMapper.insertAuthenticationHistory", loginInfo);
    }

    @Override
    public int updateLogout(LoginInfo loginInfo) {

        sqlSession.update("mapper.AuthenticationMapper.updateAPIKeyToNull", loginInfo);
        return sqlSession.update("mapper.AuthenticationMapper.updateHistoryLogoutTime", loginInfo);
    }
    
}
