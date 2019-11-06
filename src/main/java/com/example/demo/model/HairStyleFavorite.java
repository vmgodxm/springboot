package com.example.demo.model;

public class HairStyleFavorite {
	// 즐겨찾기 번호(?���?)
	private Long hfavoriteNo;

	// ?��?��?��?�� ?��?��?��
	private String designerId;

	// ?��?��?�� ?��?��?��
	private String userId;

	// ?��?��?��????�� 번호
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
