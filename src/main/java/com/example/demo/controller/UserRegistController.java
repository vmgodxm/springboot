package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.UserRegist;
import com.example.demo.repository.interfaces.IUserRegistRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class UserRegistController {

    @Autowired
    private IUserRegistRepository repository;

    @GetMapping(path = "/user")
    public ResponseEntity<List<UserRegist>> getUserList() throws Exception {
        ResponseEntity<List<UserRegist>> retVal = null;

        List<UserRegist> list = repository.getUserList();
        if (list != null) {
            retVal = new ResponseEntity<>(list, HttpStatus.OK);
        } else {
            retVal = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return retVal;
    }

    @GetMapping(path = "/user/{userId}")
    public ResponseEntity<UserRegist> getUser(@PathVariable String userId) throws Exception {

        ResponseEntity<UserRegist> retVal = null;
        UserRegist user = null;

        try {
            user = repository.getUser(userId);
        } catch (Exception e) {
            retVal = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        if (user != null) {
            retVal = new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            retVal = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return retVal;
    }

    @PostMapping(path = "/user")
    public int insertUserInfo(UserRegist userRegist) throws Exception {
        return repository.insertUser(userRegist);
    }

    @PutMapping(value = "/user/{userId}")
    public int updateUser(@PathVariable String userId, UserRegist userRegist) throws Exception {
        // #1: userId 가 있는지 유효성 검사를 먼저 실시
        // 이 부분은 공통적으로 제공되어야 하는 서비스의 부분으로..
        // 공통 모듈로 제공되어야 한다.

        // #2 : user 정보를 수정한다.

        return repository.updateUser(userRegist);
    }

    @DeleteMapping(value = "/user/{userId}")
    public int deleteUser(@PathVariable String userId) throws Exception {
        return repository.deleteUser(userId);
    }
}