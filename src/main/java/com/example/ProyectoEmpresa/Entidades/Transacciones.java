package com.example.ProyectoEmpresa.Entidades;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name="Transacciones")
public class Transacciones {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_transaccion", nullable = false)
    private long idTransaccion;

    @Column(name = "conepto_transaccion", nullable = false)
    private String coneptoTransaccion;

    @Column(name = "monto_transaccion", nullable = false)
    private float montoTransaccion;

    @ManyToOne
    @JoinColumn(name="id_empleados")
    private Empleados empleados;

    @ManyToOne
    @JoinColumn(name="nit_empresa")
    private Empresas empresas;

    @Column(name = "fecha_creacion_transaccion", nullable = false)
    private LocalDate fechaCreacionTransaccion;

    public Transacciones(long idTransaccion, String coneptoTransaccion, float montoTransaccion, Empleados empleados, Empresas empresas, LocalDate fechaCreacionTransaccion) {
        this.idTransaccion = idTransaccion;
        this.coneptoTransaccion = coneptoTransaccion;
        this.montoTransaccion = montoTransaccion;
        this.empleados = empleados;
        this.empresas = empresas;
        this.fechaCreacionTransaccion = fechaCreacionTransaccion;
    }

    public Transacciones() {
    }

    public long getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(long idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getConeptoTransaccion() {
        return coneptoTransaccion;
    }

    public void setConeptoTransaccion(String coneptoTransaccion) {
        this.coneptoTransaccion = coneptoTransaccion;
    }

    public float getMontoTransaccion() {
        return montoTransaccion;
    }

    public void setMontoTransaccion(float montoTransaccion) {
        this.montoTransaccion = montoTransaccion;
    }

    public Empleados getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleados empleados) {
        this.empleados = empleados;
    }

    public Empresas getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Empresas empresas) {
        this.empresas = empresas;
    }

    public LocalDate getFechaCreacionTransaccion() {
        return fechaCreacionTransaccion;
    }

    public void setFechaCreacionTransaccion(LocalDate fechaCreacionTransaccion) {
        this.fechaCreacionTransaccion = fechaCreacionTransaccion;
    }
}
