package com.pedro;

import java.util.*;

public class Baralho {

    private List<Carta> cartas = new ArrayList<>();

    public Baralho() {
        String[] numeros = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String num : numeros){
            cartas.add(new CartaCopas(num));
            cartas.add(new CartaEspadas(num));
            cartas.add(new CartaPaus(num));
            cartas.add(new CartaOuros(num));
        }

        cartas.addAll(new ArrayList<>(cartas)); 
    }

    public void embaralhar(){
        Collections.shuffle(cartas);
    }

    public List<Carta> distribuir(int quantidade) {
    List<Carta> mao = new ArrayList<>();
        for (int i = 0; i < quantidade && !cartas.isEmpty(); i++) {
            mao.add(cartas.remove(0));
        }
        return mao;
    }

    public List<Carta> getCartasRestantes() {
        return cartas;
    }
    
}
