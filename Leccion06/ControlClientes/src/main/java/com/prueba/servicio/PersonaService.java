/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.servicio;

import com.prueba.domain.Persona;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author daniel.delgado
 */
public interface PersonaService {
    
    public List<Persona> listarPersona();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
    
    public Optional<Persona> personById(Long id);
    
}
