package com.MiRedSalud.backend.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnfermedadData {
    
    private int idEnfermedad;
    private String nombreEnfermedad;
    private String sintoma;
    private String tratamiento;


}