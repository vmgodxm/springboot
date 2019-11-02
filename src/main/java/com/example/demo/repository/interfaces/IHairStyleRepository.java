package com.example.demo.repository.interfaces;

import com.example.demo.model.HairStyle;

public interface IHairStyleRepository {

	HairStyle getHairStyle(Long styleNo) throws Exception;
}