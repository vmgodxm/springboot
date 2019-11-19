package com.example.demo.model;


public class HairStyleListMain {

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
	
	private String thumbNailFileName;
	
	private String recommend;

	public HairStyleListMain() {
	}

	public HairStyleListMain(Long styleNo, Long gender, String styleName, Long categoryNo, Long price, Long hour,
			Long minute, String styleComment, Long fileNo, String userId, String thumbNailFileName, String recommend) {
		super();
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
		this.thumbNailFileName = thumbNailFileName;
		this.recommend = recommend;
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

	public Long getHour() {
		return hour;
	}

	public void setHour(Long hour) {
		this.hour = hour;
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

	public String getThumbNailFileName() {
		return thumbNailFileName;
	}

	public void setThumbNailFileName(String thumbNailFileName) {
		this.thumbNailFileName = thumbNailFileName;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	@Override
	public String toString() {
		return "HairStyleListMain [styleNo=" + styleNo + ", gender=" + gender + ", styleName=" + styleName
				+ ", categoryNo=" + categoryNo + ", price=" + price + ", hour=" + hour + ", minute=" + minute
				+ ", styleComment=" + styleComment + ", fileNo=" + fileNo + ", userId=" + userId
				+ ", thumbNailFileName=" + thumbNailFileName + ", recommend=" + recommend + "]";
	}

	

	
	
	
}
