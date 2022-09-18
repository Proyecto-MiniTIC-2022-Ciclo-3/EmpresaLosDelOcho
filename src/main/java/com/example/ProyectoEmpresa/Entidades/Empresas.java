package com.example.ProyectoEmpresa.Entidades;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Empresas")
public class Empresas {

    @Id
    @Column(name = "nit_empresa", nullable = false, unique = true)
    private long nitEmpresa;

    @Column(name = "nombre_empresa", nullable = false, unique = true)
    private String nombreEmpresa;

    @Column(name = "telefono_empresa", nullable = false)
    private String telefonoEmpresa;

    @Column(name = "direccion_empresa", nullable = false)
    private String direccionEmpresa;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDate fechaCreacion;


    public Empresas(long nitEmpresa, String nombreEmpresa, String telefonoEmpresa, String direccionEmpresa, LocalDate fechaCreacion) {
        this.nitEmpresa = nitEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.fechaCreacion = fechaCreacion;
    }

    public Empresas() {
    }

    public long getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(long nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
