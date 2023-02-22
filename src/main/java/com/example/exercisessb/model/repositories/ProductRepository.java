package com.example.exercisessb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.exercisessb.model.entities.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {
    
}
