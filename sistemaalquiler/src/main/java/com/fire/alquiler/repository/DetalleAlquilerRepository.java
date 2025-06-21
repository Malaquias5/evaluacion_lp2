package com.fire.alquiler.repository;

import com.fire.alquiler.entity.AlquilerDetalle;
import com.fire.alquiler.entity.DetalleAlquilerId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleAlquilerRepository extends JpaRepository<AlquilerDetalle, DetalleAlquilerId> {
}
