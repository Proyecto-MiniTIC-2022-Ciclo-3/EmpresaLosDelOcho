package com.example.ProyectoEmpresa.Controladores;

import com.example.ProyectoEmpresa.Entidades.Empresas;
import com.example.ProyectoEmpresa.Entidades.Transacciones;
import com.example.ProyectoEmpresa.Servicios.ServicioImpEmpresas;
import com.example.ProyectoEmpresa.Servicios.ServicioImpTransacciones;
import com.example.ProyectoEmpresa.Servicios.ServicioTransacciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empre/nitempresa")
//@RequestMapping()

public class ControladorMovEmpresa {


    /*ServicioImpTransacciones servicio;
    public ControladorMovEmpresa(ServicioImpTransacciones servicio){this.servicio= servicio;}*/

    @Autowired
    private ServicioImpTransacciones sit;
    @Autowired
    private ServicioImpEmpresas sie;

    //@GetMapping
    //private List<Transacciones> listar(){return sit.listarTransacciones();}

    //Controlador para consultar por Id
    @GetMapping
    public Empresas consultarporId(@PathVariable("nitempresa") Long nitempresa){
        return sie.consultarEmpresasPorNIT(nitempresa);
    }


    /*@GetMapping("/listarempresa/{idm}")
    public List<Transacciones> porlibro(@PathVariable("idm") Long idm){
        return servicio.listarporlibro(idm);

    }

    @PostMapping("/empresa/{id}/{movimiento}")
    public Transacciones add(@PathVariable("idm") Long idm, @PathVariable("movimiento") Long mov, @Validated @RequestBody Transacciones transacciones){

        return servicio.agregarTransaccion(idm,mov,transacciones);
    }*/
}
