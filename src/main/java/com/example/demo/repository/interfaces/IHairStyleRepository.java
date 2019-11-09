package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.HairStyle;

public interface IHairStyleRepository {

	List<HairStyle> getHairStyleList() throws Exception;
	HairStyle getHairStyle(Long styleNo) throws Exception;
	int insertHairStyle(HairStyle hairStyle) throws Exception;
	int updateHairStyle(Long styleNo) throws Exception;
	int deleteHairStyle(Long styleNo) throws Exception;
}