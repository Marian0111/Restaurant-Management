package com.example.restaurant.services;

import com.example.restaurant.dtos.BillDto;
import com.example.restaurant.repositories.BillRepository;
import com.example.restaurant.services.mappers.BillMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BillService {
    private final BillRepository billRepository;
    private final BillMapper billMapper;

    public List<BillDto> findAll() {
        return billRepository.findAll().stream().map(billMapper::toDto).toList();
    }
}
