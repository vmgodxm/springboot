package com.example.demo.repository.interfaces;

import com.example.demo.model.UserRegist;

public interface IUserRegistRepository {
    UserRegist getUser(String userId);
    int insertUser(UserRegist userRegist) throws Exception;
}