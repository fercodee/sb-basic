package com.example.exercisessb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exercisessb.model.entities.Product;
import com.example.exercisessb.model.repositories.ProductRepository;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public @ResponseBody Product newProduct(Product product) {
        productRepository.save(product);
        return product;
    }

}
