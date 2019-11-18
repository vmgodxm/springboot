package com.example.demo.model;

public class UserRegistJoinFile {

	private Long userNo;
	private String userId;
	private String userName;
	private Long gender;
	private String phone;
	private String nickName;
	private Long regionNo;
	private Long fileNo;
	private Long userLevel;
	private String filePath;
	private String originFileName;
	private String storageFileName;
	private String thumbNailFileName;

	
	public UserRegistJoinFile() { }


	public UserRegistJoinFile(Long userNo, String userId, String userName, Long gender, String phone, String nickName,
			Long regionNo, Long fileNo, Long userLevel, String filePath, String originFileName, String storageFileName,
			String thumbNailFileName) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userName = userName;
		this.gender = gender;
		this.phone = phone;
		this.nickName = nickName;
		this.regionNo = regionNo;
		this.fileNo = fileNo;
		this.userLevel = userLevel;
		this.filePath = filePath;
		this.originFileName = originFileName;
		this.storageFileName = storageFileName;
		this.thumbNailFileName = thumbNailFileName;
	}


	/**
	 * @return the userNo
	 */
	public Long getUserNo() {
		return userNo;
	}


	/**
	 * @param userNo the userNo to set
	 */
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}


	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}


	/**
	 * @return the gender
	 */
	public Long getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(Long gender) {
		this.gender = gender;
	}


	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}


	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}


	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}


	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	/**
	 * @return the regionNo
	 */
	public Long getRegionNo() {
		return regionNo;
	}


	/**
	 * @param regionNo the regionNo to set
	 */
	public void setRegionNo(Long regionNo) {
		this.regionNo = regionNo;
	}


	/**
	 * @return the fileNo
	 */
	public Long getFileNo() {
		return fileNo;
	}


	/**
	 * @param fileNo the fileNo to set
	 */
	public void setFileNo(Long fileNo) {
		this.fileNo = fileNo;
	}


	/**
	 * @return the userLevel
	 */
	public Long getUserLevel() {
		return userLevel;
	}


	/**
	 * @param userLevel the userLevel to set
	 */
	public void setUserLevel(Long userLevel) {
		this.userLevel = userLevel;
	}


	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}


	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


	/**
	 * @return the originFileName
	 */
	public String getOriginFileName() {
		return originFileName;
	}


	/**
	 * @param originFileName the originFileName to set
	 */
	public void setOriginFileName(String originFileName) {
		this.originFileName = originFileName;
	}


	/**
	 * @return the storageFileName
	 */
	public String getStorageFileName() {
		return storageFileName;
	}


	/**
	 * @param storageFileName the storageFileName to set
	 */
	public void setStorageFileName(String storageFileName) {
		this.storageFileName = storageFileName;
	}


	/**
	 * @return the thumbNailFileName
	 */
	public String getThumbNailFileName() {
		return thumbNailFileName;
	}


	/**
	 * @param thumbNailFileName the thumbNailFileName to set
	 */
	public void setThumbNailFileName(String thumbNailFileName) {
		this.thumbNailFileName = thumbNailFileName;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserRegistJoinFile [userNo=" + userNo + ", userId=" + userId + ", userName=" + userName + ", gender="
				+ gender + ", phone=" + phone + ", nickName=" + nickName + ", regionNo=" + regionNo + ", fileNo="
				+ fileNo + ", userLevel=" + userLevel + ", filePath=" + filePath + ", originFileName=" + originFileName
				+ ", storageFileName=" + storageFileName + ", thumbNailFileName=" + thumbNailFileName + "]";
	}
	
	
	
	
}