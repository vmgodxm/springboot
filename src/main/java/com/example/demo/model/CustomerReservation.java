package com.example.demo.model;

/**
 * CustomerReservation
 */
public class CustomerReservation {
    private Long resNo;
    private String resDate;
    private String useComment;
    private String userName;
    private String styleName;


    public CustomerReservation(Long resNo, String resDate, String useComment, String userName, String styleName) {
        this.resNo = resNo;
        this.resDate = resDate;
        this.useComment = useComment;
        this.userName = userName;
        this.styleName = styleName;
    }

    public Long getResNo() {
        return this.resNo;
    }

    public void setResNo(Long resNo) {
        this.resNo = resNo;
    }

    public String getResDate() {
        return this.resDate;
    }

    public void setResDate(String resDate) {
        this.resDate = resDate;
    }

    public String getUseComment() {
        return this.useComment;
    }

    public void setUseComment(String useComment) {
        this.useComment = useComment;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStyleName() {
        return this.styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    @Override
    public String toString() {
        return "{" +
            " resNo='" + getResNo() + "'" +
            ", resDate='" + getResDate() + "'" +
            ", useComment='" + getUseComment() + "'" +
            ", userName='" + getUserName() + "'" +
            ", styleName='" + getStyleName() + "'" +
            "}";
    }
    
}