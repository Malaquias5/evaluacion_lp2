package com.fire.alquiler.service;

import com.fire.alquiler.entity.AlquilerDetalle;
import com.fire.alquiler.repository.AlquilerDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlquilerService {

    @Autowired
    private AlquilerDetalleRepository alquilerDetalleRepository;


    public AlquilerDetalle guardarAlquilerDetalle(AlquilerDetalle alquilerDetalle) {
        return alquilerDetalleRepository.save(alquilerDetalle);
    }

    public Iterable<AlquilerDetalle> listarAlquilerDetalles() {
        return alquilerDetalleRepository.findAll();
    }
}
