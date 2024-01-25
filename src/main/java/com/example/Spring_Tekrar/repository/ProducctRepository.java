package com.example.Spring_Tekrar.repository;

import com.example.Spring_Tekrar.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Optional<Product> findByProductName(String productName);
    Optional<Product> findByProductNameIgnoreCase(String productName);

    List<Product> findAllByProductNameContainingIgnoreCase(String productName);

    List<Product> findAllByProductPriceBetween(Double start, Double end);



    List<Product> findAllByProductPriceGreaterThan(Double price);

    List<Product> findAllByProductUnitInStockGreaterThan(Integer stock);

    List<Product> findAllByProductPriceGreaterThanEqual(Double price);

    Integer countByProductCategory(String category);

    Long countByProductNameIgnoreCase(String name);



    Boolean existsByProductNameIgnoreCase(String name);


    List<Product> findByProductCategoryIsNull();

    List<Product> findByProductCategoryStartingWithIgnoreCase(String name);









}