package com.MiRedSalud.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.MiRedSalud.backend.entities.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository <Usuario, Integer>{
    
}
