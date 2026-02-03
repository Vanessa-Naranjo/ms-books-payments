package com.grupo11.ms_books_payments.service.impl;

import com.grupo11.ms_books_payments.dto.VentaDto;
import com.grupo11.ms_books_payments.entity.VentaEntity;
import com.grupo11.ms_books_payments.repository.VentaRepository;
import com.grupo11.ms_books_payments.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaServiceImpl implements VentaService {

  @Autowired
  private VentaRepository ventaRepository;

  @Override
  public VentaDto crearVenta(VentaDto ventaDTO) {

    VentaEntity ventaEntity = new VentaEntity();
    ventaEntity.setFechaVenta(ventaDTO.getFechaVenta());
    ventaEntity.setEstadoVenta(ventaDTO.getEstadoVenta());
    ventaEntity.setNumeroOrden(ventaDTO.getNumeroOrden());
    ventaEntity.setCostoEnvio(ventaDTO.getCostoEnvio());
    ventaEntity.setPorcentajeDescuento(ventaDTO.getPorcentajeDescuento());
    ventaRepository.save(ventaEntity);

    return ventaDTO;
  }
}
