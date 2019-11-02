package com.hairgram.repository.interfaces;

import com.hairgram.model.HairStyle;

public interface IHairStyleRepository {

	HairStyle getHairStyle(Long styleNo) throws Exception;
}