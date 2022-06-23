/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Diego Segura Vega
 */
package com.tienda.repository;

import com.tienda.entity.persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Diego Segura Vega
 */
@Repository
public interface PersonaRepository extends CrudRepository<persona,Long> {

    public void deleteById(long id);

    
    
}
