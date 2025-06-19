/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microservicios.curso.accountCards.view;

import java.util.List;
import lombok.Data;

/**
 *
 * @author IDS
 */

public class AccountCardsDTO 
{
    private String cards;

    public AccountCardsDTO(String cards) {
        this.cards = cards;
    }

    public String getCards() {
        return cards;
    }

    public void setCards(String cards) {
        this.cards = cards;
    }

    
    
}
