package com.example.demo.repository;

//파일 저장 테이블 
public class FileStorage {

	// 파일 번호(순번)
	private Long fileNo;

	// 파일 경로
	private String filePath;

	// 원본 파일 이름
	private String originFileName;

	// 저장 파일 이름
	private String storageFileName;

	public FileStorage() {
		// TODO Auto-generated constructor stub
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