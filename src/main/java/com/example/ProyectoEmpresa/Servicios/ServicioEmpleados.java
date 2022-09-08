package com.example.ProyectoEmpresa.Servicios;

import com.example.ProyectoEmpresa.Entidades.Empleados;

import java.util.List;
import java.util.Map;

public interface ServicioEmpleados {

    List<Empleados>listarEmpleados();
    public Empleados guardarEmpleados(Empleados empleados);
    public Empleados consultarEmpleadosPorID(Long idEmpleados);
    public Empleados actualizarEmpleados(Empleados empleados);
    public void eliminarEmpleadosPorId(Long idEmpleados);
    public Empleados actualizarPorId(Long idEmplea, Map<Object,Object> objectMap);




}
