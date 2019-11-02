package com.hairgram.repository.interfaces;

import com.hairgram.model.UserRegist;

public interface IUserRegistRepository {
	UserRegist getUser(String userId) throws Exception;
	int insertUser(UserRegist userRegist) throws Exception;
}