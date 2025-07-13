package com.pedro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Jogo { // classe abstrata chamada Jogo

    protected int quantidade;
    protected List<Carta> cartas = new ArrayList<>();
    protected List<Jogador> jogadores = new ArrayList<>();

    public Jogo(int quantidade, List<Jogador> jogadores) {  //construtor
        this.quantidade = quantidade;
        this.jogadores = jogadores;
    }

    public abstract void embaralhar();

    public abstract double getPontuacao(Carta carta);

    public void distribuir() {
        //metodo distribuir (distribui as cartas tirando elas da lista e adicionando elas na mão dos jogadores
        for (Jogador jogador : jogadores) { //laço de repetição que percorre a lista de jogadores
            List<Carta> maoJogador = new ArrayList<>();
            for (int i = 0; i < quantidade && !cartas.isEmpty(); i++) {
                maoJogador.add(cartas.remove(0)); // adiciona as cartas na mão e remove as cartas da lista
                //de cartas "baralho"
            }
            jogador.receberCartas(maoJogador); //o jogador recebe as cartas que vai utilizar durante a partida
        }
    }

    public List<Carta> getCartasRestantes() {
        return cartas;
    }

    public void calcularPontos() {
        for (Jogador jogador : jogadores) { // percorre a lista de jogadores
            double total = 0;
            for (Carta c : jogador.getMao()) {  // percorre a mao de cartas do jogador
                total += getPontuacao(c); // pega a pontuacao da carta da mão do jogador e guarda em total
                // toda vez que rodar o for vai ir somando as pontuações das cartas
            }
            jogador.setPontos(total); //altera o total dos pontos do jogador para o total calculado
        }
    }
}
