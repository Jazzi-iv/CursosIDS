/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.microservicios.curso.account.model.service;

import com.microservicios.curso.account.model.Account;
import com.microservicios.curso.account.model.AccountId;
import java.util.List;

/**
 *
 * @author IDS
 */
public interface AccountService 
{
    List<Account> getAccounts();
    Account getAccount(AccountId accountId);
    List<Account> getCustomerAccounts(String customerNumber);
}