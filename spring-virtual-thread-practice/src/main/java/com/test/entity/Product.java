package com.test.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "PRODUCT_TBLS")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long price;
}