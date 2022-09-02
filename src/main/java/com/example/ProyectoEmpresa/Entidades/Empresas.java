package com.example.ProyectoEmpresa.Entidades;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Empresas")
public class Empresas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "nit_empresa", nullable = false)
    private long nitEmpresa;

    @Column(name = "nombre_empresa", nullable = false, unique = true)
    private String nombreEmpresa;

    @Column(name = "documento_empresa", nullable = false, unique = true)
    private String documentoEmpresa;

    @Column(name = "telefono_empresa", nullable = false)
    private String telefonoEmpresa;

    @Column(name = "direccion_empresa", nullable = false)
    private String direccionEmpresa;

    private List<Empleados>empleados;

    private List<Transacciones>transacciones;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "fecha_actualizacion", nullable = false)
    private Date fechaActualizacion;

    public Empresas(long nitEmpresa, String nombreEmpresa, String documentoEmpresa, String telefonoEmpresa, String direccionEmpresa, List<Empleados> empleados, List<Transacciones> transacciones, Date fechaCreacion, Date fechaActualizacion) {
        this.nitEmpresa = nitEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.documentoEmpresa = documentoEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.empleados = empleados;
        this.transacciones = transacciones;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
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

    public String getDocumentoEmpresa() {
        return documentoEmpresa;
    }

    public void setDocumentoEmpresa(String documentoEmpresa) {
        this.documentoEmpresa = documentoEmpresa;
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

    public List<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleados> empleados) {
        this.empleados = empleados;
    }

    public List<Transacciones> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transacciones> transacciones) {
        this.transacciones = transacciones;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

}
