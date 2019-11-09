package com.example.demo.payload;

public class FileUploadResponse {
	 private String fileName;
	    private String fileDownloadUri;
	    private String fileType;
	    private String fileThumbNailName;
	    
	    public FileUploadResponse(String fileName, String fileDownloadUri, String fileType, String fileThumbNailName) {
	        this.fileName = fileName;
	        this.fileDownloadUri = fileDownloadUri;
	        this.fileType = fileType;
	        this.fileThumbNailName = fileThumbNailName;
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
	 
	    public String getfileThumbNailName() {
	        return fileThumbNailName;
	    }
	 
	    public void setfileThumbNailName(String fileThumbNailName) {
	        this.fileThumbNailName = fileThumbNailName;
	    }
}
