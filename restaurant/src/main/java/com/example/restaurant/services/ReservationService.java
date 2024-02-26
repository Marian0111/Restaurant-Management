package com.example.restaurant.services;

import com.example.restaurant.dtos.ReservationDto;
import com.example.restaurant.entities.ReservationEntity;
import com.example.restaurant.entities.RestaurantStorageEntity;
import com.example.restaurant.repositories.ReservationRepository;
import com.example.restaurant.repositories.RestaurantStorageRepository;
import com.example.restaurant.services.mappers.ReservationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final ReservationMapper reservationMapper;
    private final RestaurantStorageRepository restaurantStorageRepository;

    public List<ReservationDto> findAll() {
        return reservationRepository.findAll().stream().map(reservationMapper::toDto).toList();
    }

    public ReservationDto addReservation(String reservationName, LocalDate reservationDate, int reservationHour, int capacity) {
        List<RestaurantStorageEntity> availableTables = restaurantStorageRepository.findByTableCapacity(capacity);
        List<ReservationEntity> reservationsAtDateAndHour = reservationRepository.findByReservationDateAndReservationHour(reservationDate, reservationHour);

        if (availableTables.isEmpty()) {
            throw new RuntimeException("No available tables for the given capacity");
        }

        List<RestaurantStorageEntity> filteredTables = availableTables.stream()
                .filter(table -> reservationsAtDateAndHour.stream().noneMatch(reservation -> reservation.getReservedTable().equals(table)))
                .collect(Collectors.toList());

        if (filteredTables.isEmpty()) {
            throw new RuntimeException("No available tables for the given capacity at the specified date and hour");
        }

        RestaurantStorageEntity firstAvailableTable = filteredTables.get(0);

        ReservationEntity reservationEntity = ReservationEntity.builder()
                .reservationName(reservationName)
                .reservationDate(reservationDate)
                .reservationHour(reservationHour)
                .reservedTable(firstAvailableTable)
                .build();

        ReservationEntity savedReservationEntity = reservationRepository.save(reservationEntity);
        return reservationMapper.toDto(savedReservationEntity);
    }
}
