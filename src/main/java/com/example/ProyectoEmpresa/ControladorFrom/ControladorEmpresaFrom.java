package com.example.ProyectoEmpresa.ControladorFrom;

import com.example.ProyectoEmpresa.Entidades.Empresas;
import com.example.ProyectoEmpresa.Servicios.ServicioImpEmpresas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("empresanueva")
    public String formularioregistro(Model modelo){
        modelo.addAttribute("empresainsertar",new Empresas());
        return "regempresa";
    }

    @PostMapping("empresaguardar")
    public String insertar(Empresas empresa){
        sie.guardarEmpresas(empresa);
        return "redirect:/empresa";
    }



}
