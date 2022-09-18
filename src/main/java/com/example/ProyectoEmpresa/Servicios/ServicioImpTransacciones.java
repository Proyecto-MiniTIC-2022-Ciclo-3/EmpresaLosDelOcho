package com.example.ProyectoEmpresa.Servicios;

import com.example.ProyectoEmpresa.Entidades.Empleados;
import com.example.ProyectoEmpresa.Entidades.Transacciones;
import com.example.ProyectoEmpresa.Repositorio.RepositorioEmpleado;
import com.example.ProyectoEmpresa.Repositorio.RepositorioEmpresa;
import com.example.ProyectoEmpresa.Repositorio.RepositorioTransacciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class ServicioImpTransacciones implements ServicioTransacciones{

    @Autowired
    private RepositorioTransacciones repositorioTransacciones;

    private RepositorioEmpleado repositotrioemple;

    private RepositorioEmpresa repositorioempre;

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

    @Override
    public List<Transacciones> findbysqlmovimiento(Long idtransaccion) {
        return repositorioTransacciones.findAllById(Collections.singleton(idtransaccion));
    }



    /*public Transacciones agregarTransaccion(Long nitEmpresa,Long idEmpleados,Transacciones transacciones){

        repositorioempre.findById(nitEmpresa)
                .map(empresas -> {
                    transacciones.setEmpresas(empresas);
                    return empresas;
                });

        return repositotrioemple.findById(idEmpleados)
                .map(empleados -> {

                    transacciones.setEmpleados(empleados);
                    return repositorioTransacciones.save(transacciones);
                }).get();
    }*/

    /*public ServicioImpTransacciones(RepositorioTransacciones repositorioTransacciones, RepositorioEmpleado repositotrioemple, RepositorioEmpresa repositorioempre) {
        this.repositorioTransacciones = repositorioTransacciones;
        this.repositotrioemple = repositotrioemple;
        this.repositorioempre = repositorioempre;
    }

    public List<Transacciones>listarporlibro(Long id){
        List<Transacciones> lista=null;
        if(!this.repositorioTransacciones.existsById(id)){
            return lista;
        }
        return repositorioTransacciones.findById(repositorioempre.findById(id).get());
    }*/
}
