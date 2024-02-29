package com.example.exament3ejercicio3.controller;

import com.example.exament3ejercicio3.model.RandomNumber;
import com.example.exament3ejercicio3.service.RandomNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// La clase RandomNumberController define los endpoints de la API relacionados con números aleatorios.
@RestController
@RequestMapping("/random")
public class RandomNumberController {

    @Autowired
    private RandomNumberService randomNumberService;

    // Endpoint GET que devuelve una lista de 100 números aleatorios.
    @GetMapping("/numbers")
    public List<Integer> getRandomNumbersList() {
        return randomNumberService.generateRandomNumbersList();
    }

    // Endpoint GET que devuelve un número aleatorio con la cantidad de dígitos especificada.
    @GetMapping("/number/{digits}")
    public int getRandomNumberWithDigits(@PathVariable int digits) {
        return randomNumberService.generateRandomNumberWithDigits(digits);
    }

    // Endpoint PUT que recibe un número aleatorio (JSON en el body) y devuelve un número aleatorio con el mismo número de dígitos.
    @PutMapping("/number")
    public RandomNumber processRandomNumber(@RequestBody RandomNumber randomNumber) {
        return randomNumberService.processRandomNumber(randomNumber);
    }
}


