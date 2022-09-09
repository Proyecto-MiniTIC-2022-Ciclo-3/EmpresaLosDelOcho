package com.example.ProyectoEmpresa.Servicios;

import com.example.ProyectoEmpresa.Entidades.Empleados;
import com.example.ProyectoEmpresa.Entidades.Transacciones;
import com.example.ProyectoEmpresa.Repositorio.RepositorioTransacciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class ServicioImpTransacciones implements ServicioTransacciones{
    @Autowired
    private RepositorioTransacciones repositorioTransacciones;

    @Override
    public List<Transacciones> listarTransacciones() {
        return repositorioTransacciones.findAll();
    }

    @Override
    public Transacciones guardarTransacciones(Transacciones transacciones) {
        return repositorioTransacciones.save(transacciones);
    }

    @Override
    public Transacciones consultarTransaccionesPorID(Long idTransacciones) {
        return repositorioTransacciones.findById(idTransacciones).get();
    }

    @Override
    public Transacciones actualizarTransacciones(Transacciones transacciones) {
        return repositorioTransacciones.save(transacciones);
    }

    @Override
    public void eliminarTransaccionesPorId(Long idTransacciones) {repositorioTransacciones.deleteById(idTransacciones);

    }

    @Override
    public Transacciones actualizarPorId(Long idTransac, Map<Object, Object> objectMap) {
        Transacciones transaccion=repositorioTransacciones.findById(idTransac).get();
        objectMap.forEach((key, value)->{
            Field field= ReflectionUtils.findField(Transacciones.class,(String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field,transaccion,value);
        });
        return repositorioTransacciones.save(transaccion);
    }
}
