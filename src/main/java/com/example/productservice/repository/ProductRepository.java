package com.example.productservice.repository;

import java.util.List;

import com.example.productservice.model.Product;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> getAllProductByProductId(String productId);
}
