package com.example.laboratorio4_20192858.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="aerolinea")
public class Aerolinea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idaerolinea",nullable = false)
    private Integer idaerolinea;
    @Column(name="nombre",nullable = false)
    private String nombre;
    @Column(name="codigo",nullable = false)
    private String codigo;

}
