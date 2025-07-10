package com.pedro;

import java.util.ArrayList;
import java.util.List;

public class JogoComCoringa extends Jogo {

    private List<Carta> cartas = new ArrayList<>();
    List<Carta> mao = new ArrayList<>();

    public List<Carta> distribuir(int quantidade) {
    
        for (int i = 0; i < quantidade && !cartas.isEmpty(); i++) {
            mao.add(cartas.remove(0));
        }
        return mao;
    }

    public List<Carta> getCartasRestantes() {
        return cartas;
    }


    @Override
    public double getAtruiPontuacao(Carta numero){
        String valor = numero.getNumero();
        switch (valor) {
            case "3":
            case "4":
            case "5":
            case "6":
                return 0.5;

            case "2":
            case "7":
            case "8":
            case "9":
            case "10":
            case "J":
            case "Q":
            case "K":
                return 1;

            case "A":
                return 1.5;

            default:
                return 2;
            }

        }


    public double calcularPontos() {
        int total = 0;
        
        for (Carta c : mao) {
            total += getAtruiPontuacao(c);
        }
        return total;
    }

    
}
