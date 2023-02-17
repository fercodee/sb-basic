package com.example.exercisessb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * /calculator/sum/10/20
 * /calculator/subtract?a=20&b=10
 */

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("/sum/{a}/{b}")
    public int sum(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    @GetMapping("/sub")
    public int subtract(
            @RequestParam(name = "a") int a,
            @RequestParam(name = "b") int b) {
        return a - b;
    }

}
