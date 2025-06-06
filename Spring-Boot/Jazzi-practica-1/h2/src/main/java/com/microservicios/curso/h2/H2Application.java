package com.microservicios.curso.h2;

import com.microservicios.curso.h2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class H2Application{

        @Autowired
        private CustomerRepository customerRepository;
        
	public static void main(String[] args) {
		SpringApplication.run(H2Application.class, args);
	}
}
