package com.example.ProyectoEmpresa.Repositorio;

import com.example.ProyectoEmpresa.Entidades.Empresas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEmpresa extends JpaRepository<Empresas, Long> {
}
