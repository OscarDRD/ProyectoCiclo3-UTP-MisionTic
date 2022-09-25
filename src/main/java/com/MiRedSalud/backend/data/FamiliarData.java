package com.MiRedSalud.backend.data;
import java.util.List;


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
public class FamiliarData {

    private int idFamiliar;
    private String nombreFamiliar;
    private int edad;
    private List<EnfermedadData> enfermedades;
}
