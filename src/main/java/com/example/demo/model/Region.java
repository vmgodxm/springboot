package com.example.demo.model;

//�??�� ?���? ?��?���? 
public class Region {

	// �??�� 번호
	private Long regionNo;

	// �??�� ?���?
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