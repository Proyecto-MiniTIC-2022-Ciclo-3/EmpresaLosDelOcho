package com.example.ProyectoEmpresa.ControladorFrom;

import com.example.ProyectoEmpresa.Entidades.Empleados;
import com.example.ProyectoEmpresa.Servicios.ServicioImpEmpleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorEmpleadoFrom {

    @Autowired
    private ServicioImpEmpleados siem;

    @GetMapping("/empleado") // informacion mediante la URL
    public String listar(Model modelo){
        modelo.addAttribute("empleado", siem.listarEmpleados());
        return ("empleado");
    }

    @GetMapping("empleadonuevo")
    public String formularioregistro(Model modelo){
        modelo.addAttribute("empleadoinsertar",new Empleados());
        return "regempleados";
    }

    @PostMapping("empleadoguardar")
    public String insertar(Empleados empleado){
        siem.guardarEmpleados(empleado);
        return "redirect:/empleado";
    }

}
