package com.example.restaurant.controllers;

import com.example.restaurant.dtos.BillDto;
import com.example.restaurant.services.BillService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bills")
@RequiredArgsConstructor
public class BillController {
    private final BillService billService;

    @GetMapping
    ResponseEntity<List<BillDto>> findAll() {
        return ResponseEntity.ok(billService.findAll());
    }
}
