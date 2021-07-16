/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.dao;

import com.prueba.domain.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author daniel.delgado
 */

public interface PersonaDao extends CrudRepository<Persona, Long>{
    
    
    
    
}
