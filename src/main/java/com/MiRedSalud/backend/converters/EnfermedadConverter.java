package com.MiRedSalud.backend.converters;

import com.MiRedSalud.backend.data.EnfermedadData;
import com.MiRedSalud.backend.entities.Enfermedad;

public class EnfermedadConverter extends Converter<Enfermedad, EnfermedadData> {

    @Override
    public Enfermedad toEntity(EnfermedadData object) {
        return object == null ? null : Enfermedad.builder()
        .idEnfermedad(object.getIdEnfermedad())
        .nombreEnfermedad(object.getNombreEnfermedad())
        .sintoma(object.getSintoma())
        .tratamiento(object.getTratamiento())
        .build();
    }

    @Override
    public EnfermedadData toData(Enfermedad object) {
        return object == null ? null : EnfermedadData.builder()
        .idEnfermedad(object.getIdEnfermedad())
        .nombreEnfermedad(object.getNombreEnfermedad())
        .sintoma(object.getSintoma())
        .tratamiento(object.getTratamiento())
        .build();
    } 
}
