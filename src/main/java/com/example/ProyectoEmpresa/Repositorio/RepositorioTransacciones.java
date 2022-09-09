package com.example.ProyectoEmpresa.Repositorio;

import com.example.ProyectoEmpresa.Entidades.Transacciones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioTransacciones extends JpaRepository<Transacciones,Long> {
}
