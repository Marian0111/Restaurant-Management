package com.example.restaurant.repositories;

import com.example.restaurant.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantStorageRepository extends JpaRepository<RestaurantStorageEntity, Integer> {
    List<RestaurantStorageEntity> findByTableCapacity(int capacity);
}
