 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.skillabb.model;
import java.time.*;

/**
 *
 * @author IDS
 */
public class Account 
{
    private String customerName;
    private String accountNumber;
    private double balance;
    LocalDate dte;
    LocalTime tme;
    
    public Account(String customerName, String accountNumber, double balance) 
    {        
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dte = LocalDate.now();
        this.tme  = LocalTime.now();
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDate getDte() {
        return dte;
    }

    public LocalTime getTme() {
        return tme;
    }

    
}
