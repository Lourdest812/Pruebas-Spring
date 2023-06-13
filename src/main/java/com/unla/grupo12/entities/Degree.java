package com.unla.grupo12.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
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

	@Column(name="updatedat")
	@UpdateTimestamp
	private LocalDateTime updatedAt;

	public Degree(int id, String name, String institution, int year) {
		this.id = id;
		this.name = name;
		this.institution = institution;
		this.year = year;
	}

	public Degree(String name, String institution, int year) {
		this.name = name;
		this.institution = institution;
		this.year = year;
	}
}

