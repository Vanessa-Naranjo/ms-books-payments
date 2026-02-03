package com.grupo11.ms_books_payments.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="TBL_PRODUCTOS_FACTURADOS")
public class ProductoFacturadoEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idProductoFacturado;
  private Long idLibro;
  private int cantidadItem;
  private double precioUnitarioLibro;
  private String estadoProductoFacturado;

}
