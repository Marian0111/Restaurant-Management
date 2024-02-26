package com.example.restaurant.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestaurantStorageDto {
    private int tableCapacity;

    private int tableNumber;
}
