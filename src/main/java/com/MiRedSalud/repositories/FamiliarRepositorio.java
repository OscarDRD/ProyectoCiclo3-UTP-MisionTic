package com.MiRedSalud.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.MiRedSalud.backend.entities.Familiar;

@Repository
public interface FamiliarRepositorio extends JpaRepository <Familiar, Integer>{
    
}
