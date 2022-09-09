package com.example.ProyectoEmpresa.Controladores;

import com.example.ProyectoEmpresa.Entidades.Empresas;
import com.example.ProyectoEmpresa.Servicios.ServicioImpEmpresas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/empresas")
@RestController
public class ControladorEmpresa {

    @Autowired
    private ServicioImpEmpresas sie;

    //Controlador para consultar
    @GetMapping
    public List<Empresas> listar(){ return sie.listarEmpresas();
    }

    //Controlador para consultar por Id
    @GetMapping("/{id}")
    public Empresas consultarporId(@PathVariable("id") Long id){
        return sie.consultarEmpresasPorNIT(id);
    }

    //Controlador para guardar datos
    @PostMapping
    public Empresas insertar(@RequestBody Empresas empre){
        return sie.guardarEmpresas(empre);
    }

    // Controlador para actualizar informacion
    @PutMapping
    public Empresas actualizar(@RequestBody Empresas empre) {
        return sie.actualizarEmpresas(empre);
    }

    //Controlador para eliminar
    /*@DeleteMapping
    public void eliminar(@RequestBody Empresas empre){
        sie.eliminarEmpresas(empre.getNitEmpresa());
    }*/

    //Controlador para eliminar por Id
    @DeleteMapping("/{id}")
    public void eliminarporId(@PathVariable Long id){
        sie.eliminarEmpresas(id);
    }

    //Controlador para actualizar por Id
    @PatchMapping("/{id}")
    public Empresas actualizarPorId(@PathVariable("id")Long id, @RequestBody Map<Object,Object> objectMap){
        return sie.actualizarPorId(id,objectMap);
    }
}
