package com.MiRedSalud.backend.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.MiRedSalud.backend.converters.EnfermedadConverter;
import com.MiRedSalud.backend.data.EnfermedadData;
import com.MiRedSalud.backend.entities.Enfermedad;
import com.MiRedSalud.repositories.EnfermedadRepositorio;

@Service
public class EnfermedadService {

    @Autowired
    private EnfermedadRepositorio enfermedadRepositorio;

    private EnfermedadConverter enfermedadConverter = new EnfermedadConverter();
    
    public List<EnfermedadData> findAll() {
        return enfermedadConverter.toData(enfermedadRepositorio.findAll());
    }

    public EnfermedadData findById(int id) {
        Optional<Enfermedad> enfermedad = enfermedadRepositorio.findById(id);
        if (enfermedad.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "¡La enfermedad no existe!");
        return enfermedadConverter.toData(enfermedad.get());
    }

    public EnfermedadData insert(EnfermedadData enfermedad) {
        if (enfermedadRepositorio.existsById(enfermedad.getIdEnfermedad()))
            throw new ResponseStatusException(HttpStatus.CONFLICT, "¡La enfermedad ya existe!");
        return enfermedadConverter.toData(enfermedadRepositorio.save(enfermedadConverter.toEntity(enfermedad)));
    }

    public EnfermedadData update(EnfermedadData enfermedad) {
        if (!enfermedadRepositorio.existsById(enfermedad.getIdEnfermedad()))
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "¡La enfermedad no existe!");
        return enfermedadConverter.toData(enfermedadRepositorio.save(enfermedadConverter.toEntity(enfermedad)));
    }

    public EnfermedadData deleteById(int id) {
        Optional<Enfermedad> enfermedad = enfermedadRepositorio.findById(id);
        if (enfermedad.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "¡La enfermedad no existe!");
        EnfermedadData enfermedadData = enfermedadConverter.toData(enfermedad.get());
        enfermedadRepositorio.deleteById(id);
        return enfermedadData;
    }
}
