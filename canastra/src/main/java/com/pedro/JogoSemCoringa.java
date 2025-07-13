package com.pedro;

import java.util.Collections;
import java.util.List;

public class JogoSemCoringa extends Jogo {

    public JogoSemCoringa(int quantidade, List<Jogador> jogadores) {
        super(quantidade, jogadores);
        Baralho baralho = new Baralho();
        this.cartas = baralho.getCartas();
    }

    @Override
    public void embaralhar() {
        // CORREÇÃO: Usando removeIf para remover os Coringas de forma segura.
        // Este método percorre a lista internamente e remove os itens
        // que correspondem à condição, evitando o erro.
        cartas.removeIf(c -> c.getNumero().equals("Coringa"));
        
        // Após a remoção segura, o embaralhamento funciona como esperado.
        Collections.shuffle(cartas);
    }

    @Override
    public double getPontuacao(Carta carta) {
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