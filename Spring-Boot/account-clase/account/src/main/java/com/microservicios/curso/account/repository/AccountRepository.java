/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.microservicios.curso.account.repository;

import com.microservicios.curso.account.model.Account;
import com.microservicios.curso.account.model.AccountId;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author IDS
 */
public interface AccountRepository extends JpaRepository <Account, AccountId>
{
    List<Account> findByCustomerNumber (String customerNumber);
}
