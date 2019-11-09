package com.example.demo.model;

public class CompanyBusinessNo {
	
	//사용자아이디
	private String userId;
	//전사업장
	private PreCompany preCompany;
	//사업자번호
	private String businessNumber;
	//사업장
	private Company company;
	//사용자
	private UserRegist userRegist;
	
	public CompanyBusinessNo() {
		// TODO Auto-generated constructor stub
	}

	public CompanyBusinessNo(String userId, PreCompany preCompany, String businessNumber, Company company,
			UserRegist userRegist) {
		super();
		this.userId = userId;
		this.preCompany = preCompany;
		this.businessNumber = businessNumber;
		this.company = company;
		this.userRegist = userRegist;
	}

//	public CompanyBusinessNo(String userId) {
//		super();
//		this.userId = userId;
//	}

	public CompanyBusinessNo(PreCompany preCompany) {
		super();
		this.preCompany = preCompany;
	}

//	public CompanyBusinessNo(String businessNumber) {
//		super();
//		this.businessNumber = businessNumber;
//	}

	public CompanyBusinessNo(Company company) {
		super();
		this.company = company;
	}

	public CompanyBusinessNo(UserRegist userRegist) {
		super();
		this.userRegist = userRegist;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public PreCompany getPreCompany() {
		return preCompany;
	}

	public void setPreCompany(PreCompany preCompany) {
		this.preCompany = preCompany;
	}

	public String getBusinessNumber() {
		return businessNumber;
	}

	public void setBusinessNumber(String businessNumber) {
		this.businessNumber = businessNumber;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public UserRegist getUserRegist() {
		return userRegist;
	}

	public void setUserRegist(UserRegist userRegist) {
		this.userRegist = userRegist;
	}

	@Override
	public String toString() {
		return "CompanyBusinessNo [userId=" + userId + ", preCompany=" + preCompany + ", businessNumber="
				+ businessNumber + ", company=" + company + ", userRegist=" + userRegist + "]";
	}
	

}
