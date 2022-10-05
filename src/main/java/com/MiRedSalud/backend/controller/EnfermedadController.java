package com.MiRedSalud.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MiRedSalud.backend.Services.EnfermedadService;
import com.MiRedSalud.backend.data.EnfermedadData;


@RestController
@RequestMapping(path = "/api/enfermedades")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class EnfermedadController {
    
    @Autowired
    private EnfermedadService enfermedadService;

    //Listar todas las categorias
    @GetMapping
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<>(enfermedadService.findAll(), HttpStatus.OK);
    }

    //Listar una categoria (por id)
    @GetMapping("{id}")
    public ResponseEntity<?> findById(@PathVariable int id) {
        return new ResponseEntity<>(enfermedadService.findById(id), HttpStatus.OK);
    }

    //Agregar una categoria
    @PostMapping
    public ResponseEntity<?> insert(@RequestBody EnfermedadData category) {
        return new ResponseEntity<>(enfermedadService.insert(category), HttpStatus.CREATED);
    }

    //Editar una categoria
    @PutMapping
    public ResponseEntity<?> update(@RequestBody EnfermedadData category) {
        return new ResponseEntity<>(enfermedadService.update(category), HttpStatus.OK);
    }

    //Eliminar una categoria
    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id) {
        return new ResponseEntity<>(enfermedadService.deleteById(id), HttpStatus.OK);
    }
}
