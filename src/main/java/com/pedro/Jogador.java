package com.pedro;

import java.util.List;

public class Jogador {
    private String nome;
    private List<Carta> mao;
    private double pontos;

    public Jogador(String nome){ // construtor
        this.nome = nome;
    }
    public void receberCartas(List<Carta> cartas) { // recebe a lista de cartas e guarda na mao
        this.mao = cartas;
    }

    public List<Carta> getMao() {
        return mao;
    }

    public String getNome() {
        return nome;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) { //setter para os pontos
        this.pontos = pontos;
    }
}
