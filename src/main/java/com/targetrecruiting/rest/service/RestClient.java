package com.targetrecruiting.rest.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.targetrecruiting.rest.model.Product;

@Service
public class RestClient {
	
	private final RestTemplate restTemplate;
    
	
	public RestClient(RestTemplateBuilder builder) {
		this.restTemplate = builder.build();
	}
	
	public Product getProductName(String  byId) {
		String url = "http://redsky.target.com/v2/pdp/tcin/{id}";
		System.out.println("In ProductName");
		System.out.println(this.restTemplate.toString());
		Map<String,String> uriParams = new HashMap<String,String>();
		uriParams.put("id", byId);
		
		UriComponentsBuilder uri = UriComponentsBuilder.fromUriString(url).queryParam("excludes","taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics,deep_red_labels"); 
				//"taxonomy","price","promotion","bulk_ship","rating_and_reviews","rating_and_review_statistics","question_answer_statistics");
		System.out.println(uri.buildAndExpand(uriParams).toUriString());
		Product dt = this.restTemplate.getForObject(uri.buildAndExpand(uriParams).toUriString(),Product.class);
	    return dt;
	}

}
