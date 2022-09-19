package com.product.services;

import java.util.Optional;

import com.product.entity.Product;

import antlr.collections.List;

public interface IProducrService {
	Integer addProduct(Product product);

	 List<Product> getAllProducts();
	
	Optional<Product> getProduct(Integer Id);
	
	Product updateProduct(Product product, Integer Id);
	
	public void deleteproduct(Integer Id);

}
