package com.unla.grupo12.entities;

import jakarta.annotation.Generated;
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
@Table(name="Dispositivo")
public class Dispositivo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected int id;

    @Column(name="nombre")
    protected String nombre;

    @Column(name="activo")
    protected boolean activo;

    public Dispositivo(int id, String nombre, boolean activo){
        this.id=id;
        this.nombre=nombre;
        this.activo=activo;
    }

    public Dispositivo(String nombre, boolean activo){
        this.nombre=nombre;
        this.activo=activo;
    }
}
