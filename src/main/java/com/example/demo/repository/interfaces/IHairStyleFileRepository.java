package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.HairStyleFile;

public interface IHairStyleFileRepository {
	List<HairStyleFile> getHairStyleList() throws Exception;
}