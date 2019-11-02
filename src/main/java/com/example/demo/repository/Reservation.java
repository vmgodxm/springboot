package com.example.demo.repository;

//이용예약 테이블 
public class Reservation {

 // 예약번호(순번) 
 private Long resNo;

 // 연도 
 private Long year;

 // 월 
 private Long month;

 // 일 
 private Long beginDay;

 // 시작시간 
 private Long beginHour;

 // 종료시간 
 private Long endHour;

 // 시작분 
 private Long beginMinute;

 // 종료분 
 private Long endMinute;

 // 사용자 요청사항 
 private String userComment;

 // 시술완료 
 private Integer userComplete;

 // 헤어스타일 번호 
 private Long styleNo;

 // 디자이너 아이디 
 private String desinerId;

 // 사용자 아이디 
 private String userId;

public Reservation() {
	// TODO Auto-generated constructor stub
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