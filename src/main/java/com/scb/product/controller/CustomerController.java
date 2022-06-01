package com.scb.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.scb.product.dto.CustomerRequest;
import com.scb.product.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerservice;
	
	@PostMapping("/saveCustomer")
	public ResponseEntity<String> saveCustomer(@RequestBody  CustomerRequest customerRequest) {
		return ResponseEntity.status(HttpStatus.OK).body(customerservice.saveCustomerDetails(customerRequest));
	}

}
