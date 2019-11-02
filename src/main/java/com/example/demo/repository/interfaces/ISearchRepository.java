package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.UserRegist;

public interface ISearchRepository {

	List<UserRegist> getDisigner(String userName);

}