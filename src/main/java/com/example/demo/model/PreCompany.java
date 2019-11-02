package com.example.demo.model;

//?΄?  ?¬??₯ ??΄λΈ? 
public class PreCompany {

	// ?¬??₯ λ²νΈ(?λ²?)
	private Long preCompanyNo;

	// ?¬??₯ ?΄λ¦?
	private String companyName;

	// ?¬?©? ?΄λ¦?
	private String userId;

	public PreCompany() {
	}

	public PreCompany(Long preCompanyNo, String companyName, String userId) {
		super();
		this.preCompanyNo = preCompanyNo;
		this.companyName = companyName;
		this.userId = userId;
	}

	public Long getPreCompanyNo() {
		return preCompanyNo;
	}

	public void setPreCompanyNo(Long preCompanyNo) {
		this.preCompanyNo = preCompanyNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "PreCompany [preCompanyNo=" + preCompanyNo + ", companyName=" + companyName + ", userId=" + userId + "]";
	}

}