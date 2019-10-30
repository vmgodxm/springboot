package com.example.demo.repository;

import com.example.demo.model.UserRegist;

public interface IUserRegistRepository {
    UserRegist getUser(String userId);
}