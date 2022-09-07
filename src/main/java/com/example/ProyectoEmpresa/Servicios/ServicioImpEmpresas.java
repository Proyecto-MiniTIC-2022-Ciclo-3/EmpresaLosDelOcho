package com.example.ProyectoEmpresa.Servicios;

import com.example.ProyectoEmpresa.Entidades.Empresas;
import com.example.ProyectoEmpresa.repositorio.RepositorioEmpresas;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServicioImpEmpresas implements ServicioEmpresas {
    @Autowired
    private RepositorioEmpresas repositorioEmpresas;

    @Override
    public List<Empresas> listarEmpresas() {
        return repositorioEmpresas.findAll();
    }

    @Override
    public Empresas guardarEmpresas(Empresas empresas) {
        return repositorioEmpresas.save(empresas);
    }

    @Override
    public Empresas consultarEmpresasPorNit(Long nit) {
        return repositorioEmpresas.findById(nit).get();
    }

    @Override
    public Empresas actualizarEmpresas(Empresas empresas) {
        return repositorioEmpresas.save(empresas);
    }

    @Override
    public void eliminarEmpresas(Long nit) {
        repositorioEmpresas.deleteById(nit);

    }
}
