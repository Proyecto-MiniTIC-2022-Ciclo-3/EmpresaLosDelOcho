package com.example.ProyectoEmpresa.ControladorFrom;

import com.example.ProyectoEmpresa.Entidades.Empresas;
import com.example.ProyectoEmpresa.Servicios.ServicioImpEmpresas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class ControladorEmpresaFrom {

    @Autowired
    private ServicioImpEmpresas sie;

    //@GetMapping("index")

    @GetMapping("empresa")
    public String listar(Model modelo){
        modelo.addAttribute("empresa", sie.listarEmpresas());
        return ("empresa");
    }

    @GetMapping("empresa/nueva")
    public String formularioregistro(Model modelo){
        modelo.addAttribute("empresainsertar",new Empresas());
        return "regempresa";
    }

    @PostMapping("empresa/guardar")
    public String insertar(Empresas empresa){
        sie.guardarEmpresas(empresa);
        return "redirect:/empresa";
    }

    @GetMapping("empresasactualizar/{dato}")
    public String formularioActualizar(@PathVariable("dato") Long dato, Model modelo){
        Empresas empresa=sie.consultarEmpresasPorNIT(dato);
        modelo.addAttribute("empresaactualizar", empresa);
        return "actempresa";
    }

    @PostMapping("empresasactualizar")
    public String actualizar(Empresas empresa){
        sie.actualizarEmpresas(empresa);
        return "redirect:/empresa";
    }

    @GetMapping("empresaeliminar/{id}")
    public String eliminarporId(@PathVariable("id") Long id){
        sie.eliminarEmpresas(id);
        return ("redirect:/empresa");
    }

}
