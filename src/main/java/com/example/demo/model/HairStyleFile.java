package com.example.demo.model;

public class HairStyleFile {

	private Long styleNo;

	private Long gender;

	private String styleName;

	private Long categoryNo;

	private Long price;

	private Long hour;

	private Long minute;

	private String styleComment;

	private Long fileNo;

	private String userId;
	
	private Long recommend;

	private String thumbNailFileName;


	public HairStyleFile() {
	}


	public HairStyleFile(Long styleNo, Long gender, String styleName, Long categoryNo, Long price, Long hour, Long minute, String styleComment, Long fileNo, String userId, Long recommend, String thumbNailFileName) {
		this.styleNo = styleNo;
		this.gender = gender;
		this.styleName = styleName;
		this.categoryNo = categoryNo;
		this.price = price;
		this.hour = hour;
		this.minute = minute;
		this.styleComment = styleComment;
		this.fileNo = fileNo;
		this.userId = userId;
		this.recommend = recommend;
		this.thumbNailFileName = thumbNailFileName;
	}

	public Long getStyleNo() {
		return this.styleNo;
	}

	public void setStyleNo(Long styleNo) {
		this.styleNo = styleNo;
	}

	public Long getGender() {
		return this.gender;
	}

	public void setGender(Long gender) {
		this.gender = gender;
	}

	public String getStyleName() {
		return this.styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}

	public Long getCategoryNo() {
		return this.categoryNo;
	}

	public void setCategoryNo(Long categoryNo) {
		this.categoryNo = categoryNo;
	}

	public Long getPrice() {
		return this.price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getHour() {
		return this.hour;
	}

	public void setHour(Long hour) {
		this.hour = hour;
	}

	public Long getMinute() {
		return this.minute;
	}

	public void setMinute(Long minute) {
		this.minute = minute;
	}

	public String getStyleComment() {
		return this.styleComment;
	}

	public void setStyleComment(String styleComment) {
		this.styleComment = styleComment;
	}

	public Long getFileNo() {
		return this.fileNo;
	}

	public void setFileNo(Long fileNo) {
		this.fileNo = fileNo;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getRecommend() {
		return this.recommend;
	}

	public void setRecommend(Long recommend) {
		this.recommend = recommend;
	}

	public String getThumbNailFileName() {
		return this.thumbNailFileName;
	}

	public void setThumbNailFileName(String thumbNailFileName) {
		this.thumbNailFileName = thumbNailFileName;
	}

	public HairStyleFile styleNo(Long styleNo) {
		this.styleNo = styleNo;
		return this;
	}

	public HairStyleFile gender(Long gender) {
		this.gender = gender;
		return this;
	}

	public HairStyleFile styleName(String styleName) {
		this.styleName = styleName;
		return this;
	}

	public HairStyleFile categoryNo(Long categoryNo) {
		this.categoryNo = categoryNo;
		return this;
	}

	public HairStyleFile price(Long price) {
		this.price = price;
		return this;
	}

	public HairStyleFile hour(Long hour) {
		this.hour = hour;
		return this;
	}

	public HairStyleFile minute(Long minute) {
		this.minute = minute;
		return this;
	}

	public HairStyleFile styleComment(String styleComment) {
		this.styleComment = styleComment;
		return this;
	}

	public HairStyleFile fileNo(Long fileNo) {
		this.fileNo = fileNo;
		return this;
	}

	public HairStyleFile userId(String userId) {
		this.userId = userId;
		return this;
	}

	public HairStyleFile recommend(Long recommend) {
		this.recommend = recommend;
		return this;
	}

	public HairStyleFile thumbNailFileName(String thumbNailFileName) {
		this.thumbNailFileName = thumbNailFileName;
		return this;
	}


	@Override
	public String toString() {
		return "{" +
			" styleNo='" + getStyleNo() + "'" +
			", gender='" + getGender() + "'" +
			", styleName='" + getStyleName() + "'" +
			", categoryNo='" + getCategoryNo() + "'" +
			", price='" + getPrice() + "'" +
			", hour='" + getHour() + "'" +
			", minute='" + getMinute() + "'" +
			", styleComment='" + getStyleComment() + "'" +
			", fileNo='" + getFileNo() + "'" +
			", userId='" + getUserId() + "'" +
			", recommend='" + getRecommend() + "'" +
			", thumbNailFileName='" + getThumbNailFileName() + "'" +
			"}";
	}
	
}