package com.example.restaurant.services;

import com.example.restaurant.dtos.OrderedProductDto;
import com.example.restaurant.entities.OrderEntity;
import com.example.restaurant.entities.OrderedProductEntity;
import com.example.restaurant.entities.ProductEntity;
import com.example.restaurant.repositories.OrderedProductRepository;
import com.example.restaurant.repositories.ProductRepository;
import com.example.restaurant.services.mappers.OrderedProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderedProductService {
    private final OrderedProductRepository orderedProductRepository;
    private final OrderedProductMapper orderedProductMapper;
    private final ProductRepository productRepository;

    public List<OrderedProductDto> findAll() {
        return orderedProductRepository.findAll().stream().map(orderedProductMapper::toDto).toList();
    }

    public List<OrderedProductDto> addOrderedProducts(List<String> productNames, List<Integer> productQuantities, OrderEntity order){
        List<OrderedProductDto> orderedProducts = new ArrayList<>();
        for(int i = 0; i < productNames.size(); i++){
            ProductEntity productEntity = productRepository.findByProductName(productNames.get(i)).get(0);
            OrderedProductEntity newOrderedProduct = OrderedProductEntity.builder()
                    .quantityOfProducts(productQuantities.get(i))
                    .orderProduct(productEntity)
                    .newOrder(order)
                    .build();
            OrderedProductEntity savedNewOrderedProduct = orderedProductRepository.save(newOrderedProduct);
            orderedProducts.add(orderedProductMapper.toDto(savedNewOrderedProduct));
        }
        return orderedProducts;
    }
}
