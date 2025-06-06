/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.skillabb.service.imp;

import com.skillabb.model.Account;

/**
 *
 * @author IDS
 */
public class AccountsImp 
{
    public Account[] ctas = new Account[3];

    public void generateAccounts()
    {
        this.ctas[0] = new Account("Jazmin","12345678",88);
        this.ctas[1] = new Account("Pablo", "87654321", 76);
        this.ctas[2] = new Account("Arturo", "32145678", 0);
    }
    
    public static void validateAccounts(String numCta, double bal)
    {
        if(bal > 0 && numCta != "32145678")
            System.out.println("La cuenta existe");
        else
            System.out.println("La cuenta no existe");
    }
}
