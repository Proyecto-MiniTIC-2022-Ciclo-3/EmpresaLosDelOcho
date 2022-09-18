package com.example.ProyectoEmpresa.Servicios;

import com.example.ProyectoEmpresa.Entidades.Empleados;
import com.example.ProyectoEmpresa.Repositorio.RepositorioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
public class ServicioImpEmpleados implements ServicioEmpleados {

    @Autowired
    //private CrudRepository crudRepository;
    private RepositorioEmpleado repositorioEmpleado;

    @Override
    public List<Empleados> listarEmpleados() {return repositorioEmpleado.findAll();
    }

    @Override
    public Empleados guardarEmpleados(Empleados empleados) {;
        return repositorioEmpleado.save(empleados);
    }

    @Override
    public Empleados consultarEmpleadosPorID(Long docEmpleados) {
        return repositorioEmpleado.findById(docEmpleados).get();
    }

    @Override
    public Empleados actualizarEmpleados(Empleados empleados) {
        return repositorioEmpleado.save(empleados);
    }

    @Override
    public void eliminarEmpleadosPorId(Long docEmpleados) {
        repositorioEmpleado.deleteById(docEmpleados);

    }
    @Override
    public Empleados actualizarPorId(Long docEmplea, Map<Object, Object> objectMap) {
        Empleados emple=repositorioEmpleado.findById(docEmplea).get();
        objectMap.forEach((key, value)->{
            Field field= ReflectionUtils.findField(Empleados.class,(String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field,emple,value);
        });
        return repositorioEmpleado.save(emple);
    }


}


