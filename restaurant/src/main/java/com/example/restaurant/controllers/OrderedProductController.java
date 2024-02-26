package com.example.restaurant.controllers;

import com.example.restaurant.dtos.OrderedProductDto;
import com.example.restaurant.services.OrderedProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ordered-products")
@RequiredArgsConstructor
public class OrderedProductController {
    private final OrderedProductService orderedProductService;

    @GetMapping
    ResponseEntity<List<OrderedProductDto>> findAll() {
        return ResponseEntity.ok(orderedProductService.findAll());
    }
}
