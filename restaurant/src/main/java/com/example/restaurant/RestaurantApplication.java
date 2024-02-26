package com.example.restaurant;

import com.example.restaurant.entities.*;
import com.example.restaurant.repositories.*;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
@RequiredArgsConstructor
public class RestaurantApplication {
    private final ProductRepository productRepository;
    private final RestaurantStorageRepository restaurantStorageRepository;
    private final ReservationRepository reservationRepository;

    public static void main(String[] args) {
        SpringApplication.run(RestaurantApplication.class, args);
    }

    @PostConstruct
    void setup() {

		/*
			TEAS
		 */
        productRepository.save(ProductEntity.builder()
                .productName("Black Tea")
                .productPrice(8.99)
                .productWeight(330)
                .category(ProductCategory.TEA)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Green Tea")
                .productPrice(8.99)
                .productWeight(330)
                .category(ProductCategory.TEA)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Black Tea")
                .productPrice(8.99)
                .productWeight(330)
                .category(ProductCategory.TEA)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Wildberries tea")
                .productPrice(9.99)
                .productWeight(420)
                .category(ProductCategory.TEA)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Ginger&Lime tea")
                .productPrice(10.99)
                .productWeight(400)
                .category(ProductCategory.TEA)
                .build()
        );

		/*
			COFFEES
		 */
        productRepository.save(ProductEntity.builder()
                .productName("Latte")
                .productPrice(15.99)
                .productWeight(250)
                .category(ProductCategory.COFFEE)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Latte")
                .productPrice(15.99)
                .productWeight(250)
                .category(ProductCategory.COFFEE)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Cappuccino")
                .productPrice(16.99)
                .productWeight(250)
                .category(ProductCategory.COFFEE)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Espresso")
                .productPrice(13.99)
                .productWeight(250)
                .category(ProductCategory.COFFEE)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Americano")
                .productPrice(12.99)
                .productWeight(250)
                .category(ProductCategory.COFFEE)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Irish Coffee")
                .productPrice(17.99)
                .productWeight(250)
                .category(ProductCategory.COFFEE)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Mocha")
                .productPrice(16.99)
                .productWeight(250)
                .category(ProductCategory.COFFEE)
                .build()
        );

		/*
			REFRESHER
		 */
        productRepository.save(ProductEntity.builder()
                .productName("Classic Lemonade")
                .productPrice(15.99)
                .productWeight(450)
                .category(ProductCategory.REFRESHER)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Elderflower Lemonade")
                .productPrice(18.99)
                .productWeight(450)
                .category(ProductCategory.REFRESHER)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Ginger Lemonade")
                .productPrice(16.99)
                .productWeight(450)
                .category(ProductCategory.REFRESHER)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Mint Lemonade")
                .productPrice(16.99)
                .productWeight(450)
                .category(ProductCategory.REFRESHER)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Strawberry Lemonade")
                .productPrice(18.99)
                .productWeight(450)
                .category(ProductCategory.REFRESHER)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Orange Fresh")
                .productPrice(20.99)
                .productWeight(450)
                .category(ProductCategory.REFRESHER)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Grapefruit Fresh")
                .productPrice(20.99)
                .productWeight(450)
                .category(ProductCategory.REFRESHER)
                .build()
        );

		/*
			SODAS
		 */
        productRepository.save(ProductEntity.builder()
                .productName("Coke")
                .productPrice(6.99)
                .productWeight(330)
                .category(ProductCategory.SODA)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Sprite")
                .productPrice(6.99)
                .productWeight(330)
                .category(ProductCategory.SODA)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Mirinda")
                .productPrice(6.99)
                .productWeight(330)
                .category(ProductCategory.SODA)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Pepsi")
                .productPrice(6.99)
                .productWeight(330)
                .category(ProductCategory.SODA)
                .build()
        );

		/*
			ALCOHOL DRINKS
		 */
        productRepository.save(ProductEntity.builder()
                .productName("Red Wine")
                .productPrice(78.99)
                .productWeight(750)
                .category(ProductCategory.ALCOHOL)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("White Wine")
                .productPrice(75.99)
                .productWeight(750)
                .category(ProductCategory.ALCOHOL)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Mojito")
                .productPrice(23.99)
                .productWeight(500)
                .category(ProductCategory.ALCOHOL)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Prosecco")
                .productPrice(21.99)
                .productWeight(500)
                .category(ProductCategory.ALCOHOL)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Bloody Mary")
                .productPrice(26.99)
                .productWeight(450)
                .category(ProductCategory.ALCOHOL)
                .build()
        );

		/*
			PASTAS
		 */
        productRepository.save(ProductEntity.builder()
                .productName("Carbonara Pasta")
                .productPrice(34.99)
                .productWeight(540)
                .category(ProductCategory.PASTA)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Arabiatta Pasta")
                .productPrice(32.99)
                .productWeight(480)
                .category(ProductCategory.PASTA)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Quattro Fromaggi Pasta")
                .productPrice(30.99)
                .productWeight(450)
                .category(ProductCategory.PASTA)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Polo Pasta")
                .productPrice(33.99)
                .productWeight(500)
                .category(ProductCategory.PASTA)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Tuna Pasta")
                .productPrice(38.99)
                .productWeight(510)
                .category(ProductCategory.PASTA)
                .build()
        );

		/*
			PIZZAS
		 */
        productRepository.save(ProductEntity.builder()
                .productName("Quatro Fromaggi Pizza")
                .productPrice(32.99)
                .productWeight(550)
                .category(ProductCategory.PIZZA)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Quatro Stagionni Pizza")
                .productPrice(33.99)
                .productWeight(510)
                .category(ProductCategory.PIZZA)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Prosciutto Pizza")
                .productPrice(32.99)
                .productWeight(500)
                .category(ProductCategory.PIZZA)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Peperoni Pizza")
                .productPrice(35.99)
                .productWeight(530)
                .category(ProductCategory.PIZZA)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Canibale Pizza")
                .productPrice(38.99)
                .productWeight(560)
                .category(ProductCategory.PIZZA)
                .build()
        );

        productRepository.save(ProductEntity.builder()
                .productName("Hawaii Pizza")
                .productPrice(38.99)
                .productWeight(600)
                .category(ProductCategory.PIZZA)
                .build()
        );

		/*
			TABLES
		 */
        RestaurantStorageEntity table1 = restaurantStorageRepository.save(RestaurantStorageEntity.builder()
                .tableCapacity(4)
                .tableNumber(1)
                .build()
        );

        RestaurantStorageEntity table2 = restaurantStorageRepository.save(RestaurantStorageEntity.builder()
                .tableCapacity(4)
                .tableNumber(2)
                .build()
        );

        RestaurantStorageEntity table3 = restaurantStorageRepository.save(RestaurantStorageEntity.builder()
                .tableCapacity(2)
                .tableNumber(3)
                .build()
        );

        RestaurantStorageEntity table4 = restaurantStorageRepository.save(RestaurantStorageEntity.builder()
                .tableCapacity(6)
                .tableNumber(4)
                .build()
        );

        RestaurantStorageEntity table5 = restaurantStorageRepository.save(RestaurantStorageEntity.builder()
                .tableCapacity(2)
                .tableNumber(5)
                .build()
        );

        RestaurantStorageEntity table6 = restaurantStorageRepository.save(RestaurantStorageEntity.builder()
                .tableCapacity(6)
                .tableNumber(6)
                .build()
        );

        RestaurantStorageEntity table7 = restaurantStorageRepository.save(RestaurantStorageEntity.builder()
                .tableCapacity(8)
                .tableNumber(7)
                .build()
        );

        RestaurantStorageEntity table8 = restaurantStorageRepository.save(RestaurantStorageEntity.builder()
                .tableCapacity(4)
                .tableNumber(8)
                .build()
        );

        RestaurantStorageEntity table9 = restaurantStorageRepository.save(RestaurantStorageEntity.builder()
                .tableCapacity(6)
                .tableNumber(9)
                .build()
        );

        RestaurantStorageEntity table10 = restaurantStorageRepository.save(RestaurantStorageEntity.builder()
                .tableCapacity(4)
                .tableNumber(10)
                .build()
        );

        RestaurantStorageEntity table11 = restaurantStorageRepository.save(RestaurantStorageEntity.builder()
                .tableCapacity(6)
                .tableNumber(11)
                .build()
        );

        RestaurantStorageEntity table12 = restaurantStorageRepository.save(RestaurantStorageEntity.builder()
                .tableCapacity(2)
                .tableNumber(12)
                .build()
        );

        RestaurantStorageEntity table13 = restaurantStorageRepository.save(RestaurantStorageEntity.builder()
                .tableCapacity(2)
                .tableNumber(13)
                .build()
        );

        RestaurantStorageEntity table14 = restaurantStorageRepository.save(RestaurantStorageEntity.builder()
                .tableCapacity(8)
                .tableNumber(14)
                .build()
        );

        RestaurantStorageEntity table15 = restaurantStorageRepository.save(RestaurantStorageEntity.builder()
                .tableCapacity(4)
                .tableNumber(15)
                .build()
        );

        /*
            RESERVATIONS
         */
        reservationRepository.save(ReservationEntity.builder()
                .reservationName("Antonescu Mihaela")
                .reservationDate(LocalDate.of(2024, 1, 22))
                .reservationHour(20)
                .reservedTable(table3)
                .build()
        );

        reservationRepository.save(ReservationEntity.builder()
                .reservationName("Mircea Cornel")
                .reservationDate(LocalDate.of(2024, 1, 18))
                .reservationHour(16)
                .reservedTable(table4)
                .build()
        );

        reservationRepository.save(ReservationEntity.builder()
                .reservationName("Graur Catalin")
                .reservationDate(LocalDate.of(2024, 1, 20))
                .reservationHour(12)
                .reservedTable(table1)
                .build()
        );

    }
}
