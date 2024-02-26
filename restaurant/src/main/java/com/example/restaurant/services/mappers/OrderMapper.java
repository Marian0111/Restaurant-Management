package com.example.restaurant.services.mappers;

import com.example.restaurant.dtos.OrderDto;
import com.example.restaurant.entities.OrderEntity;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {
    public OrderDto toDto(OrderEntity orderEntity) {
        return OrderDto.builder()
                .tableNumber(orderEntity.getTableNumber())
                .build();
    }
}
