/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba;

import com.prueba.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Value("${index.saludo}")
    private String saludo;
    
    @GetMapping("/")
    public String inicio(Model model){
        var mensaje = "Hola mundo con Thymeleaf....";
        
        var persona = new Persona();
        persona.setNombre("Daniel");
        persona.setApellido("Delgado");
        persona.setEmail("dasdafe");
        persona.setTelefono("1334");
        
        var persona2 = new Persona();
        persona2.setNombre("Katerine");
        persona2.setApellido("Delgado");
        persona2.setEmail("dasfsg");
        persona2.setTelefono("45664");
        
        //List<Persona> personas = new ArrayList();
        //personas.add(persona);
        //personas.add(persona2);
        
        var personas = Arrays.asList(persona,persona2);
        //var personas = new ArrayList();
        
        log.info("Ejecutando el controlador Spring MVC");
        
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        //model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        
        return "index";
    }
    
}
