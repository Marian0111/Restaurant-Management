package com.example.restaurant.services.mappers;

import com.example.restaurant.dtos.RestaurantStorageDto;
import com.example.restaurant.entities.RestaurantStorageEntity;
import org.springframework.stereotype.Component;

@Component
public class RestaurantStorageMapper {
    public RestaurantStorageDto toDto(RestaurantStorageEntity restaurantStorageEntity) {
        return RestaurantStorageDto.builder()
                .tableCapacity(restaurantStorageEntity.getTableCapacity())
                .tableNumber(restaurantStorageEntity.getTableNumber())
                .build();
    }
}
