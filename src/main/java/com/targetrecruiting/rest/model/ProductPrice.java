package com.targetrecruiting.rest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document(collection="productprice")
@Component
public class ProductPrice {
	
	@Id
	private String id;
	private String price;
	private String currencyCode;
	
	public ProductPrice() {
		
	}
	
	/*public ProductPrice(String id, String price, String currencyCode) {
		this.id=id;
		this.price=price;
		this.currencyCode=currencyCode;
	}*/
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
}
