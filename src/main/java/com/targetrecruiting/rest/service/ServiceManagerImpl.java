package com.targetrecruiting.rest.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.targetrecruiting.rest.model.Item;
import com.targetrecruiting.rest.model.ProductPrice;

public class ServiceManagerImpl implements ServiceManager {
	
	@Autowired
	private RestClientService client;
	
	@Autowired
	private ProductRepository repository;
	
	public Item externalRestCall(String url, String productId){
		
		return client.getProductName(url, productId).getProduct().getItem();
	}
	
	public ProductPrice findByProductId(String productId) {
		return repository.findByProductId(productId);
	}

	public ProductPrice save(ProductPrice newPrice) {
		return repository.save(newPrice);
	}
}
