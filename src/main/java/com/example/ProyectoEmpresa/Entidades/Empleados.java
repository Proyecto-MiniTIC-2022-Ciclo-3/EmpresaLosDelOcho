package com.example.ProyectoEmpresa.Entidades;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import java.util.Date;
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
    private String email;

    //@Column(name = "empresas_empleados", nullable = false)
    @ManyToOne
    @JoinColumn(name="nit_empresa", insertable = false,updatable = false)
    Empresas empresasEmpleados;

    @OneToMany(mappedBy = "empleados", cascade = CascadeType.ALL)
    private List<Transacciones>transacciones;

    @Column(name = "fecha_creacion_Empleados", nullable = false)
    private Date fechaCreacionEmpleados;

    @Column(name = "fecha_actualizacion_Empleados", nullable = false)
    private Date fechaActualizacionEmpleados;

    public Empleados(long idEmpleados, String nombres, String apellidos, String email, Empresas empresasEmpleados, List<Transacciones> transacciones, Date fechaCreacionEmpleados, Date fechaActualizacionEmpleados) {
        this.idEmpleados = idEmpleados;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.empresasEmpleados = empresasEmpleados;
        this.transacciones = transacciones;
        this.fechaCreacionEmpleados = fechaCreacionEmpleados;
        this.fechaActualizacionEmpleados = fechaActualizacionEmpleados;
    }

    public Empleados() {
    }

    public long getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(long idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Empresas getEmpresasEmpleados() {
        return empresasEmpleados;
    }

    public void setEmpresasEmpleados(Empresas empresasEmpleados) {
        this.empresasEmpleados = empresasEmpleados;
    }

    public List<Transacciones> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transacciones> transacciones) {
        this.transacciones = transacciones;
    }

    public Date getFechaCreacionEmpleados() {
        return fechaCreacionEmpleados;
    }

    public void setFechaCreacionEmpleados(Date fechaCreacionEmpleados) {
        this.fechaCreacionEmpleados = fechaCreacionEmpleados;
    }

    public Date getFechaActualizacionEmpleados() {
        return fechaActualizacionEmpleados;
    }

    public void setFechaActualizacionEmpleados(Date fechaActualizacionEmpleados) {
        this.fechaActualizacionEmpleados = fechaActualizacionEmpleados;
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
}
