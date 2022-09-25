package com.example.ProyectoEmpresa.Repositorio;
import com.example.ProyectoEmpresa.Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, String> {

    Usuario findByEmail(String email);


}
