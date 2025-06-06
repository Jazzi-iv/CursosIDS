/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.microservicios.curso.h2.service;

import com.microservicios.curso.h2.model.Customer;
import com.microservicios.curso.h2.view.CustomerDto;
import java.util.List;

/**
 *
 * @author IDS
 */
public interface CustomerService 
{
    List<CustomerDto> getCustomers();
    
    CustomerDto getCustomer(String customerNumber) throws Exception;
}
