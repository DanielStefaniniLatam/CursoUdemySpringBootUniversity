/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.web;

import com.prueba.domain.Persona;
import com.prueba.servicio.PersonaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author daniel.delgado
 */
@CrossOrigin(origins = {"http://localhost:8089/"})
@RestController
public class ControladorRest {
    
    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/personas")
    List<Persona> all(){
        return personaService.listarPersona();
    }
    
    @GetMapping("/personas/{id}")
    Optional<Persona> getPersona(@PathVariable("id") Long idPersona){
        return personaService.personById(idPersona);
    }
    
}
