package com.example.demo.payload;

public class FileUploadResponse {
		private String fileName;
	    private String fileDownloadUri;
	    private String fileType;
	    private String fileThumbNailName;
	    private String fileStorageName;
	    
	    
	 
	    public FileUploadResponse(String fileName, String fileDownloadUri, String fileType, String fileThumbNailName,
				String fileStorageName) {
			super();
			this.fileName = fileName;
			this.fileDownloadUri = fileDownloadUri;
			this.fileType = fileType;
			this.fileThumbNailName = fileThumbNailName;
			this.fileStorageName = fileStorageName;
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



		@Override
		public String toString() {
			return "FileUploadResponse [fileName=" + fileName + ", fileDownloadUri=" + fileDownloadUri + ", fileType="
					+ fileType + ", fileThumbNailName=" + fileThumbNailName + ", fileStorageName=" + fileStorageName
					+ "]";
		}

		
}
