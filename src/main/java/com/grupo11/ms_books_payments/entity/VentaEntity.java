package com.grupo11.ms_books_payments.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="TBL_VENTAS")
public class VentaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenta;
    private String numeroOrden;
    private Date fechaVenta;
    private double porcentajeDescuento;
    private double costoEnvio;
    private String estadoVenta;
}
