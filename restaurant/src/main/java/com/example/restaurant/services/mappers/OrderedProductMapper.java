package com.example.restaurant.services.mappers;

import com.example.restaurant.dtos.OrderedProductDto;
import com.example.restaurant.entities.OrderedProductEntity;
import org.springframework.stereotype.Component;

@Component
public class OrderedProductMapper {
    public OrderedProductDto toDto(OrderedProductEntity orderedProductEntity) {
        return OrderedProductDto.builder()
                .quantityOfProducts(orderedProductEntity.getQuantityOfProducts())
                .build();
    }
}
