package com.example.demo.model;

/**
 * LoginInfo
 */
public class LoginInfo {
    private String userId;
    private String apiKey;
    private long userLevel;

    public LoginInfo() { }

    public LoginInfo(String userId, String apiKey, long userLevel) {
        this.userId = userId;
        this.apiKey = apiKey;
        this.userLevel = userLevel;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public long getUserLevel() {
        return this.userLevel;
    }

    public void setUserLevel(long userLevel) {
        this.userLevel = userLevel;
    }

    @Override
    public String toString() {
        return "{" +
            " userId='" + getUserId() + "'" +
            ", apiKey='" + getApiKey() + "'" +
            ", userLevel='" + getUserLevel() + "'" +
            "}";
    }


}