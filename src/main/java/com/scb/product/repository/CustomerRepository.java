package com.scb.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scb.product.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	Customer findByCustomerId(Integer customerId);

}
