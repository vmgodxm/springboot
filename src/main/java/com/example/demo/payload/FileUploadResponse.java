package com.example.demo.payload;

public class FileUploadResponse {
		private String fileName;
	    private String fileDownloadUri;
	    private String fileType;
	    private String fileThumbNailName;
	    private String fileStorageName;
	    private String originalfileName;
	    
	 public FileUploadResponse() {
	}

	public FileUploadResponse(String fileName, String fileDownloadUri, String fileType, String fileThumbNailName,
			String fileStorageName, String originalfileName) {
		super();
		this.fileName = fileName;
		this.fileDownloadUri = fileDownloadUri;
		this.fileType = fileType;
		this.fileThumbNailName = fileThumbNailName;
		this.fileStorageName = fileStorageName;
		this.originalfileName = originalfileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileDownloadUri() {
		return fileDownloadUri;
	}

	public void setFileDownloadUri(String fileDownloadUri) {
		this.fileDownloadUri = fileDownloadUri;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileThumbNailName() {
		return fileThumbNailName;
	}

	public void setFileThumbNailName(String fileThumbNailName) {
		this.fileThumbNailName = fileThumbNailName;
	}

	public String getFileStorageName() {
		return fileStorageName;
	}

	public void setFileStorageName(String fileStorageName) {
		this.fileStorageName = fileStorageName;
	}

	public String getOriginalfileName() {
		return originalfileName;
	}

	public void setOriginalfileName(String originalfileName) {
		this.originalfileName = originalfileName;
	}

	@Override
	public String toString() {
		return "FileUploadResponse [fileName=" + fileName + ", fileDownloadUri=" + fileDownloadUri + ", fileType="
				+ fileType + ", fileThumbNailName=" + fileThumbNailName + ", fileStorageName=" + fileStorageName
				+ ", originalfileName=" + originalfileName + "]";
	}
	 
	
		
}
