package com.example.demo.model;

import java.util.Date;

//?´?š© ?›„ê¸? ?…Œ?´ë¸? 
public class Review {

	// ?´?š©?›„ê¸? ë²ˆí˜¸(?ˆœë²?)
	private Long replyNo;

	// ? œëª?
	private String title;

	// ?‚´?š©
	private String useContent;

	// ?‘?„±?‹œê°?
	private Date writeTime;

	// ?””??´?„ˆ ?•„?´?””
	private String designerId;

	// ?‚¬?š©? ?•„?´?””
	private String userId;

	// ?—¤?–´?Š¤????¼ ë²ˆí˜¸
	private Long styleNo;

	// ?˜ˆ?•½ë²ˆí˜¸
	private Long resNo;
	
	public Review() {
	}

	public Review(Long replyNo, String title, String useContent, Date writeTime, String designerId, String userId,
			Long styleNo, Long resNo) {
		super();
		this.replyNo = replyNo;
		this.title = title;
		this.useContent = useContent;
		this.writeTime = writeTime;
		this.designerId = designerId;
		this.userId = userId;
		this.styleNo = styleNo;
		this.resNo = resNo;
	}

	public Long getReplyNo() {
		return replyNo;
	}

	public void setReplyNo(Long replyNo) {
		this.replyNo = replyNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUseContent() {
		return useContent;
	}

	public void setUseContent(String useContent) {
		this.useContent = useContent;
	}

	public Date getWriteTime() {
		return writeTime;
	}

	public void setWriteTime(Date writeTime) {
		this.writeTime = writeTime;
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

	public Long getResNo() {
		return resNo;
	}

	public void setResNo(Long resNo) {
		this.resNo = resNo;
	}

	@Override
	public String toString() {
		return "Review [replyNo=" + replyNo + ", title=" + title + ", useContent=" + useContent + ", writeTime="
				+ writeTime + ", designerId=" + designerId + ", userId=" + userId + ", styleNo=" + styleNo + ", resNo="
				+ resNo + "]";
	}
	
	
}