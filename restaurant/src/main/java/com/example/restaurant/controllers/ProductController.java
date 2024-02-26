package com.example.restaurant.controllers;

import com.example.restaurant.dtos.ProductDto;
import com.example.restaurant.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@CrossOrigin
public class ProductController {
    private final ProductService productService;

    @GetMapping
    ResponseEntity<List<ProductDto>> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }

    @GetMapping("/bySection/{sectionName}")
    ResponseEntity<List<ProductDto>> findBySectionName(@PathVariable String sectionName) {
        List<ProductDto> products = productService.findBySectionName(sectionName);
        return ResponseEntity.ok(products);
    }
}
