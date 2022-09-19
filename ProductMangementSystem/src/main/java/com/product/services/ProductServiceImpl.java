package com.product.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repo.IProductRepository;
import com.product.services.IProducrService;
@Service
public class ProductServiceImpl implements IProducrService {

	
		
		// TODO Auto-generated method stub
@Autowired
IProductRepository ProductRepository;
	
@Override
	public Integer addProduct(Product product) {
		// TODO Auto-generated method stub
		Product addProduct=ProductRepository.save(product);
		return addProduct.getId();
	}


	}


