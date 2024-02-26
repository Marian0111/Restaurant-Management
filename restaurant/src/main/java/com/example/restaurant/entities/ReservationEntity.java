package com.example.restaurant.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "reservation")
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id", unique = true, nullable = false)
    private int reservationId;

    @Column(name = "client_name")
    private String reservationName;

    @Column(name = "reservation_date")
    private LocalDate reservationDate;

    @Column(name = "reservation_hour")
    private int reservationHour;

    @ManyToOne
    @JoinColumn(name = "table_id")
    private RestaurantStorageEntity reservedTable;
}
