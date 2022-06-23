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
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Diego Segura Vega
 */
@Repository
public interface PaisRepository extends CrudRepository<persona,Long> {
    
}

