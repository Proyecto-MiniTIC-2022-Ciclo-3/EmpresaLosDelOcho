package com.example.ProyectoEmpresa.ControladorFrom;

import com.example.ProyectoEmpresa.Servicios.ServicioImpEmpresas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ControladorEmpresaFrom {

    @Autowired
    private ServicioImpEmpresas sie;

    //@GetMapping("index")

    @GetMapping("/empresa") // informacion mediante la URL
    public String listar(Model modelo){
        modelo.addAttribute("empresa", sie.listarEmpresas());
        return ("empresa");
    }



}
