package com.samosoftware.category;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity


public class category  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private int category_id;
	@Column(name = "category")
	private String category;
	@Column(name = "grade")
    private int grade;
	@Column(name = "sub_category")
    private String sub_category;
	@Column(name = "unit")
    private String unit;
	@Column(name = "level")
    private String level;
	public int getCategory_id() {
		return category_id;
	}

	
	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public String getSub_category() {
		return sub_category;
	}


	public void setSub_category(String sub_category) {
		this.sub_category = sub_category;
	}


	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		this.unit = unit;
	}


	public String getLevel() {
		return level;
	}


	public void setLevel(String level) {
		this.level = level;
	}


	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}


	public category(String category, int grade, String sub_category, String unit, String level) {
		super();
		this.category = category;
		this.grade = grade;
		this.sub_category = sub_category;
		this.unit = unit;
		this.level = level;
	}


	public category() {
		super();
	}


	@Override
	public String toString() {
		return "category [category_id=" + category_id + ", category=" + category + ", grade=" + grade
				+ ", sub_category=" + sub_category + ", unit=" + unit + ", level=" + level + "]";
	}
	

	
}