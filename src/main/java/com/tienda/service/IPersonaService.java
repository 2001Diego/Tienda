/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Diego Segura Vega
 */

package com.tienda.service;

import com.tienda.entity.persona;
import java.util.List;

public interface IPersonaService {
    public List<persona> getAllPersona();
    public persona getPersonaById (long id);
    public void savePersona (persona persona);
    public void delete (long id);
}
