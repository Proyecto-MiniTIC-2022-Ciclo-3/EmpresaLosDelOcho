package com.example.ProyectoEmpresa.Controladores;

import com.example.ProyectoEmpresa.Entidades.Empleados;
import com.example.ProyectoEmpresa.Servicios.ServicioImpEmpleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/empleados")
@RestController
public class ControladorEmpleados {

    @Autowired
    private ServicioImpEmpleados sie;

    //Controlador para consultar
    @GetMapping
    public List<Empleados>listar(){
        return sie.listarEmpleados();
    }

    //Controlador para guardar datos
    @PostMapping
    public Empleados insertar(@RequestBody Empleados emple){
        return sie.guardarEmpleados(emple);
    }

    // Controlador para actualizar informacion
    @PutMapping
    public Empleados actualizar(@RequestBody Empleados emple) {
        return sie.actualizarEmpleados(emple);
    }

    //Controlador para eliminar
    @DeleteMapping
    public void eliminar(@RequestBody Empleados emple){
        sie.eliminarEmpleados(emple.getIdEmpleados());
    }







}
