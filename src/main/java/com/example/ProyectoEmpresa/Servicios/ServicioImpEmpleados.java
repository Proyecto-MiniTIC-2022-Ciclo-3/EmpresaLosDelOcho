package com.example.ProyectoEmpresa.Servicios;

import com.example.ProyectoEmpresa.Entidades.Empleados;
import com.example.ProyectoEmpresa.Repositorio.RepositorioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioImpEmpleados implements ServicioEmpleados {

    @Autowired
    //private CrudRepository crudRepository;
    private RepositorioEmpleado repositorioEmpleado;

    @Override
    public List<Empleados> listarEmpleados() {
        return repositorioEmpleado.findAll();
    }

    @Override
    public Empleados guardarEmpleados(Empleados empleados) {
        return repositorioEmpleado.save(empleados);
    }

    @Override
    public Empleados consultarEmpleadosPorID(Long idEmpleados) {
        return repositorioEmpleado.findById(idEmpleados).get();
    }

    @Override
    public Empleados actualizarEmpleados(Empleados empleados) {
        return repositorioEmpleado.save(empleados);
    }

    @Override
    public void eliminarEmpleados(Long idEmpleados) {
        repositorioEmpleado.deleteById(idEmpleados);

    }


}


