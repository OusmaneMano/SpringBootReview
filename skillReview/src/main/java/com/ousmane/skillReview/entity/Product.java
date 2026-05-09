package com.ousmane.skillReview.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable=false)
    private double price;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private boolean published;

    @Column(nullable = false)
    private LocalDateTime createAt;


@PrePersist
    protected void onCreate(){
    createAt = LocalDateTime.now();
    published = false;

}
}
