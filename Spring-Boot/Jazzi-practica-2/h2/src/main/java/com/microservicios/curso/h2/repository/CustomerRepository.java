/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.microservicios.curso.h2.repository;
import com.microservicios.curso.h2.model.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author IDS
 */
public interface CustomerRepository extends JpaRepository<Customer, String>
{
    List<Customer> findByStatus (String status);
}