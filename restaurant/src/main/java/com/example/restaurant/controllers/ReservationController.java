package com.example.restaurant.controllers;

import com.example.restaurant.dtos.ReservationDto;
import com.example.restaurant.dtos.ReservationRequestDto;
import com.example.restaurant.services.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
@RequiredArgsConstructor
@CrossOrigin
public class ReservationController {
    private final ReservationService reservationService;

    @GetMapping
    ResponseEntity<List<ReservationDto>> findAll() {
        return ResponseEntity.ok(reservationService.findAll());
    }
    @PostMapping
    ResponseEntity<ReservationDto> addReservation(@RequestBody ReservationRequestDto reservationRequestDto){
        try {
            ReservationDto addedReservation = reservationService.addReservation(reservationRequestDto.getReservationName(), reservationRequestDto.getReservationDate(), reservationRequestDto.getReservationHour(), reservationRequestDto.getCapacity());
            return ResponseEntity.ok(addedReservation);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }
}
