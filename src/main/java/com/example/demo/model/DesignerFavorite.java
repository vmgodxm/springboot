package com.example.demo.model;

public class DesignerFavorite {

	// 즐겨찾기 번호(순번)
	private Long dfavoriteNo;

	// 디자이너 아이디
	private String designerId;

	// 사용자 아이디
	private String userId;

	public DesignerFavorite() {

	}

	public DesignerFavorite(Long dfavoriteNo, String designerId, String userId) {
		super();
		this.dfavoriteNo = dfavoriteNo;
		this.designerId = designerId;
		this.userId = userId;
	}

	
	
	public Long getDfavoriteNo() {
		return dfavoriteNo;
	}

	public void setDfavoriteNo(Long dfavoriteNo) {
		this.dfavoriteNo = dfavoriteNo;
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

	@Override
	public String toString() {
		return "DesignerFavorite [dfavoriteNo=" + dfavoriteNo + ", designerId=" + designerId + ", userId=" + userId
				+ "]";
	}

}
