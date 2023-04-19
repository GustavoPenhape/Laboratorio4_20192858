package com.example.laboratorio4_20192858.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="vuelo")
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idvuelo",nullable = false)
    private Integer idvuelo;
    @Column(name="origen",nullable = false)
    private String fecha_reserva;
    @Column(name="destino",nullable = false)
    private String destino;
    @Column(name="fecha_salida",nullable = false)
    private String fecha_salida;
    @Column(name="fecha_llegada",nullable = false)
    private String fecha_llegada;
    @Column(name="duracion",nullable = false)
    private Integer duracion;
    @Column(name="precio",nullable = false)
    private Float precio;
    @Column(name="asientos_disponibles",nullable = false)
    private Integer asientos_disponibles;
    @Column(name="descripcion",nullable = false)
    private String descripcion;
    @ManyToOne
    @JoinColumn(name="idaerolinea",nullable = false)
    private Aerolinea aerolinea_idaerolinea;

}
