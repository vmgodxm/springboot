package com.example.demo.model;

//헤어스타일 테이블 
public class HairStyle {

	// 헤어스타일 번호
	private Long styleNo;

	// 성별
	private Long gender;

	// 헤어스타일 이름
	private String styleName;

	// 카테고리 번호
	private Long categoryNo;

	// 가격
	private Long price;

	// 시술시간(시간)
	private Long beginHour;

	// 시술시간(분)
	private Long minute;

	// 스타일 설명
	private String styleComment;

	// 헤어스타일 파일 번호
	private Long fileNo;

	// 사용자 아이디
	private String userId;

	public HairStyle() {
		// TODO Auto-generated constructor stub
	}

	public HairStyle(Long styleNo, Long gender, String styleName, Long categoryNo, Long price, Long beginHour,
			Long minute, String styleComment, Long fileNo, String userId) {
		super();
		this.styleNo = styleNo;
		this.gender = gender;
		this.styleName = styleName;
		this.categoryNo = categoryNo;
		this.price = price;
		this.beginHour = beginHour;
		this.minute = minute;
		this.styleComment = styleComment;
		this.fileNo = fileNo;
		this.userId = userId;
	}

	

	public Long getStyleNo() {
		return styleNo;
	}

	public void setStyleNo(Long styleNo) {
		this.styleNo = styleNo;
	}

	public Long getGender() {
		return gender;
	}

	public void setGender(Long gender) {
		this.gender = gender;
	}

	public String getStyleName() {
		return styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}

	public Long getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(Long categoryNo) {
		this.categoryNo = categoryNo;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getBeginHour() {
		return beginHour;
	}

	public void setBeginHour(Long beginHour) {
		this.beginHour = beginHour;
	}

	public Long getMinute() {
		return minute;
	}

	public void setMinute(Long minute) {
		this.minute = minute;
	}

	public String getStyleComment() {
		return styleComment;
	}

	public void setStyleComment(String styleComment) {
		this.styleComment = styleComment;
	}

	public Long getFileNo() {
		return fileNo;
	}

	public void setFileNo(Long fileNo) {
		this.fileNo = fileNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "HairStyle [styleNo=" + styleNo + ", gender=" + gender + ", styleName=" + styleName + ", categoryNo="
				+ categoryNo + ", price=" + price + ", beginHour=" + beginHour + ", minute=" + minute
				+ ", styleComment=" + styleComment + ", fileNo=" + fileNo + ", userId=" + userId + "]";
	}

}
