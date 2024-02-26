package com.example.restaurant.services.mappers;

import com.example.restaurant.dtos.ReservationDto;
import com.example.restaurant.entities.ReservationEntity;
import org.springframework.stereotype.Component;

@Component
public class ReservationMapper {
    public ReservationDto toDto(ReservationEntity reservationEntity) {
        return ReservationDto.builder()
                .reservationName(reservationEntity.getReservationName())
                .reservationHour(reservationEntity.getReservationHour())
                .reservationDate(reservationEntity.getReservationDate())
                .build();
    }

}
