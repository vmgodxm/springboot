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
	private Long day;

	// ?��?��?���?
	private Long beginHour;

	// 종료?���?
	private Long endHour;

	// ?��?���?
	private Long beingMinute;

	// 종료�?
	private Long endMinute;

	// ?��?��?�� ?���??��?��
	private String useComment;

	// ?��?��?���?
	private Integer useComplete;

	// ?��?��?��????�� 번호
	private Long styleNo;

	// ?��?��?��?�� ?��?��?��
	private String designerId;

	// ?��?��?�� ?��?��?��
	private String userId;

	private String styleName;

	private String phone;

	public Reservation() {
	}


	public Reservation(Long resNo, Long year, Long month, Long day, Long beginHour, Long endHour, Long beingMinute, Long endMinute, String useComment, Integer useComplete, Long styleNo, String designerId, String userId, String styleName, String phone) {
		this.resNo = resNo;
		this.year = year;
		this.month = month;
		this.day = day;
		this.beginHour = beginHour;
		this.endHour = endHour;
		this.beingMinute = beingMinute;
		this.endMinute = endMinute;
		this.useComment = useComment;
		this.useComplete = useComplete;
		this.styleNo = styleNo;
		this.designerId = designerId;
		this.userId = userId;
		this.styleName = styleName;
		this.phone = phone;
	}


	public Reservation(Long resNo, Long year, Long month, Long day, Long beginHour, Long endHour, Long beingMinute, Long endMinute, String useComment, Integer useComplete, Long styleNo, String designerId, String userId, String styleName) {
		this.resNo = resNo;
		this.year = year;
		this.month = month;
		this.day = day;
		this.beginHour = beginHour;
		this.endHour = endHour;
		this.beingMinute = beingMinute;
		this.endMinute = endMinute;
		this.useComment = useComment;
		this.useComplete = useComplete;
		this.styleNo = styleNo;
		this.designerId = designerId;
		this.userId = userId;
		this.styleName = styleName;
	}


	public Reservation(Long resNo, Long year, Long month, Long day, Long beginHour, Long endHour, Long beingMinute,
			Long endMinute, String useComment, Integer useComplete, Long styleNo, String designerId, String userId) {
		super();
		this.resNo = resNo;
		this.year = year;
		this.month = month;
		this.day = day;
		this.beginHour = beginHour;
		this.endHour = endHour;
		this.beingMinute = beingMinute;
		this.endMinute = endMinute;
		this.useComment = useComment;
		this.useComplete = useComplete;
		this.styleNo = styleNo;
		this.designerId = designerId;
		this.userId = userId;
	}

	public Reservation(Long year, Long month, Long day, Long beginHour, Long endHour, Long beingMinute,
			Long endMinute, String useComment, Integer useComplete, Long styleNo, String designerId, String userId) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.beginHour = beginHour;
		this.endHour = endHour;
		this.beingMinute = beingMinute;
		this.endMinute = endMinute;
		this.useComment = useComment;
		this.useComplete = useComplete;
		this.styleNo = styleNo;
		this.designerId = designerId;
		this.userId = userId;
	}


	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public Long getday() {
		return day;
	}

	public void setday(Long day) {
		this.day = day;
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

	public Long getBeingMinute() {
		return beingMinute;
	}

	public void setBeingMinute(Long beingMinute) {
		this.beingMinute = beingMinute;
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

	public String getDesignerId() {
		return designerId;
	}

	public void setDesignerId(String designerId) {
		this.designerId = designerId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStyleName() {
		return this.styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}

	@Override
	public String toString() {
		return "Reservation [resNo=" + resNo + ", year=" + year + ", month=" + month + ", beginday=" + day
				+ ", beginHour=" + beginHour + ", endHour=" + endHour + ", beingMinute=" + beingMinute + ", endMinute="
				+ endMinute + ", useComment=" + useComment + ", useComplete=" + useComplete + ", styleNo=" + styleNo
				+ ", designerId=" + designerId + ", userId=" + userId + "]";
	}

}