package com.example.demo.repository.interfaces;

import com.example.demo.model.LoginInfo;

public interface IAuthRepository {
    int insertAuthentication(LoginInfo loginInfo);
    int updateLogout(LoginInfo loginInfo);
}