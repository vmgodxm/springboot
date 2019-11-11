package com.example.demo.model;

public class DeleteFileInfo {

	private String storageFileName;
	private String thumbnailFileName;
	
	public DeleteFileInfo() {
		
	}

	public DeleteFileInfo(String storageFileName, String thumbnailFileName) {
		super();
		this.storageFileName = storageFileName;
		this.thumbnailFileName = thumbnailFileName;
	}

	public String getStorageFileName() {
		return storageFileName;
	}

	public void setStorageFileName(String storageFileName) {
		this.storageFileName = storageFileName;
	}

	public String getThumbnailFileName() {
		return thumbnailFileName;
	}

	public void setThumbnailFileName(String thumbnailFileName) {
		this.thumbnailFileName = thumbnailFileName;
	}

	@Override
	public String toString() {
		return "DeleteFileInfo [storageFileName=" + storageFileName + ", thumbnailFileName=" + thumbnailFileName + "]";
	}

	
	

	
	
}
