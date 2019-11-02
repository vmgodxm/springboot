package com.example.demo.repository;

//관리자 테이블 
public class Admin {

	// 관리자 번호(순번)
	private Long adminNo;

	// 관리자 아이디
	private String adminUserId;
 
	// 비밀번호
	private String password;
 
	// 이메일
	private String email;

	// 관리자 이름
	private String adminName; 

	// 전화번호
	private String phone; 

	// 주소
	private String address;

	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(Long adminNo, String adminUserId, String password, String email, String adminName, String phone,
			String address) {
		super();
		this.adminNo = adminNo;
		this.adminUserId = adminUserId;
		this.password = password;
		this.email = email;
		this.adminName = adminName;
		this.phone = phone;
		this.address = address;
	}

	public Admin(String adminUserId, String password, String email, String adminName, String phone, String address) {
		super();
		this.adminUserId = adminUserId;
		this.password = password;
		this.email = email;
		this.adminName = adminName;
		this.phone = phone;
		this.address = address;
	}

	public Long getAdminNo() {
		return adminNo;
	}

	public void setAdminNo(Long adminNo) {
		this.adminNo = adminNo;
	}

	public String getAdminUserId() {
		return adminUserId;
	}

	public void setAdminUserId(String adminUserId) {
		this.adminUserId = adminUserId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Admin [adminNo=" + adminNo + ", adminUserId=" + adminUserId + ", password=" + password + ", email="
				+ email + ", adminName=" + adminName + ", phone=" + phone + ", address=" + address + "]<br/>";
	}

	

}