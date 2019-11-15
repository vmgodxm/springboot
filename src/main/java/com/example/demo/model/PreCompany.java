package com.example.demo.model;

//이전 사업자 테이블 
public class PreCompany {

	// 번호
	private int preComNo;

	// 사업장이름
	private String companyName;

	// 사용자아이디
	private String userId;

	//지역번호
	private int regionNo;
	
	//사업장주소
	private String companyAddress;
	
	public PreCompany() {
	}

	public PreCompany(int preCompanyNo, String companyName, String userId, int regionNo, String companyAddress) {
		super();
		this.preComNo = preCompanyNo;
		this.companyName = companyName;
		this.userId = userId;
		this.regionNo = regionNo;
		this.companyAddress = companyAddress;
	}
	
	/*
	public PreCompany(String companyName, int regionNo, String companyAddress) {
		super();
		this.companyName = companyName;
		this.regionNo = regionNo;
		this.companyAddress = companyAddress;
	}
	*/
	/**
	 * @return the preCompanyNo
	 */
	public int getPreCompanyNo() {
		return preComNo;
	}

	/**
	 * @param preCompanyNo the preCompanyNo to set
	 */
	public void setPreCompanyNo(int preCompanyNo) {
		this.preComNo = preCompanyNo;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the regionNo
	 */
	public int getRegionNo() {
		return regionNo;
	}

	/**
	 * @param regionNo the regionNo to set
	 */
	public void setRegionNo(int regionNo) {
		this.regionNo = regionNo;
	}

	/**
	 * @return the companyAddress
	 */
	public String getCompanyAddress() {
		return companyAddress;
	}

	/**
	 * @param companyAddress the companyAddress to set
	 */
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PreCompany [preCompanyNo=" + preComNo + ", companyName=" + companyName + ", userId=" + userId
				+ ", regionNo=" + regionNo + ", companyAddress=" + companyAddress + "]";
	}
	
	

	

}