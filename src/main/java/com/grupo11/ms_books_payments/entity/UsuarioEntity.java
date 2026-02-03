package com.grupo11.ms_books_payments.entity;

import jakarta.persistence.*;

@Entity
@Table(name="TBL_USUARIOS")
public class UsuarioEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idVenta;
  private String correoUsuario;
  private String claveUsuario;
  private String estadoUsuario;
}
