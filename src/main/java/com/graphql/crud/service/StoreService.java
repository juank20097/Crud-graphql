package com.graphql.crud.service;

import com.graphql.crud.entity.Store;
import com.graphql.crud.repository.StoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreService {

	@Autowired
    private StoreRepo storeRepository;

    // Method to save a store
    public Store saveStore(Store store) {
        return storeRepository.save(store);
    }

    // Method to get all stores
    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }

    // Method to get a store by its ID
    public Optional<Store> getStoreById(Long id) {
        return storeRepository.findById(id);
    }

    // Method to update a store
    public Store updateStore(Store store) {
        return storeRepository.save(store);
    }

    // Method to delete a store by its ID
    public void deleteStoreById(Long id) {
        storeRepository.deleteById(id);
    }
}
