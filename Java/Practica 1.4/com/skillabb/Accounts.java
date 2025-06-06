/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.skillabb;

import com.skillabb.model.Account;
import com.skillabb.service.imp.AccountsImp;
/**
 *
 * @author IDS
 */
public class Accounts 
{
    public static void main(String[] args) 
    {
        //Practica 1.1
        Account acc = new Account("Jazzi", "3214567", 1);
        System.out.println("name: " + acc.getCustomerName());
        System.out.println("account: " + acc.getAccountNumber());
        System.out.println("balance: " + acc.getBalance());
        
        //Practica 1.2
        AccountsImp.validateAccounts(acc.getAccountNumber(), acc.getBalance());
        
        //Practica 1.3
        AccountsImp nuevas = new AccountsImp();
        nuevas.generateAccounts();
        
        int i = 0;
        
        for(Account nueva : nuevas.ctas)
        {
            System.out.println("name " + (i + 1) + ": " + nuevas.ctas[i].getCustomerName());
            System.out.println("account " + (i + 1) + ": " + nuevas.ctas[i].getAccountNumber());
            System.out.println("balance " + (i + 1) + ": " + nuevas.ctas[i].getBalance());
            i++;
        }
        
        //Practica 1.4
        //Implementacion de API Time y Getters.
    }
}
