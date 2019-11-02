package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserRegist;
import com.example.demo.repository.interfaces.IUserRegistRepository;

@RestController
public class UserRegistController {

    @Autowired
    private IUserRegistRepository repoistory;

    @GetMapping(path = "/user")
    public UserRegist message(@RequestParam(required=true, defaultValue="test@test.com")String userId) throws Exception {
        return repoistory.getUser(userId);
    }
}