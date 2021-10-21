package com.example.springcrud.models.repository;

import com.example.springcrud.models.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {
}
