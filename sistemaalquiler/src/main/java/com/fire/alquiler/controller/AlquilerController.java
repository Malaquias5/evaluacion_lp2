package com.fire.alquiler.controller;

import com.fire.alquiler.entity.AlquilerDetalle;
import com.fire.alquiler.entity.Cliente;
import com.fire.alquiler.entity.Pelicula;
import com.fire.alquiler.service.AlquilerService;
import com.fire.alquiler.repository.ClienteRepository;
import com.fire.alquiler.repository.PeliculaRepository;
import com.fire.alquiler.repository.AlquilerDetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class AlquilerController {

    @Autowired
    private AlquilerService alquilerService;

    @Autowired
    private AlquilerDetalleRepository alquilerDetalleRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PeliculaRepository peliculaRepository;

    @GetMapping("/alquileres")
    public String listarAlquileres(Model model) {
        // Aquí cambiamos 'listarAlquileres()' por 'listarAlquilerDetalles()' que existe en el servicio
        model.addAttribute("alquileres", alquilerService.listarAlquilerDetalles());
        return "alquileres/lista";  // Thymeleaf
    }

    @GetMapping("/nuevo-alquiler")
    public String nuevoAlquiler(Model model) {
        model.addAttribute("clientes", clienteRepository.findAll());
        model.addAttribute("peliculas", peliculaRepository.findAll());
        model.addAttribute("alquiler", new AlquilerDetalle());  // Para el formulario (cambiado a AlquilerDetalle)
        return "alquileres/nuevo";  // Thymeleaf
    }

    @PostMapping("/guardar-alquiler")
    public String guardarAlquiler(@ModelAttribute AlquilerDetalle alquilerDetalle) {  // Cambiado a AlquilerDetalle
        // Cambiamos 'guardarAlquiler()' por 'guardarAlquilerDetalle()' que existe en el servicio
        alquilerService.guardarAlquilerDetalle(alquilerDetalle);  // Cambiado a AlquilerDetalle
        return "redirect:/alquileres";
    }
}
