package com.fire.alquiler.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "detalle_alquiler")
public class AlquilerDetalle {

    @EmbeddedId
    private DetalleAlquilerId id;  // Usando la clave compuesta

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false, insertable = false, updatable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_pelicula", nullable = false, insertable = false, updatable = false)
    private Pelicula pelicula;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fecha;

    @Column(nullable = false)
    private Double total;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoAlquiler estado;

    // Constructor vacío
    public AlquilerDetalle() {}

    // Constructor con parámetros
    public AlquilerDetalle(Cliente cliente, Pelicula pelicula, Date fecha, Double total, EstadoAlquiler estado) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

    // Getters y setters
    public DetalleAlquilerId getId() {
        return id;
    }

    public void setId(DetalleAlquilerId id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        ACTIVO, DEVUELTO, RETRASADO
    }
}
