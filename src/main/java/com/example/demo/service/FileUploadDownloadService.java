package com.example.demo.service;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.exeption.FileDownloadException;
import com.example.demo.exeption.FileUploadException;
import com.example.demo.model.DeleteFileInfo;
import com.example.demo.property.FileUploadProperties;




@Service
public class FileUploadDownloadService {

	private final Path fileLocation;
    
    @Autowired
    public FileUploadDownloadService(FileUploadProperties prop)   {
        this.fileLocation = Paths.get(prop.getUploadDir())
                .toAbsolutePath().normalize();
        
        try {
            Files.createDirectories(this.fileLocation);
        }catch(Exception e) {
            throw new FileUploadException("파일을 업로드할 디렉토리를 생성하지 못했습니다.", e);
        }
    }
    
    public String storeFile(MultipartFile file)   {
        String originalfileName = StringUtils.cleanPath(file.getOriginalFilename());
        	
        String frontFileName = RandomStringUtils.randomAlphanumeric(16);
        String extFileName = FilenameUtils.getExtension(originalfileName).toLowerCase();
        String fileName =  frontFileName + "." + extFileName ;
        //파일명을 16자리 랜덤알파뱃과 .확장자소문자 를 조합해 만든다.
        try {
            // 파일명에 부적합 문자가 있는지 확인한다.
            if(fileName.contains(".."))
                throw new FileUploadException("파일명에 부적합 문자가 포함되어 있습니다. " + fileName);
            if(!(file.getContentType().toString().contains("image"))){
            	throw new FileUploadException("파일이 이미지가 아닙니다");
            }
            
            Path targetLocation = this.fileLocation.resolve(fileName);
            
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
            
            makeThumbnail(targetLocation.toString(), frontFileName, extFileName);
            
            
            
            
        }catch(Exception e) {
            throw new FileUploadException("["+fileName+"] 파일 업로드에 실패하였습니다. 다시 시도하십시오.",e);
        }
        return fileName; 
    }
    
    private void makeThumbnail(String filePath, String frontFileName, String extFileName) throws IOException {

    	BufferedImage srcImg = ImageIO.read(new File(filePath));
    	
    	
    	
    	String path = fileLocation.toString();
    	
    	
    	
    	String thumbName = path +"/"+ frontFileName + "_th.JPG";
    	
    	File thumbFile = new File(thumbName);

    	ImageIO.write(srcImg, "JPG", thumbFile);
    	

	}
    
    
    public Resource loadFileAsResource(String fileName) {
        try {
            Path filePath = this.fileLocation.resolve(fileName).normalize();
            org.springframework.core.io.Resource resource = new UrlResource(filePath.toUri());
            
            if(resource.exists()) {
                return resource;
            }else {
                throw new FileDownloadException(fileName + " 파일을 찾을 수 없습니다.");
            }
        }catch(MalformedURLException e) {
            throw new FileDownloadException(fileName + " 파일을 찾을 수 없습니다.", e);
        }
    }
    
    
    public boolean deleteFile(List<DeleteFileInfo> deleteFilelist) {
    	String path = fileLocation.toString();
    	
    	boolean isSuccess = true;
    	try {
    		
	    	for (DeleteFileInfo deleteFileInfo : deleteFilelist) {
	    		
	    		String pathName1 =path +"\\"+ deleteFileInfo.getStorageFileName();
	    		File file1 = new File(pathName1);
	    		if(file1.exists()) {
	        		file1.delete();
	        	}
	    		String pathName2 =path +"\\"+ deleteFileInfo.getThumbnailFileName();
	    		File file2 = new File(pathName2);
	    		if(file2.exists()) {
	        		file2.delete();
	        	}
			}
    	}

    	catch(Exception e){
    		isSuccess = false;
    	}
    	return isSuccess;
    	
    }
    
//    public static boolean deleteFile(List fileList) {
//    	
//    	for (int i = 0; i < fileList.; i++) {
//			
//		}
//    	
//		
//    	return true;
//	}
    

    /** * 썸네일을 생성합니다. * 250 x 150 크기의 썸네일을 만듭니다. */ 

    
    
    
    
}
