package com.example.restaurant.services.mappers;

import com.example.restaurant.dtos.ProductDto;
import com.example.restaurant.entities.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public ProductDto toDto(ProductEntity productEntity) {
        return ProductDto.builder()
                .name(productEntity.getProductName())
                .weight(productEntity.getProductWeight())
                .price(productEntity.getProductPrice())
                .category(productEntity.getCategory())
                .build();
    }
}
