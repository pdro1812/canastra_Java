package com.pedro;

import java.util.Collections;
import java.util.List;

public class JogoSemCoringa extends Jogo { // classe que é filha da classe pai (Jogo)

    public JogoSemCoringa(int quantidade, List<Jogador> jogadores) { // construtor
        super(quantidade, jogadores); // pega a quantidade e jogadores da classe pai (Jogo)
        Baralho baralho = new Baralho();
        this.cartas = baralho.getCartas();
    }

    @Override
    public void embaralhar() {
        //Usando removeIf para remover os Coringas
        // percorre a lista internamente e remove o que e igual a Coringa
        cartas.removeIf(c -> c.getNumero().equals("Coringa"));
        
        // depois de remover embaralha as cartas do baralho
        Collections.shuffle(cartas);
    }

    @Override
    public double getPontuacao(Carta carta) {  // faz o calculo da pontuacao de cada carta sem o Coringa
        String valor = carta.getNumero();
        switch (valor) {
            case "3":
            case "4":
            case "5":
            case "6":
                return 0.5;
            case "A":
                return 1.5;
            default: 
                return 1;
        }
    }
}