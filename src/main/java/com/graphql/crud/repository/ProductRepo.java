package com.graphql.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graphql.crud.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
}

