package com.grupo11.ms_books_payments.repository;

import com.grupo11.ms_books_payments.entity.VentaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository <VentaEntity, Integer> {

}
