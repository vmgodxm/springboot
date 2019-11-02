package com.example.demo.repository;

//이전 사업장 테이블 
public class PreCompany {

	// 사업장 번호(순번)
	private Long preCompanyNo;

	// 사업장 이름
	private String companyName;

	// 사용자 이름
	private String userId;

	public PreCompany() {
		// TODO Auto-generated constructor stub
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