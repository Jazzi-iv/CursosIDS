/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microservicios.curso.login.api;

import com.microservicios.curso.login.service.AuthenticationService;
import com.microservicios.curso.login.view.Credentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author IDS
 */
@RestController
@RequestMapping("/api")
public class AuthenticationController 
{
    @Autowired
    private AuthenticationService authenticationService;
    
    @PostMapping("/login")
    public ResponseEntity <HttpStatus> login(@RequestBody Credentials credentials) throws Exception
    {
        if(!authenticationService.authenticate(credentials))
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
