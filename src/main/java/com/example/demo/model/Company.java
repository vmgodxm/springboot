package com.example.demo.model;

//사업장 테이블 
public class Company {

	// 사업자 번호
	private String businessNumber;

	// 지역번호
	private String regionNo;

	// 사업장 이름
	private String companyName;

	// 사업장 주소
	private String companyAddress;

	public Company() {
	}

	public Company(String businessNumber, String regionNo, String companyName, String companyAddress) {
		super();
		this.businessNumber = businessNumber;
		this.regionNo = regionNo;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
	}
	

	public Company(String businessNumber, String companyName) {
		super();
		this.businessNumber = businessNumber;
		this.companyName = companyName;
	}

	public String getBusinessNumber() {
		return businessNumber;
	}

	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
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

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	@Override
	public String toString() {
		return "Company [businessNumber=" + businessNumber + ", regionNo=" + regionNo + ", companyName=" + companyName
				+ ", companyAddress=" + companyAddress + "]";
	}

	
	

}