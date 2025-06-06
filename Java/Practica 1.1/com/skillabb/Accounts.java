/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.skillabb;

import com.skillabb.model.Account;
/**
 *
 * @author IDS
 */
public class Accounts 
{
    public static void main(String[] args) 
    {
        Account acc = new Account("Jazzi", "ABC-123", 33);
        System.out.println("name: " + acc.customerName);
        System.out.println("account: " + acc.accountNumber);
        System.out.println("balance: " + acc.balance);
    }
}
