/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microservicios.curso.h2.controller;

import com.microservicios.curso.h2.model.Customer;
import com.microservicios.curso.h2.repository.CustomerRepository;
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
    private CustomerRepository customerRepository;
    @GetMapping("/customers")
    public List<Customer> getCustomers(@RequestParam(name = "status", required = false) String status)
    {
        if (Objects.nonNull(status))
        {
            return customerRepository.findByStatus(status);
        }
        return customerRepository.findAll();
    }
    
    @GetMapping("/customers/{customerNumber}")
    public Customer getCustomer(@PathVariable("customerNumber") String customerNumber) throws Exception
    {
        return customerRepository.findById(customerNumber).orElseThrow(() -> new Exception("Customer not found."));
    }
}
