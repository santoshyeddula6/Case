package com.targetrecruiting.rest.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.targetrecruiting.rest.model.ProductPrice;

@Repository
public interface ProductRepository extends MongoRepository<ProductPrice,String> {

	public Optional<ProductPrice> findById(String id); 
}
