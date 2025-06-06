/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.microservicios.curso.login.service;

import com.microservicios.curso.login.view.Credentials;

/**
 *
 * @author IDS
 */
public interface AuthenticationService 
{
    public boolean authenticate(Credentials credentials) throws Exception;
}
