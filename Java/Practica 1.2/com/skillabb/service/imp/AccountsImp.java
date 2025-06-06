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
    public static void validateAccounts(String numCta, double bal)
    {
        if(bal > 0 && numCta != "32145678")
            System.out.println("La cuenta existe");
        else
            System.out.println("La cuenta no existe");
    }
}
