package com.pedro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Jogo {

    protected int quantidade;
    protected List<Carta> cartas = new ArrayList<>();
    protected List<Jogador> jogadores = new ArrayList<>();

    public Jogo(int quantidade, List<Jogador> jogadores) {
        this.quantidade = quantidade;
        this.jogadores = jogadores;
    }

    public abstract void embaralhar();

    public abstract double getPontuacao(Carta carta);

    public void distribuir() {
        for (Jogador jogador : jogadores) {
            List<Carta> maoJogador = new ArrayList<>();
            for (int i = 0; i < quantidade && !cartas.isEmpty(); i++) {
                maoJogador.add(cartas.remove(0));
            }
            jogador.receberCartas(maoJogador);
        }
    }

    public List<Carta> getCartasRestantes() {
        return cartas;
    }

    public void calcularPontos() {
        for (Jogador jogador : jogadores) {
            double total = 0;
            for (Carta c : jogador.getMao()) {
                total += getPontuacao(c);
            }
            jogador.setPontos(total);
        }
    }
}
