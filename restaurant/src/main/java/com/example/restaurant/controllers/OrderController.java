package com.example.restaurant.controllers;

import com.example.restaurant.dtos.OrderDto;
import com.example.restaurant.dtos.PlaceOrderDto;
import com.example.restaurant.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@CrossOrigin
public class OrderController {
    private final OrderService orderService;

    @GetMapping
    ResponseEntity<List<OrderDto>> findAll() {
        return ResponseEntity.ok(orderService.findAll());
    }
    @PostMapping
    ResponseEntity<OrderDto> addOrder(@RequestBody PlaceOrderDto placeOrderDto){
        return ResponseEntity.ok(orderService.addOrder(placeOrderDto.getProductNames(), placeOrderDto.getProductQuantities(), placeOrderDto.getTableNumber()));
    }
}
