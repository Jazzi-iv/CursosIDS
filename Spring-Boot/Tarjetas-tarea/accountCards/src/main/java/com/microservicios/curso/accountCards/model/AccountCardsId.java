/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microservicios.curso.accountCards.model;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author IDS
 */
@Data
public class AccountCardsId implements Serializable
{
    private String customerNumber;
    private String accountNumber;
}
