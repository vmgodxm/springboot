package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.UserRegist;

public interface IUserRepository {
    String getUserId(String userId) throws Exception;
    List<UserRegist> getUserList() throws Exception;
    UserRegist getUser(String userId) throws Exception;
    int insertUser(UserRegist userRegist) throws Exception;
    int updateUser(UserRegist userRegist) throws Exception;
    int deleteUser(String userId);
}