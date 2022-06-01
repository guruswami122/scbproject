package com.scb.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scb.product.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	Product findByProductCode(Integer productCode);
	List<Product> findByCustomerCustomerId(Integer customerId);

}
