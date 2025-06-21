package com.fire.alquiler.repository;

import com.fire.alquiler.entity.AlquilerDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlquilerDetalleRepository extends JpaRepository<AlquilerDetalle, Integer> {
}
