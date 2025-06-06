/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microservicios.curso.h2.business;

import com.microservicios.curso.h2.model.Customer;
import com.microservicios.curso.h2.repository.CustomerRepository;
import com.microservicios.curso.h2.service.CustomerService;
import com.microservicios.curso.h2.view.CustomerDto;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author IDS
 */

@Service
public class CustomerServiceImp implements CustomerService
{
    @Autowired
    private CustomerRepository customerRepository;
    
    private Function<Customer, CustomerDto> mapper = customer -> new CustomerDto(customer.getName(), customer.getLastName(), customer.getEmail());
    
    @Override
    public List<CustomerDto> getCustomers()
    {
        return customerRepository.findAll().stream().map(mapper).collect(Collectors.toList());
    }

    @Override
    public CustomerDto getCustomer(String customerNumber) throws Exception
    {
        return mapper.apply(customerRepository.findById(customerNumber).orElseThrow(() -> new Exception("Customer not found.")));
    }            
}
