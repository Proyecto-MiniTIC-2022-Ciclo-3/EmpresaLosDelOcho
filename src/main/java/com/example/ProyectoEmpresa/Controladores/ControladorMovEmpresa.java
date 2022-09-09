package com.example.ProyectoEmpresa.Controladores;

import com.example.ProyectoEmpresa.Entidades.Transacciones;
import com.example.ProyectoEmpresa.Servicios.ServicioImpTransacciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")

public class ControladorMovEmpresa {
    @Autowired
    private ServicioImpTransacciones sit;
    @GetMapping
    private List<Transacciones> listar(){return sit.listarTransacciones();}
}
