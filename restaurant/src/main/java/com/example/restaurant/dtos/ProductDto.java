package com.example.restaurant.dtos;

import com.example.restaurant.entities.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {
    private String name;
    private int weight;
    private double price;
    private ProductCategory category;
}
