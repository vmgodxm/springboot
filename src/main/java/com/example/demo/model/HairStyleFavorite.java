package com.example.demo.model;

public class HairStyleFavorite {
	// Ï¶êÍ≤®Ï∞æÍ∏∞ Î≤àÌò∏(?àúÎ≤?)
	private Long hfavoriteNo;

	// ?îî?ûê?ù¥?Ñà ?ïÑ?ù¥?îî
	private String designerId;

	// ?Ç¨?ö©?ûê ?ïÑ?ù¥?îî
	private String userId;

	// ?ó§?ñ¥?ä§????ùº Î≤àÌò∏
	private Long styleNo;

	public HairStyleFavorite() {
	}

	public HairStyleFavorite(Long hfavoriteNo, String designerId, String userId, Long styleNo) {
		super();
		this.hfavoriteNo = hfavoriteNo;
		this.designerId = designerId;
		this.userId = userId;
		this.styleNo = styleNo;
	}

	

	public Long getHfavoriteNo() {
		return hfavoriteNo;
	}

	public void setHfavoriteNo(Long hfavoriteNo) {
		this.hfavoriteNo = hfavoriteNo;
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

	public Long getStyleNo() {
		return styleNo;
	}

	public void setStyleNo(Long styleNo) {
		this.styleNo = styleNo;
	}

	@Override
	public String toString() {
		return "HairStyleFavorite [hfavoriteNo=" + hfavoriteNo + ", designerId=" + designerId + ", userId=" + userId
				+ ", styleNo=" + styleNo + "]";
	}

}
