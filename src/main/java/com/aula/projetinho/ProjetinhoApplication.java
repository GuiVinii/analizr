package com.aula.projetinho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjetinhoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetinhoApplication.class, args);
    }

    @GetMapping("/")
    public String hello(){
        return "Manuzita rainha de todos";
    }

}
