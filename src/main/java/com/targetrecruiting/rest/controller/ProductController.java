package com.targetrecruiting.rest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.targetrecruiting.rest.model.Item;
import com.targetrecruiting.rest.model.ProductDetails;
import com.targetrecruiting.rest.model.ProductPrice;
import com.targetrecruiting.rest.repository.ProductRepository;
import com.targetrecruiting.rest.service.RestClient;

@RestController
public class ProductController {
	
	@Autowired
	RestClient client;
	
	@Autowired
	ProductDetails product;
	
	@Autowired
	ProductRepository repository;
	
	@Autowired
	ProductPrice price;
	
	@RequestMapping(method=RequestMethod.GET, value="/products/{id}")
    public ProductDetails getProductInfo(@PathVariable String id) {
		Item item = client.getProductName(id).getItem();
		product.setName(item.getDescription().getTitle());
		Optional<ProductPrice> opt= repository.findById(id);
		if(opt.isPresent()) {
			price = opt.get();
		}else {
			price.setId(id);
			price.setCurrencyCode("null");
			price.setPrice("null");
		}
		product.setPriceInfo(price);
		product.setId(id);
		
		return product;
    } 

}
