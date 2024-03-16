package com.graphql.crud.service;

import com.graphql.crud.entity.Product;
import com.graphql.crud.repository.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

	@Autowired
    private ProductRepo productRepository;

    // Method to save a product
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Method to get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Method to get a product by its ID
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // Method to update a product
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    // Method to delete a product by its ID
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }
}
