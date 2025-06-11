/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microservicios.curso.account.model.business;

import com.microservicios.curso.account.model.Account;
import com.microservicios.curso.account.model.AccountId;
import com.microservicios.curso.account.model.service.AccountService;
import com.microservicios.curso.account.repository.AccountRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservicios.curso.account.repository.view.AccountDTO;

/**
 *
 * @author IDS
 */
@Service
public class AccountServiceImp  implements AccountService
{
    @Autowired
    private AccountRepository accountRepository;
    
    private final static String STATUS = "ACT";
    
    public List<Account> getAccounts()
    {
        List<Account> accounts = accountRepository.findAll();
        return accounts.stream().filter(account -> account.getStatus().equals(STATUS)).collect(Collectors.toList());
    }
    public Account getAccount(AccountId accountId)
    {
        return null;
    }
    public List<Account> getCustomerAccounts(String customerNumber)
    {
        List<Account> accs = accountRepository.findByCustomerNumber(customerNumber);
        return accs;
    }
}
