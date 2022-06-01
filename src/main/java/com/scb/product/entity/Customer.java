package com.scb.product.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table
public class Customer {
	
	@Id
	@SequenceGenerator(name = "CustomerIdGenerator", sequenceName = "CustomerIdGenerator", 
	allocationSize = 1, initialValue = 200000)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "CustomerIdGenerator")
	private Integer customerId;
	private String customerName;
	private String email;
	private String phoneNumber;
	private String address;
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL,  fetch = FetchType.EAGER)
	private List<Product> product;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	

}
