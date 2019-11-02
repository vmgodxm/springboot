package com.example.demo.model;

//지역 정보 테이블 
public class Region {

	// 지역 번호
	private Long regionNo;

	// 지역 이름
	private String regionName;

	public Region() {
		// TODO Auto-generated constructor stub
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