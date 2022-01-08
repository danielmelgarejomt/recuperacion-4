/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.habilitacion.repository;

import com.usa.habilitacion.repository.crudrepository.ProductCrudRepository;
import com.usahabilitacion.product.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DANIEL
 */
@Repository
public class ProductRepository {

    @Autowired
    private ProductCrudRepository ProductCrudRepository;

    public List<Product> getAll() {
        return ProductCrudRepository.findAll();
    }

    public Optional<Product> getProduct(String reference) {
        return ProductCrudRepository.findById(reference);
    }

    public Product create(Product product) {
        return ProductCrudRepository.save(product);
    }

    public void update(Product product) {
        ProductCrudRepository.save(product);
    }

    public void delete(Product product) {
        ProductCrudRepository.delete(product);
    }

    public List<Product> findByDescriptionContainigIgnoreCase(String description){
        return ProductCrudRepository.findByDescriptionContainigIgnoreCase(description);
    }

    public List<Product> findByPriceLessThanEqual(Double price){
        return ProductCrudRepository.findByPriceLessThanEqual(price);
    }
}
