/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microservicios.curso.account.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.List;
import lombok.Data;

/**
 *
 * @author IDS
 */
@Data
@Entity
@Table(name="TBL_CUENTAS")
@IdClass(AccountId.class)
public class Account 
{
    @Id
    private String customerNumber;
    @Id
    private String accountNumber;
    private int productNumber;
    private String productName;
    private String status;
    private BigDecimal balance; //En java siempre se usa BigDecimal para la moneda, si no la precision de la variable se redondea con cualquier otro tipo de dato.
    private String creationDate;
}
