package com.example.ProyectoEmpresa.Entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Perfiles")
public class Perfiles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_perfiles", nullable = false) //Pendiente definir si debe manejarse como una tabla
    private long idPerfiles;

    private String imagen;

    @Column(name = "telefono_perfil", nullable = false)
    private String telefonoPerfil;

    private Empleados empleados;

    @Column(name = "fecha_creacion_perfil", nullable = false)
    private Date fechaCreacionPerfil;

    @Column(name = "fecha_actualizacion_perfil", nullable = false)
    private Date fechaActualizacionPerfil;

    public Perfiles(long idPerfiles, String imagen, String telefonoPerfil, Empleados empleados, Date fechaCreacionPerfil, Date fechaActualizacionPerfil) {
        this.idPerfiles = idPerfiles;
        this.imagen = imagen;
        this.telefonoPerfil = telefonoPerfil;
        this.empleados = empleados;
        this.fechaCreacionPerfil = fechaCreacionPerfil;
        this.fechaActualizacionPerfil = fechaActualizacionPerfil;
    }

    public Perfiles() {
    }

    public long getIdPerfiles() {
        return idPerfiles;
    }

    public void setIdPerfiles(long idPerfiles) {
        this.idPerfiles = idPerfiles;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTelefonoPerfil() {
        return telefonoPerfil;
    }

    public void setTelefonoPerfil(String telefonoPerfil) {
        this.telefonoPerfil = telefonoPerfil;
    }

    public Empleados getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleados empleados) {
        this.empleados = empleados;
    }

    public Date getFechaCreacionPerfil() {
        return fechaCreacionPerfil;
    }

    public void setFechaCreacionPerfil(Date fechaCreacionPerfil) {
        this.fechaCreacionPerfil = fechaCreacionPerfil;
    }

    public Date getFechaActualizacionPerfil() {
        return fechaActualizacionPerfil;
    }

    public void setFechaActualizacionPerfil(Date fechaActualizacionPerfil) {
        this.fechaActualizacionPerfil = fechaActualizacionPerfil;
    }
}
