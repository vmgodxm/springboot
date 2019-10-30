package com.example.demo.model;

import java.math.BigDecimal;

public class UserRegist {

    private BigDecimal userNo;
    private String userId;
    private String userName;
    private BigDecimal gender;
    private String phone;
    private String nickName;
    private String businessNumber;
    private BigDecimal region;
    private BigDecimal fileStorage;
    private BigDecimal userLevel;

    public UserRegist(String userId, String userName, BigDecimal gender, String phone, String nickName,
            String businessNumber, BigDecimal region, BigDecimal fileStorage, BigDecimal userLevel) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.phone = phone;
        this.nickName = nickName;
        this.businessNumber = businessNumber;
        this.region = region;
        this.fileStorage = fileStorage;
        this.userLevel = userLevel;
    }

    public UserRegist(BigDecimal userNo, String userId, String userName, BigDecimal gender, String phone,
            String nickName, String businessNumber, BigDecimal region, BigDecimal fileStorage, BigDecimal userLevel) {
        super();
        this.userNo = userNo;
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.phone = phone;
        this.nickName = nickName;
        this.businessNumber = businessNumber;
        this.region = region;
        this.fileStorage = fileStorage;
        this.userLevel = userLevel;
    }

    public BigDecimal getUserNo() {
        return userNo;
    }

    public void setUserNo(BigDecimal userNo) {
        this.userNo = userNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getGender() {
        return gender;
    }

    public void setGender(BigDecimal gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public BigDecimal getRegion() {
        return region;
    }

    public void setRegion(BigDecimal region) {
        this.region = region;
    }

    public BigDecimal getFileStorage() {
        return fileStorage;
    }

    public void setFileStorage(BigDecimal fileStorage) {
        this.fileStorage = fileStorage;
    }

    public BigDecimal getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(BigDecimal userLevel) {
        this.userLevel = userLevel;
    }

    @Override
    public String toString() {
        return "UserRegist [userNo=" + userNo + ", userId=" + userId + ", userName=" + userName + ", gender=" + gender
                + ", phone=" + phone + ", nickName=" + nickName + ", businessNumber=" + businessNumber + ", region="
                + region + ", fileStorage=" + fileStorage + ", userLevel=" + userLevel + "]";
    }

}
