package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.HairStyleFile;

public interface IHairStyleFileRepository {
	List<HairStyleFile> getHairStyleFileList() throws Exception;
	
}