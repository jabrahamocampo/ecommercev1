package com.jaom.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="products")
public class Products {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	
	private String productSKU; 
	private String productName;
	private Double productPrice;
	private Double productWeight;
	private String productCartDesc;
	private String productShortDesc;
	private String productLongDesc;
	private String productThumb;
	private String productImage;
	private Long productCategoryId;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date productUpdateDate;
	
	private Double productStock;
	private int productLive;
	private int productUnlimited;
	private String ProductLocation;
	
	public Products() {
		super();
	}

	public Products(Long productId, String productSKU, String productName, Double productPrice, Double productWeight,
			String productCartDesc, String productShortDesc, String productLongDesc, String productThumb,
			String productImage, Long productCategoryId, Date productUpdateDate, Double productStock, int productLive,
			int productUnlimited, String productLocation) {
		super();
		this.productId = productId;
		this.productSKU = productSKU;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productWeight = productWeight;
		this.productCartDesc = productCartDesc;
		this.productShortDesc = productShortDesc;
		this.productLongDesc = productLongDesc;
		this.productThumb = productThumb;
		this.productImage = productImage;
		this.productCategoryId = productCategoryId;
		this.productUpdateDate = productUpdateDate;
		this.productStock = productStock;
		this.productLive = productLive;
		this.productUnlimited = productUnlimited;
		ProductLocation = productLocation;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductSKU() {
		return productSKU;
	}

	public void setProductSKU(String productSKU) {
		this.productSKU = productSKU;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Double getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(Double productWeight) {
		this.productWeight = productWeight;
	}

	public String getProductCartDesc() {
		return productCartDesc;
	}

	public void setProductCartDesc(String productCartDesc) {
		this.productCartDesc = productCartDesc;
	}

	public String getProductShortDesc() {
		return productShortDesc;
	}

	public void setProductShortDesc(String productShortDesc) {
		this.productShortDesc = productShortDesc;
	}

	public String getProductLongDesc() {
		return productLongDesc;
	}

	public void setProductLongDesc(String productLongDesc) {
		this.productLongDesc = productLongDesc;
	}

	public String getProductThumb() {
		return productThumb;
	}

	public void setProductThumb(String productThumb) {
		this.productThumb = productThumb;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public Long getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public Date getProductUpdateDate() {
		return productUpdateDate;
	}

	public void setProductUpdateDate(Date productUpdateDate) {
		this.productUpdateDate = productUpdateDate;
	}

	public Double getProductStock() {
		return productStock;
	}

	public void setProductStock(Double productStock) {
		this.productStock = productStock;
	}

	public int getProductLive() {
		return productLive;
	}

	public void setProductLive(int productLive) {
		this.productLive = productLive;
	}

	public int getProductUnlimited() {
		return productUnlimited;
	}

	public void setProductUnlimited(int productUnlimited) {
		this.productUnlimited = productUnlimited;
	}

	public String getProductLocation() {
		return ProductLocation;
	}

	public void setProductLocation(String productLocation) {
		ProductLocation = productLocation;
	}
	
	

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productSKU=" + productSKU + ", productName=" + productName
				+ ", productPrice=" + productPrice + ", productWeight=" + productWeight + ", productCartDesc="
				+ productCartDesc + ", productShortDesc=" + productShortDesc + ", productLongDesc=" + productLongDesc
				+ ", productThumb=" + productThumb + ", productImage=" + productImage + ", productCategoryId="
				+ productCategoryId + ", productUpdateDate=" + productUpdateDate + ", productStock=" + productStock
				+ ", productLive=" + productLive + ", productUnlimited=" + productUnlimited + ", ProductLocation="
				+ ProductLocation + "]";
	}

}
