package com.example.demo.model;

//?åå?ùº ????û• ?Öå?ù¥Î∏? 
public class FileStorage {

	// ?åå?ùº Î≤àÌò∏(?àúÎ≤?)
	private Long fileNo;

	// ?åå?ùº Í≤ΩÎ°ú
	private String filePath;

	// ?õêÎ≥? ?åå?ùº ?ù¥Î¶?
	private String originFileName;

	// ????û• ?åå?ùº ?ù¥Î¶?
	private String storageFileName;

	public FileStorage() {
	}

	public FileStorage(Long fileNo, String filePath, String originFileName, String storageFileName) {
		super();
		this.fileNo = fileNo;
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

	@Override
	public String toString() {
		return "FileStorage [fileNo=" + fileNo + ", filePath=" + filePath + ", originFileName=" + originFileName
				+ ", storageFileName=" + storageFileName + "]";
	}

	
	

}