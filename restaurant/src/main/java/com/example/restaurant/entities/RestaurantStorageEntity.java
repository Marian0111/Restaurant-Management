package com.example.restaurant.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tables")
public class RestaurantStorageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "table_id", unique = true, nullable = false)
    private int tableId;

    @Column(name = "table_capacity")
    private int tableCapacity;

    @Column(name = "table_number")
    private int tableNumber;

    @OneToMany(mappedBy = "reservedTable", cascade = CascadeType.ALL)
    private List<ReservationEntity> reservations;
}
