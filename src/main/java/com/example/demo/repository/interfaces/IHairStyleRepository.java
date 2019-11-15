package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.HairStyle;

public interface IHairStyleRepository {

	List<HairStyle> getHairStyleList() throws Exception;
	HairStyle getHairStyle(Long styleNo) throws Exception;
	HairStyle getHairStyle(HairStyle hairStyle) throws Exception;
	int insertHairStyle(HairStyle hairStyle) throws Exception;
	int updateHairStyle(HairStyle hairStyle) throws Exception;
	int deleteHairStyle(Long styleNo) throws Exception;
}