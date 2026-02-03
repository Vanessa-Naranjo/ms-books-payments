package com.grupo11.ms_books_payments.dto;

import lombok.Data;

@Data
public class UsuarioDto {
  private Long idUsuario;
  private String correoUsuario;
  private String claveUsuario;
  private String estadoUsuario;
}
