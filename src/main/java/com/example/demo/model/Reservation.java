package com.example.demo.model;

//?��?��?��?�� ?��?���? 
public class Reservation {

 // ?��?��번호(?���?) 
 private Long resNo;

 // ?��?�� 
 private Long year;

 // ?�� 
 private Long month;

 // ?�� 
 private Long beginDay;

 // ?��?��?���? 
 private Long beginHour;

 // 종료?���? 
 private Long endHour;

 // ?��?���? 
 private Long beginMinute;

 // 종료�? 
 private Long endMinute;

 // ?��?��?�� ?���??��?�� 
 private String useComment;

 // ?��?��?���? 
 private Integer useComplete;

 // ?��?��?��????�� 번호 
 private Long styleNo;

 // ?��?��?��?�� ?��?��?�� 
 private String desinerId;

 // ?��?��?�� ?��?��?�� 
 private String userId;

public Reservation() {
}

public Reservation(Long resNo, Long year, Long month, Long beginDay, Long beginHour, Long endHour, Long beginMinute,
		Long endMinute, String useComment, Integer useComplete, Long styleNo, String desinerId, String userId) {
	super();
	this.resNo = resNo;
	this.year = year;
	this.month = month;
	this.beginDay = beginDay;
	this.beginHour = beginHour;
	this.endHour = endHour;
	this.beginMinute = beginMinute;
	this.endMinute = endMinute;
	this.useComment = useComment;
	this.useComplete = useComplete;
	this.styleNo = styleNo;
	this.desinerId = desinerId;
	this.userId = userId;
}

public Reservation(Long year, Long month, Long beginDay, Long beginHour, Long endHour, Long beginMinute, Long endMinute,
		String useComment, Integer useComplete, Long styleNo, String desinerId, String userId) {
	super();
	this.year = year;
	this.month = month;
	this.beginDay = beginDay;
	this.beginHour = beginHour;
	this.endHour = endHour;
	this.beginMinute = beginMinute;
	this.endMinute = endMinute;
	this.useComment = useComment;
	this.useComplete = useComplete;
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

public String getUseComment() {
	return useComment;
}

public void setUseComment(String useComment) {
	this.useComment = useComment;
}

public Integer getUseComplete() {
	return useComplete;
}

public void setUseComplete(Integer useComplete) {
	this.useComplete = useComplete;
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
			+ endMinute + ", useComment=" + useComment + ", useComplete=" + useComplete + ", styleNo=" + styleNo
			+ ", desinerId=" + desinerId + ", userId=" + userId + "]";
}



}