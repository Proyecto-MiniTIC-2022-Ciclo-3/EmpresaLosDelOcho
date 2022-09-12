package com.example.ProyectoEmpresa.Repositorio;

import com.example.ProyectoEmpresa.Entidades.Empresas;
import com.example.ProyectoEmpresa.Entidades.Transacciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioTransacciones extends JpaRepository<Transacciones,Long> {

    //List<Transacciones> findById(Empresas empresas);
}
