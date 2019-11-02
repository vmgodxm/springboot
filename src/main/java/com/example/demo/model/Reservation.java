package com.example.demo.model;

//?΄?©??½ ??΄λΈ? 
public class Reservation {

 // ??½λ²νΈ(?λ²?) 
 private Long resNo;

 // ?°? 
 private Long year;

 // ? 
 private Long month;

 // ?Ό 
 private Long beginDay;

 // ???κ°? 
 private Long beginHour;

 // μ’λ£?κ°? 
 private Long endHour;

 // ??λΆ? 
 private Long beginMinute;

 // μ’λ£λΆ? 
 private Long endMinute;

 // ?¬?©? ?μ²??¬?­ 
 private String userComment;

 // ?? ?λ£? 
 private Integer userComplete;

 // ?€?΄?€????Ό λ²νΈ 
 private Long styleNo;

 // ???΄? ??΄? 
 private String desinerId;

 // ?¬?©? ??΄? 
 private String userId;

public Reservation() {
}

public Reservation(Long resNo, Long year, Long month, Long beginDay, Long beginHour, Long endHour, Long beginMinute,
		Long endMinute, String userComment, Integer userComplete, Long styleNo, String desinerId, String userId) {
	super();
	this.resNo = resNo;
	this.year = year;
	this.month = month;
	this.beginDay = beginDay;
	this.beginHour = beginHour;
	this.endHour = endHour;
	this.beginMinute = beginMinute;
	this.endMinute = endMinute;
	this.userComment = userComment;
	this.userComplete = userComplete;
	this.styleNo = styleNo;
	this.desinerId = desinerId;
	this.userId = userId;
}

public Long getResNo() {
	return resNo;
}

public void setResNo(Long resNo) {
	this.resNo = resNo;
}

public Long getYear() {
	return year;
}

public void setYear(Long year) {
	this.year = year;
}

public Long getMonth() {
	return month;
}

public void setMonth(Long month) {
	this.month = month;
}

public Long getBeginDay() {
	return beginDay;
}

public void setBeginDay(Long beginDay) {
	this.beginDay = beginDay;
}

public Long getBeginHour() {
	return beginHour;
}

public void setBeginHour(Long beginHour) {
	this.beginHour = beginHour;
}

public Long getEndHour() {
	return endHour;
}

public void setEndHour(Long endHour) {
	this.endHour = endHour;
}

public Long getBeginMinute() {
	return beginMinute;
}

public void setBeginMinute(Long beginMinute) {
	this.beginMinute = beginMinute;
}

public Long getEndMinute() {
	return endMinute;
}

public void setEndMinute(Long endMinute) {
	this.endMinute = endMinute;
}

public String getUserComment() {
	return userComment;
}

public void setUserComment(String userComment) {
	this.userComment = userComment;
}

public Integer getUserComplete() {
	return userComplete;
}
 
public void setUserComplete(Integer userComplete) {
	this.userComplete = userComplete;
}

public Long getStyleNo() {
	return styleNo; 
}

public void setStyleNo(Long styleNo) {
	this.styleNo = styleNo;
}

public String getDesinerId() {
	return desinerId;
}

public void setDesinerId(String desinerId) {
	this.desinerId = desinerId;
}

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

@Override
public String toString() {
	return "Reservation [resNo=" + resNo + ", year=" + year + ", month=" + month + ", beginDay=" + beginDay
			+ ", beginHour=" + beginHour + ", endHour=" + endHour + ", beginMinute=" + beginMinute + ", endMinute="
			+ endMinute + ", userComment=" + userComment + ", userComplete=" + userComplete + ", styleNo=" + styleNo
			+ ", desinerId=" + desinerId + ", userId=" + userId + "]";
}

 
}