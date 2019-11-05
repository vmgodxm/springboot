package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.UserRegist;
import com.example.demo.repository.interfaces.IUserRegistRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class UserRegistController {

    @Autowired
    private IUserRegistRepository repoistory;

    @GetMapping(path ="/user")
    public List<String> getUserList() throws Exception {
        return repoistory.getUserList();
    }

    @GetMapping(path = "/user/{userId}")
    public UserRegist message(@PathVariable  String userId) throws Exception {
        return repoistory.getUser(userId);
    }

    @PostMapping(path = "/user")
	public int insertUserInfo(UserRegist userRegist) throws Exception {
		return repoistory.insertUser(userRegist);
    }
    
    @PutMapping(value="/user/")
    public int updateUser(UserRegist userRegist) throws Exception {
        return repoistory.updateUser(userRegist);
    }

    @DeleteMapping(value="/user/{userId}")
    public int deleteUser(@PathVariable String userId) throws Exception {
        return repoistory.deleteUser(userId);
    }
}