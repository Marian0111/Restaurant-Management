package com.example.restaurant.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "orderedProduct")
public class OrderedProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ordered_product_id", unique = true, nullable = false)
    private int orderedProductId;

    @Column(name = "ordered_product_quantity")
    private int quantityOfProducts;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity newOrder;

    @OneToOne
    @JoinColumn(name = "product_id")
    private ProductEntity orderProduct;
}
