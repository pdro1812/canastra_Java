package com.pedro;

import java.util.ArrayList;
import java.util.List;

public class Baralho {

    private List<Carta> cartas = new ArrayList<>(); // cria uma lista de cartas

    public Baralho() {
        String[] numeros = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "Coringa"};

        for (String num : numeros) {  // adiciona a quantidade de cartas de cada naipe
            cartas.add(new Carta("Copas", num));
            cartas.add(new Carta("Ouros", num));
            cartas.add(new Carta("Paus", num));
            cartas.add(new Carta("Espadas", num));
        }

        cartas.addAll(new ArrayList<>(cartas)); // duplica a quantidade de cartas que estava na lista de cartas
    }

    public List<Carta> getCartas() { // getter de carta que retorna a lista de cartas
        return this.cartas;
    }
}