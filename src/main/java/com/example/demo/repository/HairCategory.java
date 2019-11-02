package com.example.demo.repository;

//헤어 스타일 분류 
public class HairCategory {

	// 카테고리 번호
	private Integer categoryNo;

	// 카테고리 이름
	private String categoriName;

	// 성별
	private String gender;

	public HairCategory() {

	}

	public HairCategory(Integer categoryNo, String categoriName, String gender) {
		super();
		this.categoryNo = categoryNo;
		this.categoriName = categoriName;
		this.gender = gender;
	}


	public Integer getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(Integer categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getCategoriName() {
		return categoriName;
	}

	public void setCategoriName(String categoriName) {
		this.categoriName = categoriName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "HairCategory [categoryNo=" + categoryNo + ", categoriName=" + categoriName + ", gender=" + gender + "]";
	}

}
