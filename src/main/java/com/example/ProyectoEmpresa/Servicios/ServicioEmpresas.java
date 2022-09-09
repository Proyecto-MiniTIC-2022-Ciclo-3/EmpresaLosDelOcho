package com.example.ProyectoEmpresa.Servicios;

import com.example.ProyectoEmpresa.Entidades.Empresas;

import java.util.List;
import java.util.Map;

public interface ServicioEmpresas {

    List<Empresas>listarEmpresas();
    public Empresas guardarEmpresas(Empresas empresas);
    public Empresas consultarEmpresasPorNIT(Long nitEmpresa);
    public Empresas actualizarEmpresas(Empresas empresas);
    public void eliminarEmpresas(Long nitEmpresa);
    public Empresas actualizarPorId(Long nitEmpre, Map<Object,Object> objectMap);



}
