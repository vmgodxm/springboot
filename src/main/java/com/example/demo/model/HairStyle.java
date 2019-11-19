package com.example.demo.model;

public class HairStyle {

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

	public HairStyle() {
	}

	public HairStyle(Long styleNo, Long gender, String styleName, Long categoryNo, Long price, Long hour, Long minute,
			String styleComment, Long fileNo, String userId) {
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
	}

	public HairStyle(Long gender, String styleName, Long categoryNo, Long price, Long hour, Long minute,
			String styleComment, Long fileNo, String userId) {
		super();
		this.gender = gender;
		this.styleName = styleName;
		this.categoryNo = categoryNo;
		this.price = price;
		this.hour = hour;
		this.minute = minute;
		this.styleComment = styleComment;
		this.fileNo = fileNo;
		this.userId = userId;
	}
	
	
	
	public HairStyle(Long styleNo, Long gender, String styleName, Long categoryNo, Long price, Long hour, Long minute,
			String styleComment, Long fileNo, String userId, Long recommend) {
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
		this.recommend = recommend;
	}
	
	
	/**
	 * @return the styleNo
	 */
	public Long getStyleNo() {
		return styleNo;
	}

	/**
	 * @param styleNo the styleNo to set
	 */
	public void setStyleNo(Long styleNo) {
		this.styleNo = styleNo;
	}

	/**
	 * @return the gender
	 */
	public Long getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(Long gender) {
		this.gender = gender;
	}

	/**
	 * @return the styleName
	 */
	public String getStyleName() {
		return styleName;
	}

	/**
	 * @param styleName the styleName to set
	 */
	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}

	/**
	 * @return the categoryNo
	 */
	public Long getCategoryNo() {
		return categoryNo;
	}

	/**
	 * @param categoryNo the categoryNo to set
	 */
	public void setCategoryNo(Long categoryNo) {
		this.categoryNo = categoryNo;
	}

	/**
	 * @return the price
	 */
	public Long getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Long price) {
		this.price = price;
	}

	/**
	 * @return the hour
	 */
	public Long getHour() {
		return hour;
	}

	/**
	 * @param hour the hour to set
	 */
	public void setHour(Long hour) {
		this.hour = hour;
	}

	/**
	 * @return the minute
	 */
	public Long getMinute() {
		return minute;
	}

	/**
	 * @param minute the minute to set
	 */
	public void setMinute(Long minute) {
		this.minute = minute;
	}

	/**
	 * @return the styleComment
	 */
	public String getStyleComment() {
		return styleComment;
	}

	/**
	 * @param styleComment the styleComment to set
	 */
	public void setStyleComment(String styleComment) {
		this.styleComment = styleComment;
	}

	/**
	 * @return the fileNo
	 */
	public Long getFileNo() {
		return fileNo;
	}

	/**
	 * @param fileNo the fileNo to set
	 */
	public void setFileNo(Long fileNo) {
		this.fileNo = fileNo;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * @return the recommend
	 */
	public Long getRecommend() {
		return recommend;
	}

	/**
	 * @param recommend the recommend to set
	 */
	public void setRecommend(Long recommend) {
		this.recommend = recommend;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HairStyle [styleNo=" + styleNo + ", gender=" + gender + ", styleName=" + styleName + ", categoryNo="
				+ categoryNo + ", price=" + price + ", hour=" + hour + ", minute=" + minute + ", styleComment="
				+ styleComment + ", fileNo=" + fileNo + ", userId=" + userId + ", recommend=" + recommend + "]";
	}

	
	
}
