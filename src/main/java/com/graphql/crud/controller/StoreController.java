package com.graphql.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphql.crud.entity.Store;
import com.graphql.crud.service.StoreService;

@Controller
public class StoreController {

	@Autowired
	private StoreService storeService;
	
	@QueryMapping
	public List<Store> listStores(){
		return storeService.getAllStores();
	}
	
	@QueryMapping
	public Optional<Store> getStoreById(@Argument Long id) {
		return Optional.ofNullable(storeService.getStoreById(id).orElseThrow(
				() -> new RuntimeException(String.format("Product not found", id))
				));
	}
}
