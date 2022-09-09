package com.example.ProyectoEmpresa.Controladores;

import com.example.ProyectoEmpresa.Modelo.MovEmpresa;
import com.example.ProyectoEmpresa.Vista.MovEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class ControladorMovEmpresa {
    @Autowired
    private ControladorMovEmpresa repository;


    @GetMapping("/ControladorMovEmpresa")
    Public List ControladorMovEmpresa AllMonto() {
        return repository.findAll();
    }

    @GetMapping("/ControladorMovEmpresa/{monto}")
    Public List MovEmpresa findByMonto(@PathVariable("monto") Integer monto) {
        return repository.findByMonto(monto);
    }

    @PostMapping("/MovEmpresa")
    public MovEmpresa createMovEmpresa(@RequestBody MovEmpresa MovEmpresa) {
        return repository.save(MovEmpresa);
    }

    @PutMapping("/MovEmpresa/{id}")
    public MovEmpresa updateMovEmpresa(@PathVariable int id, @RequestBody MovEmpresa MovEmpresa) {
        return repository.save(MovEmpresa);
    }

    @DeleteMapping("/MovEmpresa/{id}")
    public void deleteMovEmpresa(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }
}
