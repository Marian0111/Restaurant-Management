package com.example.restaurant.services.mappers;

import com.example.restaurant.dtos.BillDto;
import com.example.restaurant.entities.BillEntity;
import org.springframework.stereotype.Component;

@Component
public class BillMapper {
    public BillDto toDto(BillEntity billEntity) {
        return BillDto.builder()
                .totalPrice(billEntity.getTotalPrice())
                .build();
    }
}
