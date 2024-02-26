package com.example.restaurant.controllers;

import com.example.restaurant.dtos.RestaurantStorageDto;
import com.example.restaurant.services.RestaurantStorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tables")
@RequiredArgsConstructor
public class RestaurantStorageController {
    private final RestaurantStorageService restaurantStorageService;

    @GetMapping
    ResponseEntity<List<RestaurantStorageDto>> findAll() {
        return ResponseEntity.ok(restaurantStorageService.findAll());
    }
}
