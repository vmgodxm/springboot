package com.example.demo.model;

//?��?��?�� ?��?��?���? ?��?���? 
public class CompanyOperation {

	// ?��?��
	private Long year;

	// ?��
	private Long month;

	// ?��?��?���?
	private Long beginDay;

	// 종료?���?
	private Long endDay;

	// ?��?��?���?
	private Long beginHour;

	// 종료?���?
	private Long endHour;

	// ?��?���?
	private Long beginMinute;

	// 종료�?
	private Long endMinute;

	// ?��?��?�� ?��?��?��
	private String userId;

	public CompanyOperation() {
	}

	public CompanyOperation(Long year, Long month, Long beginDay, Long endDay, Long beginHour, Long endHour,
			Long beginMinute, Long endMinute, String userId) {
		super();
		this.year = year;
		this.month = month;
		this.beginDay = beginDay;
		this.endDay = endDay;
		this.beginHour = beginHour;
		this.endHour = endHour;
		this.beginMinute = beginMinute;
		this.endMinute = endMinute;
		this.userId = userId;
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

	public Long getEndDay() {
		return endDay;
	}

	public void setEndDay(Long endDay) {
		this.endDay = endDay;
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
 

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "CompanyOperation [year=" + year + ", month=" + month + ", beginDay=" + beginDay + ", endDay=" + endDay
				+ ", beginHour=" + beginHour + ", endHour=" + endHour + ", beginMinute=" + beginMinute + ", endMinute="
				+ endMinute + ", userId=" + userId + "]";
	}


}