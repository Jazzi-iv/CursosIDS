/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.microservicios.curso.accountCards.service;

import com.microservicios.curso.accountCards.model.AccountCards;
import com.microservicios.curso.accountCards.view.AccountCardsDTO;
import java.util.List;

/**
 *
 * @author IDS
 */
public interface AccountCardsService 
{
    List<AccountCardsDTO> getCardsByCustomerNumber(String customerNumber);
}
