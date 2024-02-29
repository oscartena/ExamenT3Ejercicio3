package com.example.exament3ejercicio3.service;

import com.example.exament3ejercicio3.model.RandomNumber;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// La clase RandomNumberService proporciona servicios relacionados con números aleatorios.
@Service
public class RandomNumberService {

    // Genera una lista de 100 números aleatorios y la devuelve.
    public List<Integer> generateRandomNumbersList() {
        List<Integer> randomNumbersList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            randomNumbersList.add(random.nextInt());
        }

        return randomNumbersList;
    }

    // Genera un número aleatorio con la cantidad de dígitos especificada y lo devuelve.
    public int generateRandomNumberWithDigits(int digits) {
        Random random = new Random();
        int min = (int) Math.pow(10, digits - 1);
        int max = (int) Math.pow(10, digits) - 1;

        return random.nextInt(max - min + 1) + min;
    }

    // Procesa un número aleatorio recibido, determina la cantidad de dígitos y genera un nuevo número aleatorio con esa cantidad de dígitos.
    // Devuelve el nuevo número aleatorio envuelto en un objeto RandomNumber.
    public RandomNumber processRandomNumber(RandomNumber randomNumber) {
        int digits = String.valueOf(randomNumber.getRandom()).length();
        int newRandom = generateRandomNumberWithDigits(digits);

        return new RandomNumber(newRandom);
    }
}
