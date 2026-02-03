package com.grupo11.ms_books_payments.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
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
