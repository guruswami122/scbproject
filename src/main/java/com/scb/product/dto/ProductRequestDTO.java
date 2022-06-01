package com.scb.product.dto;

import java.time.LocalDate;

public class ProductRequestDTO {
	
	private String productName;
	private String productOwner;
	private String productDescription;
	private String productStatus;
	private LocalDate productOpenDate;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductOwner() {
		return productOwner;
	}
	public void setProductOwner(String productOwner) {
		this.productOwner = productOwner;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public LocalDate getProductOpenDate() {
		return productOpenDate;
	}
	public void setProductOpenDate(LocalDate productOpenDate) {
		this.productOpenDate = productOpenDate;
	}


}
