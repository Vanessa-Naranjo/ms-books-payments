package com.grupo11.ms_books_payments.dto;
import lombok.Data;

import java.util.Date;
@Data
public class VentaDto {

    private Long idVenta;
    private String numeroOrden;
    private Date fechaVenta;
    private double porcentajeDescuento;
    private double costoEnvio;
    private String estadoVenta;

    private UsuarioDto usuarioDTO;

}
