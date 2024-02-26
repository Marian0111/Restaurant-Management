package com.example.restaurant.services;

import com.example.restaurant.dtos.ProductDto;
import com.example.restaurant.entities.ProductCategory;
import com.example.restaurant.repositories.ProductRepository;
import com.example.restaurant.services.mappers.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public List<ProductDto> findAll() {
        return productRepository.findAll().stream().map(productMapper::toDto).toList();
    }

    public List<ProductDto> findBySectionName(String sectionName) {
        return productRepository.findByCategory(ProductCategory.valueOf(sectionName))
                .stream()
                .map(productMapper::toDto)
                .toList();
    }
}
