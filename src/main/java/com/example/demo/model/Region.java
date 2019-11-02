package com.example.demo.model;

//Ïß??ó≠ ?†ïÎ≥? ?Öå?ù¥Î∏? 
public class Region {

	// Ïß??ó≠ Î≤àÌò∏
	private Long regionNo;

	// Ïß??ó≠ ?ù¥Î¶?
	private String regionName;

	public Region() {
	}

	public Region(Long regionNo, String regionName) {
		super();
		this.regionNo = regionNo;
		this.regionName = regionName;
	}

	public Long getRegionNo() {
		return regionNo;
	}

	public void setRegionNo(Long regionNo) {
		this.regionNo = regionNo;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@Override
	public String toString() {
		return "Region [regionNo=" + regionNo + ", regionName=" + regionName + "]";
	}

}