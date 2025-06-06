/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microservicios.curso.login.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


/**
 *
 * @author IDS
 */

@Data
@Entity
@Table(name = "TBL_CUSTOMERS")

public class Customer 
{
    @Id
    @Column(name="CUSTOMER_NUMBER")
    private String customerNumber;
    
    private String password;
    
    @Column(name="SESSION")
    private boolean isSessionAlive;
    
    private String status;
}
