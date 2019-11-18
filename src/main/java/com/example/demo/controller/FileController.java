package com.example.demo.controller;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.example.demo.exeption.FileUploadException;
import com.example.demo.model.DeleteFileInfo;
import com.example.demo.model.FileStorage;
import com.example.demo.property.FileUploadProperties;
import com.example.demo.repository.interfaces.IFileRepository;
import com.example.demo.service.FileUploadDownloadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class FileController {

	@Autowired
	private IFileRepository repository;

	@Autowired
	private FileUploadDownloadService service;

	private final Path filelocation;

	@Autowired
	public FileController(FileUploadProperties prop) {
		filelocation = Paths.get(prop.getUploadDir())
				// .toAbsolutePath().normalize(); //서버의 절대경로
				.normalize();
	}

	@GetMapping(path = "/file/{fileNo}")
	public FileStorage getFileInfo(@PathVariable int fileNo) throws Exception {
		FileStorage file = repository.getFile(new Long(fileNo));
		return file;
	}

	// @GetMapping(path = "/file/{fileName}")
	// public Long getFileInfo(@PathVariable String storageFileName ) throws
	// Exception {
	// return repository.getFileNo(storageFileName);
	// }

	@PostMapping(path = "/fileUpload")
	public int insertFile(FileStorage files) throws Exception {
		return repository.insertFile(files);
	}

	@DeleteMapping(path = "/fileDelete/{fileNo}")
	public int deleteFile(@PathVariable Long fileNo) throws Exception {
		return repository.deleteFile(fileNo);
	}

	@DeleteMapping(path = "/fileDeleteByUserId/{userId}")
	public int deleteFile(@PathVariable String userId) throws Exception {
		return repository.deleteFileByUserID(userId);
	}

	@PutMapping(path = "/file/{fileNo}")
	public int updateFile(@PathVariable Long fileNo, MultipartFile file, String userId) throws Exception {

		int retVal = 0;

		List<DeleteFileInfo> deleteFilelist = repository.getDeleteFileListByFileNo(fileNo);
		boolean result = service.deleteFile(deleteFilelist);
		if (result) {
			String fileName = service.storeFile(file);
			String originalfileName = StringUtils.cleanPath(file.getOriginalFilename());

			// 파일 경로 요청
			String fileStorageName = filelocation.toString();
			//확장자 이름 변경 - 실제 변경은 섬네일 imageio가 변경
			String fileThumbNailName = fileName.replace(fileName.substring(fileName.lastIndexOf(".")), "_th.JPG"); 
			FileStorage fileStorage = new FileStorage(fileNo, userId, fileStorageName, originalfileName, fileName, fileThumbNailName);

			try {
				retVal = repository.updateFile(fileStorage);
			} catch (Exception e) {
				throw new FileUploadException("파일목록을 데이터베이스에 생성하지 못했습니다.", e);
				// e.printStackTrace();
			}
		}

		return retVal; // repository.updateFile(file);
	}

	@DeleteMapping(path = "/fileDeleteStorageByuserId/{userId}")
	public boolean getDeleteFileListByUserId(@PathVariable String userId) throws Exception {
		List<DeleteFileInfo> deleteFilelist = repository.getDeleteFileListByUserId(userId);
		boolean result = service.deleteFile(deleteFilelist);

		return result;
	}

	@DeleteMapping(path = "/fileDeleteStorageByfileNo/{fileNo}")
	public boolean getDeleteFileListByFileNo(@PathVariable Long fileNo) throws Exception {
		List<DeleteFileInfo> deleteFilelist = repository.getDeleteFileListByFileNo(fileNo);
		boolean result = service.deleteFile(deleteFilelist);

		return result;
	}

}
