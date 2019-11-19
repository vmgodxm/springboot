package com.example.demo.model;

public class Reservation {
	private Long   resNo;
	private String resDate;
	private String useComment;
	private String useComplete;
	private Long   styleNo;
	private String designerId;
	private String userId;

	public Reservation() { }

	public Reservation(String designerId, String userId) {
		this.designerId = designerId;
		this.userId = userId;
	}
	public Reservation(String resDate, String designerId, int dummy) {
		this.resDate = resDate;
		this.designerId = designerId;
	}

	public Reservation(String resDate, String useComment, String useComplete, Long styleNo, String designerId, String userId) {
		this.resDate = resDate;
		this.useComment = useComment;
		this.useComplete = useComplete;
		this.styleNo = styleNo;
		this.designerId = designerId;
		this.userId = userId;
	}

	public Reservation(Long resNo, String resDate, String useComment, String useComplete, Long styleNo, String designerId, String userId) {
		this.resNo = resNo;
		this.resDate = resDate;
		this.useComment = useComment;
		this.useComplete = useComplete;
		this.styleNo = styleNo;
		this.designerId = designerId;
		this.userId = userId;
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

	public String getuseComment() {
		return this.useComment;
	}

	public void setuseComment(String useComment) {
		this.useComment = useComment;
	}

	public String getuseComplete() {
		return this.useComplete;
	}

	public void setuseComplete(String useComplete) {
		this.useComplete = useComplete;
	}

	public Long getStyleNo() {
		return this.styleNo;
	}

	public void setStyleNo(Long styleNo) {
		this.styleNo = styleNo;
	}

	public String getDesignerId() {
		return this.designerId;
	}

	public void setDesignerId(String designerId) {
		this.designerId = designerId;
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
			" resNo='" + getResNo() + "'" +
			", resDate='" + getResDate() + "'" +
			", useComment='" + getuseComment() + "'" +
			", useComplete='" + getuseComplete() + "'" +
			", styleNo='" + getStyleNo() + "'" +
			", designerId='" + getDesignerId() + "'" +
			", userId='" + getUserId() + "'" +
			"}";
	}
	

}