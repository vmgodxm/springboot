package com.example.demo.controller;

import com.example.demo.model.UserRegist;
import com.example.demo.repository.interfaces.IUserRegistRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegistController {

    @Autowired
    private IUserRegistRepository repoistory;

    @GetMapping(path = "/user")
    public UserRegist message(@RequestParam(required=true, defaultValue="test@test.com")String userId) {
        return repoistory.getUser(userId);
    }

    @PostMapping(path = "/user")
	public int insertUserInfo(UserRegist userRegist) throws Exception {
		
		if (userRegist.getUserId() == null) {
			userRegist = new UserRegist("rusiell00@outlook.com", "kim", 0L, "010-0000-0000", "rusiela", 0L);
		}
		
		return repoistory.insertUser(userRegist);
	}
}