package com.example.demo.model;

/**
 * CustomerReservation
 */
public class CustomerReservation {
    private Long resNo;
    private Long categoryNo;
    private Long useComplete;
    private String resDate;
    private String useComment;
    private String userName;
    private String styleName;

    public CustomerReservation() { }

    public CustomerReservation(Long resNo, Long categoryNo, Long useComplete, String resDate, String useComment, String userName, String styleName) {
        this.resNo = resNo;
        this.categoryNo = categoryNo;
        this.useComplete = useComplete;
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

    public Long getCategoryNo() {
        return this.categoryNo;
    }

    public void setCategoryNo(Long categoryNo) {
        this.categoryNo = categoryNo;
    }

    public Long getUseComplete() {
        return this.useComplete;
    }

    public void setUseComplete(Long useComplete) {
        this.useComplete = useComplete;
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
            ", categoryNo='" + getCategoryNo() + "'" +
            ", useComplete='" + getUseComplete() + "'" +
            ", resDate='" + getResDate() + "'" +
            ", useComment='" + getUseComment() + "'" +
            ", userName='" + getUserName() + "'" +
            ", styleName='" + getStyleName() + "'" +
            "}";
    }

}