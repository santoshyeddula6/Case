package com.targetrecruiting.rest.model;

import org.springframework.stereotype.Component;

@Component
public class ProductDetails {
	
	public ProductDetails() {
		
	}
	
	private String id;
      
	private ProductPrice priceInfo;
	
	private String name;

	public ProductPrice getPriceInfo() {
		return priceInfo;
	}

	public void setPriceInfo(ProductPrice priceInfo) {
		this.priceInfo = priceInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
