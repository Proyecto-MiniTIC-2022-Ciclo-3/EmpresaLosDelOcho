package com.example.ProyectoEmpresa.Servicios;

import com.example.ProyectoEmpresa.Entidades.Empresas;
import com.example.ProyectoEmpresa.Repositorio.RepositorioEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Service
public class ServicioImpEmpresas implements ServicioEmpresas {

    @Autowired
    private RepositorioEmpresa repositorioEmpresa;


    @Override
    public List<Empresas> listarEmpresas() {
        return repositorioEmpresa.findAll();
    }

    @Override
    public Empresas guardarEmpresas(Empresas empresas) {

        return repositorioEmpresa.save(empresas);
    }

    @Override
    public Empresas consultarEmpresasPorNIT(Long nitEmpresa) {
        return repositorioEmpresa.findById(nitEmpresa).get();
    }

    @Override
    public Empresas actualizarEmpresas(Empresas empresas) {
        return repositorioEmpresa.save(empresas);
    }

    @Override
    public void eliminarEmpresas(Long nitEmpresa) {
        repositorioEmpresa.deleteById(nitEmpresa);
    }

    @Override
    public Empresas actualizarPorId(Long nitEmpre, Map<Object, Object> objectMap) {
        Empresas empre=repositorioEmpresa.findById(nitEmpre).get();
        objectMap.forEach((key, value)->{
            Field field= ReflectionUtils.findField(Empresas.class,(String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, empre,value);
        });
        return repositorioEmpresa.save(empre);
    }


}
