package com.scb.product.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.product.dto.ProductRequestDTO;
import com.scb.product.dto.ProductResponseDto;
import com.scb.product.entity.Product;
import com.scb.product.repository.ProductRepository;
import com.scb.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public String saveProduct(ProductRequestDTO productRequestDTO) {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.setProductDescription(productRequestDTO.getProductDescription());
		p.setProductName(productRequestDTO.getProductName());
		p.setProductOpenDate(productRequestDTO.getProductOpenDate());
		p.setProductOwner(productRequestDTO.getProductOwner());
		p.setProductStatus(productRequestDTO.getProductStatus());
		productRepository.save(p);
		return "Product Details saved sucessfully";
		
	}

	@Override
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product viewProduct(Integer productCode) {
		// TODO Auto-generated method stub
		return productRepository.findByProductCode(productCode);
	}

	@Override
	public String deleteProduct(Integer productCode) {
		// TODO Auto-generated method stub
		productRepository.deleteById(productCode);
		return "Product details detede sucessfully"+" " +productCode;
	}

	@Override
	public String updateProduct(Integer productCode, ProductRequestDTO productRequestDTO) {
		// TODO Auto-generated method stub
		Product p=productRepository.findByProductCode(productCode);
		p.setProductDescription(productRequestDTO.getProductDescription());
		productRepository.save(p);
		return "Product details are updated sucessfully";
	}

	@Override
	public List<ProductResponseDto> viewProductwithCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		List<Product> products=productRepository.findByCustomerCustomerId(customerId);
		List<ProductResponseDto> productResponseDto=new ArrayList<ProductResponseDto>();
		for(Product product:products) {
			ProductResponseDto p=new ProductResponseDto();
			p.setProductDescription(product.getProductDescription());
			p.setProductName(product.getProductName());
			p.setProductOpenDate(product.getProductOpenDate());
			p.setProductOwner(product.getProductOwner());
			p.setProductStatus(product.getProductStatus());
			p.setAddress(product.getCustomer().getAddress());
			p.setCustomerName(product.getCustomer().getCustomerName());
			p.setEmail(product.getCustomer().getEmail());
			p.setPhoneNumber(product.getCustomer().getPhoneNumber());
			productResponseDto.add(p);
		}
		return productResponseDto;
			
		}
	}
	


