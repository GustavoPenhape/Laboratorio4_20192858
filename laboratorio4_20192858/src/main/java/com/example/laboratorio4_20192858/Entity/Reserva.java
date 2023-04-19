package com.example.laboratorio4_20192858.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idreserva",nullable = false)
    private Integer idreserva;
    @Column(name="fecha_reserva",nullable = false)
    private String fecha_reserva;
    @Column(name="precio_total",nullable = false)
    private Float precio_total;
    @Column(name="estado_pago",nullable = false)
    private String estado_pago;
    @ManyToOne
    @JoinColumn(name="iduser",nullable = false)
    private User iduser;
    @ManyToOne
    @JoinColumn(name="idvuelo",nullable = false)
    private Vuelo idvuelo;
}
