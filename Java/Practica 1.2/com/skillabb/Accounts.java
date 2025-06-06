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
        Account acc = new Account("Jazzi", "3214567", 1);
        System.out.println("name: " + acc.customerName);
        System.out.println("account: " + acc.accountNumber);
        System.out.println("balance: " + acc.balance);
        
        AccountsImp.validateAccounts(acc.accountNumber, acc.balance);
    }
}
