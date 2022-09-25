package com.MiRedSalud.backend.entities;

import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Enfermedad {
    @Id
    @Column(nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEnfermedad;

    @Column(nullable =false, unique = true)
    private String nombreEnfermedad;

    @Column(nullable =false, unique = true)
    private String sintoma;
    
    @Column(nullable =false, unique = true)
    private String tratamiento;
}
