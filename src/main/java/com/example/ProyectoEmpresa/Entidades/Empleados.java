package com.example.ProyectoEmpresa.Entidades;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Empleados {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_empleados", nullable = false)
    private long idEmpleados;

    @Column(name = "correo_empleado", nullable = false, unique = true)
    private String email;



}
