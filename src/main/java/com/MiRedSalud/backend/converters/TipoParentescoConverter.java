package com.MiRedSalud.backend.converters;

import com.MiRedSalud.backend.data.TipoParentescoData;
import com.MiRedSalud.backend.entities.TipoParentesco;

public class TipoParentescoConverter extends Converter<TipoParentesco, TipoParentescoData>  {
    
    @Override
    public TipoParentesco toEntity(TipoParentescoData object) {
        return object == null ? null : TipoParentesco.builder()
        .idParentesco(object.getIdParentesco())
        .parentesco(object.getParentesco())
        .build();
    }

    @Override
    public TipoParentescoData toData(TipoParentesco object) {
        return object == null ? null : TipoParentescoData.builder()
        .idParentesco(object.getIdParentesco())
        .parentesco(object.getParentesco())
        .build();
    } 
}
