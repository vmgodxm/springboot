package com.example.demo.model;

//사업장 운영시간 테이블 
public class CompanyOperation {

	/** 쉬는날짜 */
	private String restDate;

	/** 시작시작 */
	private String startTime;

	/** 종료시간 */
	private String endTime;

	/** 사용자 아이디 */
	private String userId;

	public CompanyOperation() { }

	public CompanyOperation(String restDate, String startTime, String endTime, String userId) {
		this.restDate = restDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.userId = userId;
	}

	public String getRestDate() {
		return this.restDate;
	}

	public void setRestDate(String restDate) {
		this.restDate = restDate;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "{" +
			" restDate='" + getRestDate() + "'" +
			", startTime='" + getStartTime() + "'" +
			", endTime='" + getEndTime() + "'" +
			", userId='" + getUserId() + "'" +
			"}";
	}

}