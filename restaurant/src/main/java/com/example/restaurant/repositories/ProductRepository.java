package com.example.restaurant.repositories;

import com.example.restaurant.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    List<ProductEntity> findByCategory(ProductCategory category);
    List<ProductEntity> findByProductName(String name);
}
