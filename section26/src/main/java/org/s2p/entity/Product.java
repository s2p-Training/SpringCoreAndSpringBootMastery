package org.s2p.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "products")
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "name", length = 250, nullable = false)
    private String name;

    @Column(name = "description", length = 500, nullable = false)
    private String description;

    @Column(name = "price",nullable = false)
    private BigDecimal price;

    @Column(name = "popularity", nullable = false)
    private Integer popularity;

    @Column(name = "image_url", length = 500)
    private String imageUrl;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "created_by", length =  20, nullable = false)
    private String createdBy;

    @Column(name = "updated_at", nullable = true)
    private Instant updatedAt;

    @Column(name = "updated_by", length =  20, nullable = true)
    private String updatedBy;

}
