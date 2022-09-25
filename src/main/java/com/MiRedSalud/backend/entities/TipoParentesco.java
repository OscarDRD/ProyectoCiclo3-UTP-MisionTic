package com.MiRedSalud.backend.entities;

import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoParentesco {

    @Id
    @Column(nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idParentesco;
    //Nullable: Obligatorio
    //unique No se repita la categoria
    @Column(nullable =false, unique = true)
    private String parentesco;

}
