package com.scb.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scb.product.dto.ProductRequestDTO;
import com.scb.product.dto.ProductResponseDto;
import com.scb.product.entity.Product;
import com.scb.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/saveproduct")
	public ResponseEntity<String> saveProduct(@RequestBody ProductRequestDTO productRequestDTO) {
		return ResponseEntity.status(HttpStatus.OK).body(productService.saveProduct(productRequestDTO));
	}
	
	@GetMapping("/viewAllProducts")
	public List<Product> viewAllProducts(){
		return productService.viewAllProducts();
	}
	
	@GetMapping("/viewProduct/{productCode}")
	public ResponseEntity<Product> viewProduct(@PathVariable Integer productCode) {
		return ResponseEntity.status(HttpStatus.OK).body(productService.viewProduct(productCode));
	}
	
	@DeleteMapping("/deleteProduct/{productCode}")
	public ResponseEntity<String> deleteProduct(@PathVariable Integer productCode) {
		return ResponseEntity.status(HttpStatus.OK).body(productService.deleteProduct(productCode));

	}
    @PutMapping("/updateProduct/{productCode}")
	public ResponseEntity<String> updateProduct(@PathVariable Integer productCode,@RequestBody  ProductRequestDTO productRequestDTO) {
    	return ResponseEntity.status(HttpStatus.OK).body(productService.updateProduct(productCode, productRequestDTO));
    }
    
    @GetMapping("/viewProductwithCustomer/{customerId}")
	public ResponseEntity<List<ProductResponseDto>> viewProductwithCustomer(@PathVariable Integer customerId) {
    	return ResponseEntity.status(HttpStatus.OK).body(productService.viewProductwithCustomer(customerId));
    }


}
