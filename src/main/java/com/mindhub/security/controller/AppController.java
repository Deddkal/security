package com.mindhub.security.controller;

import com.mindhub.security.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {

    @Autowired
    private ClientService clientService;

//    IoC / DI
//    Bean , Component

    @GetMapping
    public String hello(){
        clientService.findAll();
        return "Hola";
    }
}
