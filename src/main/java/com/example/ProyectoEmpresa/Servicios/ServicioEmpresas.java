package com.example.ProyectoEmpresa.Servicios;

import com.example.ProyectoEmpresa.Entidades.Empresas;

import java.util.List;

public interface ServicioEmpresas {
    public List<Empresas>listarEmpresas();
    public Empresas guardarEmpresas(Empresas empresas);
    public Empresas consultarEmpresasPorNit(Long nit);
    public Empresas actualizarEmpresas(Empresas empresas);
    public void eliminarEmpresas(Long nit);





}
