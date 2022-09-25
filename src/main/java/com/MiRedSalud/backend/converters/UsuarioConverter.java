package com.MiRedSalud.backend.converters;

import com.MiRedSalud.backend.data.UsuarioData;
import com.MiRedSalud.backend.entities.Usuario;

public class UsuarioConverter extends Converter<Usuario, UsuarioData> {

    private EnfermedadConverter enfermedadConverter = new EnfermedadConverter();
    private FamiliarConverter familiarConverter = new FamiliarConverter();
    private TipoParentescoConverter tipoParentescoConverter =new TipoParentescoConverter();

    @Override
    public Usuario toEntity(UsuarioData object) {
        return object == null ? null : Usuario.builder()
        .id(object.getId())
        .nombre(object.getNombre())
        .password(object.getPassword())
        .email(object.getEmail())
        .enable(object.isEnable())
        .enfermedades(enfermedadConverter.toEntity(object.getEnfermedades()))
        .familia(familiarConverter.toEntity(object.getFamilia()))
        .parentesco(tipoParentescoConverter.toEntity(object.getParentesco()))
        .build();
    }

    @Override
    public UsuarioData toData(Usuario object) {
        return object == null ? null : UsuarioData.builder()
        .id(object.getId())
        .nombre(object.getNombre())
        .password(null)
        .email(object.getEmail())
        .enable(object.isEnable())
        .enfermedades(enfermedadConverter.toData(object.getEnfermedades()))
        .familia(familiarConverter.toData(object.getFamilia()))
        .parentesco(tipoParentescoConverter.toData(object.getParentesco()))
        .build();
    }
}
