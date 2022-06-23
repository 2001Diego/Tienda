/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.persona;
import com.tienda.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Diego Segura Vega
 */
public class PersonaService implements IPersonaService {
    
    @Service
    @Autowired
    private PersonaRepository personaRepository;
    
    @Override
    public List<persona> getAllPersona() {
        return (List<persona>)personaRepository.findAll();
    }

    @Override
    public Object getPersonaById(long id) {
       return personaRepository.findById(id).erElse(null);
    }

    @Override
    public void savePersona(persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void delete(long id) {
        personaRepository.deleteById(id);
    }
    
}
