package com.example.demo.model;

public class UserRegist {

	private Long userNo;
	private String userId;
	private String userName;
	private Long gender;
	private String phone;
	private String nickName;
	private Long regionNo;
	private Long fileNo;
	private Long userLevel;
	
	
	public UserRegist() { }
	
	public UserRegist(String userId, String userName, Long gender, String phone, String nickName, Long userLevel) {
		this.userId = userId;
		this.userName = userName;
		this.gender = gender;
		this.phone = phone;
		this.nickName = nickName;
		this.userLevel = userLevel;
	}
	
	public UserRegist(String userId, String userName, Long gender, String phone,
			String nickName, Long regionNo, Long fileNo, Long userLevel) {
		this.userId = userId;
		this.userName = userName;
		this.gender = gender;
		this.phone = phone;
		this.nickName = nickName;
		this.regionNo = regionNo;
		this.fileNo = fileNo;
		this.userLevel = userLevel;
	}
	
	public UserRegist(Long userNo, String userId, String userName, Long gender, String phone,
			String nickName, Long regionNo, Long fileNo, Long userLevel) {
		this.userNo = userNo;
		this.userId = userId;
		this.userName = userName;
		this.gender = gender;
		this.phone = phone;
		this.nickName = nickName;
		this.regionNo = regionNo;
		this.fileNo = fileNo;
		this.userLevel = userLevel;
	}

	public Long getUserNo() {
		return userNo;
	}


	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Long getGender() {
		return gender;
	}


	public void setGender(Long gender) {
		this.gender = gender;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}



	public Long getRegionNo() {
		return regionNo;
	}


	public void setRegionNo(Long regionNo) {
		this.regionNo = regionNo;
	}


	public Long getFileNo() {
		return fileNo;
	}


	public void setFileNo(Long fileNo) {
		this.fileNo = fileNo;
	}


	public Long getUserLevel() {
		return userLevel;
	}


	public void setUserLevel(Long userLevel) {
		this.userLevel = userLevel;
	}


	@Override
	public String toString() {
		return "UserRegist [userNo=" + userNo + ", userId=" + userId + ", userName=" + userName + ", gender=" + gender
				+ ", phone=" + phone + ", nickName=" + nickName + ", regionNo="
				+ regionNo + ", fileNo=" + fileNo + ", userLevel=" + userLevel + "]";
	}
	
	
}