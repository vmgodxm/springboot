package com.example.demo.model;

public class FileStorage {

	private Long fileNo;
	
	private String userId;

	private String filePath;

	private String originFileName;

	private String storageFileName;
	
	private String thumbNailFileName;

	public FileStorage() {
		
	}
	
	public FileStorage(Long fileNo, String userId, String filePath, String originFileName, String storageFileName,
			String thumbNailFileName) {
		super();
		this.fileNo = fileNo;
		this.userId = userId;
		this.filePath = filePath;
		this.originFileName = originFileName;
		this.storageFileName = storageFileName;
		this.thumbNailFileName = thumbNailFileName;
	}
	
	

	public FileStorage(String userId, String filePath, String originFileName, String storageFileName,
			String thumbNailFileName) {
		super();
		this.userId = userId;
		this.filePath = filePath;
		this.originFileName = originFileName;
		this.storageFileName = storageFileName;
		this.thumbNailFileName = thumbNailFileName;
	}

	
	public FileStorage(String filePath, String originFileName, String storageFileName) {
		super();
		this.filePath = filePath;
		this.originFileName = originFileName;
		this.storageFileName = storageFileName;
	}

	public Long getFileNo() {
		return fileNo;
	}

	public void setFileNo(Long fileNo) {
		this.fileNo = fileNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getOriginFileName() {
		return originFileName;
	}

	public void setOriginFileName(String originFileName) {
		this.originFileName = originFileName;
	}

	public String getStorageFileName() {
		return storageFileName;
	}

	public void setStorageFileName(String storageFileName) {
		this.storageFileName = storageFileName;
	}

	public String getThumbNailFileName() {
		return thumbNailFileName;
	}

	public void setThumbNailFileName(String thumbNailFileName) {
		this.thumbNailFileName = thumbNailFileName;
	}



	@Override
	public String toString() {
		return "FileStorage [fileNo=" + fileNo + ", userId=" + userId + ", filePath=" + filePath + ", originFileName="
				+ originFileName + ", storageFileName=" + storageFileName + ", thumbNailFileName=" + thumbNailFileName
				+ "]";
	}

	
	
	
	

}