/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microservicios.curso.accountCards.api;

import com.microservicios.curso.accountCards.service.AccountCardsService;
import com.microservicios.curso.accountCards.view.AccountCardsDTO;
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
public class AccountCardsController 
{
    @Autowired
    private AccountCardsService accountCardsService;
    
    @GetMapping("/cards/{customerNumber}")
    public List<AccountCardsDTO> getCardsByCustomerNumber(@PathVariable("customerNumber") String customerNumber)
    {
        return accountCardsService.getCardsByCustomerNumber(customerNumber);
    }
}
