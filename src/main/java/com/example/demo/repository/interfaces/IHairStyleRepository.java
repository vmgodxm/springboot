package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.HairStyle;
import com.example.demo.model.HairStyleListMain;
import com.example.demo.model.UserRegistJoinFile;

public interface IHairStyleRepository {

	List<HairStyle> getHairStyleList() throws Exception;
	HairStyle getHairStyle(Long styleNo) throws Exception;
	HairStyle getHairStyle(HairStyle hairStyle) throws Exception;
	int insertHairStyle(HairStyle hairStyle) throws Exception;
	int updateHairStyle(HairStyle hairStyle) throws Exception;
	int deleteHairStyle(Long styleNo) throws Exception;
	List<HairStyleListMain> getHairStyleListJoin() throws Exception;
	List<HairStyleListMain> getHairStyleListReco() throws Exception;
	UserRegistJoinFile getHairStyleJoinFile(String userId) throws Exception;
	List<HairStyleListMain> hairStyleJoinbyUserId(String userId) throws Exception;
	List<HairStyleListMain> hairStyleListPrice() throws Exception;
}