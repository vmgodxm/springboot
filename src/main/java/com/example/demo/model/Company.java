package com.example.demo.model;

//사업장 테이블 
public class Company {

	// 사업자 번호
	private Long companyNo;

	// 지역번호
	private String regionNo;

	// 사업장 이름
	private String companyName;

	// 사업장 주소
	private String companyAddress;

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(Long companyNo, String regionNo, String companyName, String companyAddress) {
		super();
		this.companyNo = companyNo;
		this.regionNo = regionNo;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public Long getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(Long companyNo) {
		this.companyNo = companyNo;
	}

	public String getRegionNo() {
		return regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Company [companyNo=" + companyNo + ", regionNo=" + regionNo + ", companyName=" + companyName
				+ ", companyAddress=" + companyAddress + "]";
	}

}