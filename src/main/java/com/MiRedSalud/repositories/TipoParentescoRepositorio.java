package com.MiRedSalud.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.MiRedSalud.backend.entities.TipoParentesco;

@Repository
public interface TipoParentescoRepositorio extends JpaRepository <TipoParentesco, Integer>{
    
}
