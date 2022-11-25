package org.aadi.keycloak.microservice2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {

    @GetMapping("/microservice2/home")
    @ResponseStatus(HttpStatus.OK)
    public String hello() {
        return "Yes, Present. This is hello from Microservice2.";
    }
}
