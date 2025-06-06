/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microservicios.curso.h2.controller;

import com.microservicios.curso.h2.model.Customer;
import com.microservicios.curso.h2.repository.CustomerRepository;
import com.microservicios.curso.h2.service.CustomerService;
import com.microservicios.curso.h2.view.CustomerDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author IDS
 */
@RestController
@RequestMapping("/api")
public class CustomerController
{    
    @Autowired
    private CustomerService customerService;
    
    @GetMapping("/customers")
    public List<CustomerDto> getCustomers()
    {
        return customerService.getCustomers();
    }
    
    @GetMapping("/customers/{customerNumber}")
    public CustomerDto getCustomer(@PathVariable("customerNumber") String customerNumber) throws Exception
    {
        return customerService.getCustomer(customerNumber);
    }
}
