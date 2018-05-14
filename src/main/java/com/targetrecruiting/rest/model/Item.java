package com.targetrecruiting.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {
	
	public Item() {
		
	}
	
	private String tcin;
	
	private ProductDescription product_description;

	public String getTcin() {
		return tcin;
	}

	public void setTcin(String tcin) {
		this.tcin = tcin;
	}

	public ProductDescription getDescription() {
		return product_description;
	}

	public void setDescription(ProductDescription description) {
		this.product_description = description;
	}

	@Override
	public String toString() {
		return "Item [tcin=" + tcin + ", description=" + product_description + "]";
	}
	
	

}
