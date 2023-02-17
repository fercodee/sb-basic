package com.example.exercisessb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exercisessb.model.entities.Client;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @GetMapping("/any")
    public Client getClient() {
        return new Client(28, "Ana", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable int id) {
        return new Client(id, "Maria", "987.645.321-00");
    }

    @GetMapping
    public Client getClientByIdTwo(@RequestParam(name = "id", defaultValue = "1") int id) {
        return new Client(id, "João Augusto", "111.222.333-44");
    }

}
