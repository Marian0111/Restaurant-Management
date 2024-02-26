package com.example.restaurant.services;

import com.example.restaurant.dtos.OrderDto;
import com.example.restaurant.entities.OrderEntity;
import com.example.restaurant.repositories.OrderRepository;
import com.example.restaurant.services.mappers.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;
    private final OrderedProductService orderedProductService;

    public List<OrderDto> findAll() {
        return orderRepository.findAll().stream().map(orderMapper::toDto).toList();
    }

    public OrderDto addOrder(List<String> productNames, List<Integer> productQuantities, Integer tableNumber){
        OrderEntity newOrder = OrderEntity.builder()
                .tableNumber(tableNumber)
                .build();
        OrderEntity savedNewOrder = orderRepository.save(newOrder);
        orderedProductService.addOrderedProducts(productNames, productQuantities, savedNewOrder);
        return orderMapper.toDto(savedNewOrder);
    }
}
