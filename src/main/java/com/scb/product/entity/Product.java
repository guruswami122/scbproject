package com.scb.product.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ProductCodeGenerator")
	private Integer productCode;
	private String productName;
	private String productOwner;
	private String productDescription;
	private String productStatus;
	private LocalDate productOpenDate;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="customerId")
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Integer getProductCode() {
		return productCode;
	}
	public void setProductCode(Integer productCode) {
		this.productCode = productCode;
	}
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
