package com.MiRedSalud.backend.entities;


import java.util.List;

import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Familiar {
    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFamiliar;

    @Column(nullable = false)
    private String nombreFamiliar;

    @Column(nullable = false)
    private int edad;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private List<Enfermedad> enfermedades;

}
