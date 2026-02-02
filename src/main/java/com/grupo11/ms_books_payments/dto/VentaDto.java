package com.grupo11.ms_books_payments.dto;
import lombok.Data;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.boot.convert.DataSizeUnit;

import java.util.Date;
@Data
public class VentaDto {

    private Long idVenta;
    private String numeroOrden;
    private Date fechaVenta;
    private double porcentajeDescuento;
    private double costoEnvio;
    private String estadoVenta;




}
