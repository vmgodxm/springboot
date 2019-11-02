package com.example.demo.model;

//ê´?ë¦¬ì ?…Œ?´ë¸? 
public class Admin {

	// ê´?ë¦¬ì ë²ˆí˜¸(?ˆœë²?)
	private Long adminNo;

	// ê´?ë¦¬ì ?•„?´?””
	private String adminUserId;
 
	// ë¹„ë??ë²ˆí˜¸
	private String password;
 
	// ?´ë©”ì¼
	private String email;

	// ê´?ë¦¬ì ?´ë¦?
	private String adminName; 

	// ? „?™”ë²ˆí˜¸
	private String phone; 

	// ì£¼ì†Œ
	private String address;

	public Admin() {
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