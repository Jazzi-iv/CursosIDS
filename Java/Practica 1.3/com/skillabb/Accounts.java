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
        System.out.println("name: " + acc.customerName);
        System.out.println("account: " + acc.accountNumber);
        System.out.println("balance: " + acc.balance);
        
        //Practica 1.2
        AccountsImp.validateAccounts(acc.accountNumber, acc.balance);
        
        //Practica 1.3
        AccountsImp nuevas = new AccountsImp();
        nuevas.generateAccounts();
        
        int i = 0;
        
        for(Account nueva : nuevas.ctas)
        {
            System.out.println("name " + (i + 1) + ": " + nuevas.ctas[i].customerName);
            System.out.println("account " + (i + 1) + ": " + nuevas.ctas[i].accountNumber);
            System.out.println("balance " + (i + 1) + ": " + nuevas.ctas[i].balance);
            i++;
        }
    }
}
