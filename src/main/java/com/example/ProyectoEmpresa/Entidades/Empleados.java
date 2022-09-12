package com.example.ProyectoEmpresa.Entidades;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Empleados")
public class Empleados {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_empleados", nullable = false)
    private long idEmpleados;

    @Column(name = "nombres_empleado", nullable = false)
    private String nombres;

    @Column(name = "apellidos_empleado", nullable = false)
    private String apellidos;

    @Column(name = "correo_empleado", nullable = false, unique = true)
    private String correo;

    //@Column(name = "empresas_empleados", nullable = false)
    @ManyToOne
    @JoinColumn(name="nit_empresa")
    private Empresas empresasEmpleados;

    @Column(name = "fecha_creacion_Empleados", nullable = false)
    private LocalDateTime fechaCreacionEmpleados;

    @Column(name = "fecha_actualizacion_Empleados", nullable = false)
    private LocalDateTime fechaActualizacionEmpleados;

    public Empleados() {
    }

    public long getIdEmpleados() {
        return idEmpleados;
    }

    public Empleados(long idEmpleados, String nombres, String apellidos, String correo, Empresas empresasEmpleados, LocalDateTime fechaCreacionEmpleados, LocalDateTime fechaActualizacionEmpleados) {
        this.idEmpleados = idEmpleados;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.empresasEmpleados = empresasEmpleados;
        this.fechaCreacionEmpleados = fechaCreacionEmpleados;
        this.fechaActualizacionEmpleados = fechaActualizacionEmpleados;
    }

    public void setIdEmpleados(long idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresas getEmpresasEmpleados() {
        return empresasEmpleados;
    }

    public void setEmpresasEmpleados(Empresas empresasEmpleados) {
        this.empresasEmpleados = empresasEmpleados;
    }

    public LocalDateTime getFechaCreacionEmpleados() {
        return fechaCreacionEmpleados;
    }

    public void setFechaCreacionEmpleados(LocalDateTime fechaCreacionEmpleados) {
        this.fechaCreacionEmpleados = fechaCreacionEmpleados;
    }

    public LocalDateTime getFechaActualizacionEmpleados() {
        return fechaActualizacionEmpleados;
    }

    public void setFechaActualizacionEmpleados(LocalDateTime fechaActualizacionEmpleados) {
        this.fechaActualizacionEmpleados = fechaActualizacionEmpleados;
    }
}
