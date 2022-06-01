package com.scb.product.serviceimpl;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.product.dto.CustomerRequest;
import com.scb.product.dto.ProductRequestDTO;
import com.scb.product.entity.Customer;
import com.scb.product.entity.Product;
import com.scb.product.repository.CustomerRepository;
import com.scb.product.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public String saveCustomerDetails(CustomerRequest customerRequest) {
		// TODO Auto-generated method stub
     Customer customer=new Customer();
     customer.setAddress(customerRequest.getAddress());
     customer.setCustomerName(customerRequest.getCustomerName());
     customer.setEmail(customerRequest.getEmail());
     customer.setPhoneNumber(customerRequest.getPhoneNumber());
     Product p=new Product();
     p.setProductDescription(customerRequest.getProductDescription());
     p.setProductName(customerRequest.getProductName());
     p.setProductOpenDate(customerRequest.getProductOpenDate());
     p.setProductOwner(customerRequest.getProductOwner());
     p.setProductStatus(customerRequest.getProductStatus());
     p.setCustomer(customer);
     customer.setProduct(new ArrayList<Product>(Arrays.asList(p)));
     customerRepository.save(customer);
     return "Customer details saved sucessfully";

	}

}
