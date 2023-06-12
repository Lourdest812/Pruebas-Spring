package com.unla.grupo12.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="degree")
public class Degree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="institution")
    private String institution;

    @Column(name="year")
    private int year;

    @Column(name="createdat")
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name="updateat")
    @UpdateTimestamp
    private LocalDateTime updateAt;
    
}

