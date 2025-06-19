/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microservicios.curso.accountCards.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.Data;

/**
 *
 * @author IDS
 */
@Data
@Entity
@Table(name="TBL_CUENTAS")
@IdClass(AccountCardsId.class)
public class AccountCards 
{
    @Id
    private String customerNumber;
    @Id
    private String accountNumber;
    private int productNumber;
    private String cards;
    private String productName;
    private String status;
    private BigDecimal balance;
    private String creationDate;
}
