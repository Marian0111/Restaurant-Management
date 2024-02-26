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
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_weight")
    private int productWeight;

    @Column(name = "product_price")
    private double productPrice;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "category")
    private ProductCategory category;

    @OneToOne(mappedBy = "orderProduct")
    private OrderedProductEntity orderedProduct;
}
