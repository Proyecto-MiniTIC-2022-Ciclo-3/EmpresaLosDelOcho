package com.example.ProyectoEmpresa.ControladorFrom;

import com.example.ProyectoEmpresa.Servicios.ServicioImpTransacciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class CrontroladorMovFrom {

    @Autowired
    private ServicioImpTransacciones sit;

    @GetMapping("/movimientos") // informacion mediante la URL
    public String listar(Model modelo){
        modelo.addAttribute("movimientos", sit.listarTransacciones());
        return ("movimientos");
    }
}
