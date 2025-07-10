package com.pedro;

import java.util.*;

public class Baralho {

    private List<Carta> cartas = new ArrayList<>();

    public Baralho() {
        String[] numeros = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "Coringa"};

        for (String num : numeros){
            cartas.add(new Carta("Copas", num));
            cartas.add(new Carta("Ouros", num));
            cartas.add(new Carta("Paus", num));
            cartas.add(new Carta("Espadas", num));
        }

        cartas.addAll(new ArrayList<>(cartas)); 
    }
    
}
