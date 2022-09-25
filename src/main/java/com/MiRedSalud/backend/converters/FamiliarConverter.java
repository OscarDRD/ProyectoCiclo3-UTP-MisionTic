package com.MiRedSalud.backend.converters;

import com.MiRedSalud.backend.data.FamiliarData;
import com.MiRedSalud.backend.entities.Familiar;

public class FamiliarConverter extends Converter<Familiar, FamiliarData> {
    
    private EnfermedadConverter enfermedadConverter = new EnfermedadConverter();

    @Override
    public Familiar toEntity(FamiliarData object) {
        return object == null ? null : Familiar.builder()
        .idFamiliar(object.getIdFamiliar())
        .nombreFamiliar(object.getNombreFamiliar())
        .edad(object.getEdad())
        .enfermedades(enfermedadConverter.toEntity(object.getEnfermedades()))
        .build();
    }

    @Override
    public FamiliarData toData(Familiar object) {
        return object == null ? null : FamiliarData.builder()
        .idFamiliar(object.getIdFamiliar())
        .nombreFamiliar(object.getNombreFamiliar())
        .edad(object.getEdad())
        .enfermedades(enfermedadConverter.toData(object.getEnfermedades()))
        .build();
    }

    
}
