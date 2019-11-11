package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.LoginInfo;
import com.example.demo.model.ResponseData;
import com.example.demo.model.UserRegist;
import com.example.demo.repository.interfaces.IAuthRepository;
import com.example.demo.repository.interfaces.IUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IAuthRepository authRepository;

    @PostMapping(path = "/user/login")
    public ResponseEntity<ResponseData> loginUser(HttpEntity<LoginInfo> httpEntity) {
        ResponseEntity<ResponseData> retVal = new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        ResponseData responseData = new ResponseData();        
        try {
            LoginInfo loginInfo = httpEntity.getBody();
            String userId = userRepository.getUserId(loginInfo.getUserId());
            if (userId != null) {
                authRepository.insertAuthentication(loginInfo);

                responseData.setIsSuccess(true);
                responseData.setData(userId);
                retVal = new ResponseEntity<>(responseData, HttpStatus.OK);
            }
        } catch (Exception e) {
            responseData.setIsSuccess(true);
            responseData.setMessage("login failure");
            retVal = new ResponseEntity<>(responseData, HttpStatus.BAD_REQUEST);
        }

        return retVal;
    }

    @PostMapping(path = "/user/logout")
    public HttpStatus logoutAdmin(HttpEntity<String> httpEntity) throws Exception {

        HttpStatus httpStatus = HttpStatus.OK;

        try {
            String userId = httpEntity.getBody();
            if (userId != null) {
                LoginInfo loginInfo = authRepository.getAuthencication(userId);
                authRepository.updateLogout(loginInfo);
            }
        } catch (Exception e) {
            httpStatus = HttpStatus.BAD_GATEWAY;
        }

        return httpStatus;
    }

    @GetMapping(path = "/user")
    public ResponseEntity<List<UserRegist>> getUserList() throws Exception {
        ResponseEntity<List<UserRegist>> retVal = null;

        List<UserRegist> list = userRepository.getUserList();
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
            user = userRepository.getUser(userId);
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
        return userRepository.insertUser(userRegist);
    }

    @PutMapping(value = "/user/{userId}")
    public int updateUser(@PathVariable String userId, UserRegist userRegist) throws Exception {
        // #1: userId 가 있는지 유효성 검사를 먼저 실시
        // 이 부분은 공통적으로 제공되어야 하는 서비스의 부분으로..
        // 공통 모듈로 제공되어야 한다.

        // #2 : user 정보를 수정한다.

        return userRepository.updateUser(userRegist);
    }

    @DeleteMapping(value = "/user/{userId}")
    public int deleteUser(@PathVariable String userId) throws Exception {
        return userRepository.deleteUser(userId);
    }
}