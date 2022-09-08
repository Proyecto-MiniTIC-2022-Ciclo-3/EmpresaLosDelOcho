package com.example.ProyectoEmpresa.servicios;

import com.example.ProyectoEmpresa.entidades.Empresas;

import java.util.List;

public interface ServicioEmpresas {
    public List<Empresas>listarEmpresas();
    public Empresas guardarEmpresas(Empresas empresas);
    public Empresas consultarEmpresasPorNit(Long nit);
    public Empresas actualizarEmpresas(Empresas empresas);
    public void eliminarEmpresas(Long nit);





}
