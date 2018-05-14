package com.targetrecruiting.rest.model;

import org.springframework.stereotype.Component;

@Component
public class ProductData {

	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
}
