package com.pedro;

import java.util.Collections;
import java.util.List;

public class JogoComCoringa extends Jogo {  // classe que é filha da classe pai (Jogo)

    public JogoComCoringa(int quantidade, List<Jogador> jogadores) { //construtor
        super(quantidade, jogadores); // pega a quantidade e jogadores da classe pai (Jogo)
        Baralho baralho = new Baralho();
        this.cartas = baralho.getCartas(); // recebe as cartas que estao no baralho
    }

    @Override
    public void embaralhar() { // embaralha as cartas que estao no baralho
        Collections.shuffle(cartas);
    }

    @Override
    public double getPontuacao(Carta carta) {  // faz o calculo da pontuacao de cada carta com o Coringa
        String valor = carta.getNumero();
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
}