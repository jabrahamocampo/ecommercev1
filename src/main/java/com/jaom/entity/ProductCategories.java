package com.jaom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productcategories")
public class ProductCategories {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;
	private String CategoryName;
	
	public ProductCategories() {
		super();
	}
	
	public ProductCategories(Long categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.CategoryName = categoryName;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	@Override
	public String toString() {
		return "ProductCategories [categoryId=" + categoryId + ", CategoryName=" + CategoryName + "]";
	}
	
}
