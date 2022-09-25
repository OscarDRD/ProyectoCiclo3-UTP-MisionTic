package com.MiRedSalud.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.MiRedSalud.backend.entities.Enfermedad;

@Repository
public interface EnfermedadRepositorio extends JpaRepository <Enfermedad, Integer>{
    
}

