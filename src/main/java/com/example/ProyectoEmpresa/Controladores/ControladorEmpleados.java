package com.example.ProyectoEmpresa.Controladores;

import com.example.ProyectoEmpresa.Entidades.Empleados;
import com.example.ProyectoEmpresa.Servicios.ServicioImpEmpleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RequestMapping("/empleados")
@RestController
public class ControladorEmpleados {

    @Autowired
    private ServicioImpEmpleados sie;

    //Controlador para consultar
    @GetMapping
    public List<Empleados>listar(){ return sie.listarEmpleados();
    }

    //Controlador para consultar por Id
    @GetMapping("/{id}")
    public Empleados consultarporId(@PathVariable("id") Long id){
        return sie.consultarEmpleadosPorID(id);
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
    /*@DeleteMapping
    public void eliminar(@RequestBody Empleados emple){ sie.eliminarEmpleadosPorId(emple.getIdEmpleados());
    }*/

    //Controlador para eliminar por Id
    @DeleteMapping("/{id}")
    public void eliminarporId(@PathVariable Long id){
        sie.eliminarEmpleadosPorId(id);
    }

    //Controlador para actualizar por Id
    @PatchMapping("/{id}")
    public Empleados actualizarporId(@PathVariable("id") Long id, @RequestBody Map<Object,Object> objectMap){
        return sie.actualizarPorId(id,objectMap);
    }

}
