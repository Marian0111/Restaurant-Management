package com.example.restaurant.services;

import com.example.restaurant.dtos.RestaurantStorageDto;
import com.example.restaurant.repositories.RestaurantStorageRepository;
import com.example.restaurant.services.mappers.RestaurantStorageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantStorageService {
    private final RestaurantStorageRepository restaurantStorageRepository;
    private final RestaurantStorageMapper restaurantStorageMapper;

    public List<RestaurantStorageDto> findAll() {
        return restaurantStorageRepository.findAll().stream().map(restaurantStorageMapper::toDto).toList();
    }
}
