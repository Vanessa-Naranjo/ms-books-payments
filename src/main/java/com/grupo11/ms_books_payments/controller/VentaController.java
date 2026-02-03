package com.grupo11.ms_books_payments.controller;

import com.grupo11.ms_books_payments.dto.VentaDto;
import com.grupo11.ms_books_payments.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VentaController {

  @Autowired
  private VentaService ventaService;

  @PostMapping("/venta")
  public ResponseEntity<VentaDto> crearVenta(@RequestBody VentaDto ventaDto){
    return ResponseEntity.status(HttpStatus.CREATED).body(ventaService.crearVenta(ventaDto));
  }

}
