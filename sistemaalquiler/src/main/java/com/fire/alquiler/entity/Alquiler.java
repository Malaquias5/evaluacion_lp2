package com.fire.alquiler.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "alquileres")
public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alquiler")
    private Integer idAlquiler;

    @Column(nullable = false)
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @Column(nullable = false)
    private Double total;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoAlquiler estado;

    // Constructor vacío
    public Alquiler() {}

    // Constructor con parámetros
    public Alquiler(LocalDate fecha, Cliente cliente, Double total, EstadoAlquiler estado) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.total = total;
        this.estado = estado;
    }

    // Getters y setters
    public Integer getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(Integer idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public EstadoAlquiler getEstado() {
        return estado;
    }

    public void setEstado(EstadoAlquiler estado) {
        this.estado = estado;
    }

    // Enum para el estado del alquiler
    public enum EstadoAlquiler {
        ACTIVO,
        DEVUELTO,
        RETRASADO
    }
}
