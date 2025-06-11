/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microservicios.curso.account.model.api;

import com.microservicios.curso.account.model.Account;
import com.microservicios.curso.account.model.service.AccountService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author IDS
 */
@RestController
@RequestMapping("/api")
public class AccountController 
{
    @Autowired
    private AccountService accountService;
    
    @GetMapping("/accounts/{customerNumber}")
    public List<Account> accountRetrive(@PathVariable("customerNumber") String customerNumber)
    {
        return accountService.getCustomerAccounts(customerNumber);
    }
}
