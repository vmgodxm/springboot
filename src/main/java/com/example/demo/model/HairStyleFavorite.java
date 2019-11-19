package com.example.demo.model;

public class HairStyleFavorite {

	private Long hfavoriteNo;

	private String designerId;

	private String userId;
 
	private Long styleNo;

	private String styleName;

	private String styleComment;

	private Long fileNo;

	private String userName;

	private String thumbNailFileName;

	public HairStyleFavorite() {
	}


	public HairStyleFavorite(Long hfavoriteNo, String designerId, String userId, Long styleNo, String styleName, String styleComment, Long fileNo, String userName, String thumbNailFileName) {
		this.hfavoriteNo = hfavoriteNo;
		this.designerId = designerId;
		this.userId = userId;
		this.styleNo = styleNo;
		this.styleName = styleName;
		this.styleComment = styleComment;
		this.fileNo = fileNo;
		this.userName = userName;
		this.thumbNailFileName = thumbNailFileName;
	}

	public HairStyleFavorite(Long hfavoriteNo, String designerId, String userId, Long styleNo, String styleName, String styleComment, Long fileNo, String thumbNailFileName) {
		this.hfavoriteNo = hfavoriteNo;
		this.designerId = designerId;
		this.userId = userId;
		this.styleNo = styleNo;
		this.styleName = styleName;
		this.styleComment = styleComment;
		this.fileNo = fileNo;
		this.thumbNailFileName = thumbNailFileName;
	}

	public HairStyleFavorite(Long hfavoriteNo, String designerId, String userId, Long styleNo, String styleName, String styleComment) {
		this.hfavoriteNo = hfavoriteNo;
		this.designerId = designerId;
		this.userId = userId;
		this.styleNo = styleNo;
		this.styleName = styleName;
		this.styleComment = styleComment;
	}


	public HairStyleFavorite(Long hfavoriteNo, String designerId, String userId, Long styleNo) {
		super();
		this.hfavoriteNo = hfavoriteNo;
		this.designerId = designerId;
		this.userId = userId;
		this.styleNo = styleNo;
	}


	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getStyleName() {
		return this.styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}

	public String getStyleComment() {
		return this.styleComment;
	}

	public void setStyleComment(String styleComment) {
		this.styleComment = styleComment;
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
