/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microservicios.curso.login.business;

import com.microservicios.curso.login.model.Customer;
import com.microservicios.curso.login.view.Credentials;
import com.microservicios.curso.login.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import com.microservicios.curso.login.repository.CustomerRepository;
import java.util.Objects;
import java.util.function.BiPredicate;
import org.springframework.stereotype.Service;


/**
 *
 * @author IDS
 */
@Service
public class AuthenticationServiceImp implements AuthenticationService 
{
    @Autowired
    private CustomerRepository customerRepository;
    
    BiPredicate<Customer, Credentials> customerValidation = (customer, credentials) -> Objects.isNull(customer) || !customer.getCustomerNumber().equals(credentials.getCustomerNumber()) || !customer.getPassword().equals(credentials.getPassword()); 
    
    @Override
    public boolean authenticate(Credentials credentials) throws Exception
    {
        Customer customer = customerRepository.findById(credentials.getCustomerNumber())
                .orElse(null);
        
        if(customerValidation.test(customer, credentials))
            return false;
        
        return true;
    }
}
