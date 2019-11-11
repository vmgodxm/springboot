package com.example.demo.model;

//사업장 테이블 
public class Company {

	// 사용자ID
	private String userId;

	// 사업자 번호
	private String businessNumber;

	// 지역번호
	private int regionNo;

	// 사업장 이름
	private String companyName;

	// 사업장 주소
	private String companyAddress;

	public Company() {

	}

	public Company(String userId, String businessNumber, int regionNo, String companyName, String companyAddress) {
		super();
		this.userId = userId;
		this.businessNumber = businessNumber;
		this.regionNo = regionNo;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBusinessNumber() {
		return businessNumber;
	}

	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
	}

	public int getRegionNo() {
		return regionNo;
	}

	public void setRegionNo(int regionNo) {
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Company [userId=" + userId + ", businessNumber=" + businessNumber + ", regionNo=" + regionNo
				+ ", companyName=" + companyName + ", companyAddress=" + companyAddress + "]";
	}
	
	



	
	
	

}