package com.example.ProyectoEmpresa.Entidades;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Empleados")
public class Empleados {

    @Id
    @Column(name = "id_empleados", nullable = false,unique = true)
    private long documento;

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
    private LocalDate fechaCreacionEmpleados;


    public Empleados(long documento, String nombres, String apellidos, String correo, Empresas empresasEmpleados, LocalDate fechaCreacionEmpleados) {
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.empresasEmpleados = empresasEmpleados;
        this.fechaCreacionEmpleados = fechaCreacionEmpleados;
    }

    public Empleados() {
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
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

    public LocalDate getFechaCreacionEmpleados() {
        return fechaCreacionEmpleados;
    }

    public void setFechaCreacionEmpleados(LocalDate fechaCreacionEmpleados) {
        this.fechaCreacionEmpleados = fechaCreacionEmpleados;
    }
}
