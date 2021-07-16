/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.servicio;

import com.prueba.dao.PersonaDao;
import com.prueba.domain.Persona;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author daniel.delgado
 */
@Service
public class PersonaServiceImpl implements PersonaService{
    
    @Autowired
    private PersonaDao personaDao;
    
    @Override
    @Transactional(readOnly = true) //No modifica información
    public List<Persona> listarPersona() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true) //No modifica informacion
    public Persona encontrarPersona(Persona persona) {
        //return personaDao.findById(persona.getIdPersona()).orElse(null);
    	return null;
    }
    

    @Override
    public Optional<Persona> personById(Long id) {
        return personaDao.findById(id);
    }
    
}
