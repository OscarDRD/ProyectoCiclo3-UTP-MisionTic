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
public class UsuarioData {

    private int id;
    private String nombre;
    private int edad;
    private String email;
    private String password;
    private boolean enable;
    private List<EnfermedadData> enfermedades;
    private List<FamiliarData> familia;
    private List<TipoParentescoData> parentesco;
    
}
