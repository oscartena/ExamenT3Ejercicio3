package com.example.exament3ejercicio3.model;

// La clase RandomNumber representa un número aleatorio y se utiliza para serializar/deserializar JSON.
public class RandomNumber {
    private int random;

    // Constructor predeterminado requerido para la serialización/deserialización JSON.
    public RandomNumber() {
    }

    // Constructor que toma un número aleatorio como parámetro.
    public RandomNumber(int random) {
        this.random = random;
    }

    // Método getter para obtener el número aleatorio.
    public int getRandom() {
        return random;
    }

    // Método setter para establecer el número aleatorio.
    public void setRandom(int random) {
        this.random = random;
    }
}

