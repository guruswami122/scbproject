package com.scb.product.service;

import java.util.List;

import com.scb.product.dto.ProductRequestDTO;
import com.scb.product.dto.ProductResponseDto;
import com.scb.product.entity.Product;

public interface ProductService {
	
	public String saveProduct(ProductRequestDTO productRequestDTO);
	public List<Product> viewAllProducts();
	public Product viewProduct(Integer productCode);
	public String deleteProduct (Integer productCode);
	public String updateProduct(Integer productCode,ProductRequestDTO productRequestDTO);
	public List<ProductResponseDto> viewProductwithCustomer(Integer customerId);


}
