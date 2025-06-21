package com.fire.alquiler.entity;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DetalleAlquilerId implements Serializable {
    private Integer idAlquiler;
    private Integer idPelicula;

    // Constructor vacío
    public DetalleAlquilerId() {}

    // Constructor con parámetros
    public DetalleAlquilerId(Integer idAlquiler, Integer idPelicula) {
        this.idAlquiler = idAlquiler;
        this.idPelicula = idPelicula;
    }

    // Getters y setters
    public Integer getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(Integer idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    // Métodos hashCode y equals para que la clave primaria compuesta funcione correctamente
    @Override
    public int hashCode() {
        return Objects.hash(idAlquiler, idPelicula);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetalleAlquilerId that = (DetalleAlquilerId) o;
        return Objects.equals(idAlquiler, that.idAlquiler) &&
                Objects.equals(idPelicula, that.idPelicula);
    }
}
