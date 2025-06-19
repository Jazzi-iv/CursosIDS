/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microservicios.curso.accountCards.business;

import com.microservicios.curso.accountCards.model.AccountCards;
import com.microservicios.curso.accountCards.repository.AccountCardsRepository;
import com.microservicios.curso.accountCards.service.AccountCardsService;
import com.microservicios.curso.accountCards.view.AccountCardsDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author IDS
 */
@Service
public class AccountCardsServiceImp implements AccountCardsService 
{
    @Autowired
    private AccountCardsRepository accountCardsRepository;
        
    public List<AccountCardsDTO> getCardsByCustomerNumber(String customerNumber)
    {
        return accountCardsRepository.findByCustomerNumber(customerNumber);
    }
}
