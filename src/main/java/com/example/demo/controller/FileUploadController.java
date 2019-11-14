package com.example.demo.controller;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.exeption.FileUploadException;
import com.example.demo.model.FileStorage;
import com.example.demo.payload.FileUploadResponse;
import com.example.demo.property.FileUploadProperties;
import com.example.demo.repository.FileRepository;
import com.example.demo.service.FileUploadDownloadService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
 
@RestController
public class FileUploadController {
    private static final Logger logger = LoggerFactory.getLogger(FileUploadController.class);
    private final Path filelocation;
    @Autowired
    private FileUploadDownloadService service;
    
    @Autowired
	private FileRepository repository;
  
    @Autowired
    public FileUploadController(FileUploadProperties prop) {
    	filelocation = Paths.get(prop.getUploadDir())
                 .toAbsolutePath().normalize();  //서버의 절대경로
    	//.normalize();
	}
    
    @PostMapping("/uploadFile")
    public FileUploadResponse uploadFile( MultipartFile file, String userId) throws Exception   {
    //public FileUploadResponse uploadFile(@RequestParam("file") MultipartFile file) {
        String fileName = service.storeFile(file);
        
        String originalfileName = StringUtils.cleanPath(file.getOriginalFilename());
        //파일 경로 요청
        String fileStorageName = filelocation.toString();
        String fileThumbNailName = fileName.replace(fileName.substring(fileName.lastIndexOf(".")), "_th.JPG") ; //확장자 이름 변경 - 실제 변경은 섬네일 imageio가 변경
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                                .path("/downloadFile/")
                                .path(fileName)
                                .toUriString();
        
       
        
        
		String filePath = fileStorageName;
		String originFileName = originalfileName;
		String storageFileName = fileName;
		String thumbNailFileName = fileThumbNailName;
		FileStorage files =new FileStorage(userId,filePath,originFileName,storageFileName,thumbNailFileName);
        
		try {
			repository.insertFile(files);
		} catch (Exception e) {
			throw new FileUploadException("파일목록을 데이터베이스에 생성하지 못했습니다.", e);
			//e.printStackTrace();
		}
		Long fileNo = repository.getFileNo(storageFileName);
        
        
		return new FileUploadResponse(fileName, fileDownloadUri, file.getContentType(), fileThumbNailName ,fileStorageName, originalfileName ,fileNo);
    }
    
    @PostMapping("/uploadMultipleFiles")
    public List<FileUploadResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files,String userId )  {
        return Arrays.asList(files)
                .stream()
                .map(file -> {
					try {
						return uploadFile(file,userId);
					} catch (Exception e) {
						e.printStackTrace();
					}
					return null;
				})
                .collect(Collectors.toList());
    }
    
    
    
    
    
    @GetMapping("/downloadFile/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request){
         // Load file as Resource
        Resource resource = service.loadFileAsResource(fileName);
 
        // Try to determine file's content type
        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
            logger.info("Could not determine file type.");
        }
 
        // Fallback to the default content type if type could not be determined
        if(contentType == null) {
            contentType = "application/octet-stream";
        }
 
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
}
