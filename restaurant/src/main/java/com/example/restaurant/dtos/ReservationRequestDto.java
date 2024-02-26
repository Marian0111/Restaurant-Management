package com.example.restaurant.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservationRequestDto {
    private String reservationName;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate reservationDate;
    private int reservationHour;
    private int capacity;
}
