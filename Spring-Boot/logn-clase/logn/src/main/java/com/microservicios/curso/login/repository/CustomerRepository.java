/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.microservicios.curso.login.repository;

import com.microservicios.curso.login.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author IDS
 */
public interface CustomerRepository extends JpaRepository<Customer, String>
{
    
}
