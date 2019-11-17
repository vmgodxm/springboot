package com.example.demo.model;

public class DesignerFavorite {

	// 즐겨찾기 번호(순번)
	private Long dfavoriteNo;

	// 디자이너 아이디
	private String designerId;

	// 사용자 아이디
	private String userId;

	private String userName;

	private Long fileNo;

	private String thumbNailFileName;



	public DesignerFavorite() {

	}

	public DesignerFavorite(Long dfavoriteNo, String designerId, String userId) {
		super();
		this.dfavoriteNo = dfavoriteNo;
		this.designerId = designerId;
		this.userId = userId;
	}


	public DesignerFavorite(Long dfavoriteNo, String designerId, String userId, String userName) {
		this.dfavoriteNo = dfavoriteNo;
		this.designerId = designerId;
		this.userId = userId;
		this.userName = userName;
	}

	public DesignerFavorite(Long dfavoriteNo, String designerId, String userId, String userName, Long fileNo, String thumbNailFileName) {
		this.dfavoriteNo = dfavoriteNo;
		this.designerId = designerId;
		this.userId = userId;
		this.userName = userName;
		this.fileNo = fileNo;
		this.thumbNailFileName = thumbNailFileName;
	}

	

	public Long getFileNo() {
		return this.fileNo;
	}

	public void setFileNo(Long fileNo) {
		this.fileNo = fileNo;
	}

	public String getThumbNailFileName() {
		return this.thumbNailFileName;
	}

	public void setThumbNailFileName(String thumbNailFileName) {
		this.thumbNailFileName = thumbNailFileName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
