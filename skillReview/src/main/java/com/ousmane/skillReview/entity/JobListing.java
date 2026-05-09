package com.ousmane.skillReview.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "joblistings")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class JobListing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column
    private String company;


    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private double salary;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private boolean published;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @PrePersist
    protected void onCreate(){
        createdAt = LocalDateTime.now();
        published=false;
    }
}
