package com.grupo11.ms_books_payments.dto;

import lombok.Data;

@Data
public class ProductoFacturadoDto {
  private Long idProductoFacturado;
  private Long idLibro;
  private int cantidadItem;
  private double precioUnitarioLibro;
  private String estadoProductoFacturado;

  private VentaDto ventaDTO;

}
