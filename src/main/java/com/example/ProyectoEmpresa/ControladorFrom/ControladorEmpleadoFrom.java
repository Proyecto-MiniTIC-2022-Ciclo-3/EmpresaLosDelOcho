package com.example.ProyectoEmpresa.ControladorFrom;

import com.example.ProyectoEmpresa.Entidades.Empleados;
import com.example.ProyectoEmpresa.Entidades.Empresas;
import com.example.ProyectoEmpresa.Entidades.Usuario;
import com.example.ProyectoEmpresa.Servicios.ServicioImpEmpleados;
import com.example.ProyectoEmpresa.Servicios.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorEmpleadoFrom {

    @Autowired
    private ServicioImpEmpleados siem;

    @Autowired
    private ServicioUsuario su;

    public ControladorEmpleadoFrom(ServicioUsuario serviciousuario) {
        this.su= serviciousuario;
    }

    @GetMapping("/")
    public String inicio(Model model, @AuthenticationPrincipal OidcUser principal) {
        if(principal!=null) {
            Usuario usuario=this.su.obtenerUsuario(principal.getClaims());
            System.out.println(principal.getClaims());
            model.addAttribute("usuario",usuario);
        }
        return "index";
    }

    @GetMapping("inicio")
    public String motrarinicio(){
        return "inicio";
    }

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

    @GetMapping("empleadosactualizar/{dato}")
    public String formularioActualizar(@PathVariable("dato") Long dato, Model modelo){
        Empleados empleado=siem.consultarEmpleadosPorID(dato);
        modelo.addAttribute("empleadoactualizar", empleado);
        return "actempleados";
    }

    @PostMapping("empleadosactualizar")
    public String actualizar(Empleados empleado){
        siem.actualizarEmpleados(empleado);
        return "redirect:/empleado";
    }

    @GetMapping("empleadoseliminar/{id}")
    public String eliminarporId(@PathVariable("id") Long id){
        siem.eliminarEmpleadosPorId(id);
        return ("redirect:/empleado");
    }

}
