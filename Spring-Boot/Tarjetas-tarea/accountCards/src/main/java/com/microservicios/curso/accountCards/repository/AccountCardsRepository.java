/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.microservicios.curso.accountCards.repository;

import com.microservicios.curso.accountCards.model.AccountCards;
import com.microservicios.curso.accountCards.model.AccountCardsId;
import com.microservicios.curso.accountCards.view.AccountCardsDTO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author IDS
 */
public interface AccountCardsRepository extends JpaRepository <AccountCards, AccountCardsId>
{
    List<AccountCardsDTO> findByCustomerNumber(String customerNumber);
}
