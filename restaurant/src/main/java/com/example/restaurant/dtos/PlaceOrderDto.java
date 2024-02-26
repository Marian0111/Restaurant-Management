package com.example.restaurant.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlaceOrderDto {
    private List<String> productNames;
    private List<Integer> productQuantities;
    private Integer tableNumber;
}
