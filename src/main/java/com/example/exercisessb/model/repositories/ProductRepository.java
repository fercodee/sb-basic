package com.example.exercisessb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.exercisessb.model.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    
}
