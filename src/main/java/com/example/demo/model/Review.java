package com.example.demo.model;

import java.util.Date;

//이용 후기 테이블 
public class Review {

	// 이용후기 번호(순번)
	private Long replyNo;

	// 제목
	private String title;

	// 내용
	private String useContent;

	// 작성시간
	private Date writeTime;

	// 디자이너 아이디
	private String designerId;

	// 사용자 아이디
	private String userId;

	// 헤어스타일 번호
	private Long styleNo;

	// 예약번호
	private Long resNo;
	
	public Review() {
		// TODO Auto-generated constructor stub
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