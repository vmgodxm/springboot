package com.example.demo.model;

//?��?�� ?��?��?�� ?��?���? 
public class PreCompany {

	// ?��?��?�� 번호(?���?)
	private Long preCompanyNo;

	// ?��?��?�� ?���?
	private String companyName;

	// ?��?��?�� ?���?
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