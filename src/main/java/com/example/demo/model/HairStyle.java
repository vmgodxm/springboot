package com.example.demo.model;

//?ó§?ñ¥?ä§????ùº ?Öå?ù¥Î∏? 
public class HairStyle {

	// ?ó§?ñ¥?ä§????ùº Î≤àÌò∏
	private Long styleNo;

	// ?Ñ±Î≥?
	private Long gender;

	// ?ó§?ñ¥?ä§????ùº ?ù¥Î¶?
	private String styleName;

	// Ïπ¥ÌÖåÍ≥†Î¶¨ Î≤àÌò∏
	private Long categoryNo;

	// Í∞?Í≤?
	private Long price;

	// ?ãú?à†?ãúÍ∞?(?ãúÍ∞?)
	private Long beginHour;

	// ?ãú?à†?ãúÍ∞?(Î∂?)
	private Long minute;

	// ?ä§????ùº ?Ñ§Î™?
	private String styleComment;

	// ?ó§?ñ¥?ä§????ùº ?åå?ùº Î≤àÌò∏
	private Long fileNo;

	// ?Ç¨?ö©?ûê ?ïÑ?ù¥?îî
	private String userId;

	public HairStyle() {
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
