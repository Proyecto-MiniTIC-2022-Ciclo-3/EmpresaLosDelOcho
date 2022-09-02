package com.example.ProyectoEmpresa.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Empresas")
public class Empresa {

    @Id
    private String nombreEmpresa;
    @Column(nullable = false, length = 30)
    private String direccionEmpresa;

    @Column(nullable = false, length = 20)
    private int numeroEmpresa;

    @Column(nullable = false, length = 20, unique = true)
    private int nitEmpresa;

    public Empresa(String nombreEmpresa, String direccionEmpresa, int numeroEmpresa, int nitEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.numeroEmpresa = numeroEmpresa;
        this.nitEmpresa = nitEmpresa;
    }

    public Empresa() {
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public int getNumeroEmpresa() {
        return numeroEmpresa;
    }

    public void setNumeroEmpresa(int numeroEmpresa) {
        this.numeroEmpresa = numeroEmpresa;
    }

    public int getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(int nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }
}
